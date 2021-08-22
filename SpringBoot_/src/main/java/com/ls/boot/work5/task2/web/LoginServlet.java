package com.ls.boot.work5.task2.web;
///Demowork_war_exploded
import com.ls.boot.work5.task2.Dao.UserDao;
import com.ls.boot.work5.task2.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码

        System.out.println("111");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+" "+password);
        System.out.println("222");
        resp.setContentType("text/html;charset=utf-8");
//        resp.getWriter().write("hello"+username+password);

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println("++++"+user.getUsername()+user.getPassword());//调试
        //调用userDao中的login方法
        UserDao userDao = new UserDao();
        System.out.println("3333");
        User user1 = userDao.login(user);
        System.out.println(user1.getUsername()+"666");
        if (user1 == null){
            //登录失败,跳转
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }
        else {

            //存数据
            req.setAttribute("user",user);
            //转发
            req.getRequestDispatcher("/sailServlet").forward(req,resp);

        }
    }
}
