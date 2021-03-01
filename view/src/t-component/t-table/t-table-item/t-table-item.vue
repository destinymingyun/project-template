<template>
  <td class="t-table-item">
    <slot></slot>
  </td>
</template>

<script>
export default {
  name: "t-table-item",
  props: {
    //  选项标题
    title: {
      type: String,
      default: "",
    },
  },
};
</script>

<style scoped lang="less">
.t-table-item {
}
</style>