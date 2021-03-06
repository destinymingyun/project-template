package com.xingchenproject.template.projecttemplate.controller;

import com.xingchenproject.template.projecttemplate.model.bo.UserDetailsImpl;
import com.xingchenproject.template.projecttemplate.model.vo.ResponseJsonData;
import com.xingchenproject.template.projecttemplate.protocol.ResponseCode;
import com.xingchenproject.template.projecttemplate.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户帐户相关业务处理器
 * @author xingchen
 */
@RestController
@RequestMapping("/api/user")
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;

    /**
     * 注册帐户信息
     * @param userDetails 用户账号相关信息类
     * @return 返回json报文
     */
    @PostMapping("/register")
    public String registerAccount(UserDetailsImpl userDetails) {
        boolean ret = userAccountService.registerUser(userDetails);
        ResponseJsonData responseJsonData = ResponseJsonData.builder().build();
        if (ret) {
            responseJsonData.setCode(ResponseCode.SUCCESS);
            responseJsonData.setMsg(ResponseCode.SUCCESS_NAME);
            responseJsonData.setMsg(userDetails.toString());
        }
        return responseJsonData.toString();
    }
}
