package com.ls.boot.work5.task2.Dao;


import com.ls.boot.work5.task2.User;
import com.ls.boot.work5.task2.util.JDBCUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 登录方法
 * 登录时只有用户名和密码
 * 返回全部信息
 */

@SpringBootApplication
public class UserDao {
    //声明template对象共用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    public User login(User loginuser){
        String sql  ="select*from user where username=? and password=?";
        User user=template.queryForObject(sql,
                new BeanPropertyRowMapper<User>(User.class),
                loginuser.getUsername(),loginuser.getPassword());
        return user;
    }
}
