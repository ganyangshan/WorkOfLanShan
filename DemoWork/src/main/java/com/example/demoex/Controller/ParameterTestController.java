package com.example.demoex.Controller;

import com.example.demoex.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@Controller
public class ParameterTestController {
//    String name, String sex, String background,String hobby,String password
    @PostMapping("/user")
    @ResponseBody
    public String add(User user) throws IOException {
        SqlSession sqlSession = Function();
        sqlSession.insert("com.example.demoex.mapper.UserDao.insertUser",user);
        sqlSession.commit();
        sqlSession.close();
        return "注册成功";
    }
public SqlSession Function()  {
    String config = "mybatis.xml";
    InputStream in = null;
    try {
        in = Resources.getResourceAsStream(config);
    } catch (IOException e) {
        e.printStackTrace();
    }
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);
    SqlSession sqlSession = factory.openSession();
    return sqlSession;
}
    }































