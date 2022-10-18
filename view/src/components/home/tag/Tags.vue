<template>
  <div class="ui piled segments">
    <div class="ui segment secondary">
      <h4><i class="icon tags"></i>标签云</h4>
    </div>
    <div class="ui segment">
      <router-link to="/tag" v-for="tag in tagList" class="ui label" :class="tag.color">{{ tag.name }}</router-link>
    </div>
  </div>
</template>

<script setup>
import store from "@/store";

const tagList = store.state.tagList
</script>

<style scoped>
.ui.piled.segments {
  margin: 0 !important;
  margin-bottom: 20px !important;
}
</style>