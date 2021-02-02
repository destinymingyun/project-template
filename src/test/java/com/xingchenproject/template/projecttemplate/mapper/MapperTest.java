package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

/**
 * Mapper通路测试
 */
@SpringBootTest
public class MapperTest {
    @Autowired
    private UserAccountMapper userAccountMapper;
    @Autowired
    private PowerMapper powerMapper;
    @Autowired
    private RoleNameMapper roleNameMapper;
    @Autowired
    private RolePowerMapper rolePowerMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 添加用户测试
     */
    @Test
    public void postUserAccountTest() {
        UserAccount userAccount = new UserAccount();
        userAccount.setAccount("test1");
        userAccount.setPassword("123456");
        userAccountMapper.postUserAccount(userAccount);
        Assertions.assertNotEquals(0, userAccount.getUserId());
    }

    /**
     * 根据用户帐户查询该用户信息
     */
    @Test
    public void getUserAccountByAccount() {
        UserAccount userAccount = userAccountMapper.getUserAccountByAccount("test1");
        System.out.println(userAccount);
        Assertions.assertNotEquals(0, userAccount.getUserId());
    }

    /**
     * 添加PowerMapper.postPower
     */
    @Test
    public void postPowerTest() {
        Power power = new Power();
        power.setPowerName("test");
        power.setPowerDesc("test测试");
        powerMapper.postPower(power);
        Assertions.assertNotEquals(0, power.getPowerId());
    }

    /**
     * 测试PowerMapper.getPowerByPowerId
     */
    @Test
    public void getPowerTest() {
        Power power = powerMapper.getPowerByPowerId(1);
        Assertions.assertNotEquals(0, power.getPowerId());
    }

    /**
     * 测试RoleMapper.postRole
     */
    @Test
    public void postRoleTest() {
        RoleName roleName = new RoleName();
        roleName.setRoleName("test");
        roleName.setRoleDesc("test");
        roleNameMapper.postRole(roleName);
        Assertions.assertNotEquals(0, roleName.getRoleId());
    }

    /**
     * 测试RoleMapper.getRole
     */
    @Test
    public void getRoleTest() {
        RoleName roleName = roleNameMapper.getRoleByRoleId(1);
        Assertions.assertNotEquals(0, roleName.getRoleId());
    }

    /**
     * 测试RolePower.postRolePower
     */
    @Test
    public void PostRolePowerTest() {
        RolePower rolePower = new RolePower();
        rolePower.setRoleId(1);
        rolePower.setPowerId(1);
        rolePowerMapper.postRolePower(rolePower);
        Assertions.assertNotEquals(0, rolePower.getRolePowerId());
    }

    /**
     * 测试获取rolePower.getRolePowerByPowerId
     */
    @Test
    public void getRolePowerByRolePowerIdTest() {
        RolePower rolePower = rolePowerMapper.getRolePowerByRolePowerId(1);
        Assertions.assertEquals(1, rolePower.getRolePowerId());
    }

    /**
     * 测试rolePower.getRolePowerByRoleId()
     */
    @Test
    public void getRolePowerByRoleId() {
        Collection<RolePower> rolePowers = rolePowerMapper.getRolePowerByRoleId(1);
        for (RolePower rolePower : rolePowers) {
            System.out.println(rolePower);
        }
    }
    /**
     * 测试userRole.postUserRole()
     */
    @Test
    public void postUserRoleTest() {
        UserRole userRole = new UserRole();
        userRole.setUserId(1);
        userRole.setRoleId(1);
        userRoleMapper.postUserRole(userRole);
        Assertions.assertNotEquals(0, userRole.getUserRoleId());
    }

    /**
     * 测试userRole.getUserRoleByUserRoleId
     */
    @Test
    public void getUserRoleByUserRoleIdTest() {
        UserRole userRole = userRoleMapper.getUserRoleByUserRoleId(1);
        Assertions.assertEquals(1, userRole.getUserRoleId());
    }

    /**
     * 测试根据用户id获取用户信息
     */
    @Test
    public void getUserRolesByUserId() {
        Collection<UserRole> userRoles = userRoleMapper.getUserRolesByUserId(1);
        for (UserRole userRole : userRoles) {
            System.out.println(userRole);
        }
    }
}
