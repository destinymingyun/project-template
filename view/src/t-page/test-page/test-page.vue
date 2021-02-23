<template>
  <div class="test-page">
    {{ this.$store.getters.getToken }}
    <t-input placeholder="inputTest" long><t-icon icon="user" slot="prefix"></t-icon></t-input>
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
    <t-time></t-time>
    <t-input></t-input>
    <t-form :model="form" :rules="formRule">
      <t-form-item label-for="input">
        <t-input v-model="form.input" placeholder="123"></t-input>
      </t-form-item>
      <t-form-item>
        <t-button type="submit">提交</t-button>
      </t-form-item>
    </t-form>
    {{form.input}}
    <t-button @click="modelButton">模块框</t-button>
    <t-dialog v-model="model">
      <t-button @click="modelButton" mode="primary">模块框</t-button>
    </t-dialog>
    <div>
      <h1><t-icon icon="user" color="blue"></t-icon></h1>
    </div>
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
import TTime from "__tcomponent__/t-time";
import {TForm} from "__tcomponent__/t-form";
import {TFormItem} from "__tcomponent__/t-form";
import FormValidate from "__util__/form-validate";
import TDialog from "__tcomponent__/t-dialog";
import TIcon from "__tcomponent__/t-icon";

export default {
  name: "test-page",
  components: {
    TDialog,
    TFormItem,
    TForm, TCheckBoxItem, TCheckBox, TRadioGroup, TRadioItem, TButton, TInput, TCard, TSelect, TOption, TTime, TIcon},
  data() {
    return {
      form: {
        input: "",
      },
      formRule: {
        input: [new FormValidate.NumberValidate],
      },
      radio: "",
      checkbox: new Array(0),
      selectValue: "",
      model: false,
    };
  },
  methods: {
    /**
     * 模态框点击按钮
     */
    modelButton() {
      this.model = !this.model;
    }
  }
}
;
</script>

<style scoped lang="less">
.test-page {

}
</style>