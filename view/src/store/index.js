/**
 * VueX使用配置
 * @author xingchen
 **/
import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

// noinspection JSUnusedLocalSymbols
const store = new Vuex.Store({
    state: {

    },
    mutations: {
        saveToken(state,token) {
            sessionStorage.setItem("token", token);
        },
    },
    getters: {
        getToken: function(state) {
            return sessionStorage.getItem("token");
        },
    },
    actions: {
        setAccountToken({commit, state}, token) {
            commit("saveToken", token);
        }
    }
});

export default store;