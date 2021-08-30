package com.example.demoex.Controller;

import com.example.demoex.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DemoDel {
    @PostMapping("/del")
    @ResponseBody
    public String del(User user){
        int co=-2;//判断是否删除标志
        SqlSession sqlSession = new ParameterTestController().Function();
        co = sqlSession.delete("com.example.demoex.mapper.UserDao.del", user);
        sqlSession.commit();
        sqlSession.close();
        if(co==-2){
            return "删除失败";
        }
        return  "删除成功";
    }
}
