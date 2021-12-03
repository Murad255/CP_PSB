<template>
    <div>
        <v-form ref="formf" v-model="is_valid" class="login_form">
            <v-text-field
                    v-model="email"
                    :rules="emailRules"
                    label="Адрес эл. почты"
                    required
            ></v-text-field>
            <v-text-field
                    v-model="pass"
                    :rules="passRules"
                    type="password"
                    label="Пароль"
                    ref="passwor"
                    required
            ></v-text-field>

            <v-text-field
                    v-model="passConfirm"
                    :rules="[custom]"
                    type="password"
                    label="Подтверждение пароля"
                    required
            ></v-text-field>
            <div style="display:inline-block;margin-top:10px">
                <v-btn color="#1492e6" v-on:click="register">Регистрация</v-btn>
                <v-btn style="margin-left:70px" v-on:click="to_log">Войти</v-btn>
            </div>
        </v-form>
    </div>
    
</template>

<script>
    export default {
        name: "Register",
        data: () => ({
            is_valid: true,
            email: "",
            emailRules: [
                v => !!v || "",
                v => /.+@.+\..+/.test(v) || "Неверный Адрес"
            ],
            pass: "",
            passRules: [
                v => !!v || "",
                v => /.*\d.*/.test(v) || "Пароль должен содержать цифры"
            ],
            passConfirm: "",

        }),
        methods: {
            to_log() {
                this.$emit("logg");
            },
            register() {
                alert(this.$refs.formf.validate());
                let data = {
                    email: this.email,
                    password: this.password,
                }
                this.$store.dispatch('register', data)
                    .then(() => this.$router.push('/'))
                    .catch(err => console.log(err))
            }
        },
        computed: {
            custom() {
                return (() => (this.pass === this.passConfirm) || "Несоответствие")
            }
        }
    };
</script>

<style scoped>
    .button{
        border: 1px solid #292b61;
        margin-right: 5px;
        margin-bottom: 10px;
        display: inline-block;
        justify-content: center;
        background-color: inherit;
        border-right: 1px solid #292b61;
        text-align: center;
        display: inline-block;
        transition: all ease-in-out 0.15s;
        padding: 8px 15px 8px 15px;
        color: #292b61;
    }
    .login_form {
        border: 1px solid #959595;
        width: 340px;
        padding: 20px;
        border-radius: 30px;
        background-color: #ffffff;
    }
</style>