package com.xingchenproject.template.projecttemplate.security;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseData;
import com.xingchenproject.template.projecttemplate.protocol.ResponseCode;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理登录失败情况
 */
@Component
public class AjaxAuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        ResponseData responseData = ResponseData.builder()
                .code(ResponseCode.USER_LOGIN_FAILED)
                .msg(ResponseCode.USER_LOGIN_FAILED_NAME)
                .build();
        HttpServletJsonResponseWriter.writer(httpServletResponse, responseData);
    }
}
