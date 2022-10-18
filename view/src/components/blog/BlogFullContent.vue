<template>
  <div class="ui segments">
    <div class="ui segment" style="width: 100%">
      <!--  角标  -->
      <a class="ui right corner label"><i class="heart icon red"></i></a>
      <!--  内容体  -->
      <div class="content">
        <!--   标题   -->
        <h1 align="center" class="ui header">我是一个标题党</h1>
        <!--   描述   -->
        <div style="display: flex;justify-content: center;font-size: small;">
          <span class="left-1"><i class="ui calendar alternate outline icon teal"></i>2020-10-18</span>
          <span class="left-1"><i class="ui eye icon grey"></i>123</span>
          <span class="left-1"><i class="ui pencil alternate icon brown"></i>2000字</span>
          <span class="left-1"><i class="ui clock outline icon blue"></i>阅读时间=1分钟</span>
        </div>
        <!--   分类   -->
        <a class="ui pink ribbon label">Overview</a>
        <!--   内容   -->
        <div class="content" v-html="html"></div>
        <!--   分割线   -->
        <div class="ui divider"></div>
        <!--   标签   -->
        <span class="left-1"><a class="ui tag label">New</a></span>
        <span class="left-1"><a class="ui red tag label">即将到来</a></span>
        <span class="left-1"><a class="ui teal tag label">精选</a></span>
      </div>
    </div>

    <div class="ui segment olive">
      <ul style="margin: 0;padding-left: 20px;font-size: small;">
        <li>作者：</li>
        <li>发布时间：</li>
        <li>修改时间：</li>
        <li>可自由转载、引用，并且允许商业性使用。但需要署名作者且注明文章出处。</li>
      </ul>
    </div>

    <div class="ui segment stacked teal">
      <!--   评论系统   -->
      <div v-if="isShow===false" style="font-size: large;">评论已关闭</div>
      <Comments v-if="isShow===true"/>
    </div>
  </div>

</template>

<script setup>
import Comments from "@/components/comments/Comments";
import {ref} from "vue";

const isShow = ref(false)
const html = '<p>我是一个html内容体</p>'
</script>

<style scoped>
.left-1 {
  margin-left: 7px;
}
</style>