package com.example.demoex.Controller;

import com.example.demoex.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Demologin {
    @PostMapping("/login")
    @ResponseBody
    public String select(User user){
        SqlSession sqlSession = new ParameterTestController().Function();
        User user1 = sqlSession.selectOne("com.example.demoex.mapper.UserDao.login", new User(user.getName(), null, null, null, user.getPassword()));
        sqlSession.commit();
        sqlSession.close();
        //判断是否登录成功
        if(user1==null){
            return "登陆失败";
        }
        return  "登录成功"+
                "姓名:"+user1.getName()+"  性别:"+user1.getSex()+"  学历:"+user1.getBackground()+"  爱好:"+user1.getHobby();
//                "姓名:"+user1.getName()+"  性别:"+user1.getSex()+"  学历:"+user1.getBackground()+"  爱好:"+user1.getHobby();
    }
}
