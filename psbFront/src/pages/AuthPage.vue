<template>
    <div>
        <div class="back" v-bind:style="back_style" ref="back">
            <div>
                <Register v-on:logg="change_mode(0)" v-show="log && !isLoggedIn"/>
                <Login v-on:reg="change_mode(1)" v-show="!log && !isLoggedIn"/>
                <span v-if="isLoggedIn"><a @click="logout">Logout</a></span>
            </div>
        </div>
    </div>
</template>

<script>
    import Register from "../components/Register";
    import Login from "../components/Login";

    export default {
        name: "AuthPage",
        components: { Login, Register },
        data: () => ({
            back_style: {
                width: 0,
                paddingLeft: window.innerWidth * 0.47 - 170 + "px",
                paddingTop: window.innerHeight * 0.5 - 170 + "px"
            },
            log: false
        }),
        methods: {
            logout: function() {
                this.$store.commit("dropUser")

            },
            change_mode(val) {
                this.log = val;
            }
        },
        computed: {
            isLoggedIn: function() {
                return this.$store.state.user;
            }
        },
        mounted() {
            this.back_style.width = window.innerWidth + "px";
        },
        created() {
        }
    };
</script>
<style lang="scss">
    .back {
        position: absolute;
        z-index: 0;
        top: -2px;
        left: 0;
        background-size: 100%;
        height: 100%;
    }
</style>