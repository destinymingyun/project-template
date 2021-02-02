package com.xingchenproject.template.projecttemplate.security;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseData;
import com.xingchenproject.template.projecttemplate.protocol.ResponseCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理无权登录的情况
 */
@Component
public class AjaxAccessDeniedHandlerImpl implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                       AccessDeniedException e) throws IOException, ServletException {
        ResponseData responseData = ResponseData.builder()
                .code(ResponseCode.ACCESS_DENIED)
                .msg(ResponseCode.ACCESS_DENIED_NAME)
                .build();
        HttpServletJsonResponseWriter.writer(httpServletResponse, responseData);
    }
}
