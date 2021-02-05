/**
 * 表单验证类
 * @deprecated
 * v1.1.1 <p/>
 * 新增 <p/>
 * 非空验证器 <p/>
 **/
import FormValidate from "./form-validate";
import NotNullValidate from "./not-null-validate";
import MinAndMaxValidate from "__util__/form-validate/min-and-max-validate";

export default {
    FormValidate, NotNullValidate, MinValidate: MinAndMaxValidate,
}
