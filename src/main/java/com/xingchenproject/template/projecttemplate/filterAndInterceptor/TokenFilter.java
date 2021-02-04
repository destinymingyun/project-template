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
 */
@Component
public class TokenFilter extends OncePerRequestFilter {
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
