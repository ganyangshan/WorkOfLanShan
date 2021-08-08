package Work3.Task1;

import Utils.JDBCutils;
import com.alibaba.druid.filter.stat.StatFilterMBean;
//import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 使用Java+JDBC API的形式来实现一个简单的学生管理系统
 *
 * - 学生管理系统的主要功能：
 *   - 添加学生
 *   - 删除学生
 *   - 修改学生
 *   - 查找所有学生
 *   - 查找分数不及格的学生（3科总分300，180以下为不及格）
 */
public class SystemOfStudent {
    public static void main(String[] args) {
        String sql = "INSERT INTO student VALUES(?,?,?,?,?)";
        try {
            JDBCutils.update(sql, 1,"吴",66,77,88);
            JDBCutils.update(sql, 2,"亦",99,77,88);
            JDBCutils.update(sql, 3,"凡",66,22,88);
            JDBCutils.update(sql, 4,"李",66,34,88);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("++++++++++++++++++++");
        String delsql = "delete  from student where id=4";
        JDBCutils.Function(delsql);
        System.out.println("+++++++++++++++++++++");
        String updatesql = "update student set math=13 where id=3";
        JDBCutils.Function(updatesql);
        System.out.println("++++++++++++++++++++++++++++");
        String showsql = "select*from student";
        JDBCutils.show(showsql);
        System.out.println("+++++++++++++++++++++++++");
        String showsql2 = "select * from student where  math+english+chinese <180";
        JDBCutils.show(showsql2);
    }
}

