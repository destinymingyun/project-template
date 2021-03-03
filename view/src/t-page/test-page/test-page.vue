<template>
  <div class="test-page">
    {{ this.$store.getters.getToken }}
    <t-input placeholder="inputTest" long>
      <t-icon icon="user" slot="prefix"></t-icon>
    </t-input>
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
    {{ checkbox }}
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
    {{ form.input }}
    <t-button @click="modelButton">模块框</t-button>
    <t-dialog v-model="model">
      <t-button @click="modelButton" mode="primary">模块框</t-button>
    </t-dialog>
    <div>
      <h1>
        <t-icon icon="user" color="blue"></t-icon>
      </h1>
    </div>
    <t-switch v-model="switchValue" on-title="开" off-title="关"></t-switch>
    {{ switchValue }}
    <t-input-number v-model="inputNumberValue" style="width: 300px" radius></t-input-number>
    {{ inputNumberValue }}
    <t-table :table-data="tableData">
      <t-table-item title="title">
      </t-table-item>
      <t-table-item title="name"></t-table-item>
    </t-table>
    <t-menu v-model="menuValue">
      <t-menu-item title="登录" name="1" to="/loginAndRegister"></t-menu-item>
      <t-menu-item title="菜单二" name="2"></t-menu-item>
      <t-menu-item title="菜单三" name="3"></t-menu-item>
    </t-menu>
    <t-layout>
      <t-header style="height: 100px; background-color:yellow;">

      </t-header>
      <t-content style="height: 300px; background-color:gray;">
        <t-sider style="width: 100px; background-color:skyblue;"></t-sider>
      </t-content>
      <t-footer style="height: 100px; background-color:green;">

      </t-footer>
    </t-layout>
  </div>
</template>

<script>
import TInput from "__tcomponent__/t-input";
import TButton from "__tcomponent__/t-button";
import TCard from "__tcomponent__/t-card";
import {TRadioItem} from "__tcomponent__/t-radio-group";
import {TRadioGroup} from "__tcomponent__/t-radio-group";
import {TCheckBox, TCheckBoxItem} from "__tcomponent__/t-check-box";
import {TSelect, TOption} from "__tcomponent__/t-select";
import TTime from "__tcomponent__/t-time";
import {TForm, TFormItem} from "__tcomponent__/t-form";
import FormValidate from "__util__/form-validate";
import TDialog from "__tcomponent__/t-dialog";
import TIcon from "__tcomponent__/t-icon";
import TSwitch from "__tcomponent__/t-switch";
import TInputNumber from "__tcomponent__/t-input-number";
import {TTable} from "__tcomponent__/t-table";
import {TTableItem} from "__tcomponent__/t-table";
import {TMenu, TMenuItem} from "__tcomponent__/t-menu";
import {TLayout, TContent, TFooter, THeader, TSider} from "__tcomponent__/t-layout";

export default {
  name: "test-page",
  components: {
    TSider,
    TLayout,
    TMenuItem,
    TInputNumber, TSwitch, TDialog, TFormItem, TTable, TTableItem, TForm, TCheckBoxItem, TCheckBox, TRadioGroup,
    TRadioItem, TButton, TInput, TCard, TSelect, TOption, TTime, TIcon, TMenu, TContent, TFooter, THeader
  },
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
      switchValue: false,
      inputNumberValue: 1,
      tableData: [
        {
          title: "标题1",
          name: "名字1",
        },
        {
          name: "名字2",
          title: "标题2",
        }
      ],
      menuValue: "1",
    };
  },
  methods: {
    /**
     * 模态框点击按钮
     */
    modelButton() {
      this.model = !this.model;
    },
  }
}
;
</script>

<style scoped lang="less">
.test-page {

}
</style>