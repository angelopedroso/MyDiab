/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfface;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class dialogForgot extends javax.swing.JDialog {

    /**
     * Creates new form dialogForgot
     */
    public dialogForgot(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        JPBG.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPBG = new javax.swing.JPanel();
        jLConfirm = new javax.swing.JLabel();
        jFTField1 = new javax.swing.JFormattedTextField();
        jFTField2 = new javax.swing.JFormattedTextField();
        jFTField3 = new javax.swing.JFormattedTextField();
        jFTField4 = new javax.swing.JFormattedTextField();
        jFTField5 = new javax.swing.JFormattedTextField();
        jFTField6 = new javax.swing.JFormattedTextField();
        jLBackLogin = new javax.swing.JLabel();
        JLBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1166, 668));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPBG.setBorder(null);
        JPBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        JPBG.add(jLConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 444, 203, 29));

        jFTField1.setBackground(new java.awt.Color(33, 33, 33));
        jFTField1.setBorder(null);
        jFTField1.setForeground(new java.awt.Color(230, 230, 230));
        try {
            jFTField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTField1.setText("null");
        jFTField1.setToolTipText(null);
        jFTField1.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jFTField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFTField1KeyTyped(evt);
            }
        });
        JPBG.add(jFTField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 30, 30));

        jFTField2.setBackground(new java.awt.Color(33, 33, 33));
        jFTField2.setBorder(null);
        jFTField2.setForeground(new java.awt.Color(230, 230, 230));
        try {
            jFTField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTField2.setText("null");
        jFTField2.setToolTipText(null);
        jFTField2.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jFTField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFTField2KeyTyped(evt);
            }
        });
        JPBG.add(jFTField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 370, 30, 30));

        jFTField3.setBackground(new java.awt.Color(33, 33, 33));
        jFTField3.setBorder(null);
        jFTField3.setForeground(new java.awt.Color(230, 230, 230));
        try {
            jFTField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTField3.setText("null");
        jFTField3.setToolTipText(null);
        jFTField3.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jFTField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFTField3KeyTyped(evt);
            }
        });
        JPBG.add(jFTField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 371, 30, 30));

        jFTField4.setBackground(new java.awt.Color(33, 33, 33));
        jFTField4.setBorder(null);
        jFTField4.setForeground(new java.awt.Color(230, 230, 230));
        try {
            jFTField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTField4.setText("null");
        jFTField4.setToolTipText(null);
        jFTField4.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jFTField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFTField4KeyTyped(evt);
            }
        });
        JPBG.add(jFTField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 371, 30, 30));

        jFTField5.setBackground(new java.awt.Color(33, 33, 33));
        jFTField5.setBorder(null);
        jFTField5.setForeground(new java.awt.Color(230, 230, 230));
        try {
            jFTField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTField5.setText("null");
        jFTField5.setToolTipText(null);
        jFTField5.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jFTField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFTField5KeyTyped(evt);
            }
        });
        JPBG.add(jFTField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 371, 30, 30));

        jFTField6.setBackground(new java.awt.Color(33, 33, 33));
        jFTField6.setBorder(null);
        jFTField6.setForeground(new java.awt.Color(230, 230, 230));
        try {
            jFTField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTField6.setText("null");
        jFTField6.setToolTipText(null);
        jFTField6.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        JPBG.add(jFTField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 371, 30, 30));

        jLBackLogin.setFont(new java.awt.Font("Lato", 1, 13)); // NOI18N
        jLBackLogin.setForeground(new java.awt.Color(192, 192, 192));
        jLBackLogin.setText("Do you remember your password?");
        jLBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLBackLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBackLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBackLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBackLoginMouseExited(evt);
            }
        });
        JPBG.add(jLBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 477, -1, -1));

        JLBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Forgot/Forgot.png"))); // NOI18N
        JPBG.add(JLBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(JPBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLConfirmMouseEntered
        jLConfirm.setIcon(new ImageIcon("src/Images/Forgot/ForgotConfirm.png"));
    }//GEN-LAST:event_jLConfirmMouseEntered

    private void jLConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLConfirmMouseExited
        jLConfirm.setIcon(null);
    }//GEN-LAST:event_jLConfirmMouseExited
          
    private void jFTField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTField2KeyTyped
        jTextFieldKeyTyped(evt);     
    }//GEN-LAST:event_jFTField2KeyTyped

    private void jFTField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTField3KeyTyped
        jTextFieldKeyTyped(evt);       
    }//GEN-LAST:event_jFTField3KeyTyped

    private void jFTField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTField4KeyTyped
        jTextFieldKeyTyped(evt);  
    }//GEN-LAST:event_jFTField4KeyTyped

    private void jFTField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTField5KeyTyped
        jTextFieldKeyTyped(evt);     
    }//GEN-LAST:event_jFTField5KeyTyped

    private void jFTField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTField1KeyTyped
        jTextFieldKeyTyped(evt);         
    }//GEN-LAST:event_jFTField1KeyTyped

    private void jLBackLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBackLoginMouseEntered
        jLBackLogin.setText("<HTML><U>Do you remember your password?</UL></HTML>");
    }//GEN-LAST:event_jLBackLoginMouseEntered

    private void jLBackLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBackLoginMouseExited
        jLBackLogin.setText("Do you remember your password?");
    }//GEN-LAST:event_jLBackLoginMouseExited

    private void jLBackLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBackLoginMouseClicked
        new dialogLogin(null, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLBackLoginMouseClicked

    private void jLConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLConfirmMouseClicked
        String code = jFTField1.getText() + jFTField2.getText() + jFTField3.getText() + jFTField4.getText() + jFTField5.getText() + jFTField6.getText();
        System.out.println(code);
        new dialogNewPass(null, true).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLConfirmMouseClicked
   
    private void jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {                                     
        if (evt.getSource() instanceof JTextField) {
            JTextField campo = (JTextField) evt.getSource();
            String chara = campo.getText();
            if (chara.length() >= 1) {
                campo.transferFocus();
            }
        }
    }
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
            java.util.logging.Logger.getLogger(dialogForgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogForgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogForgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogForgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogForgot dialog = new dialogForgot(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLBG;
    private javax.swing.JPanel JPBG;
    private javax.swing.JFormattedTextField jFTField1;
    private javax.swing.JFormattedTextField jFTField2;
    private javax.swing.JFormattedTextField jFTField3;
    private javax.swing.JFormattedTextField jFTField4;
    private javax.swing.JFormattedTextField jFTField5;
    private javax.swing.JFormattedTextField jFTField6;
    private javax.swing.JLabel jLBackLogin;
    private javax.swing.JLabel jLConfirm;
    // End of variables declaration//GEN-END:variables
}
