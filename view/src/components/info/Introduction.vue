<template>
  <div class="ui card" style="width:100%">
    <div class="image">
      <img :src="avatar"/>
    </div>
    <div class="content" align="center">
      <!-- 名称显示 -->
      <h3 v-text="name"></h3>
      <!-- 彩色滚动字体 -->
      <span v-text="rollText"></span>
    </div>
    <div class="content" align="center">
      <a :href="contactWay.github" target="_blank" class="ui circular icon button">
        <i class="icon github black"></i>
      </a>
      <a :href="contactWay.twitter" target="_blank" class="ui circular icon button">
        <i class="icon twitter blue"></i>
      </a>
      <a :href="contactWay.telegram" target="_blank" class="ui circular icon button">
        <i class="icon telegram plane blue"></i>
      </a>
      <a :href="contactWay.netease" target="_blank" class="ui circular icon button">
        <i class="icon music red"></i>
      </a>
      <a :href="contactWay.email" target="_blank" class="ui circular icon button">
        <i class="icon mail teal"></i>
      </a>
    </div>
  </div>
</template>

<script setup>
import {ref} from "vue";
import store from "@/store";

const setting = store.state.setting
const avatar = setting.avatar
const name = ref(setting.name)
const rollText = ref(setting.rollText)
const contactWay = ref({
  github: setting.github,
  twitter: setting.twitter,
  telegram: setting.telegram,
  netease: setting.netease,
  email: setting.email
})
</script>