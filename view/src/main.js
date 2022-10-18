import {createApp} from 'vue'
import App from './App.vue'
// 路由router
import router from './router'
// semantic-ui-css
import 'semantic-ui-css/semantic.css'
// 数据仓库store
import store from "@/store";
// element-plus
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

console.log('欢迎来到小邝同学写的非常Low的Blog')
console.log('寄语：勤奋，重复，大量的练习，是给每个普通人成才的机会。')
const app = createApp(App)
app.use(router)
app.use(store)
app.use(ElementPlus)
app.mount('#app')