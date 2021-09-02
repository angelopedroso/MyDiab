/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfface;

import interfface.dialogRegister;
import java.awt.Color;
import java.awt.Font;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

/**
 *
 * @author angel
 */
public class dialogLogin extends javax.swing.JDialog {
    int xMouse, yMouse;
    /**
     * Creates new form NewJDialog
     */
    public dialogLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        jPBG.setBackground(new Color(0,0,0,0));
        jLPEyeClose.setVisible(false);
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
        jTFEmail = new javax.swing.JTextField();
        JTPassword = new javax.swing.JPasswordField();
        jLSignIn = new javax.swing.JLabel();
        jLSignUp = new javax.swing.JLabel();
        jLPEye = new javax.swing.JLabel();
        jLPEyeClose = new javax.swing.JLabel();
        jLForgot = new javax.swing.JLabel();
        jLErrorMail = new javax.swing.JLabel();
        LoginBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFEmail.setBackground(new java.awt.Color(33, 33, 33));
        jTFEmail.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jTFEmail.setForeground(new java.awt.Color(192, 192, 192));
        jTFEmail.setText("E-mail");
        jTFEmail.setToolTipText(null);
        jTFEmail.setBorder(null);
        jTFEmail.setOpaque(true);
        jTFEmail.setVerifyInputWhenFocusTarget(false);
        jTFEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFEmailFocusLost(evt);
            }
        });
        jPBG.add(jTFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 240, 25));

        JTPassword.setBackground(new java.awt.Color(33, 33, 33));
        JTPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JTPassword.setForeground(new java.awt.Color(192, 192, 192));
        JTPassword.setText("Password");
        JTPassword.setBorder(null);
        JTPassword.setCaretColor(new java.awt.Color(230, 230, 230));
        JTPassword.setEchoChar('\u25cf');
        JTPassword.setFocusAccelerator('8');
        JTPassword.setOpaque(true);
        JTPassword.setPreferredSize(new java.awt.Dimension(224, 25));
        JTPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTPasswordFocusLost(evt);
            }
        });
        jPBG.add(JTPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 285, -1, -1));

        jLSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSignInMouseExited(evt);
            }
        });
        jPBG.add(jLSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 361, 307, 42));

        jLSignUp.setFont(new java.awt.Font("Lato", 1, 17)); // NOI18N
        jLSignUp.setForeground(new java.awt.Color(68, 170, 162));
        jLSignUp.setText("Sign Up Now");
        jLSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSignUpMouseExited(evt);
            }
        });
        jPBG.add(jLSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, 20));

        jLPEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/white eye.png"))); // NOI18N
        jLPEye.setPreferredSize(new java.awt.Dimension(15, 15));
        jLPEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPEyeMouseClicked(evt);
            }
        });
        jPBG.add(jLPEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 291, -1, -1));

        jLPEyeClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/closeeye.png"))); // NOI18N
        jLPEyeClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPEyeCloseMouseClicked(evt);
            }
        });
        jPBG.add(jLPEyeClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 291, -1, -1));

        jLForgot.setFont(new java.awt.Font("Lato Black", 1, 12)); // NOI18N
        jLForgot.setForeground(new java.awt.Color(192, 192, 192));
        jLForgot.setText("Forgot Password?");
        jLForgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLForgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLForgotMouseExited(evt);
            }
        });
        jPBG.add(jLForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 317, -1, -1));

        jLErrorMail.setFont(new java.awt.Font("Lato Black", 1, 12)); // NOI18N
        jLErrorMail.setForeground(new java.awt.Color(237, 66, 69));
        jPBG.add(jLErrorMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 210, -1, -1));

        LoginBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/Login.png"))); // NOI18N
        jPBG.add(LoginBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSignUpMouseEntered
        jLSignUp.setText("<HTML><U>Sign Up Now</UL></HTML>");
    }//GEN-LAST:event_jLSignUpMouseEntered

    private void jLSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSignUpMouseExited
        jLSignUp.setText("Sign Up Now");
    }//GEN-LAST:event_jLSignUpMouseExited

    private void jLSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSignInMouseEntered
        jLSignIn.setIcon(new ImageIcon("Src/Images/Login/SignInPressed.png"));
    }//GEN-LAST:event_jLSignInMouseEntered

    private void jLSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSignInMouseExited
        jLSignIn.setIcon(null);
    }//GEN-LAST:event_jLSignInMouseExited

    private void jTFEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFEmailFocusGained
        LoginBG.setIcon(new ImageIcon("src/Images/Login/Login.png"));
        jLErrorMail.setText("");
        if ((jTFEmail.getText().equals("E-mail"))) {
            jTFEmail.setText("");   
        }
    }//GEN-LAST:event_jTFEmailFocusGained

    private void jTFEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFEmailFocusLost
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTFEmail.getText()))){
            LoginBG.setIcon(new ImageIcon("src/Images/Login/ForgotPasswordError.png"));
            jLErrorMail.setText("Invalid E-mail");
            jTFEmail.setText("E-mail");
        }      
    }//GEN-LAST:event_jTFEmailFocusLost

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void JTPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTPasswordFocusGained

    }//GEN-LAST:event_JTPasswordFocusGained

    private void jLPEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPEyeMouseClicked
        jLPEyeClose.setVisible(true);
        jLPEyeClose.setEnabled(true);
        JTPassword.setFont(new Font("Lato", Font.BOLD, 14));
        JTPassword.setEchoChar((char)0);
        jLPEye.setVisible(false);
        jLPEye.setEnabled(false);
    }//GEN-LAST:event_jLPEyeMouseClicked

    private void jLPEyeCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPEyeCloseMouseClicked
        jLPEye.setVisible(true);
        jLPEye.setEnabled(true);
        JTPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTPassword.setEchoChar('\u25cf');
        jLPEyeClose.setVisible(false);
        jLPEyeClose.setEnabled(false);
    }//GEN-LAST:event_jLPEyeCloseMouseClicked

    private void jLForgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLForgotMouseEntered
        jLForgot.setText("<HTML><U>Forgot Password?</UL></HTML>");
    }//GEN-LAST:event_jLForgotMouseEntered

    private void jLForgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLForgotMouseExited
        jLForgot.setText("Forgot Password?");
    }//GEN-LAST:event_jLForgotMouseExited

    private void JTPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTPasswordFocusLost

    }//GEN-LAST:event_JTPasswordFocusLost

    private void jLSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSignInMouseClicked
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTFEmail.getText()))){
            LoginBG.setIcon(new ImageIcon("src/Images/Login/ForgotPasswordError.png"));
            jLErrorMail.setText("Invalid E-mail");
            jTFEmail.setText("E-mail");
            jTFEmail.requestFocus();
            return;
        }   
        
        if (JTPassword.getText().trim().isEmpty() || (JTPassword.getText().equals("Password"))) {
            LoginBG.setIcon(new ImageIcon("src/Images/Login/ForgotPassword.png"));
            JTPassword.setText("Password");
            JTPassword.requestFocus();
            return;
        }
        
    }//GEN-LAST:event_jLSignInMouseClicked

    private void jLSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSignUpMouseClicked
        dispose();
        new dialogRegister(null, true).setVisible(true);
    }//GEN-LAST:event_jLSignUpMouseClicked

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
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogLogin dialog = new dialogLogin(new javax.swing.JFrame(), true);
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
    private javax.swing.JPasswordField JTPassword;
    private javax.swing.JLabel LoginBG;
    private javax.swing.JLabel jLErrorMail;
    private javax.swing.JLabel jLForgot;
    private javax.swing.JLabel jLPEye;
    private javax.swing.JLabel jLPEyeClose;
    private javax.swing.JLabel jLSignIn;
    private javax.swing.JLabel jLSignUp;
    private javax.swing.JPanel jPBG;
    private javax.swing.JTextField jTFEmail;
    // End of variables declaration//GEN-END:variables
}