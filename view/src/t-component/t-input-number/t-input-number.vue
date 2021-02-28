<template>
  <div class="t-input-number" v-on="inputListeners">
    <t-input v-model="inputValue" :radius="radius">
      <slot slot="prefix">
        <t-icon icon="subtract" @click="subtract"></t-icon>
      </slot>
      <slot slot="suffix">
        <t-icon icon="add" @click="add"></t-icon>
      </slot>
    </t-input>
  </div>
</template>

<script>
import TInput from "__tcomponent__/t-input";
import TIcon from "__tcomponent__/t-icon";
export default {
  name: "t-input-number",
  props: {
    //  默认初始值
    value: {
      type: Number,
    },
    //  是否开启圆角
    radius: {
      type: Boolean,
      default: false,
    },
    //  步长
    step: {
      type: Number,
      default: 1,
    },
  },
  components: {TIcon, TInput},
  data() {
    return {
      inputValue: this.value,
    }
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
              this.$emit("input", this.inputValue)
            }
          });
    },
  },
  methods: {
    /**
     * 数值减对应步长
     */
    subtract() {
      this.inputValue -= this.step;
    },
    /**
     * 数值加对应步长
     */
    add() {
      this.inputValue += this.step;
    },
  },
  watch: {
    inputValue(newValue, oldValue) {
      if (typeof this.inputValue == "string") {
        if (isNaN(Number(this.inputValue))) {
          this.inputValue = oldValue;
        }
        this.inputValue = Number(this.inputValue);
      }
    }
  }
};
</script>

<style scoped lang="less">

</style>