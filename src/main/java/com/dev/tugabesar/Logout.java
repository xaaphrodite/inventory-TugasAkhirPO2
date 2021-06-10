package com.dev.tugabesar;

import javax.swing.JFrame;

public class Logout {
  public static void logOut(JFrame context, Login loginScreen) {
    Sesi.isLogin = false;
    context.setVisible(false);
    loginScreen.setVisible(true);
  }
}
