<template>
  <div class="ui piled segments">
    <div class="ui segment secondary">
      <h4><i class="icon book"></i>
        <router-link to="/word">词频树</router-link>
      </h4>
    </div>
    <div class="ui segment">
      <a class="ui label" style="margin: 1px">
        积极的
        <div class="detail">11</div>
      </a>
      <a class="ui label" style="margin: 1px">
        热情的
        <div class="detail">103</div>
      </a>
      <a class="ui label" style="margin: 1px">
        向上的
        <div class="detail">111</div>
      </a>
      <a class="ui label" style="margin: 1px">
        自律的
        <div class="detail">520</div>
      </a>
    </div>
  </div>
</template>

<script>
export default {
  name: 'WordCount'
}
</script>

<style scoped>
.ui.piled.segments {
  margin: 0 !important;
  margin-bottom: 20px !important;
}
</style>