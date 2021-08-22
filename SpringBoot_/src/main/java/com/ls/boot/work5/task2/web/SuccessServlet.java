package com.ls.boot.work5.task2.web;

import com.ls.boot.work5.task2.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@SpringBootApplication
@WebServlet("/successServlet")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getAttribute("user");
        if (user!=null){
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("登录成功"+user+"欢迎你");
        }
    }
}
