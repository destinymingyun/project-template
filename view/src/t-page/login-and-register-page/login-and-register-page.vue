<template>
    <div class="login-and-register-page">
        <t-card class="card">
            <div slot="header" class="header">
                <h1>登录</h1>
            </div>
            <t-form @submit="login">
                <t-form-item label="account">
                    <t-input v-model="userAccount.account" placeholder="在此输入帐户"></t-input>
                </t-form-item>
                <t-form-item label="password">
                    <t-input v-model="userAccount.password" password placeholder="在此输入密码"></t-input>
                </t-form-item>
                <t-button mode="primary" long type="submit">立刻登录</t-button>
            </t-form>
        </t-card>
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

    export default {
        name: "login-and-register-page",
        data() {
            return {
                userAccount: new UserAccount(),
            };
        },
        components: {TInput, TFormItem, TForm, TCard, TButton},
        methods: {
            /**
             * 登录函数
             */
            login() {
                accountService.login(this.userAccount).then(
                    response => {
                        console.log(response);
                    }
                );
                event.preventDefault();
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