package com.xingchenproject.template.projecttemplate.security;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseJsonData;
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
 *
 * @author xingchen
 */
@Component
public class AjaxAuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException {
        ResponseJsonData responseJsonData = ResponseJsonData.builder()
                .code(ResponseCode.USER_LOGIN_FAILED)
                .msg(ResponseCode.USER_LOGIN_FAILED_NAME)
                .build();
        HttpServletJsonResponseWriter.writer(httpServletResponse, responseJsonData);
    }
}
