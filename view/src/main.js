/**
 * 前端程序入口
 **/
import Vue from "vue";
import App from "./App.vue";
import "__style__/config.less";
import router from "__router__";
import store from "./store";
import "./config";

new Vue({
    render: h => h(App),
    router,
    store,
}).$mount("#app");