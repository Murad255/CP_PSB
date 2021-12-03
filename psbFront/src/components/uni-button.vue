<template>
    <a class="button" @mouseover="upHere = true" @mouseleave="upHere = false"  v-bind:style="btnStyle" v-on:click="emitClick()">{{this.text}}</a>
</template>

<script>
    export default {
        name: "uni-button",
        props: {
            color: {
                type: String,//1 or 2 or 3 default - disabled
                required: false,
            },
            text: {
                type: String,
                required: true,
            },
            link:{
                type: String,
                required: false,
                default:null
            }
        },
        data: () => ({
            upHere:false,
            btnStyle: {
                marginTop:"0",
                boxShadow:null,
                color:null,
                backgroundColor:null,
                border:null
            },
        }),
        created(){
            switch(+this.color){
                case 1:
                    this.btnStyle.color="white";
                    this.btnStyle.border="2px solid #6e7aba";
                    this.btnStyle.backgroundColor="#6e7aba";
                    break;
                case 2:
                    this.btnStyle.color="orange";
                    this.btnStyle.border="2px solid white";
                    this.btnStyle.backgroundColor="white";
                    break;
                case 3:
                    this.btnStyle.color="#6e7aba";
                    this.btnStyle.border="2px solid #6e7aba";
                    this.btnStyle.backgroundColor="transparent";
                    break;
                default:
                    this.btnStyle.backgroundColor="#6e7aba";
            }

        },
        computed:{
            ret_link(){
                return this.link
            }

        },
        methods: {
            emitClick(){

                this.$emit('click')
                if(this.link){
                    this.$router.push(this.link)
                }
            },
        },
        watch:{

        }
    }
</script>

<style scoped>
    .button{
        border-radius:50px;
        width:160px;
        transition: 0.1ms;
        display: inline-block;
        text-align: center;
        padding: 6px 2px 6px 2px;
        box-shadow: 0 2px #999;
    }
    .button:active {
        transform: translateY(2px);
        box-shadow: 0 0 #666;
    }
</style>