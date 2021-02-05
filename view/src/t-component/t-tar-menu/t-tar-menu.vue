<template>
  <div class="t-tar-menu">
    <h6></h6>
    <t-hr></t-hr>
    <slot></slot>
  </div>
</template>

<script>
import THr from "__tcomponent__/t-hr";

export default {
  name: "t-tar-menu",
  data() {
    return {
      tarName: "",
    }
  },
  components: {
    THr,
  }
};
</script>

<style scoped lang="less">

</style>