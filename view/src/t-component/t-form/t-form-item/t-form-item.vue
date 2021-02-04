<template>
  <div class="t-form-item">
    <label :label="label" v-show="isShowLabel">{{ label }}</label>
    <slot></slot>
    <t-alert :mode="mode" v-show="isShowAlert">
      {{msg}}
    </t-alert>
  </div>
</template>

<script>
import TAlert from "__tcomponent__/t-alert";

export default {
  name: "t-form-item",
  components: {
    TAlert,
  },
  props: {
    //  标题
    label: {
      type: String,
      default: "",
    },
    //  标注名
    labelFor: {
      type: String,
      default: "",
    },
  },
  data() {
    return {
      mode: "",
      msg: "",
    }
  },
  computed: {
    /**
     * 是否显示label标签
     * 若label为空或空串则返回false，否则返回true
     * @return Boolean
     */
    isShowLabel() {
      return !(this.label == null || this.label === "" || this.label === undefined);
    },
    /**
     * 是否显示alert框
     * 若为true显示，否则不显示
     * @return boolean
     */
    isShowAlert() {
      return !(this.mode === "" || this.mode === undefined || this.mode === "");
    },
  }
};
</script>

<style scoped lang="less">
.t-form-item {

}
</style>