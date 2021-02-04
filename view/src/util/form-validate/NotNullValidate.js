import FormValidate from "./form-validate";

/**
 * 非空表单验证
 **/
class NotNullValidate extends FormValidate {
    constructor(msg, mode) {
        super(msg, mode);
        if (msg != null && msg && undefined && msg !== "") {
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