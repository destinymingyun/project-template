package com.xingchenproject.template.projecttemplate.security;

import com.xingchenproject.template.projecttemplate.model.vo.ResponseJsonData;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 简单异步json响应体类
 */
public class HttpServletJsonResponseWriter {
    /**
     * 简单书写json响应类
     *
     * @param httpServletResponse 响应体
     * @param responseJsonData        响应数据
     */
    public static void writer(HttpServletResponse httpServletResponse, ResponseJsonData responseJsonData) throws IOException {
        httpServletResponse.setContentType("application/json;charset=utf-8");
        PrintWriter out = httpServletResponse.getWriter();
        out.write(responseJsonData.toString());
        out.flush();
        out.close();
    }
}
