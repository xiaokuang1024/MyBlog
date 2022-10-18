<template>
  <div class="ui piled segments">
    <div class="ui segment secondary">
      <h4><i class="icon book"></i>
        <router-link to="/word">词频树</router-link>
      </h4>
    </div>
    <div class="ui segment">
      <a class="ui label" style="margin: 2px" v-for="word in WordCountList">
        {{ word.word }}
        <div class="detail">{{ word.count }}</div>
      </a>
    </div>
  </div>
</template>

<script setup>
import store from "@/store";

const WordCountList = store.state.WordCountList
</script>

<style scoped>
.ui.piled.segments {
  margin: 0 !important;
  margin-bottom: 20px !important;
}
</style>