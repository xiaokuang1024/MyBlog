<template>
  <div class="ui segments" style="width: 100%">
    <div class="ui segment">
      <div style="font-size: 1.5rem;text-align: center;" v-text="about.title"></div>
    </div>
    <div class="ui segment">
      <meting-js server="tencent" type="playlist" id="8613766362" theme="#25CCF7" list-folded="true"></meting-js>
    </div>
    <!--  个人介绍  -->
    <div class="ui segment" v-html="about.content"></div>
    <!--  评论系统  -->
    <div class="ui segment">
      <comments/>
    </div>
  </div>
</template>

<script setup>
import Comments from "@/components/comments/Comments";
import getAbout from "@/api/about";
import {ref} from "vue";

let about = ref({
  title: '',
  content: '',
  musicId: '',
  commentEnabled: 'false'
})
getAbout().then(res => {
  about.value = res.data
})
</script>