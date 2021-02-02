<template>
    <div :class="['t-card', isShadow, 'border-gray-lighter']">
        <header>
            <slot name="header"></slot>
        </header>
        <main>
            <slot name="default"></slot>
        </main>
        <footer>
            <slot name="footer"></slot>
        </footer>
    </div>
</template>

<script>
    export default {
        name: "t-card",
        props: {
            //  边框阴影
            shadow: {
                type: Boolean,
                default: true,
            }
        },
        computed: {
            /**
             * 是否开启阴影
             * 若开启返回默认样式"border-shadow-hover-gray"
             * @return {string}
             */
            isShadow() {
                return this.shadow ? "border-shadow-hover-gray" : "";
            }
        }
    };
</script>

<style scoped lang="less">
    .t-card {
        background-color: #fff;
    }
</style>