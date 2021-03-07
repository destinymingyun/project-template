<template>
  <div class="t-upload">
    <t-form enctype="multipart/form-data">
      <input type="file"/>
      <button type="submit">提交</button>
    </t-form>
  </div>
</template>

<script>
import {TForm} from "__tcomponent__/t-form";
export default {
  name: "t-upload",
  components: {TForm},
};
</script>

<style scoped lang="less">

</style>