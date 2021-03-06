package com.xingchenproject.template.projecttemplate.model.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * 返回给前端的数据格式,json格式
 * @author xingchen
 */
@Data
@Builder
public class ResponseJsonData {
    /**
     * token
     */
    private String token;
    /**
     * 响应状态码
     */
    private int code;
    /**
     * 响应消息
     */
    private String msg;
    /**
     * 响应内容
     */
    private Map<String, ?> data;

    /**
     * 返回json格式的字符串
     * @return json格式字符串
     */
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

