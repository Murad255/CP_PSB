<template>
  <a :href="link"><div class="icon-name-card">
		<div class="icon"><img :src="require(`../assets/img/${cardImage}`)"/></div>
		<div class="text">{{ text }}</div>
  </div>
  </a>
</template>

<script>
export default {
	name: "IconCard",
	props: {
		cardImage: {
			type: String,
			required: true
			},
		text: {
			type: String,
			required: true
		},
		link: {
			type: String,
			required: false
		}
},
}
</script>

<style scoped lang="scss">


.icon-name-card {
	position: relative;
	width: 300px;
	height: 200px;
	align-items: center;
	justify-content: center;
	cursor: pointer;
	background-color: #eff0f8;
	border-radius: 20px;
	box-shadow: 4px 4px 7px rgba(0, 0, 0, 0.07), -4px -4px 13px #FFFFFF, 6px 6px 36px rgba(0, 0, 0, 0.06);
}
.text { 
	position: absolute;
	margin: auto;
	left: 0;
	right: 0;
	bottom: 0;
	font-family: "gilroy-reguar";
	font-size:18px;
	text-align: center;
	color: #EA5616;
	padding-bottom: 7px;
		}

.icon {
	position: absolute;
    margin: auto;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    width: 200px;
    height: 133px;
	}		

</style>
