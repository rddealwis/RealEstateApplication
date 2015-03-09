/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Classes.General.Button;
import Classes.RealEstate.SortedList;
import Classes.UserLogin.*;
import javax.swing.JOptionPane;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

/**
 *
 * @author Ras
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    private ListUserLogin userLogin;
    private static SortedList list = new SortedList();
    Options optionsForm;
    UserLoginXML ob = new UserLoginXML();
   
    private ChangePassword() 
    {
        initComponents();
        this.setResizable(false);
    }
    
    ChangePassword(Options optionsForm) 
    {
        initComponents();
        this.optionsForm = optionsForm;
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelChngPwd = new javax.swing.JPanel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelOldPwd = new javax.swing.JLabel();
        jLabelNewPwd = new javax.swing.JLabel();
        jTxtUserName = new javax.swing.JTextField();
        jTxtOldPwd = new javax.swing.JTextField();
        jTxtNewPwd = new javax.swing.JTextField();
        jLabelConfirmPwd = new javax.swing.JLabel();
        jTxtConfirmPwd = new javax.swing.JTextField();
        jBtnSubmit = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelUserName.setText("User Name");

        jLabelOldPwd.setText("Old Password");

        jLabelNewPwd.setText("New Password");

        jLabelConfirmPwd.setText("Confirm Password");

        jBtnSubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSubmit.setText("Submit");
        jBtnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnSubmitMouseExited(evt);
            }
        });
        jBtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubmitActionPerformed(evt);
            }
        });

        jBtnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnCancel.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancel.setText("Cancel");
        jBtnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnCancelMouseExited(evt);
            }
        });
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelChngPwdLayout = new javax.swing.GroupLayout(jPanelChngPwd);
        jPanelChngPwd.setLayout(jPanelChngPwdLayout);
        jPanelChngPwdLayout.setHorizontalGroup(
            jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChngPwdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUserName)
                    .addComponent(jLabelOldPwd)
                    .addComponent(jLabelNewPwd)
                    .addComponent(jLabelConfirmPwd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtOldPwd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtNewPwd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtUserName)
                    .addComponent(jTxtConfirmPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanelChngPwdLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jBtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanelChngPwdLayout.setVerticalGroup(
            jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChngPwdLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserName)
                    .addComponent(jTxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOldPwd)
                    .addComponent(jTxtOldPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNewPwd)
                    .addComponent(jTxtNewPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmPwd)
                    .addComponent(jTxtConfirmPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelChngPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSubmit)
                    .addComponent(jBtnCancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelChngPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelChngPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      // Start, Button formatting
      jBtnSubmit.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnCancel.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      // End, Button formatting
    }//GEN-LAST:event_formWindowOpened

    private void jBtnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSubmitMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnSubmit, "Entry");
    }//GEN-LAST:event_jBtnSubmitMouseEntered

    private void jBtnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSubmitMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnSubmit, "Exit");
    }//GEN-LAST:event_jBtnSubmitMouseExited

    private void jBtnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCancelMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnSubmit, "Entry");
    }//GEN-LAST:event_jBtnCancelMouseEntered

    private void jBtnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCancelMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnSubmit, "Exit");
    }//GEN-LAST:event_jBtnCancelMouseExited

    private void jBtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitActionPerformed
       try {
            userLogin = ob.getUserLogin(jTxtUserName.getText(), jTxtNewPwd.getText());
            if (list.isThere(userLogin)) {
                JOptionPane.showMessageDialog(rootPane, "User name already in use");
            } else {
                list.insert(userLogin);
                ob.saveToUserLoginXML();
                JOptionPane.showMessageDialog(rootPane, "User credentials added to list");
            }
        } catch (NumberFormatException badHouseData) {
            // Text field info incorrectly formated
            JOptionPane.showMessageDialog(rootPane, "Number? " + badHouseData.getMessage());
        }        
    }//GEN-LAST:event_jBtnSubmitActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
      this.setVisible(false);
      optionsForm.setVisible(true);
    }//GEN-LAST:event_jBtnCancelActionPerformed

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
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;

            javax.swing.UIManager.setLookAndFeel("org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelWin");
            javax.swing.UIManager.put("RootPane.setupButtonVisible", false);

        } catch (javax.swing.UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnSubmit;
    private javax.swing.JLabel jLabelConfirmPwd;
    private javax.swing.JLabel jLabelNewPwd;
    private javax.swing.JLabel jLabelOldPwd;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanelChngPwd;
    private javax.swing.JTextField jTxtConfirmPwd;
    private javax.swing.JTextField jTxtNewPwd;
    private javax.swing.JTextField jTxtOldPwd;
    private javax.swing.JTextField jTxtUserName;
    // End of variables declaration//GEN-END:variables
}
