/**
 * 前端程序入口
 **/
import Vue from "vue";
import App from "./App.vue";
import "__style__/config.less";
import router from "__router__";

new Vue({
    render: h => h(App),
    router,
}).$mount("#app");