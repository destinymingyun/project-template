package com.xingchenproject.template.projecttemplate.service;

import com.xingchenproject.template.projecttemplate.model.bo.UserDetailsImpl;
import com.xingchenproject.template.projecttemplate.model.po.UserRole;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;

/**
 * 用户账户接口
 */
public interface UserAccountService extends UserDetailsService {
    /**
     * 注册用户帐户并分配权限
     * @param userDetails 用户帐户业务类
     * @return 注册成功返回true，否则返回false
     */
    public boolean registerUser(UserDetailsImpl userDetails);

    /**
     * 更改用户角色
     * @param userRoles 用户新角色集
     * @return 更改成功返回true，否则返回false
     */
    public boolean changeUserRole(Collection<UserRole> userRoles);

    /**
     * 删除指定用户全部角色
     * @param userId 用户id
     * @return 删除成功返回true，否则返回false
     */
    public boolean deleteAllUserRole(int userId);
}
