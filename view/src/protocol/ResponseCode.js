/**
 * 响应码定义
 * @author xingchen
 **/

//  成功响应
const SUCCESS = 200;
//  成功响应名
const SUCCESS_NAME = "success";
//  找不到
const NOT_FOUND = 404;
//  找不到名字
const NOT_FOUND_NAME = "not_found";
//  拒绝访问
const ACCESS_DENIED = 403;
//  拒绝访问名
const ACCESS_DENIED_NAME = "access_denied";
//  未登录
const UNAUTHORIZED = 401;
//  未登录名
const UNAUTHORIZED_NAME = "UNAUTHORIZED";
//  登录失败
const USER_LOGIN_FAILED = 416;
//  登录失败名
const USER_LOGIN_FAILED_NAME = "USER_LOGIN_FAILED";

export default {
    SUCCESS,
    SUCCESS_NAME,
    ACCESS_DENIED,
    ACCESS_DENIED_NAME,
    NOT_FOUND,
    NOT_FOUND_NAME,
    UNAUTHORIZED,
    UNAUTHORIZED_NAME,
    USER_LOGIN_FAILED,
    USER_LOGIN_FAILED_NAME
};