package com.example.demoex.Controller;

import com.example.demoex.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 这是一个测试类
 */
public class DemoUser {
    public static void main(String[] args) throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        List<User> studentsList =sqlSession.selectList("com.example.demoex.mapper.UserDao.findAll");
        System.out.println(studentsList);
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}