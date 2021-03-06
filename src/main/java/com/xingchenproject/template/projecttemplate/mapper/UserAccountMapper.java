package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.UserAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户帐户mapper类
 *
 * @author xingchen
 */
@Mapper
public interface UserAccountMapper {
    /**
     * 添加一条用户帐户信息
     * 添加成功会，会将用户id填入UserAccount.userId
     *
     * @param userAccount 用户帐户类
     */
    void postUserAccount(UserAccount userAccount);

    /**
     * 根据用户帐户提交用户信息
     *
     * @param account 用户帐户
     * @return 返回用户帐户信息
     */
    UserAccount getUserAccountByAccount(String account);

    /**
     * 根据用户账户和新密码修改用户信息
     *
     * @param userAccount 用户账户信息
     * @param newPassword 新密码
     * @return 返回数据库中受影响的行数
     */
    Integer updatePasswordByUserAccount(@Param("userAccount") UserAccount userAccount,
                                        @Param("newPassword") String newPassword);

    /**
     * 根据用户id修改用户账户状态
     *
     * @param userId    用户id
     * @param newStatus 新状态
     * @return 返回数据库中受影响的行数
     */
    Integer updateStatusByUserId(@Param("userId") int userId, @Param("newStatus") boolean newStatus);
}
