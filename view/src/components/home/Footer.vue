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

import {useStore} from "vuex";

let store = useStore()

let setting = store.state.setting
let copyright = setting.Copyright
let blogName = setting.blogName
let icp = setting.icp
let text = setting.footerText
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