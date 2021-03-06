package com.xingchenproject.template.projecttemplate.security;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseJsonData;
import com.xingchenproject.template.projecttemplate.protocol.ResponseCode;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理用户未登录情况
 *
 * @author xingchen
 */
@Component
public class AjaxAuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException {
        ResponseJsonData responseJsonData = ResponseJsonData.builder()
                .code(ResponseCode.UNAUTHORIZED)
                .msg(ResponseCode.UNAUTHORIZED_NAME)
                .build();
        HttpServletJsonResponseWriter.writer(httpServletResponse, responseJsonData);
    }
}
