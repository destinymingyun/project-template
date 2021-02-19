<template>
  <div class="t-hr">
    <div class="t-hr-line"></div>
    <div class="t-hr-text" v-if="haveText">{{ text }}</div>
    <div class="t-hr-line"></div>
  </div>
</template>

<script>
export default {
  name: "t-hr",
  props: {
    //  文本
    text: {
      type: String,
      default: "",
    }
  },
  computed: {
    /**
     *  判断是否有文字
     *  有返回true，否则返回false
     *  @return Boolean
     */
    haveText() {
      return !(this.text === null || this.text === undefined || this.text === "");
    },
  },
};
</script>

<style scoped lang="less">
.t-hr {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 0 1%;
  .t-hr-text {
    margin: 0 5px;
  }
  .t-hr-line {
    height: 1px;
    width: 100%;
    background-color: #9ea7b4;
  }
}
</style>