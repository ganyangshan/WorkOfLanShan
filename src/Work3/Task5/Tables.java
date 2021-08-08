package Work3.Task5;

import Utils.JDBCutils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 使用第四题的表完成一下题目
 *
 * - 查询各科成绩最高和最低的分， 以如下的形式显示：课程号，最高分，最低分
 * - 查询学生的总成绩并进行排名
 * - 查询平均成绩大于60分的学生的学号和平均成绩
 */
public class Tables {
    /**
     *
     -- - 查询各科成绩最高和最低的分， 以如下的形式显示：课程号，最高分，最低分
     select
     courseid ,max(greade),min(greade)
     from
     score
     group by
     courseid;
     -- - 查询学生的总成绩并进行排名

     select
     id,sum(greade) total
     from
     score
     group by
     id
     order by
     total;
     -- - 查询平均成绩大于60分的学生的学号和平均成绩
     select
     id,avg(greade) avg_greade
     from
     score
     group by
     id
     having
     avg_greade>60
     order by
     avg_greade;
     * @param args
     */
    //以下仅显示第一个sql语句，其余两个大同小异
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        String sql = "select\n" +
                "    courseid ,max(greade) max,min(greade) min\n" +
                "from\n" +
                "    score\n" +
                "group by\n" +
                "    courseid;";
        try {
            conn = JDBCutils.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()){
                int courseid = rs.getInt("courseid");

                int max = rs.getInt("max");
                int min = rs.getInt("min");
                System.out.println(" courseid:  "+courseid+"max:  "+max+"min:  "+min);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        JDBCutils.close(stat,conn);
    }
}
