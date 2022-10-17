<template>
  <div class="ui segment" style="width: 100%" v-for="i in 5">
    <div class="content">
      <img src="../../assets/img/1.jpg" style="width: 100%"/>
      <div style="font-size: 1.5rem;">标题{{ i }}</div>
      <div style="font-size: 1rem;">介绍</div>
      <div class="ui divider"></div>
      <div style="font-size: 0.5rem;text-align: right;">2022-10-16 18:47:00</div>
    </div>
  </div>
</template>

<script setup>
</script>