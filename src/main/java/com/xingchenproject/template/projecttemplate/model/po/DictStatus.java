package com.xingchenproject.template.projecttemplate.model.po;

import lombok.Data;

/**
 * 字典状态
 * @author xingchen
 */
@Data
public class DictStatus {
    /**
     * 字典状态id，唯一值
     */
    private int dictStatusId;
    /**
     * 字典id，对应字典
     */
    private int dictId;
    /**
     * 状态值
     */
    private int dictStatusValue;
    /**
     * 状态名
     */
    private String dictStatusName;
    /**
     * 描述
     */
    private String dictStatusDesc;
}
