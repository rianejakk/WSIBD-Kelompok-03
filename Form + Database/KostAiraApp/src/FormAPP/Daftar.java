 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormAPP;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Tony's PC
 */
public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Daftar() {
        initComponents();
        ScrollData.getVerticalScrollBar().setUnitIncrement(10);
        iconApp();

        loader.setVisible(false);
        loader.setEnabled(false);
        autoNumber(txtId);
        autoNumber();
        cmbAkses.setSelectedItem("User");
        cmbAkses.setEnabled(false);
        Opsi_Perempuan.setSelected(true);
        Opsi_Laki.setEnabled(false);
    }
    int xy, xx;

    private void iconApp() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/SI_AiraKost_Asset/ico2.png")));
    }

    private void LblLength(JTextField txt, int length) {
        String input = txt.getText();
        if (input.length() > length) {
            JOptionPane.showMessageDialog(rootPane, "Jumlah input melebihi batas");
            txt.setText("");
        }
    }

    private void autoNumber(JTextField f1) {
        String id_user = "U0";
        int i = 0;
        try {
            ConnectDB konek = new ConnectDB();
            ResultSet rs = konek.selectDB(id_user);

            while (rs.next()) {
                id_user = rs.getString("id_user");
            }
            id_user = id_user.substring(1);
            i = Integer.parseInt(id_user) + 1;
            id_user = "00" + i;
            id_user = "U0" + id_user.substring(id_user.length() - 2);
            f1.setText(id_user);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void autoNumber() {
        String id_cust = "U0";
        int i = 0;
        try {
            ConnectDB konek = new ConnectDB();
            ResultSet rs = konek.selectDB1(id_cust);

            while (rs.next()) {
                id_cust = rs.getString("id_cust");
            }
            id_cust = id_cust.substring(1);
            i = Integer.parseInt(id_cust) + 1;
            id_cust = "00" + i;
            id_cust = "U0" + id_cust.substring(id_cust.length() - 2);
            txtCust.setText(id_cust);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Bg = new javax.swing.JPanel();
        DaftarFull = new javax.swing.JPanel();
        Lbl_Judul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Daftar = new javax.swing.JToggleButton();
        minimized1 = new javax.swing.JButton();
        minimized = new javax.swing.JButton();
        close = new javax.swing.JButton();
        Lbl_IdCust = new javax.swing.JLabel();
        txtCust = new javax.swing.JTextField();
        Lbl_IdUser = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        ScrollData = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Lbl_Username = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Hide = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        Lbl_Password = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        Lbl_NoKTP = new javax.swing.JLabel();
        KTPField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Lbl_Nama = new javax.swing.JLabel();
        NamaField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Lbl_JenisKelamin = new javax.swing.JLabel();
        Opsi_Laki = new javax.swing.JRadioButton();
        Opsi_Perempuan = new javax.swing.JRadioButton();
        Lbl_Alamat = new javax.swing.JLabel();
        AlamatField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Lbl_NoHP1 = new javax.swing.JLabel();
        NoField1 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Lbl_NoHP2 = new javax.swing.JLabel();
        NoField2 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        cmbAkses = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        Lbl_HakAkses = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
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
        sukses = new javax.swing.JPanel();
        Masuk1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        centang = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(null);

        DaftarFull.setBackground(new java.awt.Color(255, 255, 255));
        DaftarFull.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DaftarFullMouseDragged(evt);
            }
        });
        DaftarFull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DaftarFullMousePressed(evt);
            }
        });
        DaftarFull.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Judul.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        Lbl_Judul.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Judul.setText("Daftar ");
        DaftarFull.add(Lbl_Judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 28)); // NOI18N
        jLabel1.setText("Kost Aira App");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DaftarFull.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 210, 40));

        Daftar.setBackground(new java.awt.Color(52, 135, 239));
        Daftar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Daftar.setForeground(new java.awt.Color(255, 255, 255));
        Daftar.setText("Daftar");
        Daftar.setBorder(null);
        Daftar.setBorderPainted(false);
        Daftar.setContentAreaFilled(false);
        Daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Daftar.setOpaque(true);
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });
        DaftarFull.add(Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 530, 100, 40));

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
        DaftarFull.add(minimized1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1258, 15, 20, 20));

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
        DaftarFull.add(minimized, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 20, 20));

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
        DaftarFull.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, 20));

        Lbl_IdCust.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Lbl_IdCust.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_IdCust.setText("IdUser :");
        DaftarFull.add(Lbl_IdCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 750, -1, -1));

        txtCust.setEditable(false);
        txtCust.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtCust.setBorder(null);
        txtCust.setOpaque(false);
        DaftarFull.add(txtCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 750, 40, -1));

        Lbl_IdUser.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Lbl_IdUser.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_IdUser.setText("IdUser :");
        DaftarFull.add(Lbl_IdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 750, -1, -1));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtId.setBorder(null);
        txtId.setOpaque(false);
        DaftarFull.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 750, 40, -1));

        ScrollData.setBackground(new java.awt.Color(255, 255, 255));
        ScrollData.setBorder(null);
        ScrollData.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_Username.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Username.setText("Username");
        jPanel1.add(Lbl_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        UserField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UserField.setBorder(null);
        UserField.setOpaque(false);
        UserField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserFieldKeyReleased(evt);
            }
        });
        jPanel1.add(UserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 370, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 370, 10));

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
        jPanel1.add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 116, 26, 18));

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
        jPanel1.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 116, 26, 18));

        Lbl_Password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_Password.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Password.setText("Password");
        jPanel1.add(Lbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        PassField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PassField.setBorder(null);
        PassField.setOpaque(false);
        PassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassFieldKeyReleased(evt);
            }
        });
        jPanel1.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 370, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 370, 10));

        Lbl_NoKTP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_NoKTP.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_NoKTP.setText("No. KTP");
        jPanel1.add(Lbl_NoKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        KTPField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        KTPField.setBorder(null);
        KTPField.setOpaque(false);
        KTPField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                KTPFieldKeyReleased(evt);
            }
        });
        jPanel1.add(KTPField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 370, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 370, 10));

        Lbl_Nama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_Nama.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Nama.setText("Nama Lengkap");
        jPanel1.add(Lbl_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        NamaField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        NamaField.setBorder(null);
        NamaField.setOpaque(false);
        NamaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NamaFieldKeyReleased(evt);
            }
        });
        jPanel1.add(NamaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 370, 40));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 370, 10));

        Lbl_JenisKelamin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_JenisKelamin.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_JenisKelamin.setText("Jenis Kelamin");
        jPanel1.add(Lbl_JenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        Opsi_Laki.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Opsi_Laki);
        Opsi_Laki.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Opsi_Laki.setText("Laki-laki");
        jPanel1.add(Opsi_Laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        Opsi_Perempuan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Opsi_Perempuan);
        Opsi_Perempuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Opsi_Perempuan.setText("Perempuan");
        Opsi_Perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opsi_PerempuanActionPerformed(evt);
            }
        });
        jPanel1.add(Opsi_Perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        Lbl_Alamat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_Alamat.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_Alamat.setText("Alamat");
        jPanel1.add(Lbl_Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        AlamatField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        AlamatField.setBorder(null);
        AlamatField.setOpaque(false);
        AlamatField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AlamatFieldKeyReleased(evt);
            }
        });
        jPanel1.add(AlamatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 370, 40));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 370, 10));

        Lbl_NoHP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_NoHP1.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_NoHP1.setText("No. HP Pribadi");
        jPanel1.add(Lbl_NoHP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        NoField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        NoField1.setBorder(null);
        NoField1.setOpaque(false);
        NoField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NoField1KeyReleased(evt);
            }
        });
        jPanel1.add(NoField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 370, 40));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 370, 10));

        Lbl_NoHP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_NoHP2.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_NoHP2.setText("No. HP Darurat");
        jPanel1.add(Lbl_NoHP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        NoField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        NoField2.setBorder(null);
        NoField2.setOpaque(false);
        NoField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NoField2KeyReleased(evt);
            }
        });
        jPanel1.add(NoField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 370, 40));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 370, 10));

        cmbAkses.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih sebagai", "Admin", "User" }));
        jPanel1.add(cmbAkses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 140, -1));

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 420, 10));

        Lbl_HakAkses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_HakAkses.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_HakAkses.setText("Hak Akses");
        jPanel1.add(Lbl_HakAkses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, -1));

        ScrollData.setViewportView(jPanel1);

        DaftarFull.add(ScrollData, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 645, 310));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icons8_back_arrow_26px.png"))); // NOI18N
        Back.setBorder(null);
        Back.setContentAreaFilled(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        DaftarFull.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        pola.setBackground(new java.awt.Color(255, 255, 255));
        pola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/pola1.png"))); // NOI18N
        pola.setOpaque(true);
        DaftarFull.add(pola, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 675, 768));

        gambar1.setBackground(new java.awt.Color(255, 255, 255));
        gambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Thumbnail_Login69x768.png"))); // NOI18N
        gambar1.setOpaque(true);
        DaftarFull.add(gambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fullscreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/maximize.png"))); // NOI18N
        fullscreen.setBorder(null);
        fullscreen.setBorderPainted(false);
        fullscreen.setContentAreaFilled(false);
        DaftarFull.add(fullscreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 20, 20));

        Bg.add(DaftarFull);
        DaftarFull.setBounds(0, 0, 1365, 768);

        loader.setBackground(new java.awt.Color(255, 255, 255));
        loader.setMinimumSize(new java.awt.Dimension(1366, 768));
        loader.setOpaque(false);
        loader.setPreferredSize(new java.awt.Dimension(1366, 768));
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/blur3.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        loader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        Bg.add(loader);
        loader.setBounds(0, 0, 1366, 768);

        sukses.setBackground(new java.awt.Color(255, 255, 255));
        sukses.setOpaque(false);
        sukses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Masuk1.setBackground(new java.awt.Color(96, 82, 76));
        Masuk1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Masuk1.setForeground(new java.awt.Color(96, 82, 76));
        Masuk1.setText("OK");
        Masuk1.setAlignmentY(0.0F);
        Masuk1.setAutoscrolls(true);
        Masuk1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 82, 76), 2));
        Masuk1.setContentAreaFilled(false);
        Masuk1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Masuk1.setFocusPainted(false);
        Masuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masuk1ActionPerformed(evt);
            }
        });
        sukses.add(Masuk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 473, 100, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label1.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 200, 60));

        centang.setBackground(new java.awt.Color(255, 255, 255));
        centang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/centang2.png"))); // NOI18N
        centang.setOpaque(true);
        jPanel3.add(centang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 110, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/3.2.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 380));

        sukses.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 740, 380));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/blur3.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel7.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(1366, 768));
        sukses.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        Bg.add(sukses);
        sukses.setBounds(0, 0, 1366, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarActionPerformed
        Daftar.setVisible(false);
        Daftar.setEnabled(false);
        loader.setVisible(true);
        loader.setEnabled(true);
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                String id_user, id_cust, username, noktp, nama, jeniskelamin, alamat, nohppribadi, nohpdarurat, password, akses;
                id_cust = txtCust.getText();
                id_user = txtId.getText();
                username = UserField.getText();
                noktp = KTPField.getText();
                nama = NamaField.getText();
                jeniskelamin = null;
                if (Opsi_Laki.isSelected()) {
                    jeniskelamin = "Laki-laki";
                } else if (Opsi_Perempuan.isSelected()) {
                    jeniskelamin = "Perempuan";
                }

                alamat = AlamatField.getText();
                nohppribadi = NoField1.getText();
                nohpdarurat = NoField2.getText();
                password = PassField.getText();
                akses = (String) cmbAkses.getSelectedItem();

                ConnectDB konek = new ConnectDB();
                konek.insertDB(id_cust, noktp, nama, jeniskelamin, alamat, nohppribadi, nohpdarurat);
                konek.insertDB(id_user, username, password, akses);

//                autoNumber();

                loader.setVisible(false);
                loader.setEnabled(false);
                sukses.setVisible(true);
                sukses.setEnabled(true);
            }
        }, 1120 * 5);
    }//GEN-LAST:event_DaftarActionPerformed

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
                DaftarMini mini = new DaftarMini();
                mini.show();
                dispose();
            }
        }, 5 * 5);

    }//GEN-LAST:event_minimizedActionPerformed

    private void DaftarFullMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DaftarFullMousePressed
        Lbl_NoKTP.getX();
        xy = evt.getY();
    }//GEN-LAST:event_DaftarFullMousePressed

    private void DaftarFullMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DaftarFullMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_DaftarFullMouseDragged

    private void Opsi_PerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opsi_PerempuanActionPerformed
        
    }//GEN-LAST:event_Opsi_PerempuanActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Login lg = new Login();
                lg.show();
                dispose();
            }
        }, 50 * 5);
    }//GEN-LAST:event_BackActionPerformed

    private void UserFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserFieldKeyReleased
        LblLength(UserField, 25);
    }//GEN-LAST:event_UserFieldKeyReleased

    private void PassFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassFieldKeyReleased
        LblLength(PassField, 8);
    }//GEN-LAST:event_PassFieldKeyReleased

    private void KTPFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KTPFieldKeyReleased
        LblLength(KTPField, 16);
    }//GEN-LAST:event_KTPFieldKeyReleased

    private void NamaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamaFieldKeyReleased
        LblLength(NamaField, 30);
    }//GEN-LAST:event_NamaFieldKeyReleased

    private void AlamatFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlamatFieldKeyReleased
        LblLength(AlamatField, 30);
    }//GEN-LAST:event_AlamatFieldKeyReleased

    private void NoField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoField1KeyReleased
        LblLength(NoField1, 13);
    }//GEN-LAST:event_NoField1KeyReleased

    private void NoField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoField2KeyReleased
        LblLength(NoField2, 13);
    }//GEN-LAST:event_NoField2KeyReleased

    private void Masuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masuk1ActionPerformed
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Login full = new Login();
                full.show();
                dispose();
            }
        }, 5 * 5);
    }//GEN-LAST:event_Masuk1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatField;
    private javax.swing.JButton Back;
    private javax.swing.JPanel Bg;
    private javax.swing.JToggleButton Daftar;
    private javax.swing.JPanel DaftarFull;
    private javax.swing.JButton Hide;
    private javax.swing.JTextField KTPField;
    private javax.swing.JLabel Lbl_Alamat;
    private javax.swing.JLabel Lbl_HakAkses;
    private javax.swing.JLabel Lbl_IdCust;
    private javax.swing.JLabel Lbl_IdUser;
    private javax.swing.JLabel Lbl_JenisKelamin;
    private javax.swing.JLabel Lbl_Judul;
    private javax.swing.JLabel Lbl_Nama;
    private javax.swing.JLabel Lbl_NoHP1;
    private javax.swing.JLabel Lbl_NoHP2;
    private javax.swing.JLabel Lbl_NoKTP;
    private javax.swing.JLabel Lbl_Password;
    private javax.swing.JLabel Lbl_Username;
    private javax.swing.JToggleButton Masuk1;
    private javax.swing.JTextField NamaField;
    private javax.swing.JTextField NoField1;
    private javax.swing.JTextField NoField2;
    private javax.swing.JRadioButton Opsi_Laki;
    private javax.swing.JRadioButton Opsi_Perempuan;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JScrollPane ScrollData;
    private javax.swing.JButton Show;
    private javax.swing.JTextField UserField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel centang;
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> cmbAkses;
    private javax.swing.JButton fullscreen;
    private javax.swing.JLabel gambar1;
    private javax.swing.JLabel img_loader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_loader;
    private javax.swing.JPanel loader;
    private javax.swing.JButton minimized;
    private javax.swing.JButton minimized1;
    private javax.swing.JLabel pola;
    private javax.swing.JPanel sukses;
    private javax.swing.JTextField txtCust;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
