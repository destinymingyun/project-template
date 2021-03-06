package com.xingchenproject.template.projecttemplate.filterAndInterceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * token验证器
 * @author xingchen
 */
@Component
public class TokenFilter extends OncePerRequestFilter {
    /**
     * 实现token过滤器
     * @param request 请求
     * @param response 相应
     * @param filterChain 过滤器链
     * @throws ServletException servlet异常
     * @throws IOException io异常
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        System.out.println("tokenFilter");
        String token = request.getHeader("token");
        System.out.println("token = " + token);
        if(token != null) {
            System.out.println("token = " + token);
        }
        filterChain.doFilter(request, response);
    }
}
