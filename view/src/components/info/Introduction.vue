<template>
  <div class="ui card" style="width:100%">
    <div class="image">
      <img :src="avatar"/>
    </div>
    <div class="content" align="center">
      <!-- 名称显示 -->
      <h3 v-text="name"></h3>
      <!-- 彩色滚动字体 -->
      <span v-text="rollText" ref="rollText"></span>
    </div>
    <div class="content" align="center">
      <a :href="contactWay" target="_blank" class="ui circular icon button">
        <i class="icon github black"></i>
      </a>
      <a :href="contactWay" target="_blank" class="ui circular icon button">
        <i class="icon twitter blue"></i>
      </a>
      <a :href="contactWay" target="_blank" class="ui circular icon button">
        <i class="icon telegram plane blue"></i>
      </a>
      <a :href="contactWay" target="_blank" class="ui circular icon button">
        <i class="icon music red"></i>
      </a>
      <a :href="contactWay" target="_blank" class="ui circular icon button">
        <i class="icon mail teal"></i>
      </a>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Introduction',
  setup() {
    const avatar = require('../../assets/img/avatar.png')
    const name = '小邝同学'
    const rollText = '永远相信美好的事情即将发生'
    const contactWay = []

    return {avatar, name, rollText, contactWay}
  }
}
</script>

<style scoped>

</style>