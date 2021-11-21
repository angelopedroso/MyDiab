/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.register;
import connection.ConnectionSQL;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author angel
 */
public class RegisterDAO {
    public static ResultSet emailExists(String email) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ps = ConnectionSQL.getConnection().prepareStatement("SELECT email FROM USERN WHERE email = ?");
        
        ps.setString(1, email);
        
        return rs = ps.executeQuery();
    }
    
    public static PreparedStatement register(String email, String user, String pass) throws SQLException{
        PreparedStatement ps = null;
        
        ps = ConnectionSQL.getConnection().prepareStatement("INSERT INTO usern(email, username, password) VALUES(?, ?, MD5(?))");
        
        ps.setString(1, email);
        ps.setString(2, user);
        ps.setString(3, pass);
        
        return ps;
    }
}
