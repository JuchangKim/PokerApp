/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Poker_Game.Panel;

import Poker_Game.Database.FileManager;
import java.util.List;

/**
 *
 * @author billi
 */
public class UserGameLog extends javax.swing.JFrame {

    /**
     * Creates new form UserGameLog
     */
    
    private String username;
    
    public UserGameLog(String username) {
        this.username = username;
        initComponents();
        displayUserLog();  // Call the method to display userlog when the form is created
    }

    private UserGameLog() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Method to load and display the user's game log
    private void displayUserLog() {
        StringBuilder logContent = new StringBuilder();
    
    // Use the FileManager to read the game log entries for the specified username
    List<String> gameLogs = FileManager.readGameLog(username);
    
    if (!gameLogs.isEmpty()) {
        logContent.append("Game Log for User: ").append(username).append("\n\n");
        
        // Iterate over the log entries and append them to the logContent
        for (String logEntry : gameLogs) {
            logContent.append(logEntry).append("\n");
        }
    } else {
        logContent.append("No game log found for user: ").append(username);
    }
    
    // Set the content to the UserGameLogTextArea1
    UserGameLogTextArea1.setText(logContent.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ShowUserGameLogLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserGameLogTextArea1 = new javax.swing.JTextArea();
        EnterGameButton1 = new javax.swing.JButton();
        ShowListOfUsersButton2 = new javax.swing.JButton();
        ReturnMainMenuButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(815, 439));

        ShowUserGameLogLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ShowUserGameLogLabel1.setText("Show User Game Log");

        UserGameLogTextArea1.setColumns(20);
        UserGameLogTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserGameLogTextArea1.setRows(5);
        jScrollPane1.setViewportView(UserGameLogTextArea1);

        EnterGameButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EnterGameButton1.setText("1. Play Game");
        EnterGameButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterGameButton1ActionPerformed(evt);
            }
        });

        ShowListOfUsersButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ShowListOfUsersButton2.setText("2. Show List Of Users");
        ShowListOfUsersButton2.setToolTipText("");
        ShowListOfUsersButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowListOfUsersButton2ActionPerformed(evt);
            }
        });

        ReturnMainMenuButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ReturnMainMenuButton3.setText("4. Return to Main Menu");
        ReturnMainMenuButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnMainMenuButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowUserGameLogLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ReturnMainMenuButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ShowListOfUsersButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterGameButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ShowUserGameLogLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EnterGameButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ShowListOfUsersButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ReturnMainMenuButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterGameButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterGameButton1ActionPerformed
        new AddPlayerNames().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EnterGameButton1ActionPerformed

    private void ShowListOfUsersButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowListOfUsersButton2ActionPerformed
        new ListOfUsersMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShowListOfUsersButton2ActionPerformed

    private void ReturnMainMenuButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnMainMenuButton3ActionPerformed
        new WelcomeMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMainMenuButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserGameLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserGameLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserGameLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserGameLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserGameLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnterGameButton1;
    private javax.swing.JButton ReturnMainMenuButton3;
    private javax.swing.JButton ShowListOfUsersButton2;
    private javax.swing.JLabel ShowUserGameLogLabel1;
    private javax.swing.JTextArea UserGameLogTextArea1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
