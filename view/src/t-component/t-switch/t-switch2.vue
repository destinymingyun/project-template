<template>
  <label class="t-switch2">
    <input class="switch" type="checkbox" :value="value"/><slot></slot>
  </label>
</template>

<script>
export default {
  name: "t-switch2",
};
</script>

<style scoped lang="less">
.t-switch2 {
  display: block;
  position: relative;
  width: 3em;
  height: 1em;
  background-color: gray;
}

.switch::after{
  content: "";
  position: absolute;
  width: 1em;
  height: 1em;
  background-color: yellow;
}

.switch {
  position: absolute;
  transition: all 2s;
}

.switch:checked {
  transform: translateX(2em);
}
</style>