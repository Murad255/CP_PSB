<template>
    <div>
        <v-form ref="form" v-model="is_valid" class="login_form">
            <div>Вход</div>
            <v-text-field
                    v-model="email"
                    :rules="emailRules"
                    label="Адрес эл. почты"
                    required
            ></v-text-field>

            <v-text-field
                    style="margin-top:10px"
                    v-model="pass"
                    :rules="passRules"
                    label="Пароль"
                    type="password"
                    required
            ></v-text-field>
            <div style="text-align: center;margin-top:10px">
                <btn color="1" text="Войти" v-on:click="login"></btn>
            </div>
            <div style="text-align: center;margin-top:10px">
                <btn color="3" text="Регистрация" v-on:click="to_reg"></btn>
            </div>
        </v-form>
    </div>
</template>

<script>
    import btn from "@/components/uni-button"

    export default {
        name: "Login",
        components: {
            btn,
        },
        data: () => ({
            is_valid: false,
            email: "",
            emailRules: [
                v => !!v || '',
                v => /.+@.+\..+/.test(v) || 'Неверный Адрес',
            ],
            pass: "",
            passRules: [
                v => !!v || "",
                v => /.*\d.*/.test(v) || "Пароль должен содержать цифры"
            ],
        }),
        methods: {
            login() {
                if (this.$refs.form.validate()) {
                    let email = this.email;
                    let passwrd = this.pass;
                    this.$store.commit("setUser", {email, passwrd})
                    this.$router.push("/home");
                }
            },
            to_reg() {
                this.$emit('reg')
            }
        },
        computed: {},
        mounted() {
        }
    };
</script>

<style scoped>
    .login_form {
        border: 1px solid #959595;
        width: 340px;
        padding: 20px;
        border-radius: 30px;
        background-color: #ffffff;
    }
</style>