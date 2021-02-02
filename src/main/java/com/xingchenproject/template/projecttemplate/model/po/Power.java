package com.xingchenproject.template.projecttemplate.model.po;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * 权限实体类
 */
@Data
public class Power implements GrantedAuthority {
    //  权限id，唯一值
    private int powerId;
    //  权限名，唯一值
    private  String powerName;
    //  权限描述
    private String powerDesc;

    @Override
    public String getAuthority() {
        return this.powerName;
    }
}
