import Vue from 'vue'
import App from './App.vue'
import vuetify from './vuetify'
import router from "./router";
import Vuex from 'vuex'
import store from "./store/store"
import 'es6-promise/auto'

Vue.config.productionTip = false;
Vue.use(Vuex);

new Vue({
    router,
    vuetify,
    store,
    el: '#app',
    render: h => h(App)
});
