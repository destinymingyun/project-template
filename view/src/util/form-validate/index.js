/**
 * 表单验证类
 * v1.1.1 新增非空验证
 **/
import FormValidate from "./form-validate";
import NotNullValidate from "./not-null-validate";
import MinAndMaxValidate from "__util__/form-validate/min-and-max-validate";

export default {
    FormValidate, NotNullValidate, MinValidate: MinAndMaxValidate,
}
