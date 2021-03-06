/**
 * 程序主路由
 * @author xingchen
 **/
import componentHelpRouter from "./component-help-page-router";
const route = [
    //  默认页面
    {
        path: "/",
        redirect: "/loginAndRegister",
    },
    //  index
    {
        path: "/index",
        component: () => import("__tpage__/index-page"),
    },
    //  test页面
    {
        path: "/test",
        component: () => import("__tpage__/test-page"),
    },
    //  登录注册页面
    {
        path: "/loginAndRegister",
        component: () => import("__tpage__/login-and-register-page"),
    },
    ...componentHelpRouter,
];

export default route;