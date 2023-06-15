<template>
  <div class="home">
    <el-button type="primary" size="large" @click="demoTestSelect()">查询</el-button>
    <el-button type="warning" size="large" @click="demoTestAdd()">新增</el-button>
  </div>
</template>

<script>
export default {
  name: 'demoView',
  methods: {
    async demoTestSelect () {
      await this.axios.post('http://localhost:10010/cloud/api/demo/getDemo', {
        id: 1
      }).then(res => {
        alert(res.data.id + ' ' + res.data.name + '' + res.data.number)
      })
    },
    async demoTestAdd () {
      await this.axios.post('http://localhost:10010/cloud/api/demo/addDemo', {
        name: '小垃圾',
        number: 99.88
      }).then(res => {
        alert(res.data)
      })
    }
  }
}
</script>
