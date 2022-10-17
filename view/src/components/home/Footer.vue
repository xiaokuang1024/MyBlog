<template>
  <div class="footers">
    <h5 class="ui grey header">{{ text }}</h5>
    <div class="ui grey header">
      <span>{{ copyright }}&ensp;</span>
      <span>{{ blogName }}&ensp;|&ensp;</span>
      <a href="https://beian.miit.gov.cn/" target="_blank">{{ icp }}</a>
    </div>
  </div>
</template>

<script setup>
import store from "@/store";

const setting = store.state.setting
const copyright = setting.Copyright
const blogName = setting.blogName
const icp = setting.icp
const text = setting.rollText
</script>

<style scoped>
.footers {
  background-color: #1b1c1d;
  height: 200px;
  padding: 50px;
  text-align: center;
  color: rgba(255, 255, 255, .9);
}
</style>