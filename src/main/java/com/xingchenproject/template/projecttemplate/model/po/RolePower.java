package com.xingchenproject.template.projecttemplate.model.po;

import lombok.Data;

/**
 * 角色权限
 * @author xingchen
 */
@Data
public class RolePower {
    /**
     * 系统角色描述
     */
    private int rolePowerId;
    /**
     * 角色id，对应RoleName的roleId
     */
    private int roleId;
    /**
     * 权限id，对应Power的powerId
     */
    private int powerId;
}
