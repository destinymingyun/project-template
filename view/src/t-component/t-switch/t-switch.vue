<template>
  <div class="t-switch">
    <div>
      {{offTitle}}
    </div>
    <div class="switch" :style="boxStyle">
      <div class="switch-button" @click="onOffClick" :style="switchStyle"></div>
    </div>
    <div>
      {{onTitle}}
    </div>
  </div>
</template>

<script>
import {Translate} from "__util__/style-util"
export default {
  name: "t-switch",
  props: {
    //  背景盒样式
    boxStyle: {
      type: Object,
      default: () => {
        return {
          backgroundColor: "#edfff3",
        };
      },
    },
    //  滑块样式
    switchStyle: {
      type: Object,
      default: () => {
        return {
          backgroundColor: "#2db7f5",
        };
      },
    },
    //  关闭时样式
    offTitle :{
      type: String,
      default: "",
    },
    //  启用时样式
    onTitle :{
      type: String,
      default: "",
    },
  },
  data() {
    return {
      onOffStatus: false,
    };
  },
  methods: {
    /**
     * onOff点击事件
     */
    onOffClick(event) {
      let element = event.target;
      if (this.onOffStatus === false) {
        Translate.translateX(0, 2, 2, element)
      } else {
        Translate.translateX(2, 0, 2, element)
      }
      this.onOffStatus = !this.onOffStatus;
      this.$emit("input", this.onOffStatus);
    },
  },
  computed: {
    /**
     * 控制滑块样式动画
     */
    switchStatus() {
      if (this.onOffStatus === true) {
        return "switch-on";
      } else {
        return "switch-off"
      }
    }
  }
};
</script>

<style scoped lang="less">
.t-switch {
  display: flex;
  align-items: center;
  .switch {
    width: 3em;
    height: 1em;
    border-radius: 0.5em;
    border: 0.01em #abdcff solid;
    display: flex;
    align-items: center;
  }

  .switch-button {
    width: 0.8em;
    height: 0.8em;
    border-radius: 0.5em;
  }
}
</style>