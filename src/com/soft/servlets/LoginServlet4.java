package com.soft.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
 @WebServlet("/login4")
public class LoginServlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("utf-8");

        //得到前端数据
        String login =req.getParameter("login");
        String password =req.getParameter("password");

        System.out.println(login);
        System.out.println(password);

        //去数据库查询是否有和用户名密码一样的信息，返回一个user
        //User user = Userlogin.login(login,password);


        //响应到前端
        resp.getWriter().println("success");
        //转发请求
        req.setAttribute("user",login);

//        请求转发
//        req.getRequestDispatcher("/success").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);

    }
}
