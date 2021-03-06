/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author angel
 */
public class ConnectionSQL {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://ec2-34-227-120-94.compute-1.amazonaws.com:5432/d799rrk0j3am7e", "zhptmnorwvcocs", "8abc42546a2727b2dfeca3e6d8f955f3b3a55851514501733bda918bfaf85f9a");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    
    public static void closeConnection(Connection conn){
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement pst){
        closeConnection(conn);
        
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    public static void closeConnection(Connection conn, PreparedStatement pst, ResultSet rs){
        closeConnection(conn, pst);
        
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionSQL app = new ConnectionSQL();
        app.getConnection();
    }
}
