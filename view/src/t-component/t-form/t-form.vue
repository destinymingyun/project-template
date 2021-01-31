<template>
    <div class="t-form">
        <form @submit="submitForm" @reset="resetForm" method="post">
            <slot></slot>
        </form>
    </div>
</template>

<script>
    export default {
        name: "t-form",
        methods: {
            /**
             * 对外透原生表单submit事件
             */
            submitForm() {
                this.$emit("submit");
            },
            /**
             * 对外透明reset原生表单reset事件
             */
            resetForm() {
                this.$emit("reset");
            }
        }
    };
</script>

<style scoped lang="less">
    .t-form {

    }
</style>