<template>
  <div class="t-check-box" v-on="checkListeners">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "t-check-box",
  props: {
    value: {
      type: Array,
    },
  },
  data() {
    return {
      valueArray: [],
    }
  },
  methods: {
    /**
     * @param element: 被点击事件触发的子组件自身
     **/
    updateValue(element) {
      let elementValue = element.$props.value;
      let valueArrayFindValue = this.value.find(arrayValue => arrayValue === elementValue);
      console.log(this.value)
      if (valueArrayFindValue === undefined) {
        this.value.push(elementValue);
      } else {
        this.value.splice(this.value.findIndex(arrayValue => arrayValue === elementValue), 1);
      }
    },
  },
  computed: {
    /**
     * 覆盖默认v-model
     */
    checkListeners() {
      return Object.assign({}, this.$listeners, {
        input: () => {
          return this.$emit("input", this.value);
        }
      })
    },
  }
};
</script>

<style scoped lang="less">
.t-check-box {
  display: flex;
}
</style>