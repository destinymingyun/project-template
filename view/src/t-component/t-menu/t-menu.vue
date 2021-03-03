<template>
  <div :class="['t-menu', 'panel-white', isVertical]" v-on="inputListeners">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "t-menu",
  props: {
    //  选择菜单时值
    value: {
      type: String,
      default: null,
    },
    //  菜单是否垂直
    vertical: {
      type: Boolean,
      default: false,
    }
  },
  data() {
    return {
      activeName: this.value,
    };
  },
  computed: {
    /**
     * 修改默认事件
     * 返回覆盖后的该组件事件
     * @return Object
     */
    inputListeners() {
      return Object.assign({},
          this.$listeners,
          {
            input: () => {
              this.$emit("input", activeName);
            }
          });
    },
    /**
     * 是否垂直，若vertical为true，返回垂直样式
     */
    isVertical() {
      return this.vertical ? "vertical" : "";
    }
  }
};
</script>

<style scoped lang="less">
  .t-menu {
    display: flex;
  }
  .vertical{
    flex-direction: column;
  }
</style>