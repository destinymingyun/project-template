/**
 * 用户登录实现类1
 **/
import AccountService from "./AccountService";
import Axios from "axios";

class AccountServiceImpl extends AccountService{
    login(userAccount) {
        const url = "/api/login";
        return Axios.post(url, userAccount.toFormData());
    }
}

export default AccountServiceImpl;