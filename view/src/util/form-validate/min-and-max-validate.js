import FormValidate from "__util__/form-validate/form-validate";

/**
 * 最小长度验证类
 * 默认设置场景异常级
 * @param min 最小长度限制
 * @param max 最大长度限制
 **/
class MinAndMaxValidate extends FormValidate {
    /**
     * 构造函数
     * @param msg 验证失败提示消息
     * @param mode 应用场景
     * @param min 最小值
     * @param max 最大值
     */
    constructor(msg, mode, min, max) {
        super(msg, mode);
        if (min === null || min === undefined || typeof min !== "number") {
            throw new Error("min字段必须为数值");
        }
        if (max === null || max === undefined || typeof max !== "number") {
            throw new Error("max字段必须为数值");
        }
    }

    /**
     * 验证长度是否满足限制
     * @param value
     * @return boolean
     */
    validate(value) {
        super.validate(value);
    }
}

export default MinAndMaxValidate;