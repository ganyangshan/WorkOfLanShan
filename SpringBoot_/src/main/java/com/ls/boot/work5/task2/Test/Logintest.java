package com.ls.boot.work5.task2.Test;


import com.ls.boot.work5.task2.Dao.UserDao;
import com.ls.boot.work5.task2.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Logintest {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("jorden");
        user.setPassword("123");
        UserDao userDao  = new UserDao();
        User user1=userDao.login(user);
        System.out.println(user1);
    }
}
