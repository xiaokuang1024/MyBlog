<template>
  <div class="ui container">
    <div class="logo" v-if="$route.path==='/home'&&headersIsShow===true"></div>
  </div>
  <div ref="header">
    <Headers v-if="$route.path==='/home'&&logoIsShow===true"/>
  </div>
  <div class="nav">
    <div class="ui secondary menu">
      <div class="ui container">
        <div class="ui header item">Blog</div>
        <router-link to="/home" class="item" :class="{'active':$route.path==='/home'}"><i class="ui home icon"></i>首页
        </router-link>
        <router-link to="/category" class="item" :class="{'active':$route.path==='/category'}">分类<i
            class="ui caret down icon"></i></router-link>
        <router-link to="/monents" class="item" :class="{'active':$route.path==='/monents'}"><i
            class="ui cloud icon"></i>动态
        </router-link>
        <router-link to="/friends" class="item" :class="{'active':$route.path==='/friends'}"><i
            class="ui users icon"></i>小伙伴
        </router-link>
        <router-link to="/about" class="item" :class="{'active':$route.path==='/about'}"><i class="ui info icon"></i>关于我
        </router-link>
        <div class="right menu">
          <div class="item">
            <div class="ui icon input">
              <input type="text" placeholder="Search">
              <i class="search link icon"></i>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import Headers from './Headers.vue';

export default {
  name: "Nav",
  components: {Headers},
  setup() {
    let headersIsShow = false
    let logoIsShow = false
    return {headersIsShow, logoIsShow}
  }
}
</script>

<style scoped>
.nav {
  background-color: white;
}

.logo {
  margin: 0;
  background: url('../../assets/img/logo.png') no-repeat;
  height: 80px;
  width: 220px;
  background-size: cover;
  animation: logo 5s;
}

@keyframes logo {
  from {
    height: 0px;
  }
  to {
    height: 80px;
  }
}
</style>