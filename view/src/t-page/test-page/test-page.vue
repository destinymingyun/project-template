<template>
    <div class="test-page">
        <t-input placeholder="inputTest" long></t-input>
        <t-button mode="success" long>按钮</t-button>
        <t-card>
            123
        </t-card>
    </div>
</template>

<script>
    import TInput from "__tcomponent__/t-input";
    import TButton from "__tcomponent__/t-button";
    import TCard from "__tcomponent__/t-card";
    export default {
        name: "test-page",
        components: {TButton, TInput, TCard},
    };
</script>

<style scoped lang="less">
    .test-page {

    }
</style>