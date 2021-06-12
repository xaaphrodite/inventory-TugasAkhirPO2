/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.tugabesar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author panee
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();

        privilegeLabel.setText(Sesi.Privilege);
        usernameLabel.setText(Sesi.Username);
        addPanel.setVisible(false);
        backButton.setVisible(false);

        try {
            Connection myCon = Mysql.getConnection();
            String query = "SELECT * FROM data";
            PreparedStatement preparedStatement = myCon.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String coulmn1 = resultSet.getString(1);
                String coulmn2 = resultSet.getString(2);
                String coulmn3 = resultSet.getString(3);
                String coulmn4 = resultSet.getString(4);

                String allCoulmn[] = { coulmn1, coulmn2, coulmn3, coulmn4 };
                DefaultTableModel model = (DefaultTableModel) tableInventory.getModel();
                model.addRow(allCoulmn);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        privilegeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        formId = new javax.swing.JTextField();
        optionButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        formItem = new javax.swing.JTextField();
        formCategory = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 309, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Dashboard");

        privilegeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        privilegeLabel.setForeground(new java.awt.Color(153, 153, 153));
        privilegeLabel.setText("admin");

        usernameLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(153, 153, 153));
        usernameLabel.setText("xaaphrodite");

        logoutButton.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(204, 204, 204));
        logoutButton.setText("Logout");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addComponent(privilegeLabel).addGap(0, 0,
                                Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLabel)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logoutButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(privilegeLabel))
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inventori");

        tableInventory.setBackground(new java.awt.Color(153, 153, 153));
        tableInventory.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tableInventory.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

        }, new String[] { "Id", "Nama barang", "Kategori", "Hak istimewa" }) {
            Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class };
            boolean[] canEdit = new boolean[] { false, false, false, false };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableInventory.setShowGrid(true);
        jScrollPane1.setViewportView(tableInventory);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Menu");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("------------------------");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Id");

        formId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formIdActionPerformed(evt);
            }
        });

        optionButton.setText("Ubah/Tambah");
        optionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Hapus");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        addPanel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Nama barang");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Kategori");

        editButton.setText("Ubah");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        addButton.setText("Tambah");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addPanelLayout.createSequentialGroup().addGroup(addPanelLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addPanelLayout.createSequentialGroup().addComponent(jLabel6).addGap(18, 18, 18)
                                .addComponent(formItem, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addPanelLayout.createSequentialGroup().addComponent(jLabel7).addGap(48, 48, 48)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                addPanelLayout.createSequentialGroup().addComponent(editButton)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(addButton))
                                        .addComponent(formCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 285, Short.MAX_VALUE)));
        addPanelLayout.setVerticalGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addPanelLayout.createSequentialGroup().addContainerGap()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6).addComponent(formItem, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7).addComponent(formCategory,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editButton).addComponent(addButton))
                        .addContainerGap(17, Short.MAX_VALUE)));

        backButton.setText("Kembali");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel5).addGap(84, 84, 84)
                                        .addComponent(formId, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(optionButton)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backButton)))
                        .addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel4Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5)
                                                .addComponent(formId, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deleteButton).addComponent(optionButton))
                                        .addGap(18, 18, 18).addComponent(addPanel,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(backButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel4,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_saveButtonMouseClicked
        try {
            String id = formId.getText();
            String nameItem = formItem.getText();
            String category = formCategory.getText();
            String privilege = Sesi.Privilege;

            if (Controller.addData(id, nameItem, category, privilege, this)) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                JFrame dashboard = new Dashboard();
                dashboard.setVisible(false);
                this.dispose();
                dashboard.setVisible(true);
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }// GEN-LAST:event_saveButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_saveBackButtonMouseClicked
        optionButton.setVisible(true);
        addPanel.setVisible(false);
        backButton.setVisible(false);
    }// GEN-LAST:event_saveBackButtonMouseClicked

    private void formIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_formIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_formIdActionPerformed

    private void optionButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addButtonMouseClicked
        optionButton.setVisible(false);
        addPanel.setVisible(true);
        backButton.setVisible(true);
    }// GEN-LAST:event_addButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonMouseClicked
        String id = formId.getText();
        int question = JOptionPane.showInternalConfirmDialog(null, "Hapus data?", "Konfirmasi",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (question == JOptionPane.YES_OPTION) {
            try {
                if (Controller.deleteData(id, this)) {
                    JFrame dashboard = new Dashboard();
                    dashboard.setVisible(false);
                    this.dispose();
                    dashboard.setVisible(true);
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(this, "Masukan data dengan benar!");
            }
        }

    }// GEN-LAST:event_deleteButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_editButtonMouseClicked
        try {
            String id = formId.getText();
            String nameItem = formItem.getText();
            String category = formCategory.getText();

            if (!id.equals("") && Controller.updateData(id, nameItem, category, this)) {
                JOptionPane.showMessageDialog(this, "Data berhasil diubah");
                JFrame dashboard = new Dashboard();
                dashboard.setVisible(false);
                this.dispose();
                dashboard.setVisible(true);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, "Masukan data dengan benar");
        }
    }// GEN-LAST:event_editButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logoutButtonMouseClicked
        Login login = new Login();
        Logout.logOut(this, login);
    }// GEN-LAST:event_logoutButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField formCategory;
    private javax.swing.JTextField formId;
    private javax.swing.JTextField formItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JButton optionButton;
    private javax.swing.JLabel privilegeLabel;
    private javax.swing.JTable tableInventory;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
