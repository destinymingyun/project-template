<template>
  <div class="t-select">
    <div @click="inputClick">
      <t-input long :value="inputValue" :placeholder="placeholder" :readonly="onlySelect"/>
    </div>
    <div v-show="showOption">
      <slot></slot>
    </div>
  </div>
</template>

<script>
import TInput from "__tcomponent__/t-input";
export default {
  name: "t-select",
  components: {TInput},
  props: {
    //  值
    value: {
      type: String | Array
    },
    //  提示语
    placeholder: {
      type: String,
      default: "",
    },
    //  只允许选
    onlySelect: {
      type: Boolean,
      default: false,
    }
  },
  data() {
    return {
      showOption: false,
      inputValue: "",
    };
  },
  methods: {
    /**
     * 添加点击事件
     */
    inputClick() {
      this.showOption = !this.showOption;
    },
    /**
     * 更新value值,并收起下拉框
     * @param element
     */
    updateValue(element) {
      this.inputValue = element.value;
      this.inputClick();
    }
  }
};
</script>

<style scoped lang="less">
  .t-select {

  }
</style>