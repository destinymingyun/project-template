package com.xingchenproject.template.projecttemplate.service.impl;

import com.xingchenproject.template.projecttemplate.mapper.DictMapper;
import com.xingchenproject.template.projecttemplate.mapper.DictStatusMapper;
import com.xingchenproject.template.projecttemplate.model.po.Dict;
import com.xingchenproject.template.projecttemplate.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 字典服务实现类
 *
 * @author xingchen
 */
@Service
public class DictServiceImpl implements DictService {
    @Autowired
    private DictMapper dictMapper;
    @Autowired
    private DictStatusMapper dictStatusMapper;

    /**
     * 添加一条字典数据内容
     *
     * @param dict 字典数据项
     * @return 添加成功返回true，否则返回false
     */
    @Override
    public boolean addDict(Dict dict) {
        dictMapper.postDict(dict);
        return dict.getDictId() != 0;
    }
}
