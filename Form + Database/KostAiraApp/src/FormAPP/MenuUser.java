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
        Menu1 = new javax.swing.JLabel();
        Menu7 = new javax.swing.JLabel();
        minimized2 = new javax.swing.JButton();
        close1 = new javax.swing.JButton();
        judul1 = new javax.swing.JLabel();
        Slide1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        Kamar3 = new javax.swing.JLabel();
        Kamar4 = new javax.swing.JLabel();
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
        chatskrng_txt = new javax.swing.JLabel();
        wa_icon = new javax.swing.JLabel();
        chatBx = new javax.swing.JToggleButton();
        KamarSideBar = new javax.swing.JPanel();
        Menu2 = new javax.swing.JLabel();
        Menu3 = new javax.swing.JLabel();
        minimized4 = new javax.swing.JButton();
        close2 = new javax.swing.JButton();
        judul2 = new javax.swing.JLabel();
        ScrollData2 = new javax.swing.JScrollPane();
        PanelKamar = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        Menu5 = new javax.swing.JLabel();
        Menu8 = new javax.swing.JLabel();
        minimized8 = new javax.swing.JButton();
        close4 = new javax.swing.JButton();
        judul4 = new javax.swing.JLabel();
        CekButton6 = new javax.swing.JButton();
        form = new javax.swing.JPanel();
        Lbl_Judul1 = new javax.swing.JLabel();
        ScrollData = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Masuk = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtBooking = new javax.swing.JTextField();
        txtTipeKamar = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtLokasiKamar = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtTotaBayar = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
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

        Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu1MouseClicked(evt);
            }
        });
        BerandaSideBar.add(Menu1);
        Menu1.setBounds(10, 10, 34, 30);

        Menu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu7MouseClicked(evt);
            }
        });
        BerandaSideBar.add(Menu7);
        Menu7.setBounds(10, 10, 34, 30);

        minimized2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        minimized2.setBorder(null);
        minimized2.setBorderPainted(false);
        minimized2.setContentAreaFilled(false);
        minimized2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimized2.setFocusPainted(false);
        minimized2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimized2ActionPerformed(evt);
            }
        });
        BerandaSideBar.add(minimized2);
        minimized2.setBounds(1080, 15, 20, 20);

        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        close1.setBorder(null);
        close1.setBorderPainted(false);
        close1.setContentAreaFilled(false);
        close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close1.setFocusPainted(false);
        close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close1ActionPerformed(evt);
            }
        });
        BerandaSideBar.add(close1);
        close1.setBounds(1110, 10, 20, 20);

        judul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        BerandaSideBar.add(judul1);
        judul1.setBounds(445, 10, 260, 90);

        Slide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKostFoto/1.png"))); // NOI18N
        BerandaSideBar.add(Slide1);
        Slide1.setBounds(350, 130, 450, 260);

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Jl. Taman Kampus, Lingkungan Krajan Timur, Tegalgede, Kec. Sumbersari, Kabupaten Jember");
        BerandaSideBar.add(Text2);
        Text2.setBounds(300, 440, 570, 20);

        Kamar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/buttonKamar1.png"))); // NOI18N
        Kamar3.setPreferredSize(new java.awt.Dimension(190, 230));
        BerandaSideBar.add(Kamar3);
        Kamar3.setBounds(340, 500, 160, 200);

        Kamar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/buttonKamar2.png"))); // NOI18N
        BerandaSideBar.add(Kamar4);
        Kamar4.setBounds(670, 500, 160, 200);

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
        gb1.setBounds(10, 0, 13, 20);

        buttonGroup1.add(gb2);
        gb2.setBorder(null);
        gb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb2ActionPerformed(evt);
            }
        });
        button.add(gb2);
        gb2.setBounds(29, 0, 13, 20);

        buttonGroup1.add(gb3);
        gb3.setBorder(null);
        gb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb3ActionPerformed(evt);
            }
        });
        button.add(gb3);
        gb3.setBounds(48, 0, 13, 20);

        buttonGroup1.add(gb4);
        gb4.setBorder(null);
        gb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb4ActionPerformed(evt);
            }
        });
        button.add(gb4);
        gb4.setBounds(67, 0, 13, 20);

        buttonGroup1.add(gb5);
        gb5.setBorder(null);
        gb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb5ActionPerformed(evt);
            }
        });
        button.add(gb5);
        gb5.setBounds(86, 0, 13, 20);

        buttonGroup1.add(gb6);
        gb6.setBorder(null);
        gb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb6ActionPerformed(evt);
            }
        });
        button.add(gb6);
        gb6.setBounds(105, 0, 13, 20);

        buttonGroup1.add(gb7);
        gb7.setBorder(null);
        gb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb7ActionPerformed(evt);
            }
        });
        button.add(gb7);
        gb7.setBounds(124, 0, 13, 20);

        buttonGroup1.add(gb8);
        gb8.setBorder(null);
        gb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb8ActionPerformed(evt);
            }
        });
        button.add(gb8);
        gb8.setBounds(143, 0, 13, 20);

        buttonGroup1.add(gb9);
        gb9.setBorder(null);
        gb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb9ActionPerformed(evt);
            }
        });
        button.add(gb9);
        gb9.setBounds(162, 0, 13, 20);

        buttonGroup1.add(gb10);
        gb10.setBorder(null);
        gb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb10ActionPerformed(evt);
            }
        });
        button.add(gb10);
        gb10.setBounds(181, 0, 13, 20);

        BerandaSideBar.add(button);
        button.setBounds(480, 390, 200, 20);

        PanelChat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelChat.setFocusable(false);
        PanelChat.setOpaque(false);
        PanelChat.setLayout(null);

        chatskrng_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        chatskrng_txt.setForeground(new java.awt.Color(255, 255, 255));
        chatskrng_txt.setText("Chat Sekarang !!!");
        PanelChat.add(chatskrng_txt);
        chatskrng_txt.setBounds(60, 27, 140, 20);

        wa_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icoWaP.png"))); // NOI18N
        PanelChat.add(wa_icon);
        wa_icon.setBounds(20, 22, 30, 30);

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

        Menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu2MouseClicked(evt);
            }
        });
        KamarSideBar.add(Menu2);
        Menu2.setBounds(10, 10, 34, 30);

        Menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu3MouseClicked(evt);
            }
        });
        KamarSideBar.add(Menu3);
        Menu3.setBounds(10, 10, 34, 30);

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

        judul2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        KamarSideBar.add(judul2);
        judul2.setBounds(445, 10, 260, 90);

        ScrollData2.setBackground(new java.awt.Color(255, 255, 255));
        ScrollData2.setBorder(null);
        ScrollData2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollData2.setOpaque(false);

        PanelKamar.setBackground(new java.awt.Color(255, 255, 255));
        PanelKamar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Kategori", "Kamar 1", "Kamar 2", " " }));
        jComboBox1.setBorder(null);
        PanelKamar.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, -1));

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

        Menu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu5MouseClicked(evt);
            }
        });
        PemesananSideBar.add(Menu5);
        Menu5.setBounds(10, 10, 34, 30);

        Menu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu8MouseClicked(evt);
            }
        });
        PemesananSideBar.add(Menu8);
        Menu8.setBounds(10, 10, 34, 30);

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

        judul4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        PemesananSideBar.add(judul4);
        judul4.setBounds(445, 10, 260, 90);

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("ID Booking");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 126, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel39.setText("Tipe Kamar");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 126, -1));

        txtBooking.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 335, -1));

        txtTipeKamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtTipeKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 335, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel40.setText("Nama Lengkap");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 126, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel41.setText("Lokasi Kamar");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 126, -1));

        txtLokasiKamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtLokasiKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 335, -1));

        nm_lengkap.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nm_lengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nm_lengkapActionPerformed(evt);
            }
        });
        jPanel1.add(nm_lengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 335, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel42.setText("No. HP Pribadi");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 126, -1));

        txtNoHP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtNoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 335, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel43.setText("Jenis Kelamin");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 126, -1));

        txtJenisKelamin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 335, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel44.setText("Alamat");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 126, -1));

        txtAlamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 335, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel45.setText("Total Bayar");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 126, -1));

        txtTotaBayar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtTotaBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 335, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel46.setText("Lama sewa");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 126, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel47.setText("Tanggal Masuk");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 126, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel48.setText("No. HP Darurat");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 126, -1));

        txtNoDarurat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtNoDarurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 335, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel49.setText("Kode Bayar");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 126, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/profileW.png"))); // NOI18N
        SideBarMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 30, 100, 100));

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
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close1ActionPerformed

    private void minimized2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized2ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized2ActionPerformed

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

    private void Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseClicked
        Menu1.setVisible(false);
        Menu1.setEnabled(false);
        Menu7.setVisible(true);
        Menu7.setEnabled(true);
        setPanel(BerandaSideBar);
        judul1.setBounds(545, 10, 260, 90);
        Slide1.setBounds(448, 130, 450, 260);
        button.setBounds(575, 390, 200, 220);
        Text2.setBounds(400, 440, 570, 20);
        Kamar3.setBounds(420, 500, 160, 200);
        Kamar4.setBounds(790, 500, 160, 200);
        minimized2.setBounds(1286, 15, 20, 20);
        close1.setBounds(1316, 10, 20, 20);
        PanelChat.setBounds(1138, 710, 210, 70);
    }//GEN-LAST:event_Menu1MouseClicked

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

    private void Menu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MouseClicked
        Menu5.setVisible(false);
        Menu5.setEnabled(false);
        Menu8.setVisible(true);
        Menu8.setEnabled(true);
        setPanel(PemesananSideBar);
        judul4.setBounds(545, 10, 260, 90);
        form.setBounds(154, 110, 1050, 610);
        minimized8.setBounds(1286, 15, 20, 20);
        close4.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_Menu5MouseClicked

    private void MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukActionPerformed
        //        Beranda f3 = new Beranda();
        //        f3.setVisible(true);
        //new Beranda().show();
        this.setVisible(false);
    }//GEN-LAST:event_MasukActionPerformed

    private void gb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb1ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/1.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb1ActionPerformed

    private void gb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb2ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/2.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb2ActionPerformed

    private void gb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb3ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/3.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb3ActionPerformed

    private void gb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb4ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/4.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb4ActionPerformed

    private void gb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb5ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/5.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb5ActionPerformed

    private void gb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb6ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/6.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb6ActionPerformed

    private void gb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb7ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/7.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb7ActionPerformed

    private void gb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb8ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/8.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb8ActionPerformed

    private void gb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb9ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/9.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb9ActionPerformed

    private void gb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb10ActionPerformed
        ImageIcon gmbr =  new ImageIcon(getClass().getResource("/SI_AiraKostFoto/10.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb10ActionPerformed

    private void nm_lengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nm_lengkapActionPerformed
        
        
    }//GEN-LAST:event_nm_lengkapActionPerformed

    private void Menu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu7MouseClicked
        Menu7.setVisible(false);
        Menu7.setEnabled(false);
        Menu1.setVisible(true);
        Menu1.setEnabled(true);
        judul1.setBounds(445, 10, 260, 90);
        Slide1.setBounds(350, 130, 450, 260);
        button.setBounds(480, 390, 200, 220);
        Text2.setBounds(300, 440, 570, 20);
        Kamar3.setBounds(340, 500, 160, 200);
        Kamar4.setBounds(670, 500, 160, 200);
        minimized2.setBounds(1080, 15, 20, 20);
        close1.setBounds(1110, 10, 20, 20);
        PanelChat.setBounds(932, 710, 210, 70);
        resetPanel(BerandaSideBar);
    }//GEN-LAST:event_Menu7MouseClicked

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

    private void Menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MouseClicked
        Menu3.setVisible(false);
        Menu3.setEnabled(false);
        Menu2.setVisible(true);
        Menu2.setEnabled(true);
        resetPanel(KamarSideBar);
        judul2.setBounds(445, 10, 260, 90);
        ScrollData2.setBounds(50, 110, 1050, 610);
        minimized4.setBounds(1080, 15, 20, 20);
        close2.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_Menu3MouseClicked

    private void Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseClicked
        Menu2.setVisible(false);
        Menu2.setEnabled(false);
        Menu3.setVisible(true);
        Menu3.setEnabled(true);
        setPanel(KamarSideBar);
        judul2.setBounds(545, 10, 260, 90);
        ScrollData2.setBounds(154, 110, 1050, 610);
        minimized4.setBounds(1286, 15, 20, 20);
        close2.setBounds(1316, 10, 20, 20);

    }//GEN-LAST:event_Menu2MouseClicked

    private void Menu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu8MouseClicked
        Menu8.setVisible(false);
        Menu8.setEnabled(false);
        Menu5.setVisible(true);
        Menu5.setEnabled(true);
        resetPanel(PemesananSideBar);
        judul4.setBounds(445, 10, 260, 90);
        form.setBounds(50, 110, 1050, 610);
        minimized8.setBounds(1080, 15, 20, 20);
        close4.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_Menu8MouseClicked

    
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
    private javax.swing.JLabel Kamar3;
    private javax.swing.JLabel Kamar4;
    private javax.swing.JPanel KamarSideBar;
    private javax.swing.JLabel Lbl_Judul1;
    private javax.swing.JLabel Lbl_beranda;
    private javax.swing.JLabel Lbl_kamar;
    private javax.swing.JLabel Lbl_pemesanan;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JToggleButton Masuk;
    private javax.swing.JLabel Menu1;
    private javax.swing.JLabel Menu2;
    private javax.swing.JLabel Menu3;
    private javax.swing.JLabel Menu5;
    private javax.swing.JLabel Menu7;
    private javax.swing.JLabel Menu8;
    public static final javax.swing.JLabel NamaUser2 = new javax.swing.JLabel();
    private javax.swing.JPanel PanelChat;
    private javax.swing.JPanel PanelKamar;
    private javax.swing.JPanel PemesananSideBar;
    private javax.swing.JScrollPane ScrollData;
    private javax.swing.JScrollPane ScrollData2;
    private javax.swing.JPanel SideBarMenu;
    private javax.swing.JLabel Slide1;
    private javax.swing.JLabel Text2;
    private javax.swing.JPanel beranda;
    private javax.swing.JPanel button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton chatBx;
    private javax.swing.JLabel chatskrng_txt;
    private javax.swing.JButton close1;
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul4;
    private javax.swing.JPanel kamar;
    private javax.swing.JButton minimized2;
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
    private javax.swing.JLabel wa_icon;
    // End of variables declaration//GEN-END:variables
}
