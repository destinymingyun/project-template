package com.xingchenproject.template.projecttemplate.security;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseData;
import com.xingchenproject.template.projecttemplate.protocol.ResponseCode;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理登录成功情况
 */
@Component
public class AjaxAuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        ResponseData responseData = ResponseData.builder()
                .code(ResponseCode.SUCCESS)
                .msg(ResponseCode.SUCCESS_NAME)
                .build();
        HttpServletJsonResponseWriter.writer(httpServletResponse, responseData);
    }
}
