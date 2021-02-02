package com.xingchenproject.template.projecttemplate.service;

import com.xingchenproject.template.projecttemplate.model.bo.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 用户账户接口
 */
public interface UserAccountService extends UserDetailsService {
    /**
     * 注册用户帐户并分配权限
     * @param userDetails 用户帐户业务类
     * @return 注册成功返回true，否则返回false
     */
    public boolean registerUser(UserDetailsImpl userDetails);
}
