<template>
    <v-app >
        <base-layout style="background-color: #eff0f8">
            <router-view :key="$route.fullPath"/>
        </base-layout>
    </v-app>
</template>

<script>
    import baseLayout from "@/layouts/baseLayout"
    import store from './store/store'
    export default {
        name: 'App',
        store: store,
        components: {
            baseLayout
        },
        data: () => ({
            //
        }),
    };
</script>
<style>
    @font-face {
        font-family: "gilroy-reguar";
        src: url(./assets/fonts/gilroy-regular.ttf) format('truetype');
    }
    @font-face {
        font-family: "gilroy-semibold";
        src: url(./assets/fonts/gilroy-semibold.ttf) format('truetype');
    }
    @font-face {
        font-family: "verdana-regular";
        src: url(./assets/fonts/verdana-regular.ttf) format('truetype');
    }
    @font-face {
        font-family: "verdana-bold";
        src: url(./assets/fonts/verdana-bold.ttf) format('truetype');
    }
</style>

