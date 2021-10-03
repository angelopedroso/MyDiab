/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfface.Login_Variant;

import abstractt.Data;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author angel
 */
public class dialogNewPass extends javax.swing.JDialog {
    int xMouse, yMouse;
    Connection con = null;
    PreparedStatement ps = null;
    ImageIcon passerror = new ImageIcon("src/Images/Forgot/NewPasswordError.png");
    ImageIcon pass = new ImageIcon("src/Images/Forgot/NewPassword.png");
    
    public dialogNewPass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        jPBG.setBackground(new Color(0,0,0,0));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBG = new javax.swing.JPanel();
        jLConfirm = new javax.swing.JLabel();
        jTPassword = new javax.swing.JPasswordField();
        jTPasswordConfirm = new javax.swing.JPasswordField();
        jLSuccess = new javax.swing.JLabel();
        jLBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPBG.setPreferredSize(new java.awt.Dimension(1168, 668));
        jPBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLConfirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLConfirmMouseExited(evt);
            }
        });
        jPBG.add(jLConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 422, 205, 30));

        jTPassword.setBackground(new java.awt.Color(33, 33, 33));
        jTPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTPassword.setForeground(new java.awt.Color(192, 192, 192));
        jTPassword.setText("New Password");
        jTPassword.setBorder(null);
        jTPassword.setCaretColor(new java.awt.Color(230, 230, 230));
        jTPassword.setEchoChar((char)0);
        jTPassword.setOpaque(true);
        jTPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPasswordFocusLost(evt);
            }
        });
        jPBG.add(jTPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 284, 250, 25));

        jTPasswordConfirm.setBackground(new java.awt.Color(33, 33, 33));
        jTPasswordConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTPasswordConfirm.setForeground(new java.awt.Color(192, 192, 192));
        jTPasswordConfirm.setText("Confirm Password");
        jTPasswordConfirm.setBorder(null);
        jTPasswordConfirm.setCaretColor(new java.awt.Color(230, 230, 230));
        jTPasswordConfirm.setEchoChar((char)0);
        jTPasswordConfirm.setOpaque(true);
        jTPasswordConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPasswordConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPasswordConfirmFocusLost(evt);
            }
        });
        jPBG.add(jTPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 350, 250, 25));

        jLSuccess.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLSuccess.setForeground(new java.awt.Color(0, 211, 128));
        jPBG.add(jLSuccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Forgot/NewPassword.png"))); // NOI18N
        jPBG.add(jLBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLConfirmMouseClicked
        String pass = String.valueOf(jTPassword.getPassword());
        String newpass = String.valueOf(jTPasswordConfirm.getPassword());
        if (pass.equals(newpass)) {
            try {
                String updateQuery = "UPDATE usern SET password = MD5(?) WHERE email = ?";
                con = DriverManager.getConnection("jdbc:postgresql://localhost/MYDIAB", "postgres", "321123");
                ps = con.prepareStatement(updateQuery);
                ps.setString(1, newpass);
                ps.setString(2, Data.getEmail());
                ps.executeUpdate();              
            } catch (SQLException ex) {
                System.out.println("Error: "+ex);
            }
        }else{
            jLBG.setIcon(passerror);
            jTPasswordConfirm.setText("");
            jTPasswordConfirm.requestFocus();
            return;
        }
        
        new dialogLogin(null, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLConfirmMouseClicked

    private void jLConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLConfirmMouseEntered
        jLConfirm.setIcon(new ImageIcon("src/Images/Forgot/ForgotConfirm.png"));
    }//GEN-LAST:event_jLConfirmMouseEntered

    private void jLConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLConfirmMouseExited
        jLConfirm.setIcon(null);
    }//GEN-LAST:event_jLConfirmMouseExited

    private void jTPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPasswordFocusGained
        String pass = String.valueOf(jTPassword.getPassword());
        jTPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        jTPassword.setEchoChar('\u25cf');
        if (pass.trim().toLowerCase().equals("new password")) {
            jTPassword.setText("");
        }
    }//GEN-LAST:event_jTPasswordFocusGained

    private void jTPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPasswordFocusLost
        String pass = String.valueOf(jTPassword.getPassword());
        if (((pass.trim().toLowerCase().equals("new password")) || (pass.toLowerCase().equals("")))) {
            jTPassword.setText("New Password");
            jTPassword.setEchoChar((char)0);
        }
    }//GEN-LAST:event_jTPasswordFocusLost

    private void jTPasswordConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPasswordConfirmFocusGained
        String pass = String.valueOf(jTPasswordConfirm.getPassword());
        jTPasswordConfirm.setFont(new Font("Tahoma", Font.BOLD, 12));
        jTPasswordConfirm.setEchoChar('\u25cf');        
        if (pass.trim().toLowerCase().equals("confirm password")) {
            jTPasswordConfirm.setText("");
        }
    }//GEN-LAST:event_jTPasswordConfirmFocusGained

    private void jTPasswordConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPasswordConfirmFocusLost
        String newpass = String.valueOf(jTPassword.getPassword());
        String pass = String.valueOf(jTPasswordConfirm.getPassword());
        if (((pass.trim().toLowerCase().equals("confirm password")) || (pass.toLowerCase().equals("")))) {
            jTPasswordConfirm.setText("Confirm Password");
            jTPasswordConfirm.setEchoChar((char)0);
            return;
        }
        
        if (!newpass.equals(pass)) {
            jLBG.setIcon(passerror);
            jTPasswordConfirm.setText("Confirm Password");
            jTPasswordConfirm.requestFocus();
            return;
        }
    }//GEN-LAST:event_jTPasswordConfirmFocusLost

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(dialogNewPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogNewPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogNewPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogNewPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogNewPass dialog = new dialogNewPass(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBG;
    private javax.swing.JLabel jLConfirm;
    private javax.swing.JLabel jLSuccess;
    private javax.swing.JPanel jPBG;
    private javax.swing.JPasswordField jTPassword;
    private javax.swing.JPasswordField jTPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
