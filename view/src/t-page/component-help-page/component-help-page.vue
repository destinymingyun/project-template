<template>
  <div class="component-help-page">
    <t-layout class="t-layout">
      <t-sider class="sider">
        <t-menu style="height: 100%" vertical>
          <t-menu-item title="首页"></t-menu-item>
          <t-menu-item title="组件"></t-menu-item>
          <t-menu-item title="案例"></t-menu-item>
          <t-menu-item title="登录"></t-menu-item>
        </t-menu>
      </t-sider>
      <t-header class="header panel-white border-shadow-gray">
        <t-menu>
          <t-menu-item title="首页"></t-menu-item>
          <t-menu-item title="组件"></t-menu-item>
          <t-menu-item title="案例"></t-menu-item>
          <t-menu-item title="登录"></t-menu-item>
        </t-menu>
      </t-header>
    </t-layout>

  </div>
</template>

<script>
import {TMenu, TMenuItem} from "__tcomponent__/t-menu";
import {TLayout, THeader, TSider} from "__tcomponent__/t-layout";

export default {
  name: "component-help-page",
  components: {TSider, THeader, TLayout, TMenuItem, TMenu},
};
</script>

<style scoped lang="less">
.component-help-page {
  height: 100%;
  .t-layout {
    height: 100%;
    display: flex;
    .header {
      padding: 1em;
      height: 5em;
      width: 100%;
    }
    .sider {
      width: 10em;
    }
  }
}
</style>