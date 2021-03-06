/**
 * 组件帮助页模块路由
 * @author xingchen
 **/
const componentHelpRouter = [
    //  组件帮助页
    {
        path: "/component-help-page/index",
        component: () => import("__tpage__/component-help-page"),
    },
];
export default componentHelpRouter;