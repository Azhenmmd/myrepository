package com.soft.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/login1")
public class LoginServlet implements Servlet {
    /**
     * 初始化一次
     * 默认是调用servlet时初始化
     * 建议，尽量不要再多线程中使用成员变量
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化");
    }

    /**
     * 每次访问都调用
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("每次访问时调用的方法");
    }

    /**
     * tomcat被停止时调用
     */
    @Override
    public void destroy() {
        System.out.println("被销毁时用");
    }
    /**
     * 返回配置信息类
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

}
