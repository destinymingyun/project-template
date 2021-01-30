/**
 * 前端程序入口
 **/
import Vue from "vue";
import App from "./App.vue";
import "__style__/config.less";

new Vue({
    render: h => h(App),
}).$mount("#app");