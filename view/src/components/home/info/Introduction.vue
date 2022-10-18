<template>
  <div class="ui card" style="width:100%">
    <div class="image">
      <img :src="avatar"/>
    </div>
    <div class="content" align="center">
      <!-- 名称显示 -->
      <h3 v-text="name"></h3>
      <!-- 彩色滚动字体 -->
      <span v-text="rollText"></span>
    </div>
    <div class="content" align="center">
      <a :href="contactWay.github" target="_blank" class="ui circular icon button">
        <i class="icon github black"></i>
      </a>
      <a :href="contactWay.twitter" target="_blank" class="ui circular icon button">
        <i class="icon twitter blue"></i>
      </a>
      <a :href="contactWay.telegram" target="_blank" class="ui circular icon button">
        <i class="icon telegram plane blue"></i>
      </a>
      <a :href="contactWay.netease" target="_blank" class="ui circular icon button">
        <i class="icon music red"></i>
      </a>
      <a :href="contactWay.email" target="_blank" class="ui circular icon button">
        <i class="icon mail teal"></i>
      </a>
    </div>
    <!--  六边形数据  -->
    <el-collapse class="content" style="padding: 0 15px;width: 100%">
      <el-collapse-item title="我的六边形数据">
        <div ref="chart" style="height: 280px;width: 223px;"></div>
      </el-collapse-item>
    </el-collapse>
  </div>

</template>

<script setup>
import store from "@/store";
import * as echarts from 'echarts'
import {ref} from "vue";
import {onMounted} from "@vue/runtime-core";

const setting = store.state.setting
const avatar = setting.avatar
const name = ref(setting.name)
const rollText = ref(setting.rollText)
const contactWay = ref({
  github: setting.github,
  twitter: setting.twitter,
  telegram: setting.telegram,
  netease: setting.netease,
  email: setting.email
})
let chart = ref()
// console.log(chart)
onMounted(() => {
  echarts.init(chart.value).setOption({
    radar: {
      indicator: [
        {name: '饭桶', max: 100},
        {name: '水桶', max: 100},
        {name: '创新', max: 100},
        {name: '心情', max: 100},
        {name: '勤奋', max: 100},
        {name: '努力', max: 100},
      ]
    },
    series: [
      {
        type: 'radar',
        data: [
          {
            value: [99, 55, 22, 77, 55, 66],
            areaStyle: {
              color: 'rgba(255, 145, 124, 0.9)'
            },
            itemStyle: {
              color: 'rgba(255, 145, 124, 0.9)'
            }
          }
        ]
      }
    ]
  })
})

</script>