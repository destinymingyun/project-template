package com.xingchenproject.template.projecttemplate.mapper;

import com.xingchenproject.template.projecttemplate.model.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 测试mapper
 */
@Mapper
public interface TestMapper {
    /**
     * 测试能否连接数据库
     * @return 返回1
     */
    @Select("SELECT 1")
    public int select1();

    /**
     * 测试通过mapper.xml连接
     * @param testModel 测试model
     */
    public void postTest(TestModel testModel);
}
