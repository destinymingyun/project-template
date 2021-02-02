package com.xingchenproject.template.projecttemplate.model.vo;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * 返回给前端的数据格式
 */
@Data
@Builder
public class ResponseData {
    private String token;
    private int code;
    private String msg;
    private Map<String, ?> data;
}

