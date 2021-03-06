package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.DictStatus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字典状态Mapper
 * @author xingchen
 */
@Mapper
public interface DictStatusMapper {
    /**
     * 添加一条字典状态，并将数据库中主键添加到dictStatusId字段中
     * @param dictStatus 字典状态
     */
    void postDictStatus(DictStatus dictStatus);
}
