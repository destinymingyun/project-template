<template>
  <div :class="['t-alert', modeClass]">
    <slot></slot>
  </div>
</template>

<script>
import Mode from "__protocol__/Mode";

export default {
  name: "t-alert",
  props: {
    //  类型，默认为normal,还有info，warning，error，success,类型
    mode: {
      type: String,
      default: "normal",
    },
  },
  computed: {
    /**
     * 应用场景样式
     * 返回mode对应的class
     */
    modeClass() {
      switch (this.mode) {
        case Mode.INFO:
          return ["alert-info", "border-light-info"];
        case Mode.SUCCESS:
          return ["alert-success", "border-light-success"];
        case Mode.ERROR:
          return ["alert-error", "border-light-error"];
        case Mode.WARNING:
          return ["alert-warning", "border-light-warning"];
        default:
          return "";
      }
    }
  },
};
</script>

<style scoped lang="less">
.t-alert {

}
</style>