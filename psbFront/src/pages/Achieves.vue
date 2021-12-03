<template>
    <div class="wrapper">
     <div class="my-achieves">Мои достижения</div>
        <div class="my-achieves-title">Достижения присваиваются в процессе работы в команде</div>
           <img :src="require('@/assets/img/Achieves.svg')" class="fist">
    </div>
</template>

<script>
    export default {
        name: "achieve",
        data:()=>({

        }),
        mounted () {
        },
        methods:{
          
        }
    };
</script>

<style scoped>
    .wrapper{
        padding-left:20%;
        padding-top:6%;
        background-color: #EFF0F8;
        padding-left: 4%;
        padding-top: 2%;
    }
    .my-achieves{
        font-family:"gilroy-reguar";
        color: #34398E;
        font-size: 28px;
        font-weight: 600;
        text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
        line-height: 33px;
        letter-spacing: 0.015em;
    }
    .my-achieves-title{
        width: 459px;
        height: 19px;
        left: 187px;
        top: 73px;
        font-family:"gilroy-reguar";
        font-style: normal;
        font-weight: normal;
        font-size: 16px;
        line-height: 19px;
        padding-top: 13px;
        /* identical to box height */

        letter-spacing: 0.015em;

        color: #312783;
    }
    .fist{
   
    }
</style>