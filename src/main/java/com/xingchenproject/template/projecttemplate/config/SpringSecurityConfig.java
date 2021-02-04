package com.xingchenproject.template.projecttemplate.config;

import com.xingchenproject.template.projecttemplate.filterAndInterceptor.TokenFilter;
import com.xingchenproject.template.projecttemplate.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

/**
 * spring-security配置类
 */
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private AuthenticationEntryPoint authenticationEntryPoint;
    @Autowired
    private AuthenticationSuccessHandler authenticationSuccessHandler;
    @Autowired
    private AuthenticationFailureHandler authenticationFailureHandler;
    @Autowired
    private AccessDeniedHandler accessDeniedHandler;
    @Autowired
    private LogoutSuccessHandler logoutSuccessHandler;
    @Autowired
    private TokenFilter tokenFilter;

    /**
     * 配置密码加密类
     *
     * @return 返回BCryptPasswordEncoder
     */
    @Bean
    public PasswordEncoder initPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 认证用户来源,即登录
     *
     * @param auth 用户信息
     * @throws Exception 错误
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        if (auth != null) {
            auth.userDetailsService(userAccountService).passwordEncoder(initPasswordEncoder());
        }
    }

    /**
     * spring-security拦截配置
     *
     * @param http 请求配置
     */

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                //  添加过滤器
                .addFilterBefore(tokenFilter, UsernamePasswordAuthenticationFilter.class)
                //  配置不需要权限页面
                .authorizeRequests()
                .antMatchers("/api/user/loginTest")
                .permitAll()
                .and()
                //  配置登录
                .formLogin()
                .loginProcessingUrl("/api/user/login")
                .successHandler(authenticationSuccessHandler)
                .failureHandler(authenticationFailureHandler)
                .usernameParameter("account")
                //  配置登出
                .and()
                .logout()
                .logoutUrl("/api/user/logout")
                .logoutSuccessHandler(logoutSuccessHandler)
                //  配置无权限
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(authenticationEntryPoint)
                .accessDeniedHandler(accessDeniedHandler)
                .and()
                .csrf()
                .disable()
        ;
    }
}
