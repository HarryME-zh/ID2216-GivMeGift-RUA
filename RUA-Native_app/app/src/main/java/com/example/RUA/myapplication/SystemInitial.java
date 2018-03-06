package com.example.RUA.myapplication;

import java.sql.*;

/**
 * Created by harry on 2018/2/24.
 */

public class SystemInitial {
    public static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://10.0.2.2:3306/PersonInfo";
        String username = "root";
        String password = "";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


}
