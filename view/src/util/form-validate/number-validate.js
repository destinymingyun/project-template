/**
 * 数字验证
 **/
import FormValidate from "./form-validate";
import Mode from "__protocol__/Mode";

class NumberValidate extends FormValidate {
    /**
     * 构造函数
     * @param msg
     * @param mode
     */
    constructor(msg, mode) {
        super(msg, mode);
        if (this.msg === "") {
            this.msg = "此项必须为数值";
        } else {
            this.msg = msg;
        }
    }

    /**
     * 验证是否为数值
     * @param value
     * @return boolean
     */
    validate(value) {
        switch (typeof value) {
            case "number":
                return true;
            case "string":
                return String(Number(value)) === value;
            default:
                return false;
        }
    }
}

export default NumberValidate;