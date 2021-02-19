<template>
  <div class="t-dialog" v-show="value">
    <t-card class="model">
      {{value}}
      <slot></slot>
    </t-card>
    <div class="wrapper">
      wrapper
    </div>
  </div>
</template>

<script>
import TCard from "__tcomponent__/t-card";
export default {
  name: "t-dialog",
  components: {TCard},
  props: {
    value: {
      type: Boolean,
      default: false,
    },
  }
};
</script>

<style scoped lang="less">
.t-dialog {
  .model {
    min-width: 300px;
    z-index: 100;
    position: absolute;
    left: 50%;
    top: 50%;
    transform:translate(-50%, -50%);
  }
  .wrapper {
    position: absolute;
    top: 0;
    width: 100%;
    height: 100%;
    background-color: black;
    opacity: 50%;
    z-index: 99;
  }
}

</style>