package com.javaproject.gui;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author rudra
 */


public class DBConnection {


    //static final String DB_URL = "jdbc:mysql://localhost/miniproject";
    // static final String USER = "root";
    //static final String PASS = "Root@143314";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/miniproject", "root", "Root@143314");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

}
