package com.ls.boot.work5.task2.util;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JDBCUtils {
    private static DataSource ds;
//    获取连接池对象
    public static DataSource getDataSource(){
        return ds;
    }
    static {
        try {
            //1.加载配置文件
            Properties pro = new Properties();
            //2/使用ClassLoader加载配置文件，获取直接输入流
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            //3.初始化连接池对象
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
