<template>
  <div class="ui container">
    <!--  logo  -->
    <div :class="{'logo':logoIsShow===true,'logos':logoIsShow===false}"></div>
  </div>
  <div ref="header">
    <!--  大屏幕图片  -->
    <Headers v-if="$route.path==='/home'&&headersIsShow===true" @click="headersIsShow=!headersIsShow"/>
  </div>
  <div class="nav">
    <div class="ui secondary menu">
      <div class="ui container">
        <div class="ui header item" @click="logoIsShow=!logoIsShow">Blog</div>
        <router-link to="/home" class="item" :class="{'active':$route.path==='/home'}"><i class="ui home icon"></i>首页
        </router-link>
        <router-link to="/category" class="item" :class="{'active':$route.path==='/category'}">分类<i
            class="ui caret down icon"></i></router-link>
        <router-link to="/moments" class="item" :class="{'active':$route.path==='/moments'}"><i
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

<script setup>
import Headers from './Headers.vue';
import {ref} from "vue";
import store from "@/store";

let headersIsShow = ref(store.state.setting.headersEnabled)
let logoIsShow = ref(store.state.setting.logoEnabled)

</script>

<style scoped>
.nav {
  background-color: white;
}

.logo {
  margin: 0;
  background: url('../../assets/img/logo.png') no-repeat;
  width: 220px;
  background-size: cover;
  animation: logo 2.5s;
  height: 80px;
}

.logos {
  margin: 0;
  background: url('../../assets/img/logo.png') no-repeat;
  width: 220px;
  background-size: cover;
  animation: logos 1.5s;
  height: 0px;
}

@keyframes logo {
  from {
    height: 0px;
  }
  to {
    height: 80px;
  }
}

@keyframes logos {
  from {
    height: 80px;
  }
  to {
    height: 0px;
  }
}


</style>