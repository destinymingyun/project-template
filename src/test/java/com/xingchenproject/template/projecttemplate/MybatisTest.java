package com.xingchenproject.template.projecttemplate;

import com.xingchenproject.template.projecttemplate.mapper.TestMapper;
import com.xingchenproject.template.projecttemplate.model.TestModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisTest {
    @Autowired private TestMapper testMapper;

    /**
     * 测试连接数据库
     */
    @Test
    public void mysqlTest() {
        int ret = testMapper.select1();
        Assertions.assertEquals(1, ret);
    }

    /**
     * 测试能否用mapper-xml添加
     */
    @Test
    public void testMapperXml() {
        TestModel testModel = new TestModel();
        testModel.setTestMsg("xxx");
        testMapper.postTest(testModel);
        Assertions.assertNotEquals(0, testModel.getId());
    }
}
