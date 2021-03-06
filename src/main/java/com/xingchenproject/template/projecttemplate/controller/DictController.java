package com.xingchenproject.template.projecttemplate.controller;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseJsonData;
import com.xingchenproject.template.projecttemplate.protocol.ResponseCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 字典控制器
 * @author xingchen
 */
@RestController
@RequestMapping("/dict")
public class DictController {
    /**
     * 添加一项字典
     * @return 返回报文数据
     */
    public ResponseJsonData addDict() {

        return ResponseJsonData.builder().build();
    }
}
