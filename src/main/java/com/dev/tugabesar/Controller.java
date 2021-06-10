package com.dev.tugabesar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller {
  public static boolean isLogin(String username, String password, String privilege, JFrame frame) {
    try {
      Connection myCon = Mysql.getConnection();
      String query = "SELECT id,username,privilege FROM users WHERE username = '" + username + "'AND password = '"
          + password + "'AND privilege = '" + privilege + "'";

      PreparedStatement preparedStatement = myCon.prepareStatement(query);
      ResultSet resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        Sesi.ID = resultSet.getInt("id");
        Sesi.Username = resultSet.getString("username");
        Sesi.Privilege = resultSet.getString("privilege");

        return true;
      }
    } catch (Exception error) {
      JOptionPane.showMessageDialog(frame, error.getMessage());
    }
    return false;
  }

}
