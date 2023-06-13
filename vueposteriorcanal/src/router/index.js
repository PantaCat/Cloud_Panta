import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import HomeVue from '@/components/main/HomeVue'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HomeVue',
      component: HomeVue
    },
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    }

  ]
})
