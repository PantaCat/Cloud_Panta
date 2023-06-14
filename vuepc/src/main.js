import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'
import VueQuillTextEditor from 'vue-quill-text-editor'
import 'vue-quill-text-editor/dist/vue-quill-text-editor.esm.css'

const app = createApp(App)
app.use(ElementPlus, {
  size: 'small',
  zIndex: 3000,
  locale: zhCn
})
app.use(router)
app.use(VueQuillTextEditor)
app.mount('#app')
