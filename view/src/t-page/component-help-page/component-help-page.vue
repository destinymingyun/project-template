<template>
  <div class="component-help-page">
    <t-menu>
      <t-menu-item title="首页"></t-menu-item>
      <t-menu-item title="组件"></t-menu-item>
      <t-menu-item title="案例"></t-menu-item>
      <t-menu-item title="登录"></t-menu-item>
    </t-menu>
  </div>
</template>

<script>
import {TMenu, TMenuItem} from "__tcomponent__/t-menu";

export default {
  name: "component-help-page",
  components: {TMenuItem, TMenu},
};
</script>

<style scoped>

</style>