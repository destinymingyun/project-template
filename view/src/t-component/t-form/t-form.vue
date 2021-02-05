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
    },
    //  快速表单验证，开启后则不需要提交自动验证
    quickValidate: {
      type: Boolean,
      default: false,
    }
  },
  methods: {
    /**
     * 对外透视原生表单submit事件
     */
    submitForm() {
      event.preventDefault();
      this.validateForm();
      this.$emit("submit");
    },
    /**
     * 对外透明reset原生表单reset事件
     */
    resetForm() {
      this.$emit("reset");
    },
    /**
     * 整个表单验证函数
     **/
    validateForm() {
      for (let property in this.model) {
        //  当该属性不为函数且为需要验证规则的属性
        if (typeof (property) !== "function" && this.rules.hasOwnProperty(property)) {
          this.validate(property);
        }
      }
    },
    /**
     * 单个属性验证
     */
    validate(property) {
      let propertyValidates = this.rules[property];
      for (let formValidate of propertyValidates) {
        //  如果验证不通过,则修改对应item样式，通过则设置该样式为
        if (!formValidate.validate(this.model[property])) {
          for (let element of this.$children) {
            if (element.$props.hasOwnProperty("labelFor") && element.$props.labelFor === property) {
              element.$data.mode = formValidate.mode;
              element.$data.msg = formValidate.msg;
              return;
            }
          }
        }
      }
      for (let element of this.$children) {
        if (element.$props.hasOwnProperty("labelFor") && element.$props.labelFor === property) {
          element.$data.mode = null;
          element.$data.msg = null;
          return;
        }
      }
      console.log(this.$children);
    },
  }
};
</script>

<style scoped lang="less">
.t-form {

}
</style>