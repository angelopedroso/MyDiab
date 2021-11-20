/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.table;
import connection.ConnectionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Glucose;
/**
 *
 * @author angel
 */
public class GlucoseDAO {
    public void create(Glucose g){
        Connection con = ConnectionSQL.getConnection();
        PreparedStatement pst = null;
        
        try {
            pst = con.prepareStatement("INSERT INTO glucose(data, breakfast, lunch, snack1, snack2, dinner, midnight, email) VALUES(?,?,?,?,?,?,?,?)");
            pst.setObject(1, g.getData());
            pst.setInt(2, g.getBreakfast());
            pst.setInt(3, g.getLunch());
            pst.setInt(4, g.getSnack1());
            pst.setInt(5, g.getSnack2());
            pst.setInt(6, g.getDinner());
            pst.setInt(7, g.getMidnight());
            pst.setString(8, g.getEmail());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GlucoseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionSQL.closeConnection(con, pst);
        }     
    }
    
    public LinkedList<Glucose> read(Glucose g){
        Connection con = ConnectionSQL.getConnection();
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        LinkedList<Glucose> glucoses = new LinkedList<>();
        
        try {
            pst = con.prepareStatement("SELECT * FROM glucose");
            rs = pst.executeQuery();
            
            while (rs.next()) {                
                Glucose glucose = new Glucose();
                
                glucose.setData((LocalDate)rs.getObject("data"));
                glucose.setBreakfast(rs.getInt("breakfast"));
                glucose.setLunch(rs.getInt("lunch"));
                glucose.setSnack1(rs.getInt("snack1"));
                glucose.setSnack2(rs.getInt("snack2"));
                glucose.setDinner(rs.getInt("dinner"));
                glucose.setMidnight(rs.getInt("midnight"));
                glucose.setEmail(rs.getString("email"));
                
                glucoses.add(glucose);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GlucoseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionSQL.closeConnection(con, pst, rs);
        }
        
        return glucoses;
    }   

}
