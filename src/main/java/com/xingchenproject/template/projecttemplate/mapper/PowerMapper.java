package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.po.Power;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限mapper
 */
@Mapper
public interface PowerMapper {
    /**
     * 添加一条权限
     * 权限id在power中
     * @param power 权限
     */
    public void postPower(Power power);

    /**
     * 根据powerId获取power
     * @param powerId 唯一值
     * @return 返回该powerId对应的power
     */
    public Power getPowerByPowerId(int powerId);
}
