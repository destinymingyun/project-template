<template>
    <div class="t-form-item">
        <label :label="label">{{label}}</label>
        <slot></slot>
    </div>
</template>

<script>
    export default {
        name: "t-form-item",
        props: {
            label: {
                type: String,
                default: "",
            }
        },
        computed: {
            /**
             * 是否显示label标签
             * 若label为空或空串则返回false，否则返回true
             * @return Boolean
             */
            isShowLabel() {
                return !(this.label == null || this.label === "");
            }
        }
    };
</script>

<style scoped lang="less">
    .t-form-item {

    }
</style>