<template>
  <div class="test-page">
    {{ this.$store.getters.getToken }}
    <t-input placeholder="inputTest" long></t-input>
    <t-button mode="success" long>按钮</t-button>
    <t-card>
      123
    </t-card>
    <t-radio-group v-model="radio">
      <t-radio-item value="男" name="1">男</t-radio-item>
      <t-radio-item value="女" name="1">女</t-radio-item>
    </t-radio-group>
    {{ radio }}
    <t-check-box v-model="checkbox">
      <t-check-box-item value="aa">aaa</t-check-box-item>
      <t-check-box-item value="bb">bbb</t-check-box-item>
    </t-check-box>
    {{checkbox}}
    <t-select v-model="selectValue" placeholder="在此选择" onlySelect>
      <t-option value="select1">a b c</t-option>
      <t-option value="select2">a b c</t-option>
    </t-select>
  </div>
</template>

<script>
import TInput from "__tcomponent__/t-input";
import TButton from "__tcomponent__/t-button";
import TCard from "__tcomponent__/t-card";
import {TRadioItem} from "__tcomponent__/t-radio-group";
import {TRadioGroup} from "__tcomponent__/t-radio-group";
import {TCheckBox} from "__tcomponent__/t-check-box";
import TCheckBoxItem from "__tcomponent__/t-check-box/t-check-box-item";
import {TSelect} from "__tcomponent__/t-select";
import {TOption} from "__tcomponent__/t-select";

export default {
  name: "test-page",
  components: {TCheckBoxItem, TCheckBox, TRadioGroup, TRadioItem, TButton, TInput, TCard, TSelect, TOption},
  data() {
    return {
      radio: "",
      checkbox: new Array(0),
      selectValue: "",
    };
  },
}
;
</script>

<style scoped lang="less">
.test-page {

}
</style>