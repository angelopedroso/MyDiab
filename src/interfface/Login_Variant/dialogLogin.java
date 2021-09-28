/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfface.Login_Variant;

import abstractt.Data;
import connection.ConnectionSQL;
import interfface.DashBoard.dialogDashBoard;
import interfface.Login_Variant.dialogRegister;
import java.awt.Color;
import java.awt.Font;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author angel
 */
public class dialogLogin extends javax.swing.JDialog {
    int xMouse, yMouse;
    ImageIcon emailError = new ImageIcon("src/Images/Login/ForgotPasswordError.png");
    ImageIcon passError = new ImageIcon("src/Images/Login/PasswordError.png");
    ImageIcon login = new ImageIcon("src/Images/Login/Login.png");
    public void Rand(){
        String rCode = String.format("%06d", new Random().nextInt(999999));
        Data.setRdCode(rCode);
    }
    
    
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
        jTFEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFEmailKeyTyped(evt);
            }
        });
        jPBG.add(jTFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 240, 25));

        JTPassword.setBackground(new java.awt.Color(33, 33, 33));
        JTPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JTPassword.setForeground(new java.awt.Color(192, 192, 192));
        JTPassword.setText("Password");
        JTPassword.setBorder(null);
        JTPassword.setCaretColor(new java.awt.Color(230, 230, 230));
        JTPassword.setEchoChar((char)0);
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
        JTPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTPasswordKeyTyped(evt);
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLForgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLForgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLForgotMouseExited(evt);
            }
        });
        jPBG.add(jLForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 317, -1, -1));

        jLErrorMail.setFont(new java.awt.Font("Lato", 1, 13)); // NOI18N
        jLErrorMail.setForeground(new java.awt.Color(237, 66, 69));
        jLErrorMail.setBorder(null);
        jPBG.add(jLErrorMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 206, -1, -1));

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
        if ((jTFEmail.getText().equals("E-mail") || (jTFEmail.getText().equals("")))) {
            jTFEmail.setText("");
            return;
        }

        try {
            LoginBG.setIcon(login);
            TimeUnit.MILLISECONDS.sleep(1500);
            jLErrorMail.setText("");
        } catch (InterruptedException ex) {
            Logger.getLogger(dialogLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTFEmailFocusGained

    private void jTFEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFEmailFocusLost
        if ((jTFEmail.getText().equals("E-mail") || (jTFEmail.getText().equals("")))) {
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
        ShowOff();
        String pass = String.valueOf(JTPassword.getPassword());
        if ((pass.toLowerCase().equals("") || (pass.toLowerCase().equals("password")))) {
            JTPassword.setText("");          
        }
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
        ShowOff();
    }//GEN-LAST:event_jLPEyeCloseMouseClicked

    private void jLForgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLForgotMouseEntered
        jLForgot.setText("<HTML><U>Forgot Password?</UL></HTML>");
    }//GEN-LAST:event_jLForgotMouseEntered

    private void jLForgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLForgotMouseExited
        jLForgot.setText("Forgot Password?");
    }//GEN-LAST:event_jLForgotMouseExited

    private void JTPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTPasswordFocusLost
        String pass = String.valueOf(JTPassword.getPassword());
        if (((pass.toLowerCase().equals("")) || (pass.toLowerCase().equals("password")))) {
            JTPassword.setText("Password");  
            JTPassword.setEchoChar((char)0);
        }
    }//GEN-LAST:event_JTPasswordFocusLost

    private void jLSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSignUpMouseClicked
        new dialogRegister(null, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLSignUpMouseClicked

    private void jLForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLForgotMouseClicked
      
        try {           
            if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTFEmail.getText()))){
                LoginBG.setIcon(emailError);
                Thread.sleep(100);
                jLErrorMail.setText("Verify your e-mail");
                return;
            }                           
        } catch (InterruptedException ex) {
            Logger.getLogger(dialogLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "SELECT email FROM USERN WHERE email = ?";
        PreparedStatement prepStmt;    
        
        
        
        try {
            prepStmt = ConnectionSQL.getConnection().prepareStatement(sql);
            prepStmt.setString(1, jTFEmail.getText());
            ResultSet reS = prepStmt.executeQuery();
            if (!reS.next()) {
              LoginBG.setIcon(emailError);  
              jLErrorMail.setText("E-mail Doesn't Exist");
              jTFEmail.requestFocus();
              return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(dialogRegister.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        
        try {
            
            Properties props = new Properties();

            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props,
              new javax.mail.Authenticator() {
                   @Override
                   protected PasswordAuthentication getPasswordAuthentication()
                   {
                         return new PasswordAuthentication("mydiab.acc@gmail.com",
                         "mydiab123");
                   }
              });
            
            Rand();
            
            session.setDebug(true);

            Message message = new MimeMessage(session);

            Address[] toUser = InternetAddress.parse(jTFEmail.getText());

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject("Reseting Code");
            message.setContent("<!DOCTYPE html>\n" +
                "<html lang=\"pt-br\">\n" +
                "<head>\n" +
                "\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <meta name=\"x-apple-disable-message-reformatting\">\n" +
                "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "  <title></title>\n" +
                "  \n" +
                "  <style type=\"text/css\">\n" +
                "  table, td { \n" +
                "    color: #000000; \n" +
                "  } \n" +
                "\n" +
                "  @media only screen and (min-width: 620px) {\n" +
                "    .u-row {\n" +
                "      width: 600px !important;\n" +
                "    }\n" +
                "    .u-row .u-col {\n" +
                "      vertical-align: top;\n" +
                "    }\n" +
                "\n" +
                "    .u-row .u-col-100 {\n" +
                "      width: 600px !important;\n" +
                "    }\n" +
                "  }\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .u-row-container {\n" +
                "    max-width: 100% !important;\n" +
                "    padding-left: 0px !important;\n" +
                "    padding-right: 0px !important;\n" +
                "  }\n" +
                "  .u-row .u-col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important;\n" +
                "  }\n" +
                "  .u-row {\n" +
                "    width: calc(100% - 40px) !important;\n" +
                "  }\n" +
                "  .u-col {\n" +
                "    width: 100% !important;\n" +
                "  }\n" +
                "  .u-col > div {\n" +
                "    margin: 0 auto;\n" +
                "  }\n" +
                "}\n" +
                "body {\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "}\n" +
                "\n" +
                "table,\n" +
                "tr,\n" +
                "td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "  margin: 0;\n" +
                "}\n" +
                "\n" +
                ".ie-container table,\n" +
                ".mso-container table {\n" +
                "  table-layout: fixed;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit;\n" +
                "}\n" +
                "\n" +
                "a[x-apple-data-detectors='true'] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important;\n" +
                "}\n" +
                "\n" +
                "</style>\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "<link href=\"https://fonts.googleapis.com/css?family=Cabin:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><link href=\"https://fonts.googleapis.com/css?family=Lato:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #f9f9f9;color: #000000\">\n" +
                "\n" +
                "  <table style=\"border-collapse: collapse; table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;margin: 5px auto;background-color: #f9f9f9;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "  <tbody>\n" +
                "  <tr style=\"vertical-align: top\">\n" +
                "    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "\n" +
                "    \n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px; background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px; border-radius: 10px 10px 0px 0px; max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #212121;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "<div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\">\n" +
                "  \n" +
                "<table style=\"font-family:'Cabin',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Cabin',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div style=\"color: #4bc3b9; line-height: 140%; text-align: center; word-wrap: break-word; padding: 5px 0px;\">\n" +
                "    <img src=\"https://i.ibb.co/HCfH05L/Logo.png\" alt=\"MYDIAB Logo\" style=\"width: auto; height: auto;\">\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #282828;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                " <div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\">\n" +
                "  \n" +
                "<table style=\"font-family:'Cabin',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Cabin',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "  <tr>\n" +
                "    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\n" +
                "      \n" +
                "      <img align=\"center\" border=\"0\" src=\"https://i.ibb.co/k5shXnM/image-1.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 26%;max-width: 150.8px;\" width=\"150.8\"/>\n" +
                "      \n" +
                "    </td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Cabin',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px 10px 31px;font-family:'Cabin',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div style=\"color: #e5eaf5; line-height: 140%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 28px; line-height: 39.2px;\"><strong><span style=\"line-height: 39.2px; font-size: 28px;\">Your Reseting Code</span></strong></span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #ffffff;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "<div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\">\n" +
                "  \n" +
                "<table style=\"font-family:'Cabin',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:33px 55px;font-family:'Cabin',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div style=\"line-height: 160%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 160%; text-align: left;\"><span style=\"font-size: 22px; line-height: 35.2px; color: #000;\">Hello,</span></p>\n" +
                "<p style=\"font-size: 14px; line-height: 160%; text-align: left;\"><span style=\"font-size: 16px; line-height: 25.6px; color: #000;\">Use this code to change your password:</span></p>\n" +
                "<br>\n" +
                "<p style=\"font-size: 14px; line-height: 160%; text-align: left; padding-top: 20px;\"><span style=\"font-size: 22px; line-height: 35.2px; color: #d63e41;\">"+Data.getRdCode()+"</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<table style=\"font-family:'Cabin',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:25px 55px;font-family:'Cabin',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div style=\"line-height: 160%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"line-height: 160%; font-size: 14px; text-align: left;\"><span style=\"font-size: 18px; line-height: 28.8px;\">Thanks, </span><span style=\"font-size: 18px; line-height: 28.8px;\">MyDiab</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "  </div>\n" +
                "</div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #e5eaf5;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                " <div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\">\n" +
                "  \n" +
                "<table style=\"font-family:'Cabin',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:41px 55px 18px;font-family:'Cabin',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div style=\"color: #4bc3b9; line-height: 160%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 160%;\"><span style=\"font-size: 20px; line-height: 32px;\"><strong>Get in touch</strong></span></p>\n" +
                "<p style=\"font-size: 14px; line-height: 160%;\"><a style=\"font-size: 17px; line-height: 25.6px; text-decoration: none; color: #000000;\" href=\"mailto:mydiab.acc@gmail.com\">mydiab.acc@gmail.com</a></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\n" +
                "  <div class=\"u-row\" style=\"Margin: 0 auto; border-radius: 0px 0px 10px 10px; min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #282828;\">\n" +
                "    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">\n" +
                "\n" +
                "<div class=\"u-col u-col-100\" style=\"max-width: 320px; min-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "  <div style=\"width: 100% !important;\">\n" +
                "<div style=\"padding: 0px;border-top: 0px solid transparent; border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\">\n" +
                "  \n" +
                "<table style=\"font-family:'Cabin',sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:'Cabin',sans-serif;\" align=\"left\">\n" +
                "        \n" +
                "  <div style=\"color: #ffffff; line-height: 180%; text-align: center; word-wrap: break-word;\">\n" +
                "    <p style=\"font-size: 14px; line-height: 180%;\"><span style=\"font-size: 16px; line-height: 28.8px;\">Copyrights &copy; MyDiab All Rights Reserved</span></p>\n" +
                "  </div>\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "    </td>\n" +
                "  </tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>", "text/html");
            message.setFrom(new InternetAddress("mydiab.acc@gmail.com", "MyDiab"));
            
            Transport.send(message);

        }catch (MessagingException ex) {
            throw new RuntimeException(ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(dialogLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Data.setEmail(jTFEmail.getText());
        
        new dialogForgot(null, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLForgotMouseClicked

    private void jLSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSignInMouseClicked
        PreparedStatement ps;
        ResultSet rs;
        
        String pass = String.valueOf(JTPassword.getPassword());
        
        String query = "SELECT * FROM USERN WHERE ((email = ?) and (password = MD5(?)))";
        
        String sql = "SELECT email FROM USERN WHERE email = ?";
        PreparedStatement prepStmt;
        try {
            prepStmt = ConnectionSQL.getConnection().prepareStatement(sql);
            prepStmt.setString(1, jTFEmail.getText());
            ResultSet reS = prepStmt.executeQuery();
            if (!reS.next()) {
              LoginBG.setIcon(emailError);  
              jLErrorMail.setText("E-mail Doesn't Exist");
              jTFEmail.requestFocus();
              return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(dialogRegister.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        try {
            ps = ConnectionSQL.getConnection().prepareStatement(query);
            
            ps.setString(1, jTFEmail.getText());
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                this.dispose();
                new dialogDashBoard(null, true).setVisible(true);
            }else{
                LoginBG.setIcon(passError);
                JTPassword.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(dialogLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLSignInMouseClicked

    private void JTPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPasswordKeyTyped
        String pass = String.valueOf(JTPassword.getPassword());
        if (pass.toLowerCase().equals("")) {
            LoginBG.setIcon(login);    
        }
    }//GEN-LAST:event_JTPasswordKeyTyped

    private void jTFEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFEmailKeyTyped
        if (jTFEmail.getText().equals("")) {
            LoginBG.setIcon(login);
            jLErrorMail.setText("");
        }
    }//GEN-LAST:event_jTFEmailKeyTyped

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
    
    private void ShowOff(){
        jLPEye.setVisible(true);
        jLPEye.setEnabled(true);
        JTPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTPassword.setEchoChar('\u25cf');
        jLPEyeClose.setVisible(false);
        jLPEyeClose.setEnabled(false);
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
