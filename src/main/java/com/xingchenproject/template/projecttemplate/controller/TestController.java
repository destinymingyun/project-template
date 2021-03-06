package com.xingchenproject.template.projecttemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试使用Controller
 * @author xingchen
 */
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * 测试Controller
     * @return 返回字符串
     */
    @GetMapping("/hello")
    @ResponseBody
    public String helloSpringMvc() {
        return "hello spring-mvc";
    }
}
