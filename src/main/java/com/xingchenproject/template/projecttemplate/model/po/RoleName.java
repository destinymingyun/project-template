package com.xingchenproject.template.projecttemplate.model.po;

import lombok.Data;

/**
 * 系统角色类
 * @author xingchen
 */
@Data
public class RoleName {
    /**
     * 系统角色id
     **/
    private int roleId;
    /**
     * 系统角色名
     **/
    private String roleName;
    /**
     * 系统角色描述
     **/
    private String roleDesc;
}
