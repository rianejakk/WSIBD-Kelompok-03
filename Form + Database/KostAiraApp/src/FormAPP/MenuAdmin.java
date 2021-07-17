/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormAPP;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tony's PC
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public MenuAdmin() {
        initComponents();
        ScrollForm.getVerticalScrollBar().setUnitIncrement(8);
        iconApp();
        BerandaSideBar.setVisible(true);
        BerandaSideBar.setEnabled(true);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);
        LaporanSidebar.setVisible(false);
        LaporanSidebar.setEnabled(false);
        PengaturanSideBar.setVisible(false);
        PengaturanSideBar.setEnabled(false);
        autoNumber(txtUser);
        autoNumber();
        showTables();
    }

        public void showTables() {
        DefaultTableModel tbl = new DefaultTableModel();

        tbl.addColumn("ID Cust");
        tbl.addColumn("USERNAME");
        tbl.addColumn("PASSWORD");
        tbl.addColumn("NO.KTP");
        tbl.addColumn("NAMA LENGKAP");
        tbl.addColumn("JENIS KELAMIN");
        tbl.addColumn("ALAMAT");
        tbl.addColumn("NO.HP");
        tbl.addColumn("NO.DARURAT");


 
        tabel.setModel(tbl);

        try {
            ConnectDB konek = new ConnectDB();
            ResultSet rs = konek.slctDB();
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("id_cust"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("NoKTP"),
                    rs.getString("NamaLengkap"),
                    rs.getString("JenisKelamin"),
                    rs.getString("Alamat"),
                    rs.getString("NoHpPribadi"),
                    rs.getString("NoHpDarurat")
                });
                tabel.setModel(tbl);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
//            Logger.getLogger(DataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void setIconPanelButton1(JLabel label) {
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPelangganP.png"));
        label.setIcon(gmbr);
    }

    private void setIconPanelButton2(JLabel label) {
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataAdminP.png"));
        label.setIcon(gmbr);
    }

    private void setIconPanelButton3(JLabel label) {
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPemesananP.png"));
        label.setIcon(gmbr);
    }

    private void setIconPanelButton4(JLabel label) {
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPembayaranP.png"));
        label.setIcon(gmbr);
    }

    private void resetIconPanelButton1(JLabel label) {
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPelanggan.png"));
        label.setIcon(gmbr);
    }

    private void resetIconPanelButton2(JLabel label) {
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataAdmin.png"));
        label.setIcon(gmbr);
    }

    private void resetIconPanelButton3(JLabel label) {
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPemesanan.png"));
        label.setIcon(gmbr);
    }

    private void resetIconPanelButton4(JLabel label) {
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPembayaran.png"));
        label.setIcon(gmbr);
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

    private void resetForm(){
        autoNumber(txtUser);
        autoNumber();
        txtUsername.setText("");
        txtPass.setText("");
        txtKTP.setText("");
        txtNama.setText("");
        String jeniskelamin = null;
        if (Opsi_Laki.isSelected()) {
            jeniskelamin = "Laki-laki";
        } else if (Opsi_Perempuan.isSelected()) {
            jeniskelamin = "Perempuan";
        }

        txtAlmt.setText("");
        txtNoHp.setText("");
        txtNoHPDarurat.setText("");

        cmbAkses.setSelectedIndex(0);
    }
    
    private void LblLength(JTextField txt, int length) {
        String input = txt.getText();
        if (input.length() > length) {
            JOptionPane.showMessageDialog(rootPane, "jumlah input melebihi batas");
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
            JOptionPane.showMessageDialog(rootPane, "Error pada ID User");
            System.out.println(e.getMessage());
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
            JOptionPane.showMessageDialog(rootPane, "Error pada ID Cust");
            System.out.println(e.getMessage());
        }
    }

    int xy, xx;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Bg = new javax.swing.JPanel();
        BerandaSideBar = new javax.swing.JPanel();
        Menu1 = new javax.swing.JLabel();
        Menu11 = new javax.swing.JLabel();
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
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        chatBx = new javax.swing.JToggleButton();
        KamarSideBar = new javax.swing.JPanel();
        Menu2 = new javax.swing.JLabel();
        Menu12 = new javax.swing.JLabel();
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
        Menu10 = new javax.swing.JLabel();
        minimized8 = new javax.swing.JButton();
        close4 = new javax.swing.JButton();
        judul4 = new javax.swing.JLabel();
        CekButton6 = new javax.swing.JButton();
        form = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
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
        LaporanSidebar = new javax.swing.JPanel();
        Menu7 = new javax.swing.JLabel();
        Menu13 = new javax.swing.JLabel();
        minimized3 = new javax.swing.JButton();
        close6 = new javax.swing.JButton();
        judul6 = new javax.swing.JLabel();
        Data_Pelanggan = new javax.swing.JPanel();
        icoPelanggan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Data_Admin = new javax.swing.JPanel();
        icoAdmin = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        Data_Pemesanan = new javax.swing.JPanel();
        icoPemesanan = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        Data_Pembayaran = new javax.swing.JPanel();
        icoPay = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        PengaturanSideBar = new javax.swing.JPanel();
        Menu8 = new javax.swing.JLabel();
        Menu9 = new javax.swing.JLabel();
        minimized7 = new javax.swing.JButton();
        close7 = new javax.swing.JButton();
        judul7 = new javax.swing.JLabel();
        Data_EPelanggan = new javax.swing.JPanel();
        icoPelanggan2 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        Data_EUser = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        icoAdmin2 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        Data_EKamar = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        icoPemesanan2 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
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
        laporan = new javax.swing.JPanel();
        ico_laporan = new javax.swing.JLabel();
        Lbl_laporan = new javax.swing.JLabel();
        pengaturan = new javax.swing.JPanel();
        ico_pengaturan = new javax.swing.JLabel();
        Lbl_pengaturan = new javax.swing.JLabel();
        InputDataPelanggan = new javax.swing.JPanel();
        Menu3 = new javax.swing.JLabel();
        Menu14 = new javax.swing.JLabel();
        minimized9 = new javax.swing.JButton();
        close5 = new javax.swing.JButton();
        judul5 = new javax.swing.JLabel();
        Lbl_IdUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        Lbl_IdCust = new javax.swing.JLabel();
        txtCust = new javax.swing.JTextField();
        form1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ScrollForm = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        Lbl_Username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        Lbl_Pass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        Hide = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        txtPass1 = new javax.swing.JPasswordField();
        Lbl_KTP = new javax.swing.JLabel();
        Lbl_Nama = new javax.swing.JLabel();
        Lbl_Jkl = new javax.swing.JLabel();
        Opsi_Laki = new javax.swing.JRadioButton();
        Opsi_Perempuan = new javax.swing.JRadioButton();
        Lbl_Alamat = new javax.swing.JLabel();
        Lbl_NoHP = new javax.swing.JLabel();
        Lbl_NoHPDarurat = new javax.swing.JLabel();
        Lbl_HakAkses = new javax.swing.JLabel();
        cmbAkses = new javax.swing.JComboBox<>();
        Simpan2 = new javax.swing.JToggleButton();
        Simpan1 = new javax.swing.JToggleButton();
        Simpan = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlmt = new javax.swing.JTextArea();
        Lbl_Data = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        browse = new javax.swing.JToggleButton();
        Lbl_Cari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KostAiraApp");
        setUndecorated(true);

        Bg.setBackground(new java.awt.Color(242, 242, 242));
        Bg.setLayout(null);

        BerandaSideBar.setBackground(new java.awt.Color(242, 242, 242));
        BerandaSideBar.setMinimumSize(new java.awt.Dimension(1160, 768));
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

        Menu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu11MouseClicked(evt);
            }
        });
        BerandaSideBar.add(Menu11);
        Menu11.setBounds(10, 10, 34, 30);

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

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Chat Sekarang!");
        PanelChat.add(jLabel79);
        jLabel79.setBounds(60, 27, 140, 20);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icoWaP.png"))); // NOI18N
        PanelChat.add(jLabel80);
        jLabel80.setBounds(20, 22, 30, 30);

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

        Menu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu12MouseClicked(evt);
            }
        });
        KamarSideBar.add(Menu12);
        Menu12.setBounds(10, 10, 34, 30);

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

        Menu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu10MouseClicked(evt);
            }
        });
        PemesananSideBar.add(Menu10);
        Menu10.setBounds(10, 10, 34, 30);

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
        CekButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CekButton6ActionPerformed(evt);
            }
        });
        PemesananSideBar.add(CekButton6);
        CekButton6.setBounds(390, 660, 61, 23);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setOpaque(false);
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 82, 76));
        jLabel5.setText("Formulir Pemesanan Kamar");
        form.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

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
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
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

        LaporanSidebar.setBackground(new java.awt.Color(242, 242, 242));
        LaporanSidebar.setMinimumSize(new java.awt.Dimension(1160, 768));
        LaporanSidebar.setPreferredSize(new java.awt.Dimension(1160, 768));
        LaporanSidebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LaporanSidebarSidebarMouseDragged(evt);
            }
        });
        LaporanSidebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LaporanSidebarSidebarMousePressed(evt);
            }
        });
        LaporanSidebar.setLayout(null);

        Menu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu7MouseClicked(evt);
            }
        });
        LaporanSidebar.add(Menu7);
        Menu7.setBounds(10, 10, 34, 30);

        Menu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu13MouseClicked(evt);
            }
        });
        LaporanSidebar.add(Menu13);
        Menu13.setBounds(10, 10, 34, 30);

        minimized3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        minimized3.setBorder(null);
        minimized3.setBorderPainted(false);
        minimized3.setContentAreaFilled(false);
        minimized3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimized3.setFocusPainted(false);
        minimized3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimized3ActionPerformed(evt);
            }
        });
        LaporanSidebar.add(minimized3);
        minimized3.setBounds(1080, 15, 20, 20);

        close6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        close6.setBorder(null);
        close6.setBorderPainted(false);
        close6.setContentAreaFilled(false);
        close6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close6.setFocusPainted(false);
        close6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close6ActionPerformed(evt);
            }
        });
        LaporanSidebar.add(close6);
        close6.setBounds(1110, 10, 20, 20);

        judul6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        LaporanSidebar.add(judul6);
        judul6.setBounds(445, 10, 260, 90);

        Data_Pelanggan.setBackground(new java.awt.Color(255, 255, 255));
        Data_Pelanggan.setOpaque(false);
        Data_Pelanggan.setLayout(null);

        icoPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPelanggan.png"))); // NOI18N
        Data_Pelanggan.add(icoPelanggan);
        icoPelanggan.setBounds(43, 70, 130, 130);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 82, 76));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data Pelanggan");
        Data_Pelanggan.add(jLabel3);
        jLabel3.setBounds(12, 230, 180, 20);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel64MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel64MouseExited(evt);
            }
        });
        Data_Pelanggan.add(jLabel64);
        jLabel64.setBounds(0, 20, 204, 254);

        LaporanSidebar.add(Data_Pelanggan);
        Data_Pelanggan.setBounds(110, 200, 200, 270);

        Data_Admin.setBackground(new java.awt.Color(255, 255, 255));
        Data_Admin.setOpaque(false);
        Data_Admin.setLayout(null);

        icoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataAdmin.png"))); // NOI18N
        Data_Admin.add(icoAdmin);
        icoAdmin.setBounds(40, 70, 130, 130);

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(96, 82, 76));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Data Admin");
        Data_Admin.add(jLabel65);
        jLabel65.setBounds(12, 230, 180, 20);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel66MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel66MouseExited(evt);
            }
        });
        Data_Admin.add(jLabel66);
        jLabel66.setBounds(0, 20, 204, 254);

        LaporanSidebar.add(Data_Admin);
        Data_Admin.setBounds(360, 200, 200, 270);

        Data_Pemesanan.setBackground(new java.awt.Color(255, 255, 255));
        Data_Pemesanan.setOpaque(false);
        Data_Pemesanan.setLayout(null);

        icoPemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPemesanan.png"))); // NOI18N
        Data_Pemesanan.add(icoPemesanan);
        icoPemesanan.setBounds(40, 70, 130, 130);

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(96, 82, 76));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Data Pemesanan");
        Data_Pemesanan.add(jLabel67);
        jLabel67.setBounds(12, 230, 180, 20);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel68MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel68MouseExited(evt);
            }
        });
        Data_Pemesanan.add(jLabel68);
        jLabel68.setBounds(0, 20, 204, 254);

        LaporanSidebar.add(Data_Pemesanan);
        Data_Pemesanan.setBounds(610, 200, 200, 270);

        Data_Pembayaran.setBackground(new java.awt.Color(255, 255, 255));
        Data_Pembayaran.setOpaque(false);
        Data_Pembayaran.setLayout(null);

        icoPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPembayaran.png"))); // NOI18N
        Data_Pembayaran.add(icoPay);
        icoPay.setBounds(40, 70, 130, 130);

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(96, 82, 76));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Data Pembayaran");
        Data_Pembayaran.add(jLabel69);
        jLabel69.setBounds(12, 230, 180, 20);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel70MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });
        Data_Pembayaran.add(jLabel70);
        jLabel70.setBounds(0, 20, 204, 254);

        LaporanSidebar.add(Data_Pembayaran);
        Data_Pembayaran.setBounds(850, 200, 200, 270);

        Bg.add(LaporanSidebar);
        LaporanSidebar.setBounds(206, 0, 1160, 768);

        PengaturanSideBar.setBackground(new java.awt.Color(242, 242, 242));
        PengaturanSideBar.setMinimumSize(new java.awt.Dimension(1160, 768));
        PengaturanSideBar.setPreferredSize(new java.awt.Dimension(1160, 768));
        PengaturanSideBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PengaturanSideBarSidebarMouseDragged(evt);
            }
        });
        PengaturanSideBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PengaturanSideBarSidebarMousePressed(evt);
            }
        });
        PengaturanSideBar.setLayout(null);

        Menu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu8MouseClicked(evt);
            }
        });
        PengaturanSideBar.add(Menu8);
        Menu8.setBounds(10, 10, 34, 30);

        Menu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu9MouseClicked(evt);
            }
        });
        PengaturanSideBar.add(Menu9);
        Menu9.setBounds(10, 10, 34, 30);

        minimized7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        minimized7.setBorder(null);
        minimized7.setBorderPainted(false);
        minimized7.setContentAreaFilled(false);
        minimized7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimized7.setFocusPainted(false);
        minimized7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimized7ActionPerformed(evt);
            }
        });
        PengaturanSideBar.add(minimized7);
        minimized7.setBounds(1080, 15, 20, 20);

        close7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        close7.setBorder(null);
        close7.setBorderPainted(false);
        close7.setContentAreaFilled(false);
        close7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close7.setFocusPainted(false);
        close7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close7ActionPerformed(evt);
            }
        });
        PengaturanSideBar.add(close7);
        close7.setBounds(1110, 10, 15, 20);

        judul7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        PengaturanSideBar.add(judul7);
        judul7.setBounds(445, 10, 260, 90);

        Data_EPelanggan.setBackground(new java.awt.Color(255, 255, 255));
        Data_EPelanggan.setOpaque(false);
        Data_EPelanggan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icoPelanggan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPelanggan.png"))); // NOI18N
        Data_EPelanggan.add(icoPelanggan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 70, 130, 130));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(96, 82, 76));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Data Pelanggan");
        Data_EPelanggan.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(96, 82, 76));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Input /Edit");
        Data_EPelanggan.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel86MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel86MouseExited(evt);
            }
        });
        Data_EPelanggan.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        PengaturanSideBar.add(Data_EPelanggan);
        Data_EPelanggan.setBounds(240, 200, 200, 270);

        Data_EUser.setBackground(new java.awt.Color(255, 255, 255));
        Data_EUser.setOpaque(false);
        Data_EUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(96, 82, 76));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Input /Edit");
        Data_EUser.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(96, 82, 76));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Data User");
        Data_EUser.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, -1));

        icoAdmin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataAdmin.png"))); // NOI18N
        Data_EUser.add(icoAdmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 130));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel84MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel84MouseExited(evt);
            }
        });
        Data_EUser.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        PengaturanSideBar.add(Data_EUser);
        Data_EUser.setBounds(490, 200, 200, 270);

        Data_EKamar.setBackground(new java.awt.Color(255, 255, 255));
        Data_EKamar.setOpaque(false);
        Data_EKamar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(96, 82, 76));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Input/Edit");
        Data_EKamar.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(96, 82, 76));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Data Kamar");
        Data_EKamar.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, -1));

        icoPemesanan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPemesanan.png"))); // NOI18N
        Data_EKamar.add(icoPemesanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 130));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(96, 82, 76));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Data_EKamar.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 230, 180, -1));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel82MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel82MouseExited(evt);
            }
        });
        Data_EKamar.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        PengaturanSideBar.add(Data_EKamar);
        Data_EKamar.setBounds(740, 200, 200, 270);

        Bg.add(PengaturanSideBar);
        PengaturanSideBar.setBounds(206, 0, 1160, 768);

        SideBarMenu.setBackground(new java.awt.Color(140, 120, 111));
        SideBarMenu.setMinimumSize(new java.awt.Dimension(210, 768));
        SideBarMenu.setPreferredSize(new java.awt.Dimension(210, 768));
        SideBarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/profileW.png"))); // NOI18N
        SideBarMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 30, 100, 100));

        jSeparator1.setBackground(new java.awt.Color(96, 82, 76));
        jSeparator1.setForeground(new java.awt.Color(96, 82, 76));
        SideBarMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 188, 210, -1));

        NamaUser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NamaUser1.setForeground(new java.awt.Color(255, 255, 255));
        NamaUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamaUser1.setText("admin");
        SideBarMenu.add(NamaUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 30));

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

        laporan.setBackground(new java.awt.Color(140, 120, 111));
        laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanMouseClicked(evt);
            }
        });

        ico_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_4_30px.png"))); // NOI18N

        Lbl_laporan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lbl_laporan.setForeground(new java.awt.Color(207, 207, 207));
        Lbl_laporan.setText("Laporan");

        javax.swing.GroupLayout laporanLayout = new javax.swing.GroupLayout(laporan);
        laporan.setLayout(laporanLayout);
        laporanLayout.setHorizontalGroup(
            laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporanLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ico_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        laporanLayout.setVerticalGroup(
            laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(laporanLayout.createSequentialGroup()
                        .addComponent(ico_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        SideBarMenu.add(laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 205, 50));

        pengaturan.setBackground(new java.awt.Color(140, 120, 111));
        pengaturan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengaturanMouseClicked(evt);
            }
        });

        ico_pengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_5_30px.png"))); // NOI18N

        Lbl_pengaturan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lbl_pengaturan.setForeground(new java.awt.Color(207, 207, 207));
        Lbl_pengaturan.setText("Pengaturan");

        javax.swing.GroupLayout pengaturanLayout = new javax.swing.GroupLayout(pengaturan);
        pengaturan.setLayout(pengaturanLayout);
        pengaturanLayout.setHorizontalGroup(
            pengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pengaturanLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ico_pengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_pengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pengaturanLayout.setVerticalGroup(
            pengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pengaturanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_pengaturan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pengaturanLayout.createSequentialGroup()
                        .addComponent(ico_pengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        SideBarMenu.add(pengaturan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 205, 50));

        Bg.add(SideBarMenu);
        SideBarMenu.setBounds(0, 0, 205, 768);

        InputDataPelanggan.setBackground(new java.awt.Color(242, 242, 242));
        InputDataPelanggan.setMinimumSize(new java.awt.Dimension(1160, 768));
        InputDataPelanggan.setLayout(null);

        Menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu3MouseClicked(evt);
            }
        });
        InputDataPelanggan.add(Menu3);
        Menu3.setBounds(10, 10, 34, 30);

        Menu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        Menu14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu14MouseClicked(evt);
            }
        });
        InputDataPelanggan.add(Menu14);
        Menu14.setBounds(10, 10, 34, 30);

        minimized9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        minimized9.setBorder(null);
        minimized9.setBorderPainted(false);
        minimized9.setContentAreaFilled(false);
        minimized9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimized9.setFocusPainted(false);
        minimized9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimized9ActionPerformed(evt);
            }
        });
        InputDataPelanggan.add(minimized9);
        minimized9.setBounds(1080, 15, 20, 20);

        close5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        close5.setBorder(null);
        close5.setBorderPainted(false);
        close5.setContentAreaFilled(false);
        close5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close5.setFocusPainted(false);
        close5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close5ActionPerformed(evt);
            }
        });
        InputDataPelanggan.add(close5);
        close5.setBounds(1110, 10, 20, 20);

        judul5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        InputDataPelanggan.add(judul5);
        judul5.setBounds(445, 10, 260, 90);

        Lbl_IdUser.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Lbl_IdUser.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_IdUser.setText("IdUser :");
        InputDataPelanggan.add(Lbl_IdUser);
        Lbl_IdUser.setBounds(900, 90, 35, 15);

        txtUser.setEditable(false);
        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtUser.setBorder(null);
        txtUser.setOpaque(false);
        InputDataPelanggan.add(txtUser);
        txtUser.setBounds(940, 90, 50, 15);

        Lbl_IdCust.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Lbl_IdCust.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_IdCust.setText("IdCust :");
        InputDataPelanggan.add(Lbl_IdCust);
        Lbl_IdCust.setBounds(1000, 90, 35, 15);

        txtCust.setEditable(false);
        txtCust.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtCust.setBorder(null);
        txtCust.setOpaque(false);
        InputDataPelanggan.add(txtCust);
        txtCust.setBounds(1040, 90, 50, 15);

        form1.setBackground(new java.awt.Color(255, 255, 255));
        form1.setOpaque(false);
        form1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(96, 82, 76));
        jLabel23.setText("Data Pelanggan ");
        form1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 20, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/backIco.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        form1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, 20, 20));

        ScrollForm.setBackground(new java.awt.Color(255, 255, 255));
        ScrollForm.setBorder(null);
        ScrollForm.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Username.setText("Username");
        jPanel3.add(Lbl_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 126, -1));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 310, -1));

        Lbl_Pass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Pass.setText("Password");
        jPanel3.add(Lbl_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 126, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 280, 30));

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
        jPanel3.add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 76, 26, 18));

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
        jPanel3.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 76, 26, 18));

        txtPass1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPass1.setEnabled(false);
        jPanel3.add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 310, 30));

        Lbl_KTP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_KTP.setText("No. KTP");
        jPanel3.add(Lbl_KTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 126, -1));

        txtKTP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtKTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKTPActionPerformed(evt);
            }
        });
        jPanel3.add(txtKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 310, -1));

        Lbl_Nama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Nama.setText("Nama Lengkap");
        jPanel3.add(Lbl_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 126, -1));

        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 310, -1));

        Lbl_Jkl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Jkl.setText("Jenis Kelamin");
        jPanel3.add(Lbl_Jkl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 126, -1));

        Opsi_Laki.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Opsi_Laki);
        Opsi_Laki.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Opsi_Laki.setText("Laki-laki");
        Opsi_Laki.setEnabled(false);
        jPanel3.add(Opsi_Laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        Opsi_Perempuan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Opsi_Perempuan);
        Opsi_Perempuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Opsi_Perempuan.setSelected(true);
        Opsi_Perempuan.setText("Perempuan");
        Opsi_Perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opsi_PerempuanActionPerformed(evt);
            }
        });
        jPanel3.add(Opsi_Perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        Lbl_Alamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Alamat.setText("Alamat");
        jPanel3.add(Lbl_Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 126, -1));

        Lbl_NoHP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_NoHP.setText("No. HP Pribadi");
        jPanel3.add(Lbl_NoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 126, -1));

        txtNoHp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(txtNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 310, -1));

        Lbl_NoHPDarurat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_NoHPDarurat.setText("No. HP Darurat");
        jPanel3.add(Lbl_NoHPDarurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 126, -1));

        txtNoHPDarurat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(txtNoHPDarurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 310, -1));

        Lbl_HakAkses.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_HakAkses.setText("Hak Akses");
        jPanel3.add(Lbl_HakAkses, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 126, -1));

        cmbAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih sebagai", "Admin", "User" }));
        jPanel3.add(cmbAkses, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 310, 30));

        Simpan2.setBackground(new java.awt.Color(52, 135, 239));
        Simpan2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Simpan2.setForeground(new java.awt.Color(255, 255, 255));
        Simpan2.setText("Edit");
        Simpan2.setBorder(null);
        Simpan2.setBorderPainted(false);
        Simpan2.setContentAreaFilled(false);
        Simpan2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Simpan2.setOpaque(true);
        Simpan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simpan2ActionPerformed(evt);
            }
        });
        jPanel3.add(Simpan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 100, 40));

        Simpan1.setBackground(new java.awt.Color(52, 135, 239));
        Simpan1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Simpan1.setForeground(new java.awt.Color(255, 255, 255));
        Simpan1.setText("Hapus");
        Simpan1.setBorder(null);
        Simpan1.setBorderPainted(false);
        Simpan1.setContentAreaFilled(false);
        Simpan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Simpan1.setOpaque(true);
        Simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simpan1ActionPerformed(evt);
            }
        });
        jPanel3.add(Simpan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 100, 40));

        Simpan.setBackground(new java.awt.Color(52, 135, 239));
        Simpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Simpan.setForeground(new java.awt.Color(255, 255, 255));
        Simpan.setText("Simpan");
        Simpan.setBorder(null);
        Simpan.setBorderPainted(false);
        Simpan.setContentAreaFilled(false);
        Simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Simpan.setOpaque(true);
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel3.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 100, 40));

        txtAlmt.setColumns(20);
        txtAlmt.setLineWrap(true);
        txtAlmt.setRows(5);
        jScrollPane1.setViewportView(txtAlmt);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 310, -1));

        Lbl_Data.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lbl_Data.setText("Data");
        jPanel3.add(Lbl_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 140, 170));
        jPanel3.add(txtPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 110, 20));

        browse.setText("...");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel3.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 229, 32, 22));

        Lbl_Cari.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lbl_Cari.setText("Cari Data");
        jPanel3.add(Lbl_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });
        jPanel3.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 370, -1));

        jScrollPane2.setAutoscrolls(true);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, 220));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 10, 630));

        ScrollForm.setViewportView(jPanel3);

        form1.add(ScrollForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1064, 500));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Edge.png"))); // NOI18N
        form1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 610));

        InputDataPelanggan.add(form1);
        form1.setBounds(50, 110, 1050, 610);

        Bg.add(InputDataPelanggan);
        InputDataPelanggan.setBounds(206, 0, 1160, 768);

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

    private void pengaturanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengaturanMouseClicked
        ImageIcon ptn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_5_30px_P.png"));
        ico_pengaturan.setIcon(ptn);
        ImageIcon brd = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_1_30px.png"));
        ico_beranda.setIcon(brd);
        ImageIcon kmr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_2_30px.png"));
        ico_kamar.setIcon(kmr);
        ImageIcon psn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_3_30px.png"));
        ico_pemesanan.setIcon(psn);
        ImageIcon lpr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_4_30px.png"));
        ico_laporan.setIcon(lpr);

        setColor(pengaturan);
        setColorText(Lbl_pengaturan);
        resetColor(beranda);
        resetColorText(Lbl_beranda);
        resetColor(kamar);
        resetColorText(Lbl_kamar);
        resetColor(pemesanan);
        resetColorText(Lbl_pemesanan);
        resetColor(laporan);
        resetColorText(Lbl_laporan);

        PengaturanSideBar.setVisible(true);
        PengaturanSideBar.setEnabled(true);
        BerandaSideBar.setVisible(false);
        BerandaSideBar.setEnabled(false);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);
        LaporanSidebar.setVisible(false);
        LaporanSidebar.setEnabled(false);
    }//GEN-LAST:event_pengaturanMouseClicked

    private void laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanMouseClicked
        ImageIcon lpr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_4_30px_P.png"));
        ico_laporan.setIcon(lpr);
        ImageIcon brd = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_1_30px.png"));
        ico_beranda.setIcon(brd);
        ImageIcon kmr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_2_30px.png"));
        ico_kamar.setIcon(kmr);
        ImageIcon psn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_3_30px.png"));
        ico_pemesanan.setIcon(psn);
        ImageIcon ptn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_5_30px.png"));
        ico_pengaturan.setIcon(ptn);

        setColor(laporan);
        setColorText(Lbl_laporan);
        resetColor(beranda);
        resetColorText(Lbl_beranda);
        resetColor(kamar);
        resetColorText(Lbl_kamar);
        resetColor(pemesanan);
        resetColorText(Lbl_pemesanan);
        resetColor(pengaturan);
        resetColorText(Lbl_pengaturan);

        LaporanSidebar.setVisible(true);
        LaporanSidebar.setEnabled(true);
        BerandaSideBar.setVisible(false);
        BerandaSideBar.setEnabled(false);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);
        PengaturanSideBar.setVisible(false);
        PengaturanSideBar.setEnabled(false);
    }//GEN-LAST:event_laporanMouseClicked

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

    private void pemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemesananMouseClicked
        ImageIcon psn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_3_30px_P.png"));
        ico_pemesanan.setIcon(psn);
        ImageIcon brd = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_1_30px.png"));
        ico_beranda.setIcon(brd);
        ImageIcon kmr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_2_30px.png"));
        ico_kamar.setIcon(kmr);
        ImageIcon lpr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_4_30px.png"));
        ico_laporan.setIcon(lpr);
        ImageIcon ptn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_5_30px.png"));
        ico_pengaturan.setIcon(ptn);

        setColor(pemesanan);
        setColorText(Lbl_pemesanan);
        resetColor(beranda);
        resetColorText(Lbl_beranda);
        resetColor(kamar);
        resetColorText(Lbl_kamar);
        resetColor(laporan);
        resetColorText(Lbl_laporan);
        resetColor(pengaturan);
        resetColorText(Lbl_pengaturan);

        PemesananSideBar.setVisible(true);
        PemesananSideBar.setEnabled(true);
        BerandaSideBar.setVisible(false);
        BerandaSideBar.setEnabled(false);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
    }//GEN-LAST:event_pemesananMouseClicked

    private void kamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kamarMouseClicked
        ImageIcon kmr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_2_30px_P.png"));
        ico_kamar.setIcon(kmr);
        ImageIcon brd = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_1_30px.png"));
        ico_beranda.setIcon(brd);
        ImageIcon psn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_3_30px.png"));
        ico_pemesanan.setIcon(psn);
        ImageIcon lpr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_4_30px.png"));
        ico_laporan.setIcon(lpr);
        ImageIcon ptn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_5_30px.png"));
        ico_pengaturan.setIcon(ptn);

        setColor(kamar);
        setColorText(Lbl_kamar);
        resetColor(beranda);
        resetColorText(Lbl_beranda);
        resetColor(pemesanan);
        resetColorText(Lbl_pemesanan);
        resetColor(laporan);
        resetColorText(Lbl_laporan);
        resetColor(pengaturan);
        resetColorText(Lbl_pengaturan);

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
        ImageIcon lpr = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_4_30px.png"));
        ico_laporan.setIcon(lpr);
        ImageIcon ptn = new ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icon_5_30px.png"));
        ico_pengaturan.setIcon(ptn);

        setColor(beranda);
        setColorText(Lbl_beranda);
        resetColor(kamar);
        resetColorText(Lbl_kamar);
        resetColor(pemesanan);
        resetColorText(Lbl_pemesanan);
        resetColor(laporan);
        resetColorText(Lbl_laporan);
        resetColor(pengaturan);
        resetColorText(Lbl_pengaturan);

        BerandaSideBar.setVisible(true);
        BerandaSideBar.setEnabled(true);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);
    }//GEN-LAST:event_berandaMouseClicked

    private void LaporanSidebarSidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaporanSidebarSidebarMousePressed

    }//GEN-LAST:event_LaporanSidebarSidebarMousePressed

    private void LaporanSidebarSidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaporanSidebarSidebarMouseDragged

    }//GEN-LAST:event_LaporanSidebarSidebarMouseDragged

    private void jLabel64MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseExited
        resetIconPanelButton1(icoPelanggan);
    }//GEN-LAST:event_jLabel64MouseExited

    private void jLabel64MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseEntered
        setIconPanelButton1(icoPelanggan);
    }//GEN-LAST:event_jLabel64MouseEntered

    private void jLabel66MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseExited
        resetIconPanelButton2(icoAdmin);
    }//GEN-LAST:event_jLabel66MouseExited

    private void jLabel66MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseEntered
        setIconPanelButton2(icoAdmin);
    }//GEN-LAST:event_jLabel66MouseEntered

    private void jLabel68MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseExited
        resetIconPanelButton3(icoPemesanan);
    }//GEN-LAST:event_jLabel68MouseExited

    private void jLabel68MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseEntered
        setIconPanelButton3(icoPemesanan);
    }//GEN-LAST:event_jLabel68MouseEntered

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
        resetIconPanelButton4(icoPay);
    }//GEN-LAST:event_jLabel70MouseExited

    private void jLabel70MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseEntered
        setIconPanelButton4(icoPay);
    }//GEN-LAST:event_jLabel70MouseEntered

    private void close6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close6ActionPerformed

    private void minimized3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized3ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized3ActionPerformed

    private void Menu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu7MouseClicked
        Menu7.setVisible(false);
        Menu7.setEnabled(false);
        Menu13.setVisible(true);
        Menu13.setEnabled(true);
        setPanel(LaporanSidebar);
        judul6.setBounds(545, 10, 260, 90);
        Data_Pelanggan.setBounds(210, 200, 200, 270);
        Data_Admin.setBounds(460, 200, 200, 270);
        Data_Pemesanan.setBounds(710, 200, 200, 270);
        Data_Pembayaran.setBounds(950, 200, 200, 270);
        minimized3.setBounds(1286, 15, 20, 20);
        close6.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_Menu7MouseClicked

    private void Menu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu8MouseClicked
        Menu8.setVisible(false);
        Menu8.setEnabled(false);
        Menu9.setVisible(true);
        Menu9.setEnabled(true);
        setPanel(PengaturanSideBar);
        judul7.setBounds(545, 10, 260, 90);
        Data_EPelanggan.setBounds(340, 200, 200, 270);
        Data_EUser.setBounds(590, 200, 200, 270);
        Data_EKamar.setBounds(840, 200, 200, 270);
        minimized7.setBounds(1286, 15, 20, 20);
        close7.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_Menu8MouseClicked

    private void minimized7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized7ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized7ActionPerformed

    private void close7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close7ActionPerformed

    private void jLabel84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseEntered
        setIconPanelButton2(icoAdmin2);
    }//GEN-LAST:event_jLabel84MouseEntered

    private void jLabel84MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseExited
        resetIconPanelButton2(icoAdmin2);
    }//GEN-LAST:event_jLabel84MouseExited

    private void jLabel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseEntered
        setIconPanelButton1(icoPelanggan2);
    }//GEN-LAST:event_jLabel86MouseEntered

    private void jLabel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseExited
        resetIconPanelButton1(icoPelanggan2);
    }//GEN-LAST:event_jLabel86MouseExited

    private void PengaturanSideBarSidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanSideBarSidebarMouseDragged

    }//GEN-LAST:event_PengaturanSideBarSidebarMouseDragged

    private void PengaturanSideBarSidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanSideBarSidebarMousePressed

    }//GEN-LAST:event_PengaturanSideBarSidebarMousePressed

    private void Menu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MouseClicked
        Menu5.setVisible(false);
        Menu5.setEnabled(false);
        Menu10.setVisible(true);
        Menu10.setEnabled(true);
        setPanel(PemesananSideBar);
        judul4.setBounds(545, 10, 260, 90);
        form.setBounds(154, 110, 1050, 610);
        minimized8.setBounds(1286, 15, 20, 20);
        close4.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_Menu5MouseClicked

    private void Menu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu10MouseClicked
        Menu10.setVisible(false);
        Menu10.setEnabled(false);
        Menu5.setVisible(true);
        Menu5.setEnabled(true);
        resetPanel(PemesananSideBar);
        judul4.setBounds(445, 10, 260, 90);
        form.setBounds(50, 110, 1050, 610);
        minimized8.setBounds(1080, 15, 20, 20);
        close4.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_Menu10MouseClicked

    private void minimized8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized8ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized8ActionPerformed

    private void close4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close4ActionPerformed

    private void CekButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CekButton6ActionPerformed

    }//GEN-LAST:event_CekButton6ActionPerformed

    private void Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseClicked
        Menu1.setVisible(false);
        Menu1.setEnabled(false);
        Menu11.setVisible(true);
        Menu11.setEnabled(true);
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

    private void Menu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu11MouseClicked
        Menu11.setVisible(false);
        Menu11.setEnabled(false);
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
    }//GEN-LAST:event_Menu11MouseClicked

    private void minimized2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized2ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized2ActionPerformed

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close1ActionPerformed

    private void gb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb1ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/1.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb1ActionPerformed

    private void gb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb2ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/2.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb2ActionPerformed

    private void gb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb3ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/3.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb3ActionPerformed

    private void gb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb4ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/4.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb4ActionPerformed

    private void gb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb5ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/5.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb5ActionPerformed

    private void gb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb6ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/6.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb6ActionPerformed

    private void gb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb7ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/7.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb7ActionPerformed

    private void gb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb8ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/8.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb8ActionPerformed

    private void gb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb9ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/9.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb9ActionPerformed

    private void gb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb10ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/10.png"));
        Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb10ActionPerformed

    private void chatBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatBxActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://api.whatsapp.com/send?phone=6287743310528&text=Kak%20saya%20ingin%20cek%20kamar.😊").toURI());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_chatBxActionPerformed

    private void BerandaSideBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BerandaSideBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_BerandaSideBarMouseDragged

    private void Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseClicked
        Menu2.setVisible(false);
        Menu2.setEnabled(false);
        Menu12.setVisible(true);
        Menu12.setEnabled(true);
        setPanel(KamarSideBar);
        judul2.setBounds(545, 10, 260, 90);
        ScrollData2.setBounds(154, 110, 1050, 610);
        minimized4.setBounds(1286, 15, 20, 20);
        close2.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_Menu2MouseClicked

    private void Menu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu12MouseClicked
        Menu12.setVisible(false);
        Menu12.setEnabled(false);
        Menu2.setVisible(true);
        Menu2.setEnabled(true);
        resetPanel(KamarSideBar);
        judul2.setBounds(445, 10, 260, 90);
        ScrollData2.setBounds(50, 110, 1050, 610);
        minimized4.setBounds(1080, 15, 20, 20);
        close2.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_Menu12MouseClicked

    private void minimized4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized4ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized4ActionPerformed

    private void close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close2ActionPerformed

    private void Menu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu13MouseClicked
        Menu13.setVisible(false);
        Menu13.setEnabled(false);
        Menu7.setVisible(true);
        Menu7.setEnabled(true);
        resetPanel(LaporanSidebar);
        judul6.setBounds(445, 10, 260, 90);
        Data_Pelanggan.setBounds(110, 200, 200, 270);
        Data_Admin.setBounds(360, 200, 200, 270);
        Data_Pemesanan.setBounds(610, 200, 200, 270);
        Data_Pembayaran.setBounds(850, 200, 200, 270);
        minimized3.setBounds(1080, 15, 20, 20);
        close6.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_Menu13MouseClicked

    private void Menu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu9MouseClicked
        Menu9.setVisible(false);
        Menu9.setEnabled(false);
        Menu8.setVisible(true);
        Menu8.setEnabled(true);
        resetPanel(PengaturanSideBar);
        judul7.setBounds(445, 10, 260, 90);
        Data_EPelanggan.setBounds(240, 200, 200, 270);
        Data_EUser.setBounds(490, 200, 200, 270);
        Data_EKamar.setBounds(740, 200, 200, 270);
        minimized7.setBounds(1080, 15, 20, 20);
        close7.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_Menu9MouseClicked

    private void MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukActionPerformed
        //        Beranda f3 = new Beranda();
        //        f3.setVisible(true);
        //new Beranda().show();
        this.setVisible(false);
    }//GEN-LAST:event_MasukActionPerformed

    private void nm_lengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nm_lengkapActionPerformed


    }//GEN-LAST:event_nm_lengkapActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jLabel82MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseEntered
        setIconPanelButton3(icoPemesanan2);

    }//GEN-LAST:event_jLabel82MouseEntered

    private void jLabel82MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseExited
        resetIconPanelButton3(icoPemesanan2);
    }//GEN-LAST:event_jLabel82MouseExited

    private void minimized9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimized9ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimized9ActionPerformed

    private void close5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close5ActionPerformed

    private void Opsi_PerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opsi_PerempuanActionPerformed

    }//GEN-LAST:event_Opsi_PerempuanActionPerformed

    private void txtKTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKTPActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        try {
        String id_user, id_cust, username, noktp, nama, jeniskelamin, alamat, nohppribadi, nohpdarurat, password, akses;
        id_cust = txtCust.getText();
        id_user = txtUser.getText();
        username = txtUsername.getText();
        password = txtPass.getText();
        noktp = txtKTP.getText();
        nama = txtNama.getText();
        jeniskelamin = null;
        if (Opsi_Laki.isSelected()) {
            jeniskelamin = "Laki-laki";
        } else if (Opsi_Perempuan.isSelected()) {
            jeniskelamin = "Perempuan";
        }

        alamat = txtAlmt.getText();
        nohppribadi = txtNoHp.getText();
        nohpdarurat = txtNoHPDarurat.getText();

        akses = (String) cmbAkses.getSelectedItem();

        ConnectDB konek = new ConnectDB();
        konek.insertDB(id_cust, noktp, nama, jeniskelamin, alamat, nohppribadi, nohpdarurat);
        konek.insertDB(id_user, username, password, akses);
        
        JOptionPane.showMessageDialog(rootPane, "Sukses");
        resetForm();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(rootPane, "Error");
            System.out.println(e.getMessage());
        }
        showTables();
    }//GEN-LAST:event_SimpanActionPerformed

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        InputDataPelanggan.setVisible(true);
        InputDataPelanggan.setEnabled(true);
        BerandaSideBar.setVisible(false);
        BerandaSideBar.setEnabled(false);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);
        LaporanSidebar.setVisible(false);
        LaporanSidebar.setEnabled(false);
        PengaturanSideBar.setVisible(false);
        PengaturanSideBar.setEnabled(false);
    }//GEN-LAST:event_jLabel86MouseClicked

    private void Menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MouseClicked
        Menu3.setVisible(false);
        Menu3.setEnabled(false);
        Menu14.setVisible(true);
        Menu14.setEnabled(true);
        setPanel(InputDataPelanggan);
        judul5.setBounds(545, 10, 260, 90);
        form1.setBounds(154, 110, 1050, 610);
        Lbl_IdUser.setBounds(1000, 90, 35, 15);
        txtUser.setBounds(1040, 90, 50, 15);
        Lbl_IdCust.setBounds(1100, 90, 35, 15);
        txtCust.setBounds(1140, 90, 50, 15);
        minimized9.setBounds(1286, 15, 20, 20);
        close5.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_Menu3MouseClicked

    private void Menu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu14MouseClicked
        Menu14.setVisible(false);
        Menu14.setEnabled(false);
        Menu3.setVisible(true);
        Menu3.setEnabled(true);
        resetPanel(InputDataPelanggan);
        judul5.setBounds(445, 10, 260, 90);
        form1.setBounds(50, 110, 1050, 610);
        Lbl_IdUser.setBounds(900, 90, 35, 15);
        txtUser.setBounds(940, 90, 50, 15);
        Lbl_IdCust.setBounds(1000, 90, 35, 15);
        txtCust.setBounds(1040, 90, 50, 15);
        minimized9.setBounds(1080, 15, 20, 20);
        close5.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_Menu14MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        PengaturanSideBar.setVisible(true);
        PengaturanSideBar.setEnabled(true);
        BerandaSideBar.setVisible(false);
        BerandaSideBar.setEnabled(false);
        KamarSideBar.setVisible(false);
        KamarSideBar.setEnabled(false);
        PemesananSideBar.setVisible(false);
        PemesananSideBar.setEnabled(false);
        LaporanSidebar.setVisible(false);
        LaporanSidebar.setEnabled(false);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void HideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HideActionPerformed
        Show.setVisible(true);
        Show.setEnabled(true);
        txtPass.setEchoChar((char) 0);
        Hide.setVisible(false);
        Hide.setEnabled(false);
    }//GEN-LAST:event_HideActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        Hide.setVisible(true);
        Hide.setEnabled(true);
        txtPass.setEchoChar((char) 8226);
        Show.setVisible(false);
        Show.setEnabled(false);
    }//GEN-LAST:event_ShowActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
//        DefaultTableModel tbl = new DefaultTableModel();
//        tbl.addColumn("NIM");
//        tbl.addColumn("NAMA");
//        tbl.addColumn("JURUSAN");
//        tbl.addColumn("JENIS KELAMIN");
//        tbl.addColumn("ALAMAT");
//        tabel.setModel(tbl);
//
//        try {
//            Statement st = (Statement) koneksiDB.getkoneksi().createStatement();
//            ResultSet rs = st.executeQuery("select * from tabmahasiswa where nim LIKE '%" + txtCari.getText()
//                + "%' OR nama LIKE '%" + txtCari.getText() + "%'");
//
//            while (rs.next()) {
//                tbl.addRow(new Object[]{
//                    rs.getString("nim"),
//                    rs.getString("nama"),
//                    rs.getString("jurusan"),
//                    rs.getString("jeniskelamin"),
//                    rs.getString("alamat")
//                });
//                tabel.setModel(tbl);
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(rootPane, "Error !!!");
//            //            Logger.getLogger(DataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
//        try {
//            JFileChooser jfc = new JFileChooser();
//            jfc.showOpenDialog(null);
//            File f = jfc.getSelectedFile();
//            if (f.length() > 2097152) {
//                JOptionPane.showMessageDialog(rootPane, "Ukuran terlalu besar");
//            } else {
//
//                filename = f.getAbsolutePath();
//                ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(Lbl_image.getWidth(), Lbl_image.getHeight(), Image.SCALE_SMOOTH));
//                Lbl_image.setIcon(imageicon);
//
//                txtNamaFoto.setText(f.getName());
//            }
//
//            File image = new File(filename);
//            FileInputStream fis = new FileInputStream(image);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            byte[] buf = new byte[1024];
//            for (int readNum; (readNum = fis.read(buf)) != -1;) {
//                bos.write(buf, 0, readNum);
//            }
//            photo = bos.toByteArray();
//        } catch (Exception e) {
//
//        }
    }//GEN-LAST:event_browseActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int row = tabel.getSelectedRow();
        txtUsername.setText(tabel.getValueAt(row, 1).toString());
        txtPass.setText(tabel.getValueAt(row, 2).toString());
        txtKTP.setText(tabel.getValueAt(row, 3).toString());
        txtNama.setText(tabel.getValueAt(row, 4).toString());
        if (tabel.getValueAt(row, 4).equals("Laki-laki")) {
            jRadioButton1.setSelected(true);
        } else if (tabel.getValueAt(row, 4).equals("Perempuan")) {
            jRadioButton2.setSelected(true);
        }
        txtAlamat.setText(tabel.getValueAt(row, 5).toString());
        txtNoHp.setText(tabel.getValueAt(row, 6).toString());
        txtNoHPDarurat.setText(tabel.getValueAt(row, 7).toString());
//        try {
//
//            String sql = "select * from tabmahasiswa where nim='" + txtNIM.getText() + "'";
//            Statement st = (Statement) koneksiDB.getkoneksi().createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            rs.next();
//            byte[] img = rs.getBytes("photo");
//            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(Lbl_image.getWidth(), Lbl_image.getHeight(), Image.SCALE_SMOOTH));
//            Lbl_image.setIcon(imageIcon);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
    }//GEN-LAST:event_tabelMouseClicked

    private void Simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Simpan1ActionPerformed

    private void Simpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Simpan2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BerandaSideBar;
    private javax.swing.JPanel Bg;
    private javax.swing.JButton CekButton6;
    private javax.swing.JPanel Data_Admin;
    private javax.swing.JPanel Data_EKamar;
    private javax.swing.JPanel Data_EPelanggan;
    private javax.swing.JPanel Data_EUser;
    private javax.swing.JPanel Data_Pelanggan;
    private javax.swing.JPanel Data_Pembayaran;
    private javax.swing.JPanel Data_Pemesanan;
    private javax.swing.JButton Hide;
    private javax.swing.JPanel InputDataPelanggan;
    private javax.swing.JLabel Kamar3;
    private javax.swing.JLabel Kamar4;
    private javax.swing.JPanel KamarSideBar;
    private javax.swing.JPanel LaporanSidebar;
    private javax.swing.JLabel Lbl_Alamat;
    private javax.swing.JLabel Lbl_Cari;
    private javax.swing.JLabel Lbl_Data;
    private javax.swing.JLabel Lbl_HakAkses;
    private javax.swing.JLabel Lbl_IdCust;
    private javax.swing.JLabel Lbl_IdUser;
    private javax.swing.JLabel Lbl_Jkl;
    private javax.swing.JLabel Lbl_KTP;
    private javax.swing.JLabel Lbl_Nama;
    private javax.swing.JLabel Lbl_NoHP;
    private javax.swing.JLabel Lbl_NoHPDarurat;
    private javax.swing.JLabel Lbl_Pass;
    private javax.swing.JLabel Lbl_Username;
    private javax.swing.JLabel Lbl_beranda;
    private javax.swing.JLabel Lbl_kamar;
    private javax.swing.JLabel Lbl_laporan;
    private javax.swing.JLabel Lbl_pemesanan;
    private javax.swing.JLabel Lbl_pengaturan;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JToggleButton Masuk;
    private javax.swing.JLabel Menu1;
    private javax.swing.JLabel Menu10;
    private javax.swing.JLabel Menu11;
    private javax.swing.JLabel Menu12;
    private javax.swing.JLabel Menu13;
    private javax.swing.JLabel Menu14;
    private javax.swing.JLabel Menu2;
    private javax.swing.JLabel Menu3;
    private javax.swing.JLabel Menu5;
    private javax.swing.JLabel Menu7;
    private javax.swing.JLabel Menu8;
    private javax.swing.JLabel Menu9;
    public static final javax.swing.JLabel NamaUser1 = new javax.swing.JLabel();
    private javax.swing.JRadioButton Opsi_Laki;
    private javax.swing.JRadioButton Opsi_Perempuan;
    private javax.swing.JPanel PanelChat;
    private javax.swing.JPanel PanelKamar;
    private javax.swing.JPanel PemesananSideBar;
    private javax.swing.JPanel PengaturanSideBar;
    private javax.swing.JScrollPane ScrollData;
    private javax.swing.JScrollPane ScrollData2;
    private javax.swing.JScrollPane ScrollForm;
    private javax.swing.JButton Show;
    private javax.swing.JPanel SideBarMenu;
    private javax.swing.JToggleButton Simpan;
    private javax.swing.JToggleButton Simpan1;
    private javax.swing.JToggleButton Simpan2;
    private javax.swing.JLabel Slide1;
    private javax.swing.JLabel Text2;
    private javax.swing.JPanel beranda;
    private javax.swing.JToggleButton browse;
    private javax.swing.JPanel button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton chatBx;
    private javax.swing.JButton close1;
    private javax.swing.JButton close2;
    private javax.swing.JButton close4;
    private javax.swing.JButton close5;
    private javax.swing.JButton close6;
    private javax.swing.JButton close7;
    private javax.swing.JComboBox<String> cmbAkses;
    private javax.swing.JPanel form;
    private javax.swing.JPanel form1;
    private javax.swing.JLabel foto;
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
    private javax.swing.JLabel icoAdmin;
    private javax.swing.JLabel icoAdmin2;
    private javax.swing.JLabel icoPay;
    private javax.swing.JLabel icoPelanggan;
    private javax.swing.JLabel icoPelanggan2;
    private javax.swing.JLabel icoPemesanan;
    private javax.swing.JLabel icoPemesanan2;
    private javax.swing.JLabel ico_beranda;
    private javax.swing.JLabel ico_kamar;
    private javax.swing.JLabel ico_laporan;
    private javax.swing.JLabel ico_pemesanan;
    private javax.swing.JLabel ico_pengaturan;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul4;
    private javax.swing.JLabel judul5;
    private javax.swing.JLabel judul6;
    private javax.swing.JLabel judul7;
    private javax.swing.JPanel kamar;
    private javax.swing.JPanel laporan;
    private javax.swing.JButton minimized2;
    private javax.swing.JButton minimized3;
    private javax.swing.JButton minimized4;
    private javax.swing.JButton minimized7;
    private javax.swing.JButton minimized8;
    private javax.swing.JButton minimized9;
    public static final javax.swing.JTextField nm_lengkap = new javax.swing.JTextField();
    private javax.swing.JPanel pemesanan;
    private javax.swing.JPanel pengaturan;
    private javax.swing.JTable tabel;
    private com.toedter.calendar.JDateChooser tgl_masuk;
    public static final javax.swing.JTextField txtAlamat = new javax.swing.JTextField();
    private javax.swing.JTextArea txtAlmt;
    private javax.swing.JTextField txtBooking;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCust;
    public static final javax.swing.JTextField txtJenisKelamin = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtKTP = new javax.swing.JTextField();
    private javax.swing.JTextField txtKodeBayar;
    private javax.swing.JTextField txtLokasiKamar;
    public static final javax.swing.JTextField txtNama = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtNoDarurat = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtNoHP = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtNoHPDarurat = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtNoHp = new javax.swing.JTextField();
    private javax.swing.JTextField txtNoKTP;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JTextField txtPath;
    private javax.swing.JTextField txtTipeKamar;
    private javax.swing.JTextField txtTotaBayar;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
