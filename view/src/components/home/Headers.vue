<template>
  <div class="header-image"></div>
</template>

<script setup>
</script>

<style scoped>
.header-image {
  margin: 0;
  background: url("../../assets/img/1.jpg") no-repeat;
  width: 100vw;
  background-size: cover;
  animation: header 2.5s;
  height: 100vh;
}

@keyframes header {
  from {
    height: 0vh;
  }
  to {
    height: 100vh;
  }
}
</style>