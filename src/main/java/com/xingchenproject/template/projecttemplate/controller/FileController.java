package com.xingchenproject.template.projecttemplate.controller;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseJsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件上传下载控制器
 * @author xingchen
 */
@RestController
@RequestMapping("/file")
public class FileController {
    /**
     * 上传文件
     * @return 返回报文
     */
    public ResponseJsonData uploadFile() {

        return ResponseJsonData.builder().build();
    }
}
