package Utils;
import java.sql.*;

/**
 * 自定义工具类
 * 1.获取Connection对象
 * 2、关闭
 */
public class JDBCutils {
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///anjoub?useSSL=false&serverTimezone=UTC", "root", "123456");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
//插入数据的方法
    public static void update(String sql, Object... args) throws SQLException {
        Connection connection = null;//Object... args可变参数
        PreparedStatement preparedStatement = null;
        try {
            connection = getConnection();//调用的是上面定义的方法
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {//通过传入参数个数遍历填充占位符
                preparedStatement.setObject(i + 1, args[i]);
            }
            preparedStatement.executeUpdate();//执行
            System.out.println("添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("插入失败！");
        }
        close(preparedStatement,connection);
    }
    //删除数据，修改数据
    public static void Function(String sql){
        Connection conn = null;
        Statement stat = null;
        try {
            conn = getConnection();
            stat = conn.createStatement();
            stat.executeUpdate(sql);
            System.out.println("操作成功");
        } catch (SQLException throwables) {
            System.out.println("操作失败");
            throwables.printStackTrace();
        }
        close(stat,conn);
    }
    public static void show(String sql){
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            conn=getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int Chinese = rs.getInt("Chinese");
                int math = rs.getInt("math");
                int english = rs.getInt("english");
                System.out.println("id:  "+id+"name:  "+name+"Chinese:  "+Chinese
                +"math:  "+math+"English:  "+english);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        close(rs,stat,conn);
    }

    public static void close(Statement stmt,Connection conn){
        if ((stmt!=null)){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if ((stmt!=null)){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
