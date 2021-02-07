<template>
  <div class="t-option panel-white-hover-primary-light" @click="click">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "t-option",
  props: {
    value: {
      type: String,
    }
  },
  methods: {
    /**
     * 点击按钮事件
     */
    click() {
      if (this.$parent.$options.name === "t-select") {
        this.$parent.updateValue(this);
      }
    },
  }
};
</script>

<style scoped>

</style>