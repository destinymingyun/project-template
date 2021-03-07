package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.bo.UserDetailsImpl;
import com.xingchenproject.template.projecttemplate.model.po.UserAccount;
import com.xingchenproject.template.projecttemplate.model.po.UserRole;
import com.xingchenproject.template.projecttemplate.service.UserAccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;
import java.util.Collection;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private UserAccountService userAccountService;

    /**
     * 登录测试
     */
    @Test
    public void loginTest() {
        UserDetailsImpl userDetails = (UserDetailsImpl) userAccountService.loadUserByUsername("test1");
        System.out.println(userDetails);
    }

    /**
     * 注册帐户服务测试
     */
    @Test
    public void registerTest() {
        UserDetailsImpl userDetails = new UserDetailsImpl();
        UserAccount userAccount = new UserAccount();
        userAccount.setPassword("123456");
        userAccount.setAccount("test3");
        userDetails.setUserAccount(userAccount);
        UserRole userRole = new UserRole();
        userRole.setRoleId(1);
        Collection<UserRole> userRoles = new ArrayList<>();
        userDetails.setUserRoles(userRoles);
        boolean ret = userAccountService.registerUser(userDetails);
        Assertions.assertTrue(ret);
    }
}
