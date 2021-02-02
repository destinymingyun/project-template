package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.RoleName;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统角色名mapper
 */
@Mapper
public interface RoleNameMapper {
    /**
     * 添加系统角色
     * 添加成功会在roleName.roleId中填写对应id值
     * @param roleName 角色名
     */
    public void postRole(RoleName roleName);

    /**
     * 根据角色id查找系统角色
     * @param roleId 角色id
     * @return 返回对应的系统角色
     */
    public RoleName getRoleByRoleId(int roleId);
}
