/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Fahtul Rahman
 */
public class koneksi {

    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if(connection==null){
            new Driver();
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/portal_lab","root","");
            
            
        }
        return connection;
    }
    
}
