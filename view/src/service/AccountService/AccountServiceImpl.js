import AccountService from "./AccountService";
import Axios from "axios";

/**
 * 用户登录服务实现类1
 * @author xingchen
 **/
class AccountServiceImpl extends AccountService{
    login(userAccount) {
        const url = "/api/user/login";
        return Axios.post(url, userAccount.toFormData());
    }
}

export default AccountServiceImpl;