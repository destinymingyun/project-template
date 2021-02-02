package com.xingchenproject.template.projecttemplate.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * token生成读取工具
 */
public class JwtTokenUtil {
    public final static String JWT_ID = "project-template";
    public final static String KEY = "xingchen";
    public final int overTime = 60*60*24;
    /**
     * 创建token
     * @param account 用户帐户
     * @return 返回该用户信息
     */
    public static String createToken(String account) {
        JwtBuilder builder = Jwts.builder()
                .setId(JWT_ID)
                .setIssuedAt(new Date())
                .setSubject(account)
                .signWith(SignatureAlgorithm.HS256, KEY);
        return builder.compact();
    }

    /**
     * 解析pwt
     * @param token token密文
     * @return 解析
     */
    public static Claims parseJWT(String token) {
        return Jwts.parser()
                .setSigningKey(KEY)
                .parseClaimsJws(token)
                .getBody();
    }
}
