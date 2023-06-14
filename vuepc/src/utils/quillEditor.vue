<template>
  <QuillEditor
    ref="quill"
    toolbar="full"
    theme="snow"
    content-type="html"
    :disabled="true"
    :content="content"
    :options="options"
  />
</template>

<script>
import { QuillEditor } from '@vueup/vue-quill'
import '@vueup/vue-quill/dist/vue-quill.snow.css'

export default ({
  components: {
    QuillEditor
  },
  data () {
    return {
      // 编辑器内容
      content: '',

      // 编辑器选项
      options: {
        debug: 'info',
        modules: {
          toolbar: ['bold', 'italic', 'underline']
        },
        placeholder: '请输入内容~',
        readOnly: false,
        theme: 'snow'
      }
    }
  },
  methods: {
    /**
     * 设置编辑器 Text 内容
     */
    async handleSetText (content) {
      const refs = await this.$refs
      refs.quill.setText(content)
      return 'OK'
    },

    /**
     * 获取编辑器 Text 内容
     */
    async handleGetText () {
      const refs = await this.$refs
      return refs.quill.getText()
    },

    /**
     * 设置编辑器 Html 代码
     */
    async handleSetHtml (content) {
      const refs = await this.$refs
      refs.quill.setHTML(content)
      return 'OK'
    },

    /**
     * 获取编辑器 Html 代码
     */
    async handleGetHtml () {
      const refs = await this.$refs
      return refs.quill.getHTML()
    }
  }
})
</script>
