package com.xingchenproject.template.projecttemplate.service;

import com.xingchenproject.template.projecttemplate.model.po.Dict;

/**
 * 字典数据服务
 * @author xingchen
 */
public interface DictService {
    /**
     * 添加一条字典数据内容
     * @param dict 字典数据项
     * @return 添加成功返回true，否则返回false
     */
    boolean addDict(Dict dict);
}
