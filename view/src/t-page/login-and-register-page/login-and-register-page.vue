<template>
  <div class="login-and-register-page">
    <TTarMenu>
      <TTarItem name="login">
        <t-card class="card">
          <div slot="header" class="header">
            <h1>登录</h1>
          </div>
          <t-form @submit="login" :rules="loginRule" :model="userAccount" quick-validate>
            <t-form-item label="account" label-for="account">
              <t-input v-model="userAccount.account" placeholder="在此输入帐户"></t-input>
            </t-form-item>
            <t-form-item label="password" label-for="password">
              <t-input v-model="userAccount.password" password placeholder="在此输入密码"></t-input>
            </t-form-item>
            <t-button mode="primary" long type="submit">立刻登录</t-button>
          </t-form>
        </t-card>
      </TTarItem>
      <TTarItem name="register">register</TTarItem>
    </TTarMenu>

  </div>
</template>

<script>
import TCard from "__tcomponent__/t-card";
import {TForm} from "__tcomponent__/t-form";
import {TFormItem} from "__tcomponent__/t-form";
import TInput from "__tcomponent__/t-input";
import TButton from "__tcomponent__/t-button";
import UserAccount from "__model__/UserAccount";
import accountService from "__service__/AccountService";
import {FormValidate} from "__util__";
import {TTarMenu, TTarItem} from "__tcomponent__/t-tar-menu";

export default {
  name: "login-and-register-page",
  data() {
    return {
      userAccount: new UserAccount(),
      loginRule: {
        account: [new FormValidate.NotNullValidate(),],
        password: [new FormValidate.NotNullValidate(),],
      }
    };
  },
  components: {TInput, TFormItem, TForm, TCard, TButton, TTarItem, TTarMenu},
  methods: {
    /**
     * 登录函数
     */
    login() {
      accountService.login(this.userAccount).then(
          response => {
            this.$store.dispatch("setAccountToken", response.token);
            console.log("token:" + this.$store.getters.getToken);
          }
      );
    }
  }
};
</script>

<style scoped lang="less">
.login-and-register-page {
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;

  .card {
    width: 800px;

    .header {
      text-align: center;
    }
  }
}
</style>