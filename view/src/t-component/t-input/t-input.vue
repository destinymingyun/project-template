<template>
    <div class="t-input">
        <input v-on="inputListeners" :class="[isLong]" :long="long" :mode="mode" :name="name"
               :placeholder="placeholder" :type="isPassword" :value="value"/>
    </div>
</template>

<script>
    export default {
        name: "t-input",
        props: {
            //  输入框值
            value: {
                type: String,
            },
            //  是否未密码模式
            password: {
                type: Boolean,
                default: false,
            },
            //  提醒
            placeholder: {
                type: String,
            },
            //  名字
            name: {
                type: String,
            },
            //  应用场景类型
            mode: {
                type: String,
            },
            //  长
            long: {
                type: Boolean,
                default: false,
            },
        },
        methods: {

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
                        input: (event) => {
                            this.$emit("input", event.target.value)
                        }
                    });
            },
            /**
             * 设置是否密码模式
             * 若password字段为true，则设置input为密码模式
             * @return String
             */
            isPassword() {
                return this.password ? "password" : "input";
            },
            /**
             * 是否独占一行
             * 若long字段为true则独占一行
             * @return {string}
             */
            isLong() {
                return this.long ? "long" : "";
            }
        }
    };
</script>

<style scoped lang="less">
    .t-input {
        input {
            outline: none;
            border: none;
        }
    }
</style>