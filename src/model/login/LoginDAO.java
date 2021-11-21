package model.login;
import connection.ConnectionSQL;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class LoginDAO {
    public static ResultSet checkEmailExists(String email) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        pst = ConnectionSQL.getConnection().prepareStatement("SELECT email FROM USERN WHERE email = ?");
        pst.setString(1, email);

        return rs = pst.executeQuery();
    }
    
    public static ResultSet emaildb() throws SQLException{
        Statement em = null;
        ResultSet rsem = null;
        
        em = ConnectionSQL.getConnection().createStatement();
        
        return rsem = em.executeQuery("SELECT email, password FROM mdemail");
    }
    
    public static ResultSet login(String email, String pass) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        pst = ConnectionSQL.getConnection().prepareStatement("SELECT * FROM USERN WHERE ((email = ?) and (password = MD5(?)))");
        
        pst.setString(1, email);
        pst.setString(2, pass);
        
        return rs = pst.executeQuery();
    }
}
