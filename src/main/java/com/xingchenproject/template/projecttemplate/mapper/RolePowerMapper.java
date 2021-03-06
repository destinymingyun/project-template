package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.RolePower;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

/**
 * 角色权限实现类
 * @author xingchen
 */
@Mapper
public interface RolePowerMapper {
    /**
     * 添加一条用户角色权限
     * 若添加成功返回填rolePower.rolePowerId
     * @param rolePower 用户权限对应表
     */
    void postRolePower(RolePower rolePower);

    /**
     * 根据用户权限id返回该记录
     * @param rolePowerId 用户权限id
     * @return 返回用户权限记录
     */
    RolePower getRolePowerByRolePowerId(int rolePowerId);

    /**
     * 根据角色id查看该角色所有权限
     * @param roleId 角色id
     * @return 返回该角色权限对应的表
     */
    Collection<RolePower> getRolePowerByRoleId(int roleId);
}
