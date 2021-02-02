package com.xingchenproject.template.projecttemplate.protocol;

/**
 * 响应码协议定义
 */
public final class ResponseCode {
    //  成功响应
    public final static int SUCCESS = 200;
    //  成功响应名
    public final static String SUCCESS_NAME = "success";
    //  找不到
    public final static int NOT_FOUND = 404;
    //  找不到名字
    public final static String NOT_FOUND_NAME = "not_found";
    //  拒绝访问
    public final static int ACCESS_DENIED = 403;
    //  拒绝访问名
    public final static String ACCESS_DENIED_NAME = "access_denied";
    //  未登录
    public final static int UNAUTHORIZED = 401;
    //  未登录名
    public final static String UNAUTHORIZED_NAME = "UNAUTHORIZED";
    //  登录失败
    public final static int USER_LOGIN_FAILED = 416;
    //  登录失败名
    public final static String USER_LOGIN_FAILED_NAME = "USER_LOGIN_FAILED";

}
