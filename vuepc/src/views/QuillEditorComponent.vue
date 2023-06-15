<template>
  <div style="padding: 100px;">
    <QuillEditor ref="quillEditorRef" style="width: 80%; height: 250px;"/>

    <p style="text-align: center; margin-top: 10px;">
      <el-button type="primary" plain @click="handleSetContentClick($event)">设置内容</el-button>
      &nbsp;&nbsp;
      <el-button type="success" plain @click="handleGetContentClick($event)">获取内容</el-button>
    </p>

    <p>
      {{ editorContent }}
    </p>
  </div>
</template>

<script>
import QuillEditor from '@/utils/quillEditor.vue'

export default {
  name: 'QuillEditorComponent',
  components: {
    QuillEditor
  },
  data () {
    return {
      // 编辑器内容
      editorContent: ''
    }
  },
  methods: {
    /**
     * 设置编辑器内容
     */
    async handleSetContentClick (evt) {
      this.$elementUtil.handleElButtonBlur(evt)

      const refs = await this.$refs.quillEditorRef
      const status = await refs.handleSetHtml('<h1>你好世界！</h1>')
      console.log('handleSetContentClick =>', status)
    },

    /**
     * 获取编辑器内容
     */
    async handleGetContentClick (evt) {
      this.$elementUtil.handleElButtonBlur(evt)

      const refs = await this.$refs.quillEditorRef
      this.editorContent = await refs.handleGetHtml()
      console.log('handleGetContentClick =>', this.editorContent)
    }
  }
}
</script>
