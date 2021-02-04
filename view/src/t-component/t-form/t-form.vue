<template>
  <div class="t-form">
    <form @submit="submitForm" @reset="resetForm" method="post">
      <slot></slot>
    </form>
  </div>
</template>

<script>
export default {
  name: "t-form",
  props: {
    // 表单验证规则
    rules: {
      type: Object,
      default: null,
    },
    // 表单数据
    model: {
      type: Object,
      default: null,
    }
  },
  methods: {
    /**
     * 对外透视原生表单submit事件
     */
    submitForm() {
      for (let property in this.model) {
        //  当该属性不为函数且为需要验证规则的属性
        if (typeof (property) !== "function" && this.rules.hasOwnProperty(property)) {
          let propertyValidates = this.rules[property];
          for (let formValidate of propertyValidates) {
            //  如果验证不通过
            if (!formValidate.validate(this.model[property])) {
              for (let element of this.$children) {
                if (element.$props.hasOwnProperty("labelFor") && element.$props.labelFor === property) {
                  element.$data.mode = formValidate.mode;
                  element.$data.msg = formValidate.msg;
                }
              }
            }
          }
        }
      }
      this.$emit("submit");
      event.preventDefault();
    },
    /**
     * 对外透明reset原生表单reset事件
     */
    resetForm() {
      this.$emit("reset");
    }
  }
};
</script>

<style scoped lang="less">
.t-form {

}
</style>