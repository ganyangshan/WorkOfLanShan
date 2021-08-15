package work4.task3.Test;

import work4.task3.Dao.UserDao;
import work4.task3.User;

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
