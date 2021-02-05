package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

/**
 * 用户角色映射类
 */
@Mapper
public interface UserRoleMapper {
    /**
     * 添加用户角色映射
     * 添加成功后会回填id至userRole.userRoleId
     * @param userRole 用户角色
     */
    public void postUserRole(UserRole userRole);

    /**
     * 获得UserRole
     * @param userRoleId 用户角色id
     * @return 返回用户角色
     */
    public UserRole getUserRoleByUserRoleId(int userRoleId);

    /**
     * 根据用户id获取用户id角色对应表
     * @param userId 用户id
     * @return 返回该用户角色信息
     */
    public Collection<UserRole> getUserRolesByUserId(int userId);

    /**
     * 根据用户id删除用户全部角色信息
     * @param userId 用户id
     * @return 数据库中受影响的夯实，为0则失败
     */
    public Integer deleteAllUserRoleByUserId(int userId);
}
