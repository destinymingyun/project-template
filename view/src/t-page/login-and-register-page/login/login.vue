<template>
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
</template>

<script>
import TCard from "__tcomponent__/t-card";
import {TForm, TFormItem} from "__tcomponent__/t-form";
import TInput from "__tcomponent__/t-input";
import TButton from "__tcomponent__/t-button";
import UserAccount from "__model__/UserAccount";
import accountService from "__service__/account-service";
import {FormValidate} from "__util__";
import ResponseCode from "__protocol__/ResponseCode";
import Mode from "__protocol__/Mode";

export default {
  name: "login",
  components: {TInput, TFormItem, TForm, TCard, TButton,},
  data() {
    return {
      userAccount: new UserAccount(),
      loginRule: {
        account: [new FormValidate.NotNullValidate(),],
        password: [new FormValidate.NotNullValidate(),],
      }
    };
  },
  methods: {
    /**
     * 登录函数
     */
    login() {
      accountService.login(this.userAccount).then(
          response => {
            //  登录成功
            if (response.code === ResponseCode.SUCCESS) {
              this.$store.dispatch("setAccountToken", response.token);

            }
            //  登录失败
            else {
              this.$message("账户或密码错误", Mode.ERROR)
            }
          }
      );
    }
  }
};
</script>

<style scoped lang="less">
.card {
  width: 800px;
  padding: 10px;

  .header {
    text-align: center;
  }
}
</style>