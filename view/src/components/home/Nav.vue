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

        <el-dropdown trigger="click">
          <a class="item" :class="{'active':$route.path==='/category'}">
            分类
            <i class="ui caret down icon">
              <arrow-down/>
            </i>
          </a>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item>
                <router-link to="/category">学习笔记</router-link>
              </el-dropdown-item>
              <el-dropdown-item>
                <router-link to="/category">个人项目</router-link>
              </el-dropdown-item>
              <el-dropdown-item>
                <router-link to="/category">技术杂烩</router-link>
              </el-dropdown-item>
              <el-dropdown-item>
                <router-link to="/category">心情随写</router-link>
              </el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
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
import {useStore} from "vuex";

let store = useStore()

let headersIsShow = ref(store.state.setting.headersIsShow)
let logoIsShow = ref(store.state.setting.logoIsShow)

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