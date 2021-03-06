package com.xingchenproject.template.projecttemplate.model.po;

import lombok.Data;

/**
 * 用户角色类
 * @author xingchen
 */
@Data
public class UserRole {
    /**
     * 用户角色id，唯一值
     */
    private int userRoleId;
    /**
     * 用户id，对应UserAccount的userAccountId值
     */
    private int userId;
    /**
     * 用户角色id，对应RoleName的roleId
     */
    private int roleId;
}
