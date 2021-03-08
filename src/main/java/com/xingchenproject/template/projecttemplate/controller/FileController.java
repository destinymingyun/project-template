package com.xingchenproject.template.projecttemplate.controller;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseJsonData;
import com.xingchenproject.template.projecttemplate.protocol.ResponseCode;
import com.xingchenproject.template.projecttemplate.security.HttpServletJsonResponseWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * 文件上传下载控制器
 * @author xingchen
 */
@Controller
@RequestMapping("/api/file")
public class FileController {
    /**
     * 上传文件
     * @return 返回报文
     */
    @PostMapping("upload")
    public ResponseJsonData uploadFile(MultipartFile file, HttpServletResponse response) throws IOException {
        System.out.println(file.getOriginalFilename());
        String path = "E:/test.txt";
        file.transferTo(new File(path));
        ResponseJsonData responseJsonData = ResponseJsonData.builder().code(ResponseCode.SUCCESS).msg("传输成功").build();
        HttpServletJsonResponseWriter.writer(response, responseJsonData);
        return null;
    }
}
