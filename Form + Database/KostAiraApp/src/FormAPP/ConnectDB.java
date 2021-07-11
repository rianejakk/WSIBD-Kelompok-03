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
import javax.swing.JOptionPane;

/**
 *
 * @author Tony's PC
 */
public class ConnectDB {

    Connection con; //---> Interface penyedia method utk menghubungi database
    PreparedStatement pst;
    ResultSet rs; //---> untuk menyimpan hasil proses query kedalam database
    Statement st; //---> untuk mngeksekusi query

    public ConnectDB() {
        try {
            //konstruktor koneksi
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://103.157.96.249:3306/kostaira", "kostaira", "kostaira123");
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
//            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertDB(String id_cust, String noktp, String nama, String jeniskelamin, String alamat, String nohppribadi, String nohpdarurat) {
        try {
            String sql = "insert into pelanggan values (?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, id_cust);
            pst.setString(2, noktp);
            pst.setString(3, nama);
            pst.setString(4, jeniskelamin);
            pst.setString(5, alamat);
            pst.setString(6, nohppribadi);
            pst.setString(7, nohpdarurat);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertDB(String id_user, String username, String password, String akses) {
        try {
            String sql = "insert into login_user values (?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, id_user);
            pst.setString(2, username);
            pst.setString(3, password);
            pst.setString(4, akses);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
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
//            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    
    public ResultSet selectDB() {
        try {
            String sql = "select * from login_user";
            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet selectDB(String id_user) {
        try {
            String sql = "select id_user from login_user";
            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet selectDB1(String id_cust) {
        try {
            String sql = "select id_cust from pelanggan";
            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet conLogin(String username, String password) {
        try {
            String sql = "select * from login_user where username='" + username + "' AND password='" + password + "'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet gabungDB(String username) {
        try {
            String sql = "SELECT NamaLengkap, Alamat, JenisKelamin, NoHpPribadi, NoHpDarurat From pelanggan INNER JOIN login_user ON pelanggan.id_cust=login_user.id_user WHERE login_user.username='" + username + "'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
//            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rs;
    }

//    public void deleteDB(String nim) {
//        try {
//            String sql = "delete from mahasiswa where nimmhs =?";
//            pst = con.prepareStatement(sql);
//            pst.setString(1,nim);
//            pst.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
}