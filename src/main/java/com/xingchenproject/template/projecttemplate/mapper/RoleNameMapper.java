package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.RoleName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 更新角色名
     * @param roleId 角色id
     * @param newRoleName 角色名
     * @return 返回数据库中受影响的夯实
     */
    public Integer updateRoleNameByRoleId(@Param("roleId") int roleId, @Param("newRoleName")String newRoleName);
}
