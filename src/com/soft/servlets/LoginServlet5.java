package com.soft.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //跳转(重定向)
        //假设设置/login的时候自动跳到login页面
        //使用http协议302 location；跳转地址
        //使用response
        //resp.setStatus(302);//状态码设置
        //resp.setHeader("location",req.getContextPath()+"/success.html");//跳转的协议
        //更方便的
        //resp.sendRedirect(req.getContextPath()+"/success.html");
        //转发
        req.getRequestDispatcher("/success.html").forward(req,resp);
        //区别
        //重定向：地址发生变化
        //转发：转发地址不发生变化
        //只能访问当前服务器资源
        //转发就是一次请求，可以使用request域进行共享

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
