package com.xingchenproject.template.projecttemplate.security;

import com.xingchenproject.template.projecttemplate.model.bo.UserDetailsImpl;
import com.xingchenproject.template.projecttemplate.model.po.UserAccount;
import com.xingchenproject.template.projecttemplate.model.vo.ResponseJsonData;
import com.xingchenproject.template.projecttemplate.protocol.ResponseCode;
import com.xingchenproject.template.projecttemplate.util.JwtTokenUtil;
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
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        UserAccount userAccount = userDetails.getUserAccount();
        ResponseJsonData responseJsonData = ResponseJsonData.builder()
                .token(JwtTokenUtil.createToken(userAccount))
                .code(ResponseCode.SUCCESS)
                .msg(ResponseCode.SUCCESS_NAME)
                .build();
        HttpServletJsonResponseWriter.writer(httpServletResponse, responseJsonData);
    }
}
