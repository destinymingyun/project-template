<template>
  <div class="t-radio-group" v-on="clickListeners">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "t-radio-group",
  props: {
    //  默认值
    value: {
      type: String,
    },
  },
  data() {
    return {
      checkedValue: "",
    }
  },
  methods: {
    /**
     * 当某个单选框按钮碑选择则重置其他单选框并选中该单选框
     * @param element radio-item的chick事件调用该函数时，将自身传入
     */
    tRadioChecked(element) {
      this.checkedValue = element.$props.value;
      let elementStatus = element.status;
      this.$children.forEach(childElement => {
        childElement.status = false;
      })
      element.status = !elementStatus;
    }
  },
  computed: {
    /**
     * 覆盖原生事件
     * @return {Record<string, Function | Function[]> & {input: input}}
     */
    clickListeners: function () {
      return Object.assign({},
          this.$listeners,
          {
            input: () => {
              this.$emit("input", this.checkedValue)
            }
          });
    }
  }
};
</script>

<style scoped lang="less">
  .t-radio-group {
    display: flex;
  }
</style>