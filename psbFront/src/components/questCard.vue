<template>
    <a class="questCard">
        <div style="position: relative;height:100%;width:100%">
            <div style="font-size:20px;color:#34398E;font-family: gilroy-semibold">{{CardData.headr}}</div>
            <div>
                <ul style="font-size:16px;color:#34398E;font-family: gilroy-regular">
                    <li v-for="item in CardData.txt" v-bind:key="item">
                        {{ item }}
                    </li>
                </ul>
            </div>
            <div style="position: absolute;top:120px;left:10px;width:100%">
                <span style="display: inline-block; margin-right:5px" v-for="item in CardData.imgs" v-bind:key="item">
                    <img v-bind:src="require(`../assets/img/${item}`)">
                </span>
                <span style="display: inline-block;float:right;margin-right:20px" >
                    <input
                            style="height:16px;width:16px"
                            type="checkbox"
                            name="subscribe"
                            v-model="CardData.isChecked"
                            v-on:click="emitCheck"
                            value="va1">
                </span>
            </div>

        </div>
    </a>
</template>

<script>
    export default {
        name: "questCard",
        data: () => ({
            checkbox: false,
            va: false,
        }),
        props: {
            CardData: {
                type: Object,
                required: true
            },


        },
        methods: {
            emitCheck(){
                this.$emit('check')
            },
        },
    }
</script>

<style scoped>
    .questCard {
        display:inline-block;
        padding: 10px;
        margin: 10px;
        border-radius: 20px;
        background-color: #eff0f8;
        width: 340px;
        height: 160px;
        box-shadow: 4px 4px 7px rgba(0, 0, 0, 0.07), -4px -4px 13px #FFFFFF, 6px 6px 36px rgba(0, 0, 0, 0.06);
    }
</style>