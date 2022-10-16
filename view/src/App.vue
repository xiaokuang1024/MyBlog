<template>
  <router-view/>
</template>

<script>
import {onMounted} from '@vue/runtime-core';

export default {
  name: "App",
  setup() {
    onMounted(() => {
      console.log('因为我们努力的抗争不是为了改变世界，而是为了这个世界不再改变我们。————《熔炉》')
    })
  }
};
</script>