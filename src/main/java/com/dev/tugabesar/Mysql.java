/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.tugabesar;

import java.sql.*;

/**
 *
 * @author panee
 */
public class Mysql {
  public static Connection getConnection() throws Exception {
    String uri = "jdbc:mysql://localhost:3306/sukasuka";
    String username = "root";
    String password = "haveaniceday!";

    Connection connection = (Connection) DriverManager.getConnection(uri, username, password);
    return connection;
  }

}
