<template>
  <!-- 我的动态 -->
  <div class="ui segment">
    <div style="text-align: center;font-size: 1.5rem;">我的动态</div>
  </div>
  <!-- 动态列表 -->
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
import {useStore} from "vuex";

let store = useStore()
let setting = store.state.setting
let avatar = setting.avatar
let momentList = store.state.moments
</script>