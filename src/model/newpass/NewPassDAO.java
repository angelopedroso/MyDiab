/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.newpass;
import connection.ConnectionSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author angel
 */
public class NewPassDAO {
    public static PreparedStatement update(String newpass, String email) throws SQLException{
        PreparedStatement ps = null;
        
        ps = ConnectionSQL.getConnection().prepareStatement("UPDATE usern SET password = MD5(?) WHERE email = ?");
        
        ps.setString(1, newpass);
        ps.setString(2, email);
        
        ps.executeUpdate();
        
        return ps;
    }
}
