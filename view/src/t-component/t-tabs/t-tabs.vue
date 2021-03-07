<template>
  <div class="t-tabs">
    <div>
      <div class="header">
        <div v-for="panel of panels" @click="tarPanelTitleClick">
          {{ panel.$props.title }}
        </div>
      </div>
      <div class="panel">
        <slot></slot>
      </div>
    </div>
  </div>
</template>

<script>
import TCard from "__tcomponent__/t-card";

export default {
  name: "t-tabs",
  components: {TCard},
  data() {
    return {
      panels: [],
    };
  },
  mounted() {
    this.panels = this.$children.filter((element) => {
      return element.$el.className === "t-tab-pane";
    });
  },
  methods: {
    tarPanelTitleClick() {

    }
  },
};
</script>

<style scoped lang="less">

</style>