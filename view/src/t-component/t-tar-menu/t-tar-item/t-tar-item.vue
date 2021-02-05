<template>
  <div class="t-tar-item">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "t-tar-item",
  props: {
    //  标签页名
    name: {
      type: String,
      default: undefined,
    }
  }
};
</script>

<style scoped>

</style>