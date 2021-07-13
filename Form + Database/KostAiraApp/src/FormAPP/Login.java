/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormAPP;

import static FormAPP.MenuAdmin.NamaUser1;
import static FormAPP.MenuUser.NamaUser2;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tony's PC
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        iconApp();
        loader.setVisible(false);
        loader.setEnabled(false);

    }
    int xy, xx;

    private void iconApp() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/SI_AiraKost_Asset/ico2.png")));
    }

    private void loginUser() {
        LoginFull.setVisible(false);
        LoginFull.setEnabled(false);
        loader.setVisible(true);
        loader.setEnabled(true);
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    String username, password;
                    username = UserField.getText();
                    password = PassField.getText();
                    ConnectDB konek = new ConnectDB();
                    ResultSet rs = konek.conLogin(username, password);
                    ResultSet rs2 = konek.gabungDB(username);
                    if (rs.next()) {
                        if ("Admin".equals(rs.getString("akses"))) {
                            MenuAdmin ad = new MenuAdmin();
                            ad.show();
                            NamaUser1.setText(rs.getString("username"));

                        } else if ("User".equals(rs.getString("akses"))) {
                            MenuUser usr = new MenuUser();
                            usr.show();
                            try {
                                rs2.next();
                                NamaUser2.setText(rs2.getString("NamaLengkap"));
                                MenuUser.nm_lengkap.setText(rs2.getString("NamaLengkap"));
                                MenuUser.nm_lengkap.setEnabled(false);
                                MenuUser.txtAlamat.setText(rs2.getString("Alamat"));
                                MenuUser.txtAlamat.setEnabled(false);
                                MenuUser.txtJenisKelamin.setText(rs2.getString("JenisKelamin"));
                                MenuUser.txtJenisKelamin.setEnabled(false);
                                MenuUser.txtNoHP.setText(rs2.getString("NoHpPribadi"));
                                MenuUser.txtNoHP.setEnabled(false);
                                MenuUser.txtNoDarurat.setText(rs2.getString("NoHpDarurat"));
                                MenuUser.txtNoDarurat.setEnabled(false);
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, ex.getMessage());
                            }
                        } dispose();
                    } else {
                        loader.setVisible(false);
                        loader.setEnabled(false);
                        LoginFull.setVisible(true);
                        LoginFull.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Username/Password salah atau kosong.", "Peringatan", JOptionPane.ERROR_MESSAGE);
                        System.out.println("Login Gagal");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }, 500 * 5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        LoginFull = new javax.swing.JPanel();
        Lbl_Judul = new javax.swing.JLabel();
        Lbl_Username = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Lbl_Password = new javax.swing.JLabel();
        Hide = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        PassField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        Daftar = new javax.swing.JToggleButton();
        Masuk = new javax.swing.JToggleButton();
        minimized1 = new javax.swing.JButton();
        minimized = new javax.swing.JButton();
        close = new javax.swing.JButton();
        pola = new javax.swing.JLabel();
        gambar1 = new javax.swing.JLabel();
        fullscreen = new javax.swing.JButton();
        loader = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_loader = new javax.swing.JLabel();
        img_loader = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KostAiraApp");
        setUndecorated(true);

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(null);

        LoginFull.setBackground(new java.awt.Color(255, 255, 255));
        LoginFull.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LoginFullMouseDragged(evt);
            }
        });
        LoginFull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginFullMousePressed(evt);
            }
        });
        LoginFull.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Judul.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        Lbl_Judul.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Judul.setText("Login to Kost Aira App ");
        LoginFull.add(Lbl_Judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, -1, -1));

        Lbl_Username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lbl_Username.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Username.setText("Username");
        LoginFull.add(Lbl_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, -1, -1));

        UserField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UserField.setBorder(null);
        UserField.setOpaque(false);
        LoginFull.add(UserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 370, 40));
        LoginFull.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 370, 10));

        Lbl_Password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lbl_Password.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Password.setText("Password");
        LoginFull.add(Lbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, -1, -1));

        Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/hide_32px.png"))); // NOI18N
        Hide.setBorder(null);
        Hide.setBorderPainted(false);
        Hide.setContentAreaFilled(false);
        Hide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HideActionPerformed(evt);
            }
        });
        LoginFull.add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 390, 26, 18));

        Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/show_32px.png"))); // NOI18N
        Show.setBorder(null);
        Show.setBorderPainted(false);
        Show.setContentAreaFilled(false);
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        LoginFull.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 390, 26, 18));

        PassField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PassField.setBorder(null);
        PassField.setOpaque(false);
        LoginFull.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 370, 40));
        LoginFull.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 370, 10));

        Daftar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Daftar.setForeground(new java.awt.Color(51, 51, 51));
        Daftar.setText("Daftar");
        Daftar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        Daftar.setContentAreaFilled(false);
        Daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });
        LoginFull.add(Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, 98, 39));

        Masuk.setBackground(new java.awt.Color(52, 135, 239));
        Masuk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Masuk.setForeground(new java.awt.Color(255, 255, 255));
        Masuk.setText("Login");
        Masuk.setBorder(null);
        Masuk.setBorderPainted(false);
        Masuk.setContentAreaFilled(false);
        Masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Masuk.setOpaque(true);
        Masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasukActionPerformed(evt);
            }
        });
        LoginFull.add(Masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 440, 100, 40));

        minimized1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        minimized1.setBorder(null);
        minimized1.setBorderPainted(false);
        minimized1.setContentAreaFilled(false);
        minimized1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimized1.setFocusPainted(false);
        minimized1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimized1ActionPerformed(evt);
            }
        });
        LoginFull.add(minimized1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1258, 15, 20, 20));

        minimized.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize1.png"))); // NOI18N
        minimized.setBorder(null);
        minimized.setBorderPainted(false);
        minimized.setContentAreaFilled(false);
        minimized.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimized.setFocusPainted(false);
        minimized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizedActionPerformed(evt);
            }
        });
        LoginFull.add(minimized, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 20, 20));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        close.setBorder(null);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setFocusPainted(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        LoginFull.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, 20));

        pola.setBackground(new java.awt.Color(255, 255, 255));
        pola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/pola1.png"))); // NOI18N
        pola.setOpaque(true);
        LoginFull.add(pola, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 675, 768));

        gambar1.setBackground(new java.awt.Color(255, 255, 255));
        gambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Thumbnail_Login69x768.png"))); // NOI18N
        gambar1.setOpaque(true);
        LoginFull.add(gambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fullscreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/maximize.png"))); // NOI18N
        fullscreen.setBorder(null);
        fullscreen.setBorderPainted(false);
        fullscreen.setContentAreaFilled(false);
        LoginFull.add(fullscreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 20, 20));

        Bg.add(LoginFull);
        LoginFull.setBounds(0, 0, 1365, 768);

        loader.setBackground(new java.awt.Color(255, 255, 255));
        loader.setOpaque(false);
        loader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label1.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 200, 60));

        lbl_loader.setBackground(new java.awt.Color(255, 255, 255));
        lbl_loader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_loader.setForeground(new java.awt.Color(96, 82, 76));
        lbl_loader.setText("Mohon Tunggu . . .");
        jPanel2.add(lbl_loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        img_loader.setBackground(new java.awt.Color(255, 255, 255));
        img_loader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/ring_1.gif"))); // NOI18N
        img_loader.setOpaque(true);
        jPanel2.add(img_loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 139, 141));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/3.2.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 380));

        loader.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 740, 380));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/blurLogin.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        loader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        Bg.add(loader);
        loader.setBounds(0, 0, 1366, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarActionPerformed
        LoginFull.setVisible(false);
        LoginFull.setEnabled(false);
        loader.setVisible(true);
        loader.setEnabled(true);
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Daftar df = new Daftar();
                df.show();
                dispose();
            }
        }, 5 * 5);
    }//GEN-LAST:event_DaftarActionPerformed

    private void MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukActionPerformed
        loginUser();
    }//GEN-LAST:event_MasukActionPerformed

    private void HideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HideActionPerformed
        Show.setVisible(true);
        Show.setEnabled(true);
        PassField.setEchoChar((char) 0);
        Hide.setVisible(false);
        Hide.setEnabled(false);
    }//GEN-LAST:event_HideActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        Hide.setVisible(true);
        Hide.setEnabled(true);
        PassField.setEchoChar((char) 8226);
        Show.setVisible(false);
        Show.setEnabled(false);
    }//GEN-LAST:event_ShowActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void minimized1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized1ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized1ActionPerformed

    private void minimizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizedActionPerformed
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                LoginMini mini = new LoginMini();
                mini.show();
                dispose();
            }
        }, 5 * 5);

    }//GEN-LAST:event_minimizedActionPerformed

    private void LoginFullMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginFullMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_LoginFullMousePressed

    private void LoginFullMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginFullMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_LoginFullMouseDragged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JToggleButton Daftar;
    private javax.swing.JButton Hide;
    private javax.swing.JLabel Lbl_Judul;
    private javax.swing.JLabel Lbl_Password;
    private javax.swing.JLabel Lbl_Username;
    private javax.swing.JPanel LoginFull;
    private javax.swing.JToggleButton Masuk;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JButton Show;
    private javax.swing.JTextField UserField;
    private javax.swing.JButton close;
    private javax.swing.JButton fullscreen;
    private javax.swing.JLabel gambar1;
    private javax.swing.JLabel img_loader;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_loader;
    private javax.swing.JPanel loader;
    private javax.swing.JButton minimized;
    private javax.swing.JButton minimized1;
    private javax.swing.JLabel pola;
    // End of variables declaration//GEN-END:variables
}
