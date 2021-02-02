/**
 * vue路由
 **/
import Vue from "vue";
import VueRouter from "vue-router";
import mainRouter from "./routes/main-router";

Vue.use(VueRouter);

const router = new VueRouter({
        routes: mainRouter,
    }
);

export default router;