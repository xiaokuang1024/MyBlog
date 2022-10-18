<template>
  <!-- 网页容器 -->
  <div class="blog-site">
    <!-- 音乐播放器 -->
    <MyAPlayer/>
    <!-- 开始 -->
    <div class="header">
      <Nav/>
    </div>
    <!-- 中间 -->
    <div class="body">
      <div class="ui container">
        <div class="ui grid">
          <!-- 中间主体 -->
          <div class="twelve wide column">
            <router-view/>
          </div>
          <!-- 右侧内容 -->
          <div class="four wide column">
            <Introduction/>
            <WordCount v-if="$route.path!='/word'"/>
            <Tags/>
          </div>
        </div>
      </div>
    </div>
    <!-- 结尾 -->
    <div class="footer">
      <Footer/>
    </div>
  </div>
</template>

<script setup>
import Nav from '@/components/home/Nav.vue';
import Footer from '@/components/home/Footer.vue';
import Introduction from '../components/home/info/Introduction.vue';
import MyAPlayer from '@/components/home/MyAPlayer.vue';
import Tags from '@/components/home/tag/Tags.vue';
import WordCount from '@/components/home/word/WordCount.vue';
</script>

<style scoped>
.blog-site {
  display: flex;
  min-height: 100vh; /* 没有元素时，也把页面撑开至100% */
  flex-direction: column;
  background-color: #efefef;
}

.body {
  margin-top: 20px;
}

.ui.grid {
  margin: 0;
}

.ui.grid .twelve.column {
  padding: 0;
}

.ui.grid .four.column {
  padding-top: 0;
  padding-bottom: 0;
}

.footer {
  margin-top: 20px;
}

</style>