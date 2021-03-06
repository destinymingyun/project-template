package com.xingchenproject.template.projecttemplate.model.po;

import lombok.Data;

/**
 * 系统字典类
 * @author xingchen
 */
@Data
public class Dict {
    /**
     * 字典id，唯一值
     */
    private int dictId;
    /**
     * 字典名称
     */
    private String dictName;
    /**
     * 字典描述
     */
    private String dictDesc;
}
