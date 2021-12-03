import Vue from "vue";
import VueRouter from "vue-router";
import store from "@/store/store"
Vue.use(VueRouter);

const routes = [
    { path: "/", redirect: { name: "Home" } },
    {
        path: "/home",
        name: "Home",
        component: () => import("@/pages/HomePage.vue")
    },
    {
        path: "/auth",
        name: "AuthPage",
        component: () => import("@/pages/AuthPage.vue")
    },
    {
        path: "*",
        name: "404",
        component: () => import("@/pages/NotFoundPage.vue")
    },
    {
        path: "/achieves",
        name: "achieve",
        component: () => import("@/pages/Achieves.vue")
    },
    {
        path: "*",
        redirect: "/404"
    }
];

const router = new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    scrollBehavior(to, from, savedPosition) {
        if (savedPosition) {
            return savedPosition;
        } else {
            return { x: 0, y: 0 };
        }
    },
    routes
});
router.beforeEach((to, from, next) => {
    if(to.name !== "AuthPage"  && !store.state.user){
        console.log(store.state.user);
        next({ name: "AuthPage" });
    }
    next();

});
export default router;
