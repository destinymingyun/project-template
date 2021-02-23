<template>
  <svg class="t-icon" viewBox="0 0 1024 1024" :fill="color">
    <path :d="getType"/>
  </svg>
</template>

<script>
import iconPath from "./icon-path";

export default {
  name: "t-icon",
  props: {
    //  图标类型
    icon: {
      type: String,
      default: null,
    },
    color: {
      type: String,
      default: "black",
    }
  },
  computed: {
    getType() {
      switch (this.icon) {
        case "password":
          return iconPath.passwordSvg;
        case "user":
          return iconPath.userSvg;
        case "search":
          return iconPath.searchSvg;
        default:
          return null;
      }
    }
  }
};
</script>

<style scoped lang="less">
.t-icon {
  width: 1em;
  height: 1em;
  vertical-align: -0.15em;
  overflow: hidden;
}
</style>