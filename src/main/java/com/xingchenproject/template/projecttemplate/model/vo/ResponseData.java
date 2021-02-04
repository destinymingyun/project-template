package com.xingchenproject.template.projecttemplate.model.vo;

import com.alibaba.fastjson.JSONObject;
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

    @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("token", this.token);
        json.put("code", this.code);
        json.put("msg", this.msg);
        json.put("data", this.data);
        return json.toJSONString();
    }
}

