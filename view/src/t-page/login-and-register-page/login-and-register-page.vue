<template>
  <div class="login-and-register-page">
    <login></login>
  </div>
</template>

<script>
import Login from "./login";

export default {
  name: "login-and-register-page",
  components: {Login}
};
</script>

<style scoped lang="less">
.login-and-register-page {
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>