<template>
  <!-- 我的动态 -->
  <div class="ui feed large segment" v-for="item in momentList">
    <div class="event">
      <div class="label">
        <img :src="avatar">
      </div>
      <div class="content">
        <div class="summary" style="text-align: right">
          <div class="date">{{ item.time }}</div>
        </div>
        <div class="extra text" v-text="item.content"></div>
        <div class="meta">
          <a class="like">
            <i class="like icon"></i> {{ item.likes }} Likes
          </a>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import store from "@/store";

const avatar = store.state.setting.avatar
const momentList = store.state.moment
</script>
