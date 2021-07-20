/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormAPP;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.net.URL;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Tony's PC
 */
public class MenuUser extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public MenuUser() {
        initComponents();
        ScrollData.getVerticalScrollBar().setUnitIncrement(8);
        iconApp();
        BerandaSideBar.setVisible(true);
        BerandaSideBar.setEnabled(true);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);

    }

    private void iconApp() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/SI_AiraKost_Asset/ico2.png")));
    }

    private void setColorText(JLabel label) {
        label.setForeground(new java.awt.Color(255, 255, 255));
    }

    private void resetColorText(JLabel label) {
        label.setForeground(new java.awt.Color(207, 207, 207));
    }

    private void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(96, 82, 76));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(140, 120, 111));
    }

    private void setPanel(JPanel panel) {
        SideBarMenu.setVisible(false);
        SideBarMenu.setEnabled(false);
        panel.setBounds(0, 0, 1366, 768);
    }
    
    private void resetPanel(JPanel panel) {
        SideBarMenu.setVisible(true);
        SideBarMenu.setEnabled(true);
        panel.setBounds(206, 0, 1160, 768);
    }
    
    int xy, xx;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Bg = new javax.swing.JPanel();
        BerandaSideBar = new javax.swing.JPanel();
        lbl_Menu1 = new javax.swing.JLabel();
        bttn_Menu7 = new javax.swing.JLabel();
        bttn_minimized2 = new javax.swing.JButton();
        bttn_close1 = new javax.swing.JButton();
        lbl_judul1 = new javax.swing.JLabel();
        lbl_Slide1 = new javax.swing.JLabel();
        lbl_Text2 = new javax.swing.JLabel();
        lbl_Kamar3 = new javax.swing.JLabel();
        lbl_Kamar4 = new javax.swing.JLabel();
        button = new javax.swing.JPanel();
        gb1 = new javax.swing.JRadioButton();
        gb2 = new javax.swing.JRadioButton();
        gb3 = new javax.swing.JRadioButton();
        gb4 = new javax.swing.JRadioButton();
        gb5 = new javax.swing.JRadioButton();
        gb6 = new javax.swing.JRadioButton();
        gb7 = new javax.swing.JRadioButton();
        gb8 = new javax.swing.JRadioButton();
        gb9 = new javax.swing.JRadioButton();
        gb10 = new javax.swing.JRadioButton();
        PanelChat = new javax.swing.JPanel();
        lbl_chatskrng_txt = new javax.swing.JLabel();
        lbl_wa_icon = new javax.swing.JLabel();
        chatBx = new javax.swing.JToggleButton();
        KamarSideBar = new javax.swing.JPanel();
        lbl_Menu2 = new javax.swing.JLabel();
        lbl_Menu3 = new javax.swing.JLabel();
        minimized4 = new javax.swing.JButton();
        close2 = new javax.swing.JButton();
        lbl_judul2 = new javax.swing.JLabel();
        ScrollData2 = new javax.swing.JScrollPane();
        PanelKamar = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Kode_kamar1 = new javax.swing.JLabel();
        Kode_kamar2 = new javax.swing.JLabel();
        Kode_kamar3 = new javax.swing.JLabel();
        Kode_kamar4 = new javax.swing.JLabel();
        Kode_kamar5 = new javax.swing.JLabel();
        Kode_kamar6 = new javax.swing.JLabel();
        Kode_kamar7 = new javax.swing.JLabel();
        Kode_kamar8 = new javax.swing.JLabel();
        Status1 = new javax.swing.JLabel();
        Status2 = new javax.swing.JLabel();
        Status3 = new javax.swing.JLabel();
        Status4 = new javax.swing.JLabel();
        Status5 = new javax.swing.JLabel();
        Status6 = new javax.swing.JLabel();
        Status7 = new javax.swing.JLabel();
        Status8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        PemesananSideBar = new javax.swing.JPanel();
        lbl_Menu5 = new javax.swing.JLabel();
        lbl_Menu8 = new javax.swing.JLabel();
        minimized8 = new javax.swing.JButton();
        close4 = new javax.swing.JButton();
        lbl_judul4 = new javax.swing.JLabel();
        CekButton6 = new javax.swing.JButton();
        form = new javax.swing.JPanel();
        Lbl_Judul1 = new javax.swing.JLabel();
        ScrollData = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Masuk = new javax.swing.JToggleButton();
        lbl_idbooking = new javax.swing.JLabel();
        lbl_tipekamar = new javax.swing.JLabel();
        txtBooking = new javax.swing.JTextField();
        txtTipeKamar = new javax.swing.JTextField();
        lbl_namalengkap = new javax.swing.JLabel();
        lbl_lokasi = new javax.swing.JLabel();
        txtLokasiKamar = new javax.swing.JTextField();
        lbl_nohppribadi = new javax.swing.JLabel();
        lbl_jeniskelamin = new javax.swing.JLabel();
        lbl_alamat = new javax.swing.JLabel();
        lbl_totalbayar = new javax.swing.JLabel();
        txtTotaBayar = new javax.swing.JTextField();
        lbl_lamasewa = new javax.swing.JLabel();
        lbl_tglmasuk = new javax.swing.JLabel();
        lbl_nohpdarurat = new javax.swing.JLabel();
        lbl_kodebayar = new javax.swing.JLabel();
        txtKodeBayar = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        tgl_masuk = new com.toedter.calendar.JDateChooser();
        jLabel50 = new javax.swing.JLabel();
        txtNoKTP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SideBarMenu = new javax.swing.JPanel();
        lbl_photos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        beranda = new javax.swing.JPanel();
        ico_beranda = new javax.swing.JLabel();
        Lbl_beranda = new javax.swing.JLabel();
        kamar = new javax.swing.JPanel();
        ico_kamar = new javax.swing.JLabel();
        Lbl_kamar = new javax.swing.JLabel();
        pemesanan = new javax.swing.JPanel();
        ico_pemesanan = new javax.swing.JLabel();
        Lbl_pemesanan = new javax.swing.JLabel();
        Logout = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KostAiraApp");
        setUndecorated(true);

        Bg.setBackground(new java.awt.Color(242, 242, 242));
        Bg.setLayout(null);

        BerandaSideBar.setBackground(new java.awt.Color(242, 242, 242));
        BerandaSideBar.setMinimumSize(new java.awt.Dimension(1160, 768));
        BerandaSideBar.setPreferredSize(new java.awt.Dimension(1160, 768));
        BerandaSideBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BerandaSideBarMouseDragged(evt);
            }
        });
        BerandaSideBar.setLayout(null);

        lbl_Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu1MouseClicked(evt);
            }
        });
        BerandaSideBar.add(lbl_Menu1);
        lbl_Menu1.setBounds(10, 10, 34, 30);

        bttn_Menu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        bttn_Menu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_Menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttn_Menu7MouseClicked(evt);
            }
        });
        BerandaSideBar.add(bttn_Menu7);
        bttn_Menu7.setBounds(10, 10, 34, 30);

        bttn_minimized2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        bttn_minimized2.setBorder(null);
        bttn_minimized2.setBorderPainted(false);
        bttn_minimized2.setContentAreaFilled(false);
        bttn_minimized2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_minimized2.setFocusPainted(false);
        bttn_minimized2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_minimized2ActionPerformed(evt);
            }
        });
        BerandaSideBar.add(bttn_minimized2);
        bttn_minimized2.setBounds(1080, 15, 20, 20);

        bttn_close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        bttn_close1.setBorder(null);
        bttn_close1.setBorderPainted(false);
        bttn_close1.setContentAreaFilled(false);
        bttn_close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_close1.setFocusPainted(false);
        bttn_close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_close1ActionPerformed(evt);
            }
        });
        BerandaSideBar.add(bttn_close1);
        bttn_close1.setBounds(1110, 10, 20, 20);

        lbl_judul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        BerandaSideBar.add(lbl_judul1);
        lbl_judul1.setBounds(445, 10, 260, 90);

        lbl_Slide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKostFoto/1.png"))); // NOI18N
        BerandaSideBar.add(lbl_Slide1);
        lbl_Slide1.setBounds(350, 130, 450, 260);

        lbl_Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Text2.setText("Jl. Taman Kampus, Lingkungan Krajan Timur, Tegalgede, Kec. Sumbersari, Kabupaten Jember");
        BerandaSideBar.add(lbl_Text2);
        lbl_Text2.setBounds(300, 440, 570, 20);

        lbl_Kamar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/buttonKamar1.png"))); // NOI18N
        lbl_Kamar3.setPreferredSize(new java.awt.Dimension(190, 230));
        BerandaSideBar.add(lbl_Kamar3);
        lbl_Kamar3.setBounds(340, 500, 160, 200);

        lbl_Kamar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/buttonKamar2.png"))); // NOI18N
        BerandaSideBar.add(lbl_Kamar4);
        lbl_Kamar4.setBounds(670, 500, 160, 200);

        button.setOpaque(false);
        button.setLayout(null);

        buttonGroup1.add(gb1);
        gb1.setForeground(new java.awt.Color(255, 255, 255));
        gb1.setBorder(null);
        gb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb1ActionPerformed(evt);
            }
        });
        button.add(gb1);
        gb1.setBounds(10, 0, 21, 20);

        buttonGroup1.add(gb2);
        gb2.setBorder(null);
        gb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb2ActionPerformed(evt);
            }
        });
        button.add(gb2);
        gb2.setBounds(29, 0, 21, 20);

        buttonGroup1.add(gb3);
        gb3.setBorder(null);
        gb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb3ActionPerformed(evt);
            }
        });
        button.add(gb3);
        gb3.setBounds(48, 0, 21, 20);

        buttonGroup1.add(gb4);
        gb4.setBorder(null);
        gb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb4ActionPerformed(evt);
            }
        });
        button.add(gb4);
        gb4.setBounds(67, 0, 21, 20);

        buttonGroup1.add(gb5);
        gb5.setBorder(null);
        gb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb5ActionPerformed(evt);
            }
        });
        button.add(gb5);
        gb5.setBounds(86, 0, 21, 20);

        buttonGroup1.add(gb6);
        gb6.setBorder(null);
        gb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb6ActionPerformed(evt);
            }
        });
        button.add(gb6);
        gb6.setBounds(105, 0, 21, 20);

        buttonGroup1.add(gb7);
        gb7.setBorder(null);
        gb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb7ActionPerformed(evt);
            }
        });
        button.add(gb7);
        gb7.setBounds(124, 0, 21, 20);

        buttonGroup1.add(gb8);
        gb8.setBorder(null);
        gb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb8ActionPerformed(evt);
            }
        });
        button.add(gb8);
        gb8.setBounds(143, 0, 21, 20);

        buttonGroup1.add(gb9);
        gb9.setBorder(null);
        gb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb9ActionPerformed(evt);
            }
        });
        button.add(gb9);
        gb9.setBounds(162, 0, 21, 20);

        buttonGroup1.add(gb10);
        gb10.setBorder(null);
        gb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb10ActionPerformed(evt);
            }
        });
        button.add(gb10);
        gb10.setBounds(181, 0, 21, 20);

        BerandaSideBar.add(button);
        button.setBounds(480, 390, 200, 20);

        PanelChat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelChat.setFocusable(false);
        PanelChat.setOpaque(false);
        PanelChat.setLayout(null);

        lbl_chatskrng_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_chatskrng_txt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_chatskrng_txt.setText("Chat Sekarang !!!");
        PanelChat.add(lbl_chatskrng_txt);
        lbl_chatskrng_txt.setBounds(60, 27, 140, 20);

        lbl_wa_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icoWaP.png"))); // NOI18N
        PanelChat.add(lbl_wa_icon);
        lbl_wa_icon.setBounds(20, 22, 30, 30);

        chatBx.setBackground(new java.awt.Color(96, 82, 76));
        chatBx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chatBx.setForeground(new java.awt.Color(255, 255, 255));
        chatBx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Untitled-1.png"))); // NOI18N
        chatBx.setBorder(null);
        chatBx.setBorderPainted(false);
        chatBx.setContentAreaFilled(false);
        chatBx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chatBx.setFocusPainted(false);
        chatBx.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chatBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatBxActionPerformed(evt);
            }
        });
        PanelChat.add(chatBx);
        chatBx.setBounds(0, 0, 210, 70);

        BerandaSideBar.add(PanelChat);
        PanelChat.setBounds(932, 710, 210, 70);

        Bg.add(BerandaSideBar);
        BerandaSideBar.setBounds(206, 0, 1160, 768);

        KamarSideBar.setBackground(new java.awt.Color(242, 242, 242));
        KamarSideBar.setMinimumSize(new java.awt.Dimension(1160, 768));
        KamarSideBar.setPreferredSize(new java.awt.Dimension(1160, 768));
        KamarSideBar.setLayout(null);

        lbl_Menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu2MouseClicked(evt);
            }
        });
        KamarSideBar.add(lbl_Menu2);
        lbl_Menu2.setBounds(10, 10, 34, 30);

        lbl_Menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu3MouseClicked(evt);
            }
        });
        KamarSideBar.add(lbl_Menu3);
        lbl_Menu3.setBounds(10, 10, 34, 30);

        minimized4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        minimized4.setBorder(null);
        minimized4.setBorderPainted(false);
        minimized4.setContentAreaFilled(false);
        minimized4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimized4.setFocusPainted(false);
        minimized4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimized4ActionPerformed(evt);
            }
        });
        KamarSideBar.add(minimized4);
        minimized4.setBounds(1080, 15, 20, 20);

        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        close2.setBorder(null);
        close2.setBorderPainted(false);
        close2.setContentAreaFilled(false);
        close2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close2.setFocusPainted(false);
        close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close2ActionPerformed(evt);
            }
        });
        KamarSideBar.add(close2);
        close2.setBounds(1110, 10, 20, 20);

        lbl_judul2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        KamarSideBar.add(lbl_judul2);
        lbl_judul2.setBounds(445, 10, 260, 90);

        ScrollData2.setBackground(new java.awt.Color(255, 255, 255));
        ScrollData2.setBorder(null);
        ScrollData2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollData2.setOpaque(false);

        PanelKamar.setBackground(new java.awt.Color(255, 255, 255));
        PanelKamar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Kategori", "Kamar 1", "Kamar 2", " " }));
        jComboBox1.setBorder(null);
        PanelKamar.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, -1));

        jButton1.setBackground(new java.awt.Color(140, 119, 110));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cek");
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        PanelKamar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 325, 60, 20));

        jButton2.setBackground(new java.awt.Color(140, 119, 110));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cek");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        PanelKamar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 325, 60, 20));

        jButton3.setBackground(new java.awt.Color(140, 119, 110));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cek");
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        PanelKamar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 325, 60, 20));

        jButton4.setBackground(new java.awt.Color(140, 119, 110));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cek");
        jButton4.setContentAreaFilled(false);
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelKamar.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 325, 60, 20));

        jButton5.setBackground(new java.awt.Color(140, 119, 110));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cek");
        jButton5.setContentAreaFilled(false);
        jButton5.setOpaque(true);
        PanelKamar.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 565, 60, 20));

        jButton6.setBackground(new java.awt.Color(140, 119, 110));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cek");
        jButton6.setContentAreaFilled(false);
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        PanelKamar.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 565, 60, 20));

        jButton7.setBackground(new java.awt.Color(140, 119, 110));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cek");
        jButton7.setContentAreaFilled(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        PanelKamar.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 565, 60, 20));

        jButton8.setBackground(new java.awt.Color(140, 119, 110));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Cek");
        jButton8.setContentAreaFilled(false);
        jButton8.setOpaque(true);
        PanelKamar.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 565, 60, 20));

        Kode_kamar1.setForeground(new java.awt.Color(51, 51, 51));
        Kode_kamar1.setText("Kode Kamar");
        PanelKamar.add(Kode_kamar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        Kode_kamar2.setForeground(new java.awt.Color(51, 51, 51));
        Kode_kamar2.setText("Kode kamar");
        PanelKamar.add(Kode_kamar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        Kode_kamar3.setForeground(new java.awt.Color(51, 51, 51));
        Kode_kamar3.setText("Kode kamar");
        PanelKamar.add(Kode_kamar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        Kode_kamar4.setForeground(new java.awt.Color(51, 51, 51));
        Kode_kamar4.setText("Kode kamar");
        PanelKamar.add(Kode_kamar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        Kode_kamar5.setForeground(new java.awt.Color(51, 51, 51));
        Kode_kamar5.setText("Kode kamar");
        PanelKamar.add(Kode_kamar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        Kode_kamar6.setForeground(new java.awt.Color(51, 51, 51));
        Kode_kamar6.setText("Kode kamar");
        PanelKamar.add(Kode_kamar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        Kode_kamar7.setForeground(new java.awt.Color(51, 51, 51));
        Kode_kamar7.setText("Kode kamar");
        PanelKamar.add(Kode_kamar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, -1, -1));

        Kode_kamar8.setText("Kode kamar");
        PanelKamar.add(Kode_kamar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, -1, -1));

        Status1.setForeground(new java.awt.Color(51, 51, 51));
        Status1.setText("Status");
        PanelKamar.add(Status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        Status2.setForeground(new java.awt.Color(51, 51, 51));
        Status2.setText("Status");
        PanelKamar.add(Status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        Status3.setForeground(new java.awt.Color(51, 51, 51));
        Status3.setText("Status");
        PanelKamar.add(Status3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        Status4.setForeground(new java.awt.Color(51, 51, 51));
        Status4.setText("Status");
        PanelKamar.add(Status4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        Status5.setForeground(new java.awt.Color(51, 51, 51));
        Status5.setText("Status");
        PanelKamar.add(Status5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        Status6.setForeground(new java.awt.Color(51, 51, 51));
        Status6.setText("Status");
        PanelKamar.add(Status6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

        Status7.setForeground(new java.awt.Color(51, 51, 51));
        Status7.setText("Status");
        PanelKamar.add(Status7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, -1, -1));

        Status8.setForeground(new java.awt.Color(51, 51, 51));
        Status8.setText("Status");
        PanelKamar.add(Status8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Kamar 1");
        PanelKamar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 378, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Kamar 1");
        PanelKamar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 378, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kamar 1");
        PanelKamar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 378, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kamar 1");
        PanelKamar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 378, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kamar 1");
        PanelKamar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 138, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Kamar 1");
        PanelKamar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 138, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kamar 1");
        PanelKamar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 138, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kamar 1");
        PanelKamar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 138, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 180, 240));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 180, 240));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 180, 240));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 180, 240));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 240));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, 240));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 180, 240));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 180, 240));

        ScrollData2.setViewportView(PanelKamar);

        KamarSideBar.add(ScrollData2);
        ScrollData2.setBounds(50, 110, 1050, 610);

        Bg.add(KamarSideBar);
        KamarSideBar.setBounds(206, 0, 1160, 768);

        PemesananSideBar.setBackground(new java.awt.Color(242, 242, 242));
        PemesananSideBar.setMinimumSize(new java.awt.Dimension(1160, 768));
        PemesananSideBar.setPreferredSize(new java.awt.Dimension(1160, 768));
        PemesananSideBar.setLayout(null);

        lbl_Menu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu5MouseClicked(evt);
            }
        });
        PemesananSideBar.add(lbl_Menu5);
        lbl_Menu5.setBounds(10, 10, 34, 30);

        lbl_Menu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu8MouseClicked(evt);
            }
        });
        PemesananSideBar.add(lbl_Menu8);
        lbl_Menu8.setBounds(10, 10, 34, 30);

        minimized8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        minimized8.setBorder(null);
        minimized8.setBorderPainted(false);
        minimized8.setContentAreaFilled(false);
        minimized8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimized8.setFocusPainted(false);
        minimized8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimized8ActionPerformed(evt);
            }
        });
        PemesananSideBar.add(minimized8);
        minimized8.setBounds(1080, 15, 20, 20);

        close4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        close4.setBorder(null);
        close4.setBorderPainted(false);
        close4.setContentAreaFilled(false);
        close4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close4.setFocusPainted(false);
        close4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close4ActionPerformed(evt);
            }
        });
        PemesananSideBar.add(close4);
        close4.setBounds(1110, 10, 20, 20);

        lbl_judul4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        PemesananSideBar.add(lbl_judul4);
        lbl_judul4.setBounds(445, 10, 260, 90);

        CekButton6.setBorder(null);
        CekButton6.setBorderPainted(false);
        CekButton6.setContentAreaFilled(false);
        CekButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PemesananSideBar.add(CekButton6);
        CekButton6.setBounds(390, 660, 61, 23);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setOpaque(false);
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Judul1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Lbl_Judul1.setForeground(new java.awt.Color(96, 82, 76));
        Lbl_Judul1.setText("Formulir Pemesanan Kamar");
        form.add(Lbl_Judul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        ScrollData.setBackground(new java.awt.Color(255, 255, 255));
        ScrollData.setBorder(null);
        ScrollData.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Masuk.setBackground(new java.awt.Color(52, 135, 239));
        Masuk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Masuk.setForeground(new java.awt.Color(255, 255, 255));
        Masuk.setText("Pesan");
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
        jPanel1.add(Masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 720, 100, 40));

        lbl_idbooking.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_idbooking.setText("ID Booking");
        jPanel1.add(lbl_idbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 126, -1));

        lbl_tipekamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_tipekamar.setText("Tipe Kamar");
        jPanel1.add(lbl_tipekamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 126, -1));

        txtBooking.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 335, -1));

        txtTipeKamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtTipeKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 335, -1));

        lbl_namalengkap.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_namalengkap.setText("Nama Lengkap");
        jPanel1.add(lbl_namalengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 126, -1));

        lbl_lokasi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_lokasi.setText("Lokasi Kamar");
        jPanel1.add(lbl_lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 126, -1));

        txtLokasiKamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtLokasiKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 335, -1));

        nm_lengkap.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nm_lengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nm_lengkapActionPerformed(evt);
            }
        });
        jPanel1.add(nm_lengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 335, -1));

        lbl_nohppribadi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_nohppribadi.setText("No. HP Pribadi");
        jPanel1.add(lbl_nohppribadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 126, -1));

        txtNoHP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtNoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 335, -1));

        lbl_jeniskelamin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_jeniskelamin.setText("Jenis Kelamin");
        jPanel1.add(lbl_jeniskelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 126, -1));

        txtJenisKelamin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 335, -1));

        lbl_alamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_alamat.setText("Alamat");
        jPanel1.add(lbl_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 126, -1));

        txtAlamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 335, -1));

        lbl_totalbayar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_totalbayar.setText("Total Bayar");
        jPanel1.add(lbl_totalbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 126, -1));

        txtTotaBayar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtTotaBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 335, -1));

        lbl_lamasewa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_lamasewa.setText("Lama sewa");
        jPanel1.add(lbl_lamasewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 126, -1));

        lbl_tglmasuk.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_tglmasuk.setText("Tanggal Masuk");
        jPanel1.add(lbl_tglmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 126, -1));

        lbl_nohpdarurat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_nohpdarurat.setText("No. HP Darurat");
        jPanel1.add(lbl_nohpdarurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 126, -1));

        txtNoDarurat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtNoDarurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 335, -1));

        lbl_kodebayar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_kodebayar.setText("Kode Bayar");
        jPanel1.add(lbl_kodebayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 126, -1));

        txtKodeBayar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtKodeBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 680, 335, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("6 Bulan/disc.5%");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 130, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Per-Bulan/normal");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("3 bulan/normal");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 120, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 230, 280));
        jPanel1.add(tgl_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 340, 30));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel50.setText("No. KTP");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 126, -1));

        txtNoKTP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtNoKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 335, -1));

        ScrollData.setViewportView(jPanel1);

        form.add(ScrollData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1064, 480));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Edge.png"))); // NOI18N
        form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 610));

        PemesananSideBar.add(form);
        form.setBounds(50, 110, 1050, 610);

        Bg.add(PemesananSideBar);
        PemesananSideBar.setBounds(206, 0, 1160, 768);

        SideBarMenu.setBackground(new java.awt.Color(140, 120, 111));
        SideBarMenu.setMinimumSize(new java.awt.Dimension(210, 768));
        SideBarMenu.setPreferredSize(new java.awt.Dimension(210, 768));
        SideBarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_photos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/profileW.png"))); // NOI18N
        SideBarMenu.add(lbl_photos, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 30, 100, 100));

        jSeparator1.setBackground(new java.awt.Color(96, 82, 76));
        jSeparator1.setForeground(new java.awt.Color(96, 82, 76));
        SideBarMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 188, 210, -1));

        NamaUser2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NamaUser2.setForeground(new java.awt.Color(255, 255, 255));
        NamaUser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamaUser2.setText("User");
        SideBarMenu.add(NamaUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(179, 166, 165));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SideBarMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        beranda.setBackground(new java.awt.Color(96, 82, 76));
        beranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                berandaMouseClicked(evt);
            }
        });

        ico_beranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Icon_1_30px_P.png"))); // NOI18N

        Lbl_beranda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lbl_beranda.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_beranda.setText("Beranda");

        javax.swing.GroupLayout berandaLayout = new javax.swing.GroupLayout(beranda);
        beranda.setLayout(berandaLayout);
        berandaLayout.setHorizontalGroup(
            berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(berandaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ico_beranda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_beranda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        berandaLayout.setVerticalGroup(
            berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, berandaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ico_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lbl_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        SideBarMenu.add(beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 205, 50));

        kamar.setBackground(new java.awt.Color(140, 120, 111));
        kamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kamarMouseClicked(evt);
            }
        });

        ico_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_2_30px.png"))); // NOI18N

        Lbl_kamar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lbl_kamar.setForeground(new java.awt.Color(207, 207, 207));
        Lbl_kamar.setText("Kamar");

        javax.swing.GroupLayout kamarLayout = new javax.swing.GroupLayout(kamar);
        kamar.setLayout(kamarLayout);
        kamarLayout.setHorizontalGroup(
            kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kamarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ico_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kamarLayout.setVerticalGroup(
            kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kamarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_kamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kamarLayout.createSequentialGroup()
                        .addComponent(ico_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        SideBarMenu.add(kamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 205, 50));

        pemesanan.setBackground(new java.awt.Color(140, 120, 111));
        pemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pemesananMouseClicked(evt);
            }
        });

        ico_pemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_3_30px.png"))); // NOI18N

        Lbl_pemesanan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lbl_pemesanan.setForeground(new java.awt.Color(207, 207, 207));
        Lbl_pemesanan.setText("Pemesanan");

        javax.swing.GroupLayout pemesananLayout = new javax.swing.GroupLayout(pemesanan);
        pemesanan.setLayout(pemesananLayout);
        pemesananLayout.setHorizontalGroup(
            pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pemesananLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ico_pemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_pemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pemesananLayout.setVerticalGroup(
            pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pemesananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_pemesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pemesananLayout.createSequentialGroup()
                        .addComponent(ico_pemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        SideBarMenu.add(pemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 205, 50));

        Logout.setBackground(new java.awt.Color(96, 82, 76));
        Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setBorder(null);
        Logout.setBorderPainted(false);
        Logout.setContentAreaFilled(false);
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.setFocusPainted(false);
        Logout.setOpaque(true);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        SideBarMenu.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 700, 100, 40));

        Bg.add(SideBarMenu);
        SideBarMenu.setBounds(0, 0, 205, 768);

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

    private void kamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kamarMouseClicked
        ImageIcon kmr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_2_30px_P.png"));
        ico_kamar.setIcon(kmr);
        ImageIcon brd = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_1_30px.png"));
        ico_beranda.setIcon(brd);
        ImageIcon psn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_3_30px.png"));
        ico_pemesanan.setIcon(psn);
        setColor(kamar);
        setColorText(Lbl_kamar);
        resetColor(beranda);
        resetColorText(Lbl_beranda);
        resetColor(pemesanan);
        resetColorText(Lbl_pemesanan);

        KamarSideBar.setVisible(true);
        KamarSideBar.setEnabled(true);
        BerandaSideBar.setVisible(false);
        BerandaSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);
    }//GEN-LAST:event_kamarMouseClicked

    private void berandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berandaMouseClicked
        ImageIcon brd = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_1_30px_P.png"));
        ico_beranda.setIcon(brd);
        ImageIcon kmr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_2_30px.png"));
        ico_kamar.setIcon(kmr);
        ImageIcon psn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_3_30px.png"));
        ico_pemesanan.setIcon(psn);
        setColor(beranda);
        setColorText(Lbl_beranda);
        resetColor(kamar);
        resetColorText(Lbl_kamar);
        resetColor(pemesanan);
        resetColorText(Lbl_pemesanan);

        BerandaSideBar.setVisible(true);
        BerandaSideBar.setEnabled(true);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);
    }//GEN-LAST:event_berandaMouseClicked

    private void BerandaSideBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BerandaSideBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_BerandaSideBarMouseDragged

    private void bttn_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_close1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttn_close1ActionPerformed

    private void bttn_minimized2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_minimized2ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_bttn_minimized2ActionPerformed

    private void pemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemesananMouseClicked
        ImageIcon psn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_3_30px_P.png"));
        ico_pemesanan.setIcon(psn);
        ImageIcon brd = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_1_30px.png"));
        ico_beranda.setIcon(brd);
        ImageIcon kmr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_2_30px.png"));
        ico_kamar.setIcon(kmr);

        setColor(pemesanan);
        setColorText(Lbl_pemesanan);
        resetColor(beranda);
        resetColorText(Lbl_beranda);
        resetColor(kamar);
        resetColorText(Lbl_kamar);

        PemesananSideBar.setVisible(true);
        PemesananSideBar.setEnabled(true);
        BerandaSideBar.setVisible(false);
        BerandaSideBar.setEnabled(false);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        
    }//GEN-LAST:event_pemesananMouseClicked

    private void lbl_Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu1MouseClicked
        lbl_Menu1.setVisible(false);
        lbl_Menu1.setEnabled(false);
        bttn_Menu7.setVisible(true);
        bttn_Menu7.setEnabled(true);
        setPanel(BerandaSideBar);
        lbl_judul1.setBounds(545, 10, 260, 90);
        lbl_Slide1.setBounds(448, 130, 450, 260);
        button.setBounds(575, 390, 200, 220);
        lbl_Text2.setBounds(400, 440, 570, 20);
        lbl_Kamar3.setBounds(420, 500, 160, 200);
        lbl_Kamar4.setBounds(790, 500, 160, 200);
        bttn_minimized2.setBounds(1286, 15, 20, 20);
        bttn_close1.setBounds(1316, 10, 20, 20);
        PanelChat.setBounds(1138, 710, 210, 70);
    }//GEN-LAST:event_lbl_Menu1MouseClicked

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Login lg = new Login();
                lg.show();
                dispose();
            }
        }, 10 * 5);
    }//GEN-LAST:event_LogoutActionPerformed

    private void close4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close4ActionPerformed

    private void minimized8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized8ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized8ActionPerformed

    private void lbl_Menu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu5MouseClicked
        lbl_Menu5.setVisible(false);
        lbl_Menu5.setEnabled(false);
        lbl_Menu8.setVisible(true);
        lbl_Menu8.setEnabled(true);
        setPanel(PemesananSideBar);
        lbl_judul4.setBounds(545, 10, 260, 90);
        form.setBounds(154, 110, 1050, 610);
        minimized8.setBounds(1286, 15, 20, 20);
        close4.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu5MouseClicked

    private void MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukActionPerformed
        //        Beranda f3 = new Beranda();
        //        f3.setVisible(true);
        //new Beranda().show();
        this.setVisible(false);
    }//GEN-LAST:event_MasukActionPerformed

    private void gb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb1ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/1.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb1ActionPerformed

    private void gb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb2ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/2.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb2ActionPerformed

    private void gb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb3ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/3.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb3ActionPerformed

    private void gb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb4ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/4.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb4ActionPerformed

    private void gb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb5ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/5.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb5ActionPerformed

    private void gb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb6ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/6.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb6ActionPerformed

    private void gb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb7ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/7.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb7ActionPerformed

    private void gb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb8ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/8.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb8ActionPerformed

    private void gb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb9ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/9.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb9ActionPerformed

    private void gb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb10ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/10.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb10ActionPerformed

    private void nm_lengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nm_lengkapActionPerformed
        
        
    }//GEN-LAST:event_nm_lengkapActionPerformed

    private void bttn_Menu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttn_Menu7MouseClicked
        bttn_Menu7.setVisible(false);
        bttn_Menu7.setEnabled(false);
        lbl_Menu1.setVisible(true);
        lbl_Menu1.setEnabled(true);
        lbl_judul1.setBounds(445, 10, 260, 90);
        lbl_Slide1.setBounds(350, 130, 450, 260);
        button.setBounds(480, 390, 200, 220);
        lbl_Text2.setBounds(300, 440, 570, 20);
        lbl_Kamar3.setBounds(340, 500, 160, 200);
        lbl_Kamar4.setBounds(670, 500, 160, 200);
        bttn_minimized2.setBounds(1080, 15, 20, 20);
        bttn_close1.setBounds(1110, 10, 20, 20);
        PanelChat.setBounds(932, 710, 210, 70);
        resetPanel(BerandaSideBar);
    }//GEN-LAST:event_bttn_Menu7MouseClicked

    private void chatBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatBxActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://api.whatsapp.com/send?phone=6287743310528&text=Kak%20saya%20ingin%20cek%20kamar.😊").toURI());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_chatBxActionPerformed

    private void close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close2ActionPerformed

    private void minimized4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized4ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized4ActionPerformed

    private void lbl_Menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu3MouseClicked
        lbl_Menu3.setVisible(false);
        lbl_Menu3.setEnabled(false);
        lbl_Menu2.setVisible(true);
        lbl_Menu2.setEnabled(true);
        resetPanel(KamarSideBar);
        lbl_judul2.setBounds(445, 10, 260, 90);
        ScrollData2.setBounds(50, 110, 1050, 610);
        minimized4.setBounds(1080, 15, 20, 20);
        close2.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu3MouseClicked

    private void lbl_Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu2MouseClicked
        lbl_Menu2.setVisible(false);
        lbl_Menu2.setEnabled(false);
        lbl_Menu3.setVisible(true);
        lbl_Menu3.setEnabled(true);
        setPanel(KamarSideBar);
        lbl_judul2.setBounds(545, 10, 260, 90);
        ScrollData2.setBounds(154, 110, 1050, 610);
        minimized4.setBounds(1286, 15, 20, 20);
        close2.setBounds(1316, 10, 20, 20);

    }//GEN-LAST:event_lbl_Menu2MouseClicked

    private void lbl_Menu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu8MouseClicked
        lbl_Menu8.setVisible(false);
        lbl_Menu8.setEnabled(false);
        lbl_Menu5.setVisible(true);
        lbl_Menu5.setEnabled(true);
        resetPanel(PemesananSideBar);
        lbl_judul4.setBounds(445, 10, 260, 90);
        form.setBounds(50, 110, 1050, 610);
        minimized8.setBounds(1080, 15, 20, 20);
        close4.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu8MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BerandaSideBar;
    private javax.swing.JPanel Bg;
    private javax.swing.JButton CekButton6;
    private javax.swing.JPanel KamarSideBar;
    private javax.swing.JLabel Kode_kamar1;
    private javax.swing.JLabel Kode_kamar2;
    private javax.swing.JLabel Kode_kamar3;
    private javax.swing.JLabel Kode_kamar4;
    private javax.swing.JLabel Kode_kamar5;
    private javax.swing.JLabel Kode_kamar6;
    private javax.swing.JLabel Kode_kamar7;
    private javax.swing.JLabel Kode_kamar8;
    private javax.swing.JLabel Lbl_Judul1;
    private javax.swing.JLabel Lbl_beranda;
    private javax.swing.JLabel Lbl_kamar;
    private javax.swing.JLabel Lbl_pemesanan;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JToggleButton Masuk;
    public static final javax.swing.JLabel NamaUser2 = new javax.swing.JLabel();
    private javax.swing.JPanel PanelChat;
    private javax.swing.JPanel PanelKamar;
    private javax.swing.JPanel PemesananSideBar;
    private javax.swing.JScrollPane ScrollData;
    private javax.swing.JScrollPane ScrollData2;
    private javax.swing.JPanel SideBarMenu;
    private javax.swing.JLabel Status1;
    private javax.swing.JLabel Status2;
    private javax.swing.JLabel Status3;
    private javax.swing.JLabel Status4;
    private javax.swing.JLabel Status5;
    private javax.swing.JLabel Status6;
    private javax.swing.JLabel Status7;
    private javax.swing.JLabel Status8;
    private javax.swing.JPanel beranda;
    private javax.swing.JLabel bttn_Menu7;
    private javax.swing.JButton bttn_close1;
    private javax.swing.JButton bttn_minimized2;
    private javax.swing.JPanel button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton chatBx;
    private javax.swing.JButton close2;
    private javax.swing.JButton close4;
    private javax.swing.JPanel form;
    private javax.swing.JRadioButton gb1;
    private javax.swing.JRadioButton gb10;
    private javax.swing.JRadioButton gb2;
    private javax.swing.JRadioButton gb3;
    private javax.swing.JRadioButton gb4;
    private javax.swing.JRadioButton gb5;
    private javax.swing.JRadioButton gb6;
    private javax.swing.JRadioButton gb7;
    private javax.swing.JRadioButton gb8;
    private javax.swing.JRadioButton gb9;
    private javax.swing.JLabel ico_beranda;
    private javax.swing.JLabel ico_kamar;
    private javax.swing.JLabel ico_pemesanan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel kamar;
    private javax.swing.JLabel lbl_Kamar3;
    private javax.swing.JLabel lbl_Kamar4;
    private javax.swing.JLabel lbl_Menu1;
    private javax.swing.JLabel lbl_Menu2;
    private javax.swing.JLabel lbl_Menu3;
    private javax.swing.JLabel lbl_Menu5;
    private javax.swing.JLabel lbl_Menu8;
    private javax.swing.JLabel lbl_Slide1;
    private javax.swing.JLabel lbl_Text2;
    private javax.swing.JLabel lbl_alamat;
    private javax.swing.JLabel lbl_chatskrng_txt;
    private javax.swing.JLabel lbl_idbooking;
    private javax.swing.JLabel lbl_jeniskelamin;
    private javax.swing.JLabel lbl_judul1;
    private javax.swing.JLabel lbl_judul2;
    private javax.swing.JLabel lbl_judul4;
    private javax.swing.JLabel lbl_kodebayar;
    private javax.swing.JLabel lbl_lamasewa;
    private javax.swing.JLabel lbl_lokasi;
    private javax.swing.JLabel lbl_namalengkap;
    private javax.swing.JLabel lbl_nohpdarurat;
    private javax.swing.JLabel lbl_nohppribadi;
    private javax.swing.JLabel lbl_photos;
    private javax.swing.JLabel lbl_tglmasuk;
    private javax.swing.JLabel lbl_tipekamar;
    private javax.swing.JLabel lbl_totalbayar;
    private javax.swing.JLabel lbl_wa_icon;
    private javax.swing.JButton minimized4;
    private javax.swing.JButton minimized8;
    public static final javax.swing.JTextField nm_lengkap = new javax.swing.JTextField();
    private javax.swing.JPanel pemesanan;
    private com.toedter.calendar.JDateChooser tgl_masuk;
    public static final javax.swing.JTextField txtAlamat = new javax.swing.JTextField();
    private javax.swing.JTextField txtBooking;
    public static final javax.swing.JTextField txtJenisKelamin = new javax.swing.JTextField();
    private javax.swing.JTextField txtKodeBayar;
    private javax.swing.JTextField txtLokasiKamar;
    public static final javax.swing.JTextField txtNoDarurat = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtNoHP = new javax.swing.JTextField();
    private javax.swing.JTextField txtNoKTP;
    private javax.swing.JTextField txtTipeKamar;
    private javax.swing.JTextField txtTotaBayar;
    // End of variables declaration//GEN-END:variables
}
