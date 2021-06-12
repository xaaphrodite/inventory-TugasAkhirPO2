package com.dev.tugabesar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

  public static boolean addData(String id, String nameItem, String category, String user, JFrame frame) {
    try {
      Connection myCon = Mysql.getConnection();
      String query = "INSERT INTO data (id, nameItem, category, user)" + " values (?, ?, ?, ?)";

      PreparedStatement preparedStatement = myCon.prepareStatement(query);

      preparedStatement.setString(1, id);
      preparedStatement.setString(2, nameItem);
      preparedStatement.setString(3, category);
      preparedStatement.setString(4, user);

      preparedStatement.execute();
      preparedStatement.close();

      return true;

    } catch (Exception error) {
      JOptionPane.showMessageDialog(frame, "Informasi salah");
    }
    return false;
  }

  public static boolean deleteData(String id, JFrame frame) throws Exception {
    try {
      Connection myCon = Mysql.getConnection();
      String query = "DELETE FROM data WHERE id = ?";
      PreparedStatement preparedStatement = myCon.prepareStatement(query);

      preparedStatement.setString(1, id);
      preparedStatement.executeUpdate();
      preparedStatement.close();

      return true;
    } catch (SQLException error) {
      JOptionPane.showMessageDialog(frame, error.getMessage());
    }
    return false;
  }

}
