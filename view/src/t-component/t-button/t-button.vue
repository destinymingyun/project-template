<template>
    <div class="t-button">
        <button :class="[modelType, isLong]" :long="long" :type="type" :mode="mode">
            <slot></slot>
        </button>
    </div>
</template>

<script>
    export default {
        name: "t-button",
        props: {
            //  应该场景
            mode: {
                type: String,
                default: "",
            },
            //  是否独占一行
            long: {
                type: Boolean,
                default: false,
            },
            type: {
                type: String,
                default: "button"
            }
        },
        computed: {
            /**
             * 应用场景类型颜色
             * 若有应用场景，则返回对应应用场景的悬停变浅样式和点击加深样式
             * @return Array | String
             */
            modelType() {
                switch (this.mode) {
                    case "success":
                        return ["success-active-dark", "success-hover-light"];
                    case "warning":
                        return ["warning-active-dark", "warning-hover-light"];
                    case "error":
                        return ["error-active-dark", "error-hover-light"];
                    case "primary":
                        return ["primary-active-dark", "primary-hover-light"];
                    case "info":
                        return ["info-active-dark", "info-hover-light"];
                    case "cancel":
                        return ["cancel-active-dark", "cancel-hover-light"];
                    default:
                        return "";
                }
            },
            /**
                是否独占一行
                若独占一行返回long样式，否则返回空串
                @return String
             */
            isLong() {
                return this.long ? "long" : "";
            }
        }
    };
</script>

<style scoped lang="less">
    .t-button {
        button {
            border: none;
            outline: none;
        }
    }
</style>