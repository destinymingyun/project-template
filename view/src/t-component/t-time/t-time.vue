<template>
  <div class="t-time">
    {{timeData}}
  </div>
</template>

<script>
export default {
  name: "t-time",
  props: {
    //  时间
    time: {
      type: Date,
      default: null,
    }
  },
  computed: {
    timeData: function () {
      if (this.time === null) {
        let date = new Date();
        return `${date.getFullYear()}年${date.getMonth()+1}月${date.getDate()}日`;
      }
      return "2";
    }
  }
};
</script>

<style scoped lang="less">

</style>