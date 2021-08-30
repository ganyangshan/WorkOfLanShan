package com.example.demoex.Controller;

import com.example.demoex.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoUpdate {
    @PostMapping("/update")
    @ResponseBody
    public String update(User user){
        int co=-2;
        SqlSession sqlSession = new ParameterTestController().Function();
        co = sqlSession.update("com.example.demoex.mapper.UserDao.update", user);
        sqlSession.commit();
        sqlSession.close();
        if(co==-2){
            return "更新失败";
        }
        return  "更新成功";
    }
}
