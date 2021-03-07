<template>
  <div class="t-tab-pane">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "t-tab-pane",
  props: {
    //  tab标题
    title: {
      type: String,
      value: "",
    },
  },
};
</script>

<style scoped lang="less">

</style>