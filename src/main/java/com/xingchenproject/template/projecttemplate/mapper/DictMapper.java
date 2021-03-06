package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.Dict;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字典mapper
 * @author xingchen
 */
@Mapper
public interface DictMapper {
    /**
     * 添加一个字典，并将添加后主键返回dictId字段中
     * @param dict 字典类型
     */
    void postDict(Dict dict);
}
