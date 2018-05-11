/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Risqi Faisol
 */
public class koneksiDB {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
    try{       
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        mysqlconfig=DriverManager.getConnection("jdbc:mysql://localhost/db_kos", "root","");
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Koneksi Gagal");
        }
        return mysqlconfig;
    }
}