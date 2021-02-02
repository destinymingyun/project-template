package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.bo.UserDetailsImpl;
import com.xingchenproject.template.projecttemplate.model.po.UserAccount;
import com.xingchenproject.template.projecttemplate.util.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 加密测试
 */
@SpringBootTest
public class TokenTest {

    /**
     * token测试
     */
    @Test
    public void tokenTest() {
        UserDetailsImpl userDetails = new UserDetailsImpl();
        UserAccount userAccount = new UserAccount();
        String token = JwtTokenUtil.createToken("test");
        System.out.println("token = " + token);
        Claims claims = JwtTokenUtil.parseJWT(token);
        System.out.println("claims = " + claims);
}
}
