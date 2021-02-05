package com.xingchenproject.template.projecttemplate.service.impl;

import com.xingchenproject.template.projecttemplate.mapper.*;
import com.xingchenproject.template.projecttemplate.model.bo.UserDetailsImpl;
import com.xingchenproject.template.projecttemplate.model.po.*;
import com.xingchenproject.template.projecttemplate.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 用户帐户服务
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserAccountMapper userAccountMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleNameMapper roleNameMapper;
    @Autowired
    private RolePowerMapper rolePowerMapper;
    @Autowired
    private PowerMapper powerMapper;

    /**
     * 获取用户帐户对应的用户信息，交由Spring-security进行登录验证
     *
     * @param account 用户帐户名
     * @return 返回用户密码
     * @throws UsernameNotFoundException 用户名未找到
     */
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        UserAccount userAccount = userAccountMapper.getUserAccountByAccount(account);
        if (userAccount == null || userAccount.getUserId() == 0) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        UserDetailsImpl userDetails = new UserDetailsImpl();
        userDetails.setUserAccount(userAccount);
        Collection<UserRole> userRoles = userRoleMapper.getUserRolesByUserId(userAccount.getUserId());
        ArrayList<RoleName> roleNames = new ArrayList<>();
        for (UserRole userRole : userRoles) {
            RoleName roleName = roleNameMapper.getRoleByRoleId(userRole.getRoleId());
            roleNames.add(roleName);
        }
        ArrayList<Collection<RolePower>> rolePowersList = new ArrayList<>();
        for (RoleName roleName : roleNames) {
            Collection<RolePower> rolePowers = rolePowerMapper.getRolePowerByRoleId(roleName.getRoleId());
            rolePowersList.add(rolePowers);
        }
        ArrayList<Power> powers = new ArrayList<>();
        for (Collection<RolePower> rolePowers : rolePowersList) {
            for (RolePower rolePower : rolePowers) {
                Power power = powerMapper.getPowerByPowerId(rolePower.getPowerId());
                powers.add(power);
            }
        }
        userDetails.setPowers(powers);
        return userDetails;
    }

    /**
     * 注册用户帐户
     * 会回填用户id、用户角色id
     *
     * @param userDetails 用户帐户业务类
     * @return 注册成功返回true，是否返回false
     */
    @Override
    @Transactional
    public boolean registerUser(UserDetailsImpl userDetails) {
        UserAccount userAccount = userAccountMapper.getUserAccountByAccount(userDetails.getUsername());
        if (userAccount == null) {
            userDetails.getUserAccount().setPassword(passwordEncoder.encode(userDetails.getPassword()));
            userAccountMapper.postUserAccount(userDetails.getUserAccount());
            for (UserRole userRole : userDetails.getUserRoles()) {
                userRole.setUserId(userDetails.getUserAccount().getUserId());
                userRoleMapper.postUserRole(userRole);
            }
            return true;
        }
        return false;
    }

    /**
     * 更改用户角色
     * @param userRoles 用户新角色集
     * @return 修改成功返回true，否则返回false
     */
    @Override
    @Transactional
    public boolean changeUserRole(Collection<UserRole> userRoles) {
        boolean ret = false;
        for (UserRole userRole : userRoles) {
            if (!ret) {
                userRoleMapper.deleteAllUserRoleByUserId(userRole.getUserId());
                ret = true;
            }
            userRoleMapper.postUserRole(userRole);
        }
        return true;
    }

    /**
     * 删除用户全部角色
     * @param userId 用户id
     * @return 删除成功返回true，否则返回false
     */
    @Override
    public boolean deleteAllUserRole(int userId) {
        Integer line = userRoleMapper.deleteAllUserRoleByUserId(userId);
        return line != null && line != 0;
    }
}
