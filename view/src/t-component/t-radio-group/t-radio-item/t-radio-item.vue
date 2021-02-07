<template>
  <div class="t-radio-item">
    <input type="radio" :name="name" @click="checked" :checked="status"><slot></slot>
  </div>
</template>

<script>
export default {
  name: "t-radio-item",
  props: {
    //  该单选框的值
    value: {
      type: String,
      default: null,
    },
    //  该单选框的状态
    radioStatus: {
      type: Boolean,
      default: false,
    },
    name: {
      type: String,
      default: null,
    }
  },
  data() {
    return {
      status: this.radioStatus,
    };
  },
  methods: {
    /**
     * 单选框点击事件
     * @return {default.radioStatus}
     */
    checked() {
      this.$parent.tRadioChecked(this);
    }
  }
};
</script>

<style scoped lang="less">
  .t-radio-item {
    margin-right: 10px;
  }
</style>