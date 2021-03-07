<template>
  <div class="t-message" v-if="isShow">
    <t-alert :mode="mode">{{ text }}</t-alert>
  </div>
</template>

<script>
import TAlert from "__tcomponent__/t-alert";

export default {
  name: "t-message",
  components: {TAlert},
  data() {
    return {
      //  文本内容
      text: "",
      //  场景模式
      mode: "normal",
      isShow: true,
      time: 5000,
      timer: null,
    };
  },
  mounted() {
    this.setTimer();
  },
  methods: {
    /**
     * 组件存留时间计时器
     */
    setTimer() {
      this.timer = setTimeout(() => {
        this.close();
      }, this.time);
    },
    /**
     * 关闭计时器
     */
    close() {
      this.isShow = false;
      clearTimeout(this.timer);
    }
  },
};
</script>

<style scoped lang="less">
.t-message {
  position: absolute;
  left: 50%;
  top: 50%;
}
</style>