import {createApp} from 'vue'
import App from './App.vue'
import router from "@/router"
import 'semantic-ui-css/semantic.css'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import store from "@/store";
console.log('勤奋，重复，大量的练习，是给每个普通人成才的机会。')
let app = createApp(App)
app.use(router)
app.use(ElementPlus)
app.use(store)
app.mount('#app')
