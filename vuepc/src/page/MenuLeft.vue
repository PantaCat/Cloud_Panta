<template>
  <el-row class="tac">
    <el-col :span="4">
      <h5 class="mb-2" align="center">导航栏</h5>
      <el-menu
        router
        :default-active="this.$route.path"
        class="el-menu-vertical-demo"
        style="height: calc(100% - 60px);overflow: auto;"
      >
        <el-menu-item index="/" align="center"><img style="height: 30px;width: 30px;" src="../assets/logo.png">&nbsp;&nbsp;首页</el-menu-item>
        <el-sub-menu index="1">
          <template #title>
            <el-icon><location /></el-icon>
            <span>记录本</span>
          </template>
            <el-menu-item index="/about">临时区域</el-menu-item>
            <el-menu-item index="1-2">item two</el-menu-item>
          <el-sub-menu index="1-4">
            <template #title>item four</template>
            <el-menu-item index="1-4-1">item one</el-menu-item>
          </el-sub-menu>
        </el-sub-menu>
      </el-menu>
    </el-col>
    <router-view/>
  </el-row>
</template>

<script>
export default {
  name: 'MenuLeft'
}
</script>

<style scoped>

</style>
