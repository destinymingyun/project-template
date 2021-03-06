/**
 * 用户帐户实体类
 * @author xingchen
 **/
import Qs from "qs";

class UserAccount {
    constructor() {
        this.id = 0;
        this.account = "";
        this.password = "";
    }

    /**
     * 转换为表单数据格式
     * @return String
     */
    toFormData() {
        return Qs.stringify(this);
    }
}

export default UserAccount;