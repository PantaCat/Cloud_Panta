import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'
import axios from 'axios'
import vueAxios from 'vue-axios'

const app = createApp(App)
app.use(ElementPlus, {
  size: 'small',
  zIndex: 3000,
  locale: zhCn
})
app.use(router)
app.use(vueAxios, axios)
app.mount('#app')
