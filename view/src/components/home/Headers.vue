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
  animation: header 5s;
}

@keyframes header {
  from {
    height: 100vh;
  }
  to {
    height: 0vh;
  }
}
</style>