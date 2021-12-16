package com.company.dao.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
    // 单例模式结果池化后资源浪费拉低程序运行效率问题
    // c3p0是一个类似于线程池的驱动程序池
    // 尺子里面可以连接各种数据库，但是需要在配置文件里面改参数
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource("test_c3p0");
    // 开放一个方法
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    };

    public static void close(ResultSet rs, Statement ps, Connection conn){
        try {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (conn != null)
                conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
