package com.xingchenproject.template.projecttemplate.model.po;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * 用户实体类
 * @author xingchen
 */
@Data
public class UserAccount {
    /**
     * 用户id，唯一值
     */
    private int userId;
    /**
     * 账户，唯一值
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户状态，true为激活，false为未激活
     */
    private boolean status;

    @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("userAccount", this);
        return json.toJSONString();
    }
}
