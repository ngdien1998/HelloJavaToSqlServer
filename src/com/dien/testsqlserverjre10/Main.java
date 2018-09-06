package com.dien.testsqlserverjre10;

import com.dien.testsqlserverjre10.models.Admin;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Start");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=Blog;username=sa;password=123456789");
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM Admin";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                Admin user = new Admin();
                user.setUsername(res.getString(1));
                user.setPassword(res.getString(2));
                user.setFullname(res.getString(3));
                user.setEmail(res.getString(4));
                user.setAvatar(res.getString(5));
                user.setAdmin(res.getBoolean(6));
                user.setAllowed(res.getBoolean(7));
                System.out.println(user);
            }
            System.out.println("Done");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
