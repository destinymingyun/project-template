<template>
  <div :class="['t-menu-item', isActiveStyle]" @click="click">
    <router-link :to="to"><h2 :class="isActiveStyle">{{title}}</h2></router-link>
  </div>
</template>

<script>
export default {
  name: "t-menu-item",
  props: {
    //  要跳转的页面
    to: {
      type: String,
      default: "",
    },
    //  标题
    title: {
      type: String,
      default: "",
    },
    //  名字
    name: {
      type: String,
      default: "",
    },
    //  是否默认被选中
    active: {
      type: Boolean,
      default: false,
    }
  },
  data() {
    return {
      activeMenu: this.active,
    };
  },
  methods: {
    /**
     * 按钮点击事件
     */
    click() {
      this.activeMenu = !this.activeMenu;
    }
  },
  computed: {
    isActiveStyle() {
      return this.activeMenu ? ["alert-info", "font-primary"] : "";
    }
  }
};
</script>

<style scoped lang="less">
.t-menu-item {

}
.t-menu-item:active {

}
</style>