package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.UserAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户帐户mapper类
 */
@Mapper
public interface UserAccountMapper {
    /**
     * 添加一条用户帐户信息
     *  添加成功会，会将用户id填入UserAccount.userId
     * @param userAccount 用户帐户类
     */
    public void postUserAccount(UserAccount userAccount);

    /**
     * 根据用户帐户提交用户信息
     * @param account 用户帐户
     * @return 返回用户帐户信息
     */
    public UserAccount getUserAccountByAccount(String account);
}
