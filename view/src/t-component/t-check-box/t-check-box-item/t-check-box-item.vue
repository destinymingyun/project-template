<template>
  <div class="t-check-box-item">
    <input type="checkbox" :value="value" @click="click"/><slot></slot>
  </div>
</template>

<script>
export default {
  name: "t-check-box-item",
  props: {
    value: {
      type: String,
    },
  },
  methods: {
    /**
     * 点击事件
     */
    click() {
      this.$parent.updateValue(this);
    }
  }
};
</script>

<style scoped lang="less">
  .t-check-box-item {
    margin-right: 10px;
  }
</style>