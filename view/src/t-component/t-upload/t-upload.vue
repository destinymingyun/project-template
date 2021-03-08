<template>
  <div class="t-upload">
    <t-form enctype="multipart/form-data">
      <input type="file" ref="file" @change="upload"/>
      <slot></slot>
    </t-form>
  </div>
</template>

<script>
import {TForm} from "__tcomponent__/t-form";
import FileServiceImpl from "__service__/file-service";
export default {
  name: "t-upload",
  components: {TForm},
  data() {
    return {
      file: "",
    };
  },
  methods: {
    /**
     * 文件上传
     */
    upload(event) {
      let fileServiceImpl =new FileServiceImpl();
      let formData = new FormData();
      formData.append("file", this.$refs.file.files[0]);
      fileServiceImpl.upload(formData).then(response => {
        console.log(response);
      })
    }
  }
};
</script>

<style scoped lang="less">

</style>