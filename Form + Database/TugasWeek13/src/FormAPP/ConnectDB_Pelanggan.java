/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormAPP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tony's PC
 */
public class ConnectDB_Pelanggan {

    Connection con; //---> Interface penyedia method utk menghubungi database
    PreparedStatement pst;
    ResultSet rs; //---> untuk menyimpan hasil proses query kedalam database
    Statement st; //---> untuk mngeksekusi query

    public ConnectDB_Pelanggan() {
        try {
            //konstruktor koneksi
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kostaira", "root", "");
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
//            Logger.getLogger(ConnectDB_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertDB(String username, String noktp, String nama, String jeniskelamin, String alamat, String nohppribadi, String nohpdarurat, String password) {
        try {
            String sql = "insert into pelanggan values (?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, noktp);
            pst.setString(3, nama);
            pst.setString(4, jeniskelamin);
            pst.setString(5, alamat);
            pst.setString(6, nohppribadi);
            pst.setString(7, nohpdarurat);
            pst.setString(8, password);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//        public void updateDB(String nim, String nama, String alamat) {
//        try {
//            String sql = "update mahasiswa set namamhs =?, alamatmhs=? where nimmhs =?";
//            pst = con.prepareStatement(sql);
//            pst.setString(1, nama);
//            pst.setString(2, alamat);
//            pst.setString(3, nim);
//            pst.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectDB_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    
//    public ResultSet selectDB() {
//        try {
//            String sql = "select * from mahasiswa";
//            st = con.createStatement();
//            rs = st.executeQuery(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectDB_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return rs;
//    }

//    public void deleteDB(String nim) {
//        try {
//            String sql = "delete from mahasiswa where nimmhs =?";
//            pst = con.prepareStatement(sql);
//            pst.setString(1,nim);
//            pst.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectDB_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

}
