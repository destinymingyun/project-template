import FormValidate from "__util__/form-validate/form-validate";

/**
 * 最小长度验证类
 * 默认设置场景异常级
 * @param min 最小长度限制
 * @param max 最大长度限制
 **/
class MinAndMaxValidate extends FormValidate {
    constructor(msg, mode, min, max) {
        super(msg, mode);
    }
}

export default MinAndMaxValidate;