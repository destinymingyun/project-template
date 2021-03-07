import FormValidate from "./form-validate";

/**
 * 非空表单验证
 * @author xingchen
 * 默认设置场景异常级
 **/
class NotNullValidate extends FormValidate {
    constructor(msg, mode) {
        super(msg, mode);
        if (this.msg !== "") {
            this.msg = msg;
        } else {
            this.msg = "此项值不能为空";
        }
    }

    validate(value) {
        return !(value === null || undefined === value || value === "");
    }
}

export default NotNullValidate;