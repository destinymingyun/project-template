package com.xingchenproject.template.projecttemplate.model.po;

import lombok.Data;

/**
 * 角色权限
 */
@Data
public class RolePower {
    //  角色权限id，唯一值
    private int rolePowerId;
    //  角色id，对应RoleName的roleId
    private int roleId;
    //  权限id，对应Power的powerId
    private int powerId;
}
