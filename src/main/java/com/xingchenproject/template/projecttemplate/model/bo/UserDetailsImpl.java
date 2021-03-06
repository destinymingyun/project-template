package com.xingchenproject.template.projecttemplate.model.bo;

import com.xingchenproject.template.projecttemplate.model.po.Power;
import com.xingchenproject.template.projecttemplate.model.po.UserAccount;
import com.xingchenproject.template.projecttemplate.model.po.UserRole;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * 用户权限业务
 * @author xingchen
 */
@Data
public class UserDetailsImpl implements UserDetails {
    private UserAccount userAccount;
    private Collection<UserRole> userRoles;
    private Collection<Power> powers;

    //  获取用户权限名
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.powers;
    }

    //  获取用户用户名
    @Override
    public String getUsername() {
        return this.userAccount.getAccount();
    }

    //  获取用户密码
    @Override
    public String getPassword() {
        return userAccount.getPassword();
    }

    //  帐户是否被激活
    @Override
    public boolean isEnabled() {
        return userAccount.isStatus();
    }

    //  帐户是否未过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //  帐户是否锁定
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //  帐户凭证是否过期
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
}
