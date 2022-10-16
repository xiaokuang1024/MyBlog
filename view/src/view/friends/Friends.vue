<template>
  <div class="ui segments">
    <div class="ui segment" align="center">
      <div style="font-size: 1.5rem;text-align: center;">小伙伴们</div>
    </div>
    <div class="ui segment">
      <div class="ui cards three">
        <a class="ui card" align="center" :style="{'background-color': i.color}" v-for="i in friend">
          <div class="content">
            <img class="ui medium circular image" :src="i.img" style="width: 77px;height: 77px;"/>
          </div>
          <div class="content">
            <div class="header">{{ i.name }}</div>
            <div class="description">{{ i.description }}</div>
          </div>
        </a>
      </div>
    </div>
    <div class="ui segment">
      ...
    </div>
  </div>
</template>

<script>
export default {
  name: 'Friends',
  setup() {
    const color = ['rgb(46, 204, 113)', 'rgb(46, 204, 113)', 'rgb(155, 89, 182)', 'rgb(230, 126, 34)', 'rgb(247, 159, 31)', 'rgb(52, 73, 94)']
    const friend = [
      {
        img: require('../../assets/img/avatar.png'),
        name: 'LMDKA',
        description: '拥有伟大梦想的臭咸鱼',
        color: color[Math.floor(Math.random() * 5)]
      },
      {
        img: require('../../assets/img/avatar.png'),
        name: 'LMDKA',
        description: '拥有伟大梦想的臭咸鱼',
        color: color[Math.floor(Math.random() * 5)]
      },
      {
        img: require('../../assets/img/avatar.png'),
        name: 'LMDKA',
        description: '拥有伟大梦想的臭咸鱼',
        color: color[Math.floor(Math.random() * 5)]
      },
      {
        img: require('../../assets/img/avatar.png'),
        name: 'LMDKA',
        description: '拥有伟大梦想的臭咸鱼',
        color: color[Math.floor(Math.random() * 5)]
      },
      {
        img: require('../../assets/img/avatar.png'),
        name: 'LMDKA',
        description: '拥有伟大梦想的臭咸鱼',
        color: color[Math.floor(Math.random() * 5)]
      },
      {
        img: require('../../assets/img/avatar.png'),
        name: 'LMDKA',
        description: '拥有伟大梦想的臭咸鱼',
        color: color[Math.floor(Math.random() * 5)]
      },
    ]
    return {friend, color}
  }
}
</script>

<style>

</style>