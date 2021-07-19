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
        tbl.addColumn("NO.KTP");
        tbl.addColumn("NAMA LENGKAP");
        tbl.addColumn("JENIS KELAMIN");
        tbl.addColumn("ALAMAT");
        tbl.addColumn("NO.HP");
        tbl.addColumn("NO.DARURAT");
        tbl.addColumn("ID LOGIN");
        tbl.addColumn("USERNAME");
        tbl.addColumn("PASSWORD");
        tbl.addColumn("HAK AKSES");


 
        tabel.setModel(tbl);

        try {
            ConnectDB konek = new ConnectDB();
            ResultSet rs = konek.slctDB();
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("id_cust"),
                    rs.getString("NoKTP"),
                    rs.getString("NamaLengkap"),
                    rs.getString("JenisKelamin"),
                    rs.getString("Alamat"),
                    rs.getString("NoHpPribadi"),
                    rs.getString("NoHpDarurat"),
                    rs.getString("id_user"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("akses")
                });
                tabel.setModel(tbl);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
//            Logger.getLogger(DataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public void showTableKamar() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Cust");
        tbl.addColumn("NO.KTP");
        tbl.addColumn("NAMA LENGKAP");
        tbl.addColumn("JENIS KELAMIN");
        tbl.addColumn("ALAMAT");
        tbl.addColumn("NO.HP");
        tbl.addColumn("NO.DARURAT");
        tbl.addColumn("ID LOGIN");
        tbl.addColumn("USERNAME");
        tbl.addColumn("PASSWORD");
        tbl.addColumn("HAK AKSES");


 
        tabel.setModel(tbl);

        try {
            ConnectDB konek = new ConnectDB();
            ResultSet rs = konek.slctDB();
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("id_cust"),
                    rs.getString("NoKTP"),
                    rs.getString("NamaLengkap"),
                    rs.getString("JenisKelamin"),
                    rs.getString("Alamat"),
                    rs.getString("NoHpPribadi"),
                    rs.getString("NoHpDarurat"),
                    rs.getString("id_user"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("akses")
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
        if (bttn_Opsi_Laki.isSelected()) {
            jeniskelamin = "Laki-laki";
        } else if (bttn_Opsi_Perempuan.isSelected()) {
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
        lbl_Menu1 = new javax.swing.JLabel();
        lbl_Menu11 = new javax.swing.JLabel();
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
        lbl_tekschat = new javax.swing.JLabel();
        lbl_ikonWA = new javax.swing.JLabel();
        chatBx = new javax.swing.JToggleButton();
        KamarSideBar = new javax.swing.JPanel();
        lbl_Menu2 = new javax.swing.JLabel();
        lbl_Menu12 = new javax.swing.JLabel();
        bttn_minimized4 = new javax.swing.JButton();
        bttn_close2 = new javax.swing.JButton();
        lbl_judul2 = new javax.swing.JLabel();
        ScrollData2 = new javax.swing.JScrollPane();
        PanelKamar = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl_jk1no7 = new javax.swing.JLabel();
        lbl_jk1no8 = new javax.swing.JLabel();
        lbl_jk1no6 = new javax.swing.JLabel();
        lbl_jk1no5 = new javax.swing.JLabel();
        lbl_jk1no4 = new javax.swing.JLabel();
        lbl_jk1no3 = new javax.swing.JLabel();
        lbl_jk1no1 = new javax.swing.JLabel();
        lbl_jk1no2 = new javax.swing.JLabel();
        lbl_kk1no4 = new javax.swing.JLabel();
        lbl_kk1no8 = new javax.swing.JLabel();
        lbl_kk1no2 = new javax.swing.JLabel();
        lbl_kk1no3 = new javax.swing.JLabel();
        lbl_kk1no1 = new javax.swing.JLabel();
        lbl_kk1no5 = new javax.swing.JLabel();
        lbl_kk1no6 = new javax.swing.JLabel();
        lbl_kk1no7 = new javax.swing.JLabel();
        PemesananSideBar = new javax.swing.JPanel();
        lbl_Menu5 = new javax.swing.JLabel();
        lbl_Menu10 = new javax.swing.JLabel();
        bttn_minimized8 = new javax.swing.JButton();
        bttn_close4 = new javax.swing.JButton();
        lbl_judul4 = new javax.swing.JLabel();
        bttn_CekButton6 = new javax.swing.JButton();
        form = new javax.swing.JPanel();
        lbl_judul = new javax.swing.JLabel();
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
        lbl_besar = new javax.swing.JLabel();
        LaporanSidebar = new javax.swing.JPanel();
        lbl_Menu7 = new javax.swing.JLabel();
        lbl_Menu13 = new javax.swing.JLabel();
        bttn_minimized3 = new javax.swing.JButton();
        bttn_close6 = new javax.swing.JButton();
        lbl_judul6 = new javax.swing.JLabel();
        Data_Pelanggan = new javax.swing.JPanel();
        lbl_icoPelanggan = new javax.swing.JLabel();
        lbl_dpelanggan = new javax.swing.JLabel();
        lbl_kpelanggan = new javax.swing.JLabel();
        Data_Admin = new javax.swing.JPanel();
        lbl_icoAdmin = new javax.swing.JLabel();
        lbl_dadmin = new javax.swing.JLabel();
        lbl_kadmin = new javax.swing.JLabel();
        Data_Pemesanan = new javax.swing.JPanel();
        lbl_icoPemesanan = new javax.swing.JLabel();
        lbl_dpesan = new javax.swing.JLabel();
        lbl_kpesan = new javax.swing.JLabel();
        Data_Pembayaran = new javax.swing.JPanel();
        lbl_icoPay = new javax.swing.JLabel();
        lbl_dbayar = new javax.swing.JLabel();
        lbl_kbayar = new javax.swing.JLabel();
        PengaturanSideBar = new javax.swing.JPanel();
        lbl_Menu8 = new javax.swing.JLabel();
        lbl_Menu9 = new javax.swing.JLabel();
        bttn_minimized7 = new javax.swing.JButton();
        bttn_close7 = new javax.swing.JButton();
        lbl_judul7 = new javax.swing.JLabel();
        Data_EPelanggan = new javax.swing.JPanel();
        lbl_icoPelanggan2 = new javax.swing.JLabel();
        lbl_dpelanggan2 = new javax.swing.JLabel();
        lbl_input1 = new javax.swing.JLabel();
        lbl_kpelanggan2 = new javax.swing.JLabel();
        Data_EUser = new javax.swing.JPanel();
        lbl_input2 = new javax.swing.JLabel();
        lbl_duser = new javax.swing.JLabel();
        lbl_icoAdmin2 = new javax.swing.JLabel();
        lbl_kuser = new javax.swing.JLabel();
        Data_EKamar = new javax.swing.JPanel();
        lbl_input3 = new javax.swing.JLabel();
        lbl_dkamar = new javax.swing.JLabel();
        lbl_icoPemesanan2 = new javax.swing.JLabel();
        lbl_spasi = new javax.swing.JLabel();
        lbl_kkamar = new javax.swing.JLabel();
        SideBarMenu = new javax.swing.JPanel();
        lbl_photos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_menu = new javax.swing.JLabel();
        beranda = new javax.swing.JPanel();
        ico_beranda = new javax.swing.JLabel();
        Lbl_beranda = new javax.swing.JLabel();
        kamar = new javax.swing.JPanel();
        ico_kamar = new javax.swing.JLabel();
        Lbl_kamar = new javax.swing.JLabel();
        pemesanan = new javax.swing.JPanel();
        ico_pemesanan = new javax.swing.JLabel();
        Lbl_pemesanan = new javax.swing.JLabel();
        bttn_Logout = new javax.swing.JToggleButton();
        laporan = new javax.swing.JPanel();
        ico_laporan = new javax.swing.JLabel();
        Lbl_laporan = new javax.swing.JLabel();
        pengaturan = new javax.swing.JPanel();
        ico_pengaturan = new javax.swing.JLabel();
        Lbl_pengaturan = new javax.swing.JLabel();
        InputDataPelanggan = new javax.swing.JPanel();
        lbl_Menu3 = new javax.swing.JLabel();
        lbl_Menu14 = new javax.swing.JLabel();
        bttn_minimized9 = new javax.swing.JButton();
        bttn_close5 = new javax.swing.JButton();
        lbl_judul5 = new javax.swing.JLabel();
        Lbl_IdUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        Lbl_IdCust = new javax.swing.JLabel();
        txtCust = new javax.swing.JTextField();
        form1 = new javax.swing.JPanel();
        lbl_datapelanggan = new javax.swing.JLabel();
        lbl_back = new javax.swing.JLabel();
        ScrollForm = new javax.swing.JScrollPane();
        panelPelanggan = new javax.swing.JPanel();
        Lbl_Username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        Lbl_Pass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        bttn_Hide2 = new javax.swing.JButton();
        bttn_Show2 = new javax.swing.JButton();
        txtPass1 = new javax.swing.JPasswordField();
        Lbl_KTP = new javax.swing.JLabel();
        Lbl_Nama = new javax.swing.JLabel();
        Lbl_Jkl = new javax.swing.JLabel();
        bttn_Opsi_Laki = new javax.swing.JRadioButton();
        bttn_Opsi_Perempuan = new javax.swing.JRadioButton();
        Lbl_Alamat = new javax.swing.JLabel();
        Lbl_NoHP = new javax.swing.JLabel();
        Lbl_NoHPDarurat = new javax.swing.JLabel();
        Lbl_HakAkses = new javax.swing.JLabel();
        cmbAkses = new javax.swing.JComboBox<>();
        edit = new javax.swing.JToggleButton();
        hapus = new javax.swing.JToggleButton();
        Simpan = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlmt = new javax.swing.JTextArea();
        Lbl_Data = new javax.swing.JLabel();
        lbl_foto = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        browse = new javax.swing.JToggleButton();
        Lbl_Cari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        InputDataKamar = new javax.swing.JPanel();
        lbl_Menu4 = new javax.swing.JLabel();
        lbl_Menu15 = new javax.swing.JLabel();
        bttn_minimized10 = new javax.swing.JButton();
        bttn_close8 = new javax.swing.JButton();
        lbl_judul8 = new javax.swing.JLabel();
        Lbl_IdUser1 = new javax.swing.JLabel();
        txtUser1 = new javax.swing.JTextField();
        Lbl_IdCust1 = new javax.swing.JLabel();
        txtCust1 = new javax.swing.JTextField();
        form2 = new javax.swing.JPanel();
        lbl_datapelanggan1 = new javax.swing.JLabel();
        lbl_back1 = new javax.swing.JLabel();
        ScrollForm1 = new javax.swing.JScrollPane();
        panelKamar = new javax.swing.JPanel();
        Lbl_jeniskamar = new javax.swing.JLabel();
        Lbl_lokasikamar = new javax.swing.JLabel();
        Lbl_uploadpapkmr = new javax.swing.JLabel();
        Lbl_fasilitas = new javax.swing.JLabel();
        Lbl_HakAkses1 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JToggleButton();
        btnHapus = new javax.swing.JToggleButton();
        btnSimpan = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtFasilitas = new javax.swing.JTextArea();
        Lbl_Data1 = new javax.swing.JLabel();
        lbl_fotopreview = new javax.swing.JLabel();
        txtPath1 = new javax.swing.JTextField();
        browse1 = new javax.swing.JToggleButton();
        Lbl_Cari1 = new javax.swing.JLabel();
        txtCari1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelKamar = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        Lk_bawah = new javax.swing.JRadioButton();
        Jk_kamar01 = new javax.swing.JRadioButton();
        Jk_kamar02 = new javax.swing.JRadioButton();
        Lk_atas = new javax.swing.JRadioButton();
        Lbl_ukurankamar = new javax.swing.JLabel();
        btnPilihFile = new javax.swing.JButton();
        lbl_foto2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

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

        lbl_Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu1MouseClicked(evt);
            }
        });
        BerandaSideBar.add(lbl_Menu1);
        lbl_Menu1.setBounds(10, 10, 34, 30);

        lbl_Menu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu11MouseClicked(evt);
            }
        });
        BerandaSideBar.add(lbl_Menu11);
        lbl_Menu11.setBounds(10, 10, 34, 30);

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

        lbl_tekschat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_tekschat.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tekschat.setText("Chat Sekarang!");
        PanelChat.add(lbl_tekschat);
        lbl_tekschat.setBounds(60, 27, 140, 20);

        lbl_ikonWA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/icoWaP.png"))); // NOI18N
        PanelChat.add(lbl_ikonWA);
        lbl_ikonWA.setBounds(20, 22, 30, 30);

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

        lbl_Menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu2MouseClicked(evt);
            }
        });
        KamarSideBar.add(lbl_Menu2);
        lbl_Menu2.setBounds(10, 10, 34, 30);

        lbl_Menu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu12MouseClicked(evt);
            }
        });
        KamarSideBar.add(lbl_Menu12);
        lbl_Menu12.setBounds(10, 10, 34, 30);

        bttn_minimized4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        bttn_minimized4.setBorder(null);
        bttn_minimized4.setBorderPainted(false);
        bttn_minimized4.setContentAreaFilled(false);
        bttn_minimized4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_minimized4.setFocusPainted(false);
        bttn_minimized4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_minimized4ActionPerformed(evt);
            }
        });
        KamarSideBar.add(bttn_minimized4);
        bttn_minimized4.setBounds(1080, 15, 20, 20);

        bttn_close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        bttn_close2.setBorder(null);
        bttn_close2.setBorderPainted(false);
        bttn_close2.setContentAreaFilled(false);
        bttn_close2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_close2.setFocusPainted(false);
        bttn_close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_close2ActionPerformed(evt);
            }
        });
        KamarSideBar.add(bttn_close2);
        bttn_close2.setBounds(1110, 10, 20, 20);

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

        lbl_jk1no7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_jk1no7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jk1no7.setText("Kamar 1");
        PanelKamar.add(lbl_jk1no7, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 378, -1, -1));

        lbl_jk1no8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_jk1no8.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jk1no8.setText("Kamar 1");
        PanelKamar.add(lbl_jk1no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 378, -1, -1));

        lbl_jk1no6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_jk1no6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jk1no6.setText("Kamar 1");
        PanelKamar.add(lbl_jk1no6, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 378, -1, -1));

        lbl_jk1no5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_jk1no5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jk1no5.setText("Kamar 1");
        PanelKamar.add(lbl_jk1no5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 378, -1, -1));

        lbl_jk1no4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_jk1no4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jk1no4.setText("Kamar 1");
        PanelKamar.add(lbl_jk1no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 138, -1, -1));

        lbl_jk1no3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_jk1no3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jk1no3.setText("Kamar 1");
        PanelKamar.add(lbl_jk1no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 138, -1, -1));

        lbl_jk1no1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_jk1no1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jk1no1.setText("Kamar 1");
        PanelKamar.add(lbl_jk1no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 138, -1, -1));

        lbl_jk1no2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_jk1no2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jk1no2.setText("Kamar 1");
        PanelKamar.add(lbl_jk1no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 138, -1, -1));

        lbl_kk1no4.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kk1no4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(lbl_kk1no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 180, 240));

        lbl_kk1no8.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kk1no8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(lbl_kk1no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 180, 240));

        lbl_kk1no2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kk1no2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(lbl_kk1no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 180, 240));

        lbl_kk1no3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kk1no3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(lbl_kk1no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 180, 240));

        lbl_kk1no1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kk1no1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(lbl_kk1no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 240));

        lbl_kk1no5.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kk1no5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(lbl_kk1no5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, 240));

        lbl_kk1no6.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kk1no6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(lbl_kk1no6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 180, 240));

        lbl_kk1no7.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kk1no7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/123.png"))); // NOI18N
        PanelKamar.add(lbl_kk1no7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 180, 240));

        ScrollData2.setViewportView(PanelKamar);

        KamarSideBar.add(ScrollData2);
        ScrollData2.setBounds(50, 110, 1050, 610);

        Bg.add(KamarSideBar);
        KamarSideBar.setBounds(206, 0, 1160, 768);

        PemesananSideBar.setBackground(new java.awt.Color(242, 242, 242));
        PemesananSideBar.setMinimumSize(new java.awt.Dimension(1160, 768));
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

        lbl_Menu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu10MouseClicked(evt);
            }
        });
        PemesananSideBar.add(lbl_Menu10);
        lbl_Menu10.setBounds(10, 10, 34, 30);

        bttn_minimized8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        bttn_minimized8.setBorder(null);
        bttn_minimized8.setBorderPainted(false);
        bttn_minimized8.setContentAreaFilled(false);
        bttn_minimized8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_minimized8.setFocusPainted(false);
        bttn_minimized8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_minimized8ActionPerformed(evt);
            }
        });
        PemesananSideBar.add(bttn_minimized8);
        bttn_minimized8.setBounds(1080, 15, 20, 20);

        bttn_close4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        bttn_close4.setBorder(null);
        bttn_close4.setBorderPainted(false);
        bttn_close4.setContentAreaFilled(false);
        bttn_close4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_close4.setFocusPainted(false);
        bttn_close4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_close4ActionPerformed(evt);
            }
        });
        PemesananSideBar.add(bttn_close4);
        bttn_close4.setBounds(1110, 10, 20, 20);

        lbl_judul4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        PemesananSideBar.add(lbl_judul4);
        lbl_judul4.setBounds(445, 10, 260, 90);

        bttn_CekButton6.setBorder(null);
        bttn_CekButton6.setBorderPainted(false);
        bttn_CekButton6.setContentAreaFilled(false);
        bttn_CekButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_CekButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_CekButton6ActionPerformed(evt);
            }
        });
        PemesananSideBar.add(bttn_CekButton6);
        bttn_CekButton6.setBounds(390, 660, 61, 23);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setOpaque(false);
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_judul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_judul.setForeground(new java.awt.Color(96, 82, 76));
        lbl_judul.setText("Formulir Pemesanan Kamar");
        form.add(lbl_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

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

        lbl_besar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Edge.png"))); // NOI18N
        form.add(lbl_besar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 610));

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

        lbl_Menu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu7MouseClicked(evt);
            }
        });
        LaporanSidebar.add(lbl_Menu7);
        lbl_Menu7.setBounds(10, 10, 34, 30);

        lbl_Menu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu13MouseClicked(evt);
            }
        });
        LaporanSidebar.add(lbl_Menu13);
        lbl_Menu13.setBounds(10, 10, 34, 30);

        bttn_minimized3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        bttn_minimized3.setBorder(null);
        bttn_minimized3.setBorderPainted(false);
        bttn_minimized3.setContentAreaFilled(false);
        bttn_minimized3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_minimized3.setFocusPainted(false);
        bttn_minimized3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_minimized3ActionPerformed(evt);
            }
        });
        LaporanSidebar.add(bttn_minimized3);
        bttn_minimized3.setBounds(1080, 15, 20, 20);

        bttn_close6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        bttn_close6.setBorder(null);
        bttn_close6.setBorderPainted(false);
        bttn_close6.setContentAreaFilled(false);
        bttn_close6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_close6.setFocusPainted(false);
        bttn_close6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_close6ActionPerformed(evt);
            }
        });
        LaporanSidebar.add(bttn_close6);
        bttn_close6.setBounds(1110, 10, 20, 20);

        lbl_judul6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        LaporanSidebar.add(lbl_judul6);
        lbl_judul6.setBounds(445, 10, 260, 90);

        Data_Pelanggan.setBackground(new java.awt.Color(255, 255, 255));
        Data_Pelanggan.setOpaque(false);
        Data_Pelanggan.setLayout(null);

        lbl_icoPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPelanggan.png"))); // NOI18N
        Data_Pelanggan.add(lbl_icoPelanggan);
        lbl_icoPelanggan.setBounds(43, 70, 130, 130);

        lbl_dpelanggan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dpelanggan.setForeground(new java.awt.Color(96, 82, 76));
        lbl_dpelanggan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dpelanggan.setText("Data Pelanggan");
        Data_Pelanggan.add(lbl_dpelanggan);
        lbl_dpelanggan.setBounds(12, 230, 180, 20);

        lbl_kpelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        lbl_kpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_kpelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_kpelangganMouseExited(evt);
            }
        });
        Data_Pelanggan.add(lbl_kpelanggan);
        lbl_kpelanggan.setBounds(0, 20, 204, 254);

        LaporanSidebar.add(Data_Pelanggan);
        Data_Pelanggan.setBounds(110, 200, 200, 270);

        Data_Admin.setBackground(new java.awt.Color(255, 255, 255));
        Data_Admin.setOpaque(false);
        Data_Admin.setLayout(null);

        lbl_icoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataAdmin.png"))); // NOI18N
        Data_Admin.add(lbl_icoAdmin);
        lbl_icoAdmin.setBounds(40, 70, 130, 130);

        lbl_dadmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dadmin.setForeground(new java.awt.Color(96, 82, 76));
        lbl_dadmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dadmin.setText("Data Admin");
        Data_Admin.add(lbl_dadmin);
        lbl_dadmin.setBounds(12, 230, 180, 20);

        lbl_kadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        lbl_kadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_kadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_kadminMouseExited(evt);
            }
        });
        Data_Admin.add(lbl_kadmin);
        lbl_kadmin.setBounds(0, 20, 204, 254);

        LaporanSidebar.add(Data_Admin);
        Data_Admin.setBounds(360, 200, 200, 270);

        Data_Pemesanan.setBackground(new java.awt.Color(255, 255, 255));
        Data_Pemesanan.setOpaque(false);
        Data_Pemesanan.setLayout(null);

        lbl_icoPemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPemesanan.png"))); // NOI18N
        Data_Pemesanan.add(lbl_icoPemesanan);
        lbl_icoPemesanan.setBounds(40, 70, 130, 130);

        lbl_dpesan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dpesan.setForeground(new java.awt.Color(96, 82, 76));
        lbl_dpesan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dpesan.setText("Data Pemesanan");
        Data_Pemesanan.add(lbl_dpesan);
        lbl_dpesan.setBounds(12, 230, 180, 20);

        lbl_kpesan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        lbl_kpesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_kpesanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_kpesanMouseExited(evt);
            }
        });
        Data_Pemesanan.add(lbl_kpesan);
        lbl_kpesan.setBounds(0, 20, 204, 254);

        LaporanSidebar.add(Data_Pemesanan);
        Data_Pemesanan.setBounds(610, 200, 200, 270);

        Data_Pembayaran.setBackground(new java.awt.Color(255, 255, 255));
        Data_Pembayaran.setOpaque(false);
        Data_Pembayaran.setLayout(null);

        lbl_icoPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPembayaran.png"))); // NOI18N
        Data_Pembayaran.add(lbl_icoPay);
        lbl_icoPay.setBounds(40, 70, 130, 130);

        lbl_dbayar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dbayar.setForeground(new java.awt.Color(96, 82, 76));
        lbl_dbayar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dbayar.setText("Data Pembayaran");
        Data_Pembayaran.add(lbl_dbayar);
        lbl_dbayar.setBounds(12, 230, 180, 20);

        lbl_kbayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        lbl_kbayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_kbayarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_kbayarMouseExited(evt);
            }
        });
        Data_Pembayaran.add(lbl_kbayar);
        lbl_kbayar.setBounds(0, 20, 204, 254);

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

        lbl_Menu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu8MouseClicked(evt);
            }
        });
        PengaturanSideBar.add(lbl_Menu8);
        lbl_Menu8.setBounds(10, 10, 34, 30);

        lbl_Menu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu9MouseClicked(evt);
            }
        });
        PengaturanSideBar.add(lbl_Menu9);
        lbl_Menu9.setBounds(10, 10, 34, 30);

        bttn_minimized7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        bttn_minimized7.setBorder(null);
        bttn_minimized7.setBorderPainted(false);
        bttn_minimized7.setContentAreaFilled(false);
        bttn_minimized7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_minimized7.setFocusPainted(false);
        bttn_minimized7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_minimized7ActionPerformed(evt);
            }
        });
        PengaturanSideBar.add(bttn_minimized7);
        bttn_minimized7.setBounds(1080, 15, 20, 20);

        bttn_close7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        bttn_close7.setBorder(null);
        bttn_close7.setBorderPainted(false);
        bttn_close7.setContentAreaFilled(false);
        bttn_close7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_close7.setFocusPainted(false);
        bttn_close7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_close7ActionPerformed(evt);
            }
        });
        PengaturanSideBar.add(bttn_close7);
        bttn_close7.setBounds(1110, 10, 15, 20);

        lbl_judul7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        PengaturanSideBar.add(lbl_judul7);
        lbl_judul7.setBounds(445, 10, 260, 90);

        Data_EPelanggan.setBackground(new java.awt.Color(255, 255, 255));
        Data_EPelanggan.setOpaque(false);
        Data_EPelanggan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_icoPelanggan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPelanggan.png"))); // NOI18N
        Data_EPelanggan.add(lbl_icoPelanggan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 70, 130, 130));

        lbl_dpelanggan2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dpelanggan2.setForeground(new java.awt.Color(96, 82, 76));
        lbl_dpelanggan2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dpelanggan2.setText("Data Pelanggan");
        Data_EPelanggan.add(lbl_dpelanggan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, -1));

        lbl_input1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_input1.setForeground(new java.awt.Color(96, 82, 76));
        lbl_input1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_input1.setText("Input /Edit");
        Data_EPelanggan.add(lbl_input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));

        lbl_kpelanggan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        lbl_kpelanggan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_kpelanggan2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_kpelanggan2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_kpelanggan2MouseExited(evt);
            }
        });
        Data_EPelanggan.add(lbl_kpelanggan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        PengaturanSideBar.add(Data_EPelanggan);
        Data_EPelanggan.setBounds(240, 200, 200, 270);

        Data_EUser.setBackground(new java.awt.Color(255, 255, 255));
        Data_EUser.setOpaque(false);
        Data_EUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_input2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_input2.setForeground(new java.awt.Color(96, 82, 76));
        lbl_input2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_input2.setText("Input /Edit");
        Data_EUser.add(lbl_input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));

        lbl_duser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_duser.setForeground(new java.awt.Color(96, 82, 76));
        lbl_duser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_duser.setText("Data User");
        Data_EUser.add(lbl_duser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, -1));

        lbl_icoAdmin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataAdmin.png"))); // NOI18N
        Data_EUser.add(lbl_icoAdmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 130));

        lbl_kuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        lbl_kuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_kuserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_kuserMouseExited(evt);
            }
        });
        Data_EUser.add(lbl_kuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        PengaturanSideBar.add(Data_EUser);
        Data_EUser.setBounds(490, 200, 200, 270);

        Data_EKamar.setBackground(new java.awt.Color(255, 255, 255));
        Data_EKamar.setOpaque(false);
        Data_EKamar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_input3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_input3.setForeground(new java.awt.Color(96, 82, 76));
        lbl_input3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_input3.setText("Input/Edit");
        Data_EKamar.add(lbl_input3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));

        lbl_dkamar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dkamar.setForeground(new java.awt.Color(96, 82, 76));
        lbl_dkamar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dkamar.setText("Data Kamar");
        Data_EKamar.add(lbl_dkamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, -1));

        lbl_icoPemesanan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/dataPemesanan.png"))); // NOI18N
        Data_EKamar.add(lbl_icoPemesanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 130));

        lbl_spasi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_spasi.setForeground(new java.awt.Color(96, 82, 76));
        lbl_spasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Data_EKamar.add(lbl_spasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 230, 180, -1));

        lbl_kkamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/kotakLaporan.png"))); // NOI18N
        lbl_kkamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_kkamarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_kkamarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_kkamarMouseExited(evt);
            }
        });
        Data_EKamar.add(lbl_kkamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        PengaturanSideBar.add(Data_EKamar);
        Data_EKamar.setBounds(740, 200, 200, 270);

        Bg.add(PengaturanSideBar);
        PengaturanSideBar.setBounds(206, 0, 1160, 768);

        SideBarMenu.setBackground(new java.awt.Color(140, 120, 111));
        SideBarMenu.setMinimumSize(new java.awt.Dimension(210, 768));
        SideBarMenu.setPreferredSize(new java.awt.Dimension(210, 768));
        SideBarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_photos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/profileW.png"))); // NOI18N
        SideBarMenu.add(lbl_photos, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 30, 100, 100));

        jSeparator1.setBackground(new java.awt.Color(96, 82, 76));
        jSeparator1.setForeground(new java.awt.Color(96, 82, 76));
        SideBarMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 188, 210, -1));

        lbl_NamaUser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_NamaUser1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NamaUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NamaUser1.setText("admin");
        SideBarMenu.add(lbl_NamaUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 30));

        lbl_menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_menu.setForeground(new java.awt.Color(179, 166, 165));
        lbl_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_menu.setText("Menu");
        lbl_menu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SideBarMenu.add(lbl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

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

        bttn_Logout.setBackground(new java.awt.Color(96, 82, 76));
        bttn_Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_Logout.setForeground(new java.awt.Color(255, 255, 255));
        bttn_Logout.setText("Logout");
        bttn_Logout.setBorder(null);
        bttn_Logout.setBorderPainted(false);
        bttn_Logout.setContentAreaFilled(false);
        bttn_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_Logout.setFocusPainted(false);
        bttn_Logout.setOpaque(true);
        bttn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_LogoutActionPerformed(evt);
            }
        });
        SideBarMenu.add(bttn_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 700, 100, 40));

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

        lbl_Menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu3MouseClicked(evt);
            }
        });
        InputDataPelanggan.add(lbl_Menu3);
        lbl_Menu3.setBounds(10, 10, 34, 30);

        lbl_Menu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu14MouseClicked(evt);
            }
        });
        InputDataPelanggan.add(lbl_Menu14);
        lbl_Menu14.setBounds(10, 10, 34, 30);

        bttn_minimized9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        bttn_minimized9.setBorder(null);
        bttn_minimized9.setBorderPainted(false);
        bttn_minimized9.setContentAreaFilled(false);
        bttn_minimized9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_minimized9.setFocusPainted(false);
        bttn_minimized9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_minimized9ActionPerformed(evt);
            }
        });
        InputDataPelanggan.add(bttn_minimized9);
        bttn_minimized9.setBounds(1080, 15, 20, 20);

        bttn_close5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        bttn_close5.setBorder(null);
        bttn_close5.setBorderPainted(false);
        bttn_close5.setContentAreaFilled(false);
        bttn_close5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_close5.setFocusPainted(false);
        bttn_close5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_close5ActionPerformed(evt);
            }
        });
        InputDataPelanggan.add(bttn_close5);
        bttn_close5.setBounds(1110, 10, 20, 20);

        lbl_judul5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        InputDataPelanggan.add(lbl_judul5);
        lbl_judul5.setBounds(445, 10, 260, 90);

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

        lbl_datapelanggan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_datapelanggan.setForeground(new java.awt.Color(96, 82, 76));
        lbl_datapelanggan.setText("Data Pelanggan ");
        form1.add(lbl_datapelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 20, -1, -1));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/backIco.png"))); // NOI18N
        lbl_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
        });
        form1.add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, 20, 20));

        ScrollForm.setBackground(new java.awt.Color(255, 255, 255));
        ScrollForm.setBorder(null);
        ScrollForm.setOpaque(false);

        panelPelanggan.setBackground(new java.awt.Color(255, 255, 255));
        panelPelanggan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Username.setText("Username");
        panelPelanggan.add(Lbl_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 126, -1));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panelPelanggan.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 310, -1));

        Lbl_Pass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Pass.setText("Password");
        panelPelanggan.add(Lbl_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 126, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panelPelanggan.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 280, 30));

        bttn_Hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/hide_32px.png"))); // NOI18N
        bttn_Hide2.setBorder(null);
        bttn_Hide2.setBorderPainted(false);
        bttn_Hide2.setContentAreaFilled(false);
        bttn_Hide2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_Hide2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_Hide2ActionPerformed(evt);
            }
        });
        panelPelanggan.add(bttn_Hide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 76, 26, 18));

        bttn_Show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/show_32px.png"))); // NOI18N
        bttn_Show2.setBorder(null);
        bttn_Show2.setBorderPainted(false);
        bttn_Show2.setContentAreaFilled(false);
        bttn_Show2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_Show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_Show2ActionPerformed(evt);
            }
        });
        panelPelanggan.add(bttn_Show2, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 76, 26, 18));

        txtPass1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPass1.setEnabled(false);
        panelPelanggan.add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 310, 30));

        Lbl_KTP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_KTP.setText("No. KTP");
        panelPelanggan.add(Lbl_KTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 126, -1));

        txtKTP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtKTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKTPActionPerformed(evt);
            }
        });
        panelPelanggan.add(txtKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 310, -1));

        Lbl_Nama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Nama.setText("Nama Lengkap");
        panelPelanggan.add(Lbl_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 126, -1));

        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panelPelanggan.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 310, -1));

        Lbl_Jkl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Jkl.setText("Jenis Kelamin");
        panelPelanggan.add(Lbl_Jkl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 126, -1));

        bttn_Opsi_Laki.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bttn_Opsi_Laki);
        bttn_Opsi_Laki.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttn_Opsi_Laki.setText("Laki-laki");
        bttn_Opsi_Laki.setEnabled(false);
        bttn_Opsi_Laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_Opsi_LakiActionPerformed(evt);
            }
        });
        panelPelanggan.add(bttn_Opsi_Laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        bttn_Opsi_Perempuan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bttn_Opsi_Perempuan);
        bttn_Opsi_Perempuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttn_Opsi_Perempuan.setSelected(true);
        bttn_Opsi_Perempuan.setText("Perempuan");
        bttn_Opsi_Perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_Opsi_PerempuanActionPerformed(evt);
            }
        });
        panelPelanggan.add(bttn_Opsi_Perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        Lbl_Alamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_Alamat.setText("Alamat");
        panelPelanggan.add(Lbl_Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 126, -1));

        Lbl_NoHP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_NoHP.setText("No. HP Pribadi");
        panelPelanggan.add(Lbl_NoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 126, -1));

        txtNoHp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panelPelanggan.add(txtNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 310, -1));

        Lbl_NoHPDarurat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_NoHPDarurat.setText("No. HP Darurat");
        panelPelanggan.add(Lbl_NoHPDarurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 126, -1));

        txtNoHPDarurat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panelPelanggan.add(txtNoHPDarurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 310, -1));

        Lbl_HakAkses.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_HakAkses.setText("Hak Akses");
        panelPelanggan.add(Lbl_HakAkses, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 126, -1));

        cmbAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih sebagai", "Admin", "User" }));
        panelPelanggan.add(cmbAkses, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 310, 30));

        edit.setBackground(new java.awt.Color(52, 135, 239));
        edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.setBorder(null);
        edit.setBorderPainted(false);
        edit.setContentAreaFilled(false);
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.setOpaque(true);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        panelPelanggan.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 100, 40));

        hapus.setBackground(new java.awt.Color(52, 135, 239));
        hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("Hapus");
        hapus.setBorder(null);
        hapus.setBorderPainted(false);
        hapus.setContentAreaFilled(false);
        hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapus.setOpaque(true);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        panelPelanggan.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 100, 40));

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
        panelPelanggan.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 100, 40));

        txtAlmt.setColumns(20);
        txtAlmt.setLineWrap(true);
        txtAlmt.setRows(5);
        jScrollPane1.setViewportView(txtAlmt);

        panelPelanggan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 310, -1));

        Lbl_Data.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lbl_Data.setText("Data");
        panelPelanggan.add(Lbl_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        lbl_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPelanggan.add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 140, 170));
        panelPelanggan.add(txtPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 110, 20));

        browse.setText("...");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        panelPelanggan.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 229, 32, 22));

        Lbl_Cari.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lbl_Cari.setText("Cari Data");
        panelPelanggan.add(Lbl_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });
        panelPelanggan.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 370, -1));

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

        panelPelanggan.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, 220));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelPelanggan.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 10, 630));

        ScrollForm.setViewportView(panelPelanggan);

        form1.add(ScrollForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1064, 500));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Edge.png"))); // NOI18N
        form1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 610));

        InputDataPelanggan.add(form1);
        form1.setBounds(50, 110, 1050, 610);

        Bg.add(InputDataPelanggan);
        InputDataPelanggan.setBounds(206, 0, 1160, 768);

        InputDataKamar.setBackground(new java.awt.Color(242, 242, 242));
        InputDataKamar.setMinimumSize(new java.awt.Dimension(1160, 768));
        InputDataKamar.setLayout(null);

        lbl_Menu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu4MouseClicked(evt);
            }
        });
        InputDataKamar.add(lbl_Menu4);
        lbl_Menu4.setBounds(10, 10, 34, 30);

        lbl_Menu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/menu.png"))); // NOI18N
        lbl_Menu15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Menu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Menu15MouseClicked(evt);
            }
        });
        InputDataKamar.add(lbl_Menu15);
        lbl_Menu15.setBounds(10, 10, 34, 30);

        bttn_minimized10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/minimize.png"))); // NOI18N
        bttn_minimized10.setBorder(null);
        bttn_minimized10.setBorderPainted(false);
        bttn_minimized10.setContentAreaFilled(false);
        bttn_minimized10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_minimized10.setFocusPainted(false);
        bttn_minimized10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_minimized10ActionPerformed(evt);
            }
        });
        InputDataKamar.add(bttn_minimized10);
        bttn_minimized10.setBounds(1080, 15, 20, 20);

        bttn_close8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/close.png"))); // NOI18N
        bttn_close8.setBorder(null);
        bttn_close8.setBorderPainted(false);
        bttn_close8.setContentAreaFilled(false);
        bttn_close8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_close8.setFocusPainted(false);
        bttn_close8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_close8ActionPerformed(evt);
            }
        });
        InputDataKamar.add(bttn_close8);
        bttn_close8.setBounds(1110, 10, 20, 20);

        lbl_judul8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Label.png"))); // NOI18N
        InputDataKamar.add(lbl_judul8);
        lbl_judul8.setBounds(445, 10, 260, 90);

        Lbl_IdUser1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Lbl_IdUser1.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_IdUser1.setText("IdUser :");
        InputDataKamar.add(Lbl_IdUser1);
        Lbl_IdUser1.setBounds(900, 90, 35, 15);

        txtUser1.setEditable(false);
        txtUser1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtUser1.setBorder(null);
        txtUser1.setOpaque(false);
        InputDataKamar.add(txtUser1);
        txtUser1.setBounds(940, 90, 50, 15);

        Lbl_IdCust1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Lbl_IdCust1.setForeground(new java.awt.Color(51, 51, 51));
        Lbl_IdCust1.setText("IdCust :");
        InputDataKamar.add(Lbl_IdCust1);
        Lbl_IdCust1.setBounds(1000, 90, 35, 15);

        txtCust1.setEditable(false);
        txtCust1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtCust1.setBorder(null);
        txtCust1.setOpaque(false);
        InputDataKamar.add(txtCust1);
        txtCust1.setBounds(1040, 90, 50, 15);

        form2.setBackground(new java.awt.Color(255, 255, 255));
        form2.setOpaque(false);
        form2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_datapelanggan1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_datapelanggan1.setForeground(new java.awt.Color(96, 82, 76));
        lbl_datapelanggan1.setText("Data Kamar ");
        form2.add(lbl_datapelanggan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        lbl_back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/backIco.png"))); // NOI18N
        lbl_back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back1MouseClicked(evt);
            }
        });
        form2.add(lbl_back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, 20, 20));

        ScrollForm1.setBackground(new java.awt.Color(255, 255, 255));
        ScrollForm1.setBorder(null);
        ScrollForm1.setOpaque(false);

        panelKamar.setBackground(new java.awt.Color(255, 255, 255));
        panelKamar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_jeniskamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_jeniskamar.setText("Jenis Kamar");
        panelKamar.add(Lbl_jeniskamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 126, -1));

        Lbl_lokasikamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_lokasikamar.setText("Lokasi Kamar");
        panelKamar.add(Lbl_lokasikamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 126, -1));

        Lbl_uploadpapkmr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_uploadpapkmr.setText("Upload Foto Kamar");
        panelKamar.add(Lbl_uploadpapkmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, -1));

        txtkodekamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtkodekamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodekamarActionPerformed(evt);
            }
        });
        panelKamar.add(txtkodekamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 90, -1));

        Lbl_fasilitas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_fasilitas.setText("Fasilitas");
        panelKamar.add(Lbl_fasilitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 126, -1));

        file_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panelKamar.add(file_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 210, -1));

        Lbl_HakAkses1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_HakAkses1.setText("Kode Kamar");
        panelKamar.add(Lbl_HakAkses1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 126, -1));

        btnEdit.setBackground(new java.awt.Color(52, 135, 239));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setOpaque(true);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelKamar.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 100, 40));

        btnHapus.setBackground(new java.awt.Color(52, 135, 239));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.setBorder(null);
        btnHapus.setBorderPainted(false);
        btnHapus.setContentAreaFilled(false);
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setOpaque(true);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        panelKamar.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 100, 40));

        btnSimpan.setBackground(new java.awt.Color(52, 135, 239));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(null);
        btnSimpan.setBorderPainted(false);
        btnSimpan.setContentAreaFilled(false);
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.setOpaque(true);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        panelKamar.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 100, 40));

        txtFasilitas.setColumns(20);
        txtFasilitas.setLineWrap(true);
        txtFasilitas.setRows(5);
        jScrollPane3.setViewportView(txtFasilitas);

        panelKamar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 310, -1));

        Lbl_Data1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lbl_Data1.setText("Data");
        panelKamar.add(Lbl_Data1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        lbl_fotopreview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelKamar.add(lbl_fotopreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 140, 170));
        panelKamar.add(txtPath1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 110, 20));

        browse1.setText("...");
        browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse1ActionPerformed(evt);
            }
        });
        panelKamar.add(browse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 229, 32, 22));

        Lbl_Cari1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lbl_Cari1.setText("Cari Data");
        panelKamar.add(Lbl_Cari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        txtCari1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCari1KeyReleased(evt);
            }
        });
        panelKamar.add(txtCari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 370, -1));

        jScrollPane4.setAutoscrolls(true);

        tabelKamar.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKamar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKamarMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelKamar);

        panelKamar.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, 220));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelKamar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 10, 630));

        Lk_bawah.setBackground(new java.awt.Color(255, 255, 255));
        Lk_bawah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lk_bawah.setText("Bawah");
        Lk_bawah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lk_bawahActionPerformed(evt);
            }
        });
        panelKamar.add(Lk_bawah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        Jk_kamar01.setBackground(new java.awt.Color(255, 255, 255));
        Jk_kamar01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Jk_kamar01.setText("Kamar 01");
        panelKamar.add(Jk_kamar01, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        Jk_kamar02.setBackground(new java.awt.Color(255, 255, 255));
        Jk_kamar02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Jk_kamar02.setText("Kamar 02");
        Jk_kamar02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jk_kamar02ActionPerformed(evt);
            }
        });
        panelKamar.add(Jk_kamar02, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        Lk_atas.setBackground(new java.awt.Color(255, 255, 255));
        Lk_atas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lk_atas.setText("Atas");
        Lk_atas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lk_atasActionPerformed(evt);
            }
        });
        panelKamar.add(Lk_atas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        Lbl_ukurankamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Lbl_ukurankamar.setText("Ukuran Kamar");
        panelKamar.add(Lbl_ukurankamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 126, -1));

        btnPilihFile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPilihFile.setText("Pilih File");
        panelKamar.add(btnPilihFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 30));

        txtUkuranKamar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUkuranKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUkuranKamarActionPerformed(evt);
            }
        });
        panelKamar.add(txtUkuranKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 310, -1));

        lbl_foto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelKamar.add(lbl_foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 140, 170));

        ScrollForm1.setViewportView(panelKamar);

        form2.add(ScrollForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1064, 500));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SI_AiraKost_Asset/Edge.png"))); // NOI18N
        form2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 610));

        InputDataKamar.add(form2);
        form2.setBounds(50, 110, 1050, 610);

        Bg.add(InputDataKamar);
        InputDataKamar.setBounds(206, 0, 1160, 768);

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

    private void bttn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_LogoutActionPerformed
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Login lg = new Login();
                lg.show();
                dispose();
            }
        }, 10 * 5);
    }//GEN-LAST:event_bttn_LogoutActionPerformed

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

    private void lbl_kpelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kpelangganMouseExited
        resetIconPanelButton1(lbl_icoPelanggan);
    }//GEN-LAST:event_lbl_kpelangganMouseExited

    private void lbl_kpelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kpelangganMouseEntered
        setIconPanelButton1(lbl_icoPelanggan);
    }//GEN-LAST:event_lbl_kpelangganMouseEntered

    private void lbl_kadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kadminMouseExited
        resetIconPanelButton2(lbl_icoAdmin);
    }//GEN-LAST:event_lbl_kadminMouseExited

    private void lbl_kadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kadminMouseEntered
        setIconPanelButton2(lbl_icoAdmin);
    }//GEN-LAST:event_lbl_kadminMouseEntered

    private void lbl_kpesanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kpesanMouseExited
        resetIconPanelButton3(lbl_icoPemesanan);
    }//GEN-LAST:event_lbl_kpesanMouseExited

    private void lbl_kpesanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kpesanMouseEntered
        setIconPanelButton3(lbl_icoPemesanan);
    }//GEN-LAST:event_lbl_kpesanMouseEntered

    private void lbl_kbayarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kbayarMouseExited
        resetIconPanelButton4(lbl_icoPay);
    }//GEN-LAST:event_lbl_kbayarMouseExited

    private void lbl_kbayarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kbayarMouseEntered
        setIconPanelButton4(lbl_icoPay);
    }//GEN-LAST:event_lbl_kbayarMouseEntered

    private void bttn_close6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_close6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttn_close6ActionPerformed

    private void bttn_minimized3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_minimized3ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_bttn_minimized3ActionPerformed

    private void lbl_Menu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu7MouseClicked
        lbl_Menu7.setVisible(false);
        lbl_Menu7.setEnabled(false);
        lbl_Menu13.setVisible(true);
        lbl_Menu13.setEnabled(true);
        setPanel(LaporanSidebar);
        lbl_judul6.setBounds(545, 10, 260, 90);
        Data_Pelanggan.setBounds(210, 200, 200, 270);
        Data_Admin.setBounds(460, 200, 200, 270);
        Data_Pemesanan.setBounds(710, 200, 200, 270);
        Data_Pembayaran.setBounds(950, 200, 200, 270);
        bttn_minimized3.setBounds(1286, 15, 20, 20);
        bttn_close6.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu7MouseClicked

    private void lbl_Menu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu8MouseClicked
        lbl_Menu8.setVisible(false);
        lbl_Menu8.setEnabled(false);
        lbl_Menu9.setVisible(true);
        lbl_Menu9.setEnabled(true);
        setPanel(PengaturanSideBar);
        lbl_judul7.setBounds(545, 10, 260, 90);
        Data_EPelanggan.setBounds(340, 200, 200, 270);
        Data_EUser.setBounds(590, 200, 200, 270);
        Data_EKamar.setBounds(840, 200, 200, 270);
        bttn_minimized7.setBounds(1286, 15, 20, 20);
        bttn_close7.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu8MouseClicked

    private void bttn_minimized7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_minimized7ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_bttn_minimized7ActionPerformed

    private void bttn_close7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_close7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttn_close7ActionPerformed

    private void lbl_kuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kuserMouseEntered
        setIconPanelButton2(lbl_icoAdmin2);
    }//GEN-LAST:event_lbl_kuserMouseEntered

    private void lbl_kuserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kuserMouseExited
        resetIconPanelButton2(lbl_icoAdmin2);
    }//GEN-LAST:event_lbl_kuserMouseExited

    private void lbl_kpelanggan2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kpelanggan2MouseEntered
        setIconPanelButton1(lbl_icoPelanggan2);
    }//GEN-LAST:event_lbl_kpelanggan2MouseEntered

    private void lbl_kpelanggan2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kpelanggan2MouseExited
        resetIconPanelButton1(lbl_icoPelanggan2);
    }//GEN-LAST:event_lbl_kpelanggan2MouseExited

    private void PengaturanSideBarSidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanSideBarSidebarMouseDragged

    }//GEN-LAST:event_PengaturanSideBarSidebarMouseDragged

    private void PengaturanSideBarSidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanSideBarSidebarMousePressed

    }//GEN-LAST:event_PengaturanSideBarSidebarMousePressed

    private void lbl_Menu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu5MouseClicked
        lbl_Menu5.setVisible(false);
        lbl_Menu5.setEnabled(false);
        lbl_Menu10.setVisible(true);
        lbl_Menu10.setEnabled(true);
        setPanel(PemesananSideBar);
        lbl_judul4.setBounds(545, 10, 260, 90);
        form.setBounds(154, 110, 1050, 610);
        bttn_minimized8.setBounds(1286, 15, 20, 20);
        bttn_close4.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu5MouseClicked

    private void lbl_Menu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu10MouseClicked
        lbl_Menu10.setVisible(false);
        lbl_Menu10.setEnabled(false);
        lbl_Menu5.setVisible(true);
        lbl_Menu5.setEnabled(true);
        resetPanel(PemesananSideBar);
        lbl_judul4.setBounds(445, 10, 260, 90);
        form.setBounds(50, 110, 1050, 610);
        bttn_minimized8.setBounds(1080, 15, 20, 20);
        bttn_close4.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu10MouseClicked

    private void bttn_minimized8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_minimized8ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_bttn_minimized8ActionPerformed

    private void bttn_close4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_close4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttn_close4ActionPerformed

    private void bttn_CekButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_CekButton6ActionPerformed

    }//GEN-LAST:event_bttn_CekButton6ActionPerformed

    private void lbl_Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu1MouseClicked
        lbl_Menu1.setVisible(false);
        lbl_Menu1.setEnabled(false);
        lbl_Menu11.setVisible(true);
        lbl_Menu11.setEnabled(true);
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

    private void lbl_Menu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu11MouseClicked
        lbl_Menu11.setVisible(false);
        lbl_Menu11.setEnabled(false);
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
    }//GEN-LAST:event_lbl_Menu11MouseClicked

    private void bttn_minimized2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_minimized2ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_bttn_minimized2ActionPerformed

    private void bttn_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_close1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttn_close1ActionPerformed

    private void gb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb1ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/1.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb1ActionPerformed

    private void gb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb2ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/2.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb2ActionPerformed

    private void gb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb3ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/3.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb3ActionPerformed

    private void gb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb4ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/4.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb4ActionPerformed

    private void gb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb5ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/5.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb5ActionPerformed

    private void gb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb6ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/6.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb6ActionPerformed

    private void gb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb7ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/7.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb7ActionPerformed

    private void gb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb8ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/8.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb8ActionPerformed

    private void gb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb9ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/9.png"));
        lbl_Slide1.setIcon(gmbr);
    }//GEN-LAST:event_gb9ActionPerformed

    private void gb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb10ActionPerformed
        ImageIcon gmbr = new ImageIcon(getClass().getResource("/SI_AiraKostFoto/10.png"));
        lbl_Slide1.setIcon(gmbr);
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

    private void lbl_Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu2MouseClicked
        lbl_Menu2.setVisible(false);
        lbl_Menu2.setEnabled(false);
        lbl_Menu12.setVisible(true);
        lbl_Menu12.setEnabled(true);
        setPanel(KamarSideBar);
        lbl_judul2.setBounds(545, 10, 260, 90);
        ScrollData2.setBounds(154, 110, 1050, 610);
        bttn_minimized4.setBounds(1286, 15, 20, 20);
        bttn_close2.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu2MouseClicked

    private void lbl_Menu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu12MouseClicked
        lbl_Menu12.setVisible(false);
        lbl_Menu12.setEnabled(false);
        lbl_Menu2.setVisible(true);
        lbl_Menu2.setEnabled(true);
        resetPanel(KamarSideBar);
        lbl_judul2.setBounds(445, 10, 260, 90);
        ScrollData2.setBounds(50, 110, 1050, 610);
        bttn_minimized4.setBounds(1080, 15, 20, 20);
        bttn_close2.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu12MouseClicked

    private void bttn_minimized4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_minimized4ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_bttn_minimized4ActionPerformed

    private void bttn_close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_close2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttn_close2ActionPerformed

    private void lbl_Menu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu13MouseClicked
        lbl_Menu13.setVisible(false);
        lbl_Menu13.setEnabled(false);
        lbl_Menu7.setVisible(true);
        lbl_Menu7.setEnabled(true);
        resetPanel(LaporanSidebar);
        lbl_judul6.setBounds(445, 10, 260, 90);
        Data_Pelanggan.setBounds(110, 200, 200, 270);
        Data_Admin.setBounds(360, 200, 200, 270);
        Data_Pemesanan.setBounds(610, 200, 200, 270);
        Data_Pembayaran.setBounds(850, 200, 200, 270);
        bttn_minimized3.setBounds(1080, 15, 20, 20);
        bttn_close6.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu13MouseClicked

    private void lbl_Menu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu9MouseClicked
        lbl_Menu9.setVisible(false);
        lbl_Menu9.setEnabled(false);
        lbl_Menu8.setVisible(true);
        lbl_Menu8.setEnabled(true);
        resetPanel(PengaturanSideBar);
        lbl_judul7.setBounds(445, 10, 260, 90);
        Data_EPelanggan.setBounds(240, 200, 200, 270);
        Data_EUser.setBounds(490, 200, 200, 270);
        Data_EKamar.setBounds(740, 200, 200, 270);
        bttn_minimized7.setBounds(1080, 15, 20, 20);
        bttn_close7.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu9MouseClicked

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

    private void lbl_kkamarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kkamarMouseEntered
        setIconPanelButton3(lbl_icoPemesanan2);

    }//GEN-LAST:event_lbl_kkamarMouseEntered

    private void lbl_kkamarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kkamarMouseExited
        resetIconPanelButton3(lbl_icoPemesanan2);
    }//GEN-LAST:event_lbl_kkamarMouseExited

    private void bttn_minimized9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_minimized9ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_bttn_minimized9ActionPerformed

    private void bttn_close5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_close5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttn_close5ActionPerformed

    private void bttn_Opsi_PerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_Opsi_PerempuanActionPerformed

    }//GEN-LAST:event_bttn_Opsi_PerempuanActionPerformed

    private void txtKTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKTPActionPerformed
        
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
        if (bttn_Opsi_Laki.isSelected()) {
            jeniskelamin = "Laki-laki";
        } else if (bttn_Opsi_Perempuan.isSelected()) {
            jeniskelamin = "Perempuan";
        }

        alamat = txtAlmt.getText();
        nohppribadi = txtNoHp.getText();
        nohpdarurat = txtNoHPDarurat.getText();

        akses = (String) cmbAkses.getSelectedItem();

        ConnectDB konek = new ConnectDB();
        konek.insertDB(id_cust, noktp, nama, jeniskelamin, alamat, nohppribadi, nohpdarurat);
        konek.insertDB(id_user, username, password, akses);
        
        JOptionPane.showMessageDialog(rootPane, "Tambah Data Pelanggan Sukses!!!");
        resetForm();
        showTables();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(rootPane, "Ada Kesalahan Pada Data Pelanggan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void lbl_kpelanggan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kpelanggan2MouseClicked
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
    }//GEN-LAST:event_lbl_kpelanggan2MouseClicked

    private void lbl_Menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu3MouseClicked
        lbl_Menu3.setVisible(false);
        lbl_Menu3.setEnabled(false);
        lbl_Menu14.setVisible(true);
        lbl_Menu14.setEnabled(true);
        setPanel(InputDataPelanggan);
        lbl_judul5.setBounds(545, 10, 260, 90);
        form1.setBounds(154, 110, 1050, 610);
        Lbl_IdUser.setBounds(1000, 90, 35, 15);
        txtUser.setBounds(1040, 90, 50, 15);
        Lbl_IdCust.setBounds(1100, 90, 35, 15);
        txtCust.setBounds(1140, 90, 50, 15);
        bttn_minimized9.setBounds(1286, 15, 20, 20);
        bttn_close5.setBounds(1316, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu3MouseClicked

    private void lbl_Menu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu14MouseClicked
        lbl_Menu14.setVisible(false);
        lbl_Menu14.setEnabled(false);
        lbl_Menu3.setVisible(true);
        lbl_Menu3.setEnabled(true);
        resetPanel(InputDataPelanggan);
        lbl_judul5.setBounds(445, 10, 260, 90);
        form1.setBounds(50, 110, 1050, 610);
        Lbl_IdUser.setBounds(900, 90, 35, 15);
        txtUser.setBounds(940, 90, 50, 15);
        Lbl_IdCust.setBounds(1000, 90, 35, 15);
        txtCust.setBounds(1040, 90, 50, 15);
        bttn_minimized9.setBounds(1080, 15, 20, 20);
        bttn_close5.setBounds(1110, 10, 20, 20);
    }//GEN-LAST:event_lbl_Menu14MouseClicked

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
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
    }//GEN-LAST:event_lbl_backMouseClicked

    private void bttn_Hide2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_Hide2ActionPerformed
        bttn_Show2.setVisible(true);
        bttn_Show2.setEnabled(true);
        txtPass.setEchoChar((char) 0);
        bttn_Hide2.setVisible(false);
        bttn_Hide2.setEnabled(false);
    }//GEN-LAST:event_bttn_Hide2ActionPerformed

    private void bttn_Show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_Show2ActionPerformed
        bttn_Hide2.setVisible(true);
        bttn_Hide2.setEnabled(true);
        txtPass.setEchoChar((char) 8226);
        bttn_Show2.setVisible(false);
        bttn_Show2.setEnabled(false);
    }//GEN-LAST:event_bttn_Show2ActionPerformed

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
        txtCust.setText(tabel.getValueAt(row, 0).toString());
        txtKTP.setText(tabel.getValueAt(row, 1).toString());
        txtNama.setText(tabel.getValueAt(row, 2).toString());
        if (tabel.getValueAt(row, 3).equals("Laki-laki")) {
            bttn_Opsi_Laki.setSelected(true);
        } else if (tabel.getValueAt(row, 3).equals("Perempuan")) {
            bttn_Opsi_Perempuan.setSelected(true);
        }
        txtAlmt.setText(tabel.getValueAt(row, 4).toString());
        txtNoHp.setText(tabel.getValueAt(row, 5).toString());
        txtNoHPDarurat.setText(tabel.getValueAt(row, 6).toString());
        txtUser.setText(tabel.getValueAt(row, 7).toString());
        txtUsername.setText(tabel.getValueAt(row, 8).toString());
        txtPass.setText(tabel.getValueAt(row, 9).toString());
        cmbAkses.setSelectedItem(tabel.getValueAt(row, 10).toString());
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

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String id_cust, id_user;
        id_cust = txtCust.getText();
        id_user = txtUser.getText();
        ConnectDB konek = new ConnectDB();
        konek.deleteDB(id_cust);
        konek.deleteDB(null, id_user);
        resetForm();
        txtUsername.requestFocus();
        showTables();        
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try {
        String id_user, id_cust, username, noktp, nama, jeniskelamin, alamat, nohppribadi, nohpdarurat, password, akses;
        id_cust = txtCust.getText();
        id_user = txtUser.getText();
        username = txtUsername.getText();
        password = txtPass.getText();
        noktp = txtKTP.getText();
        nama = txtNama.getText();
        jeniskelamin = null;
        if (bttn_Opsi_Laki.isSelected()) {
            jeniskelamin = "Laki-laki";
        } else if (bttn_Opsi_Perempuan.isSelected()) {
            jeniskelamin = "Perempuan";
        }

        alamat = txtAlmt.getText();
        nohppribadi = txtNoHp.getText();
        nohpdarurat = txtNoHPDarurat.getText();

        akses = (String) cmbAkses.getSelectedItem();

        ConnectDB konek = new ConnectDB();
        konek.updateDB(id_cust, noktp, nama, jeniskelamin, alamat, nohppribadi, nohpdarurat);
        konek.updateDB(id_user, username, password, akses);
        JOptionPane.showMessageDialog(rootPane, "Edit Data Sukses");
        resetForm();
        showTables();    
        } catch (Exception e) {
          JOptionPane.showMessageDialog(rootPane, "Ada Kesalahan dalam Pengeditan Data Pelanggan");
            System.out.println(e.getMessage());
        }    
    }//GEN-LAST:event_editActionPerformed

    private void bttn_Opsi_LakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_Opsi_LakiActionPerformed
        
    }//GEN-LAST:event_bttn_Opsi_LakiActionPerformed

    private void lbl_Menu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu4MouseClicked
        
    }//GEN-LAST:event_lbl_Menu4MouseClicked

    private void lbl_Menu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Menu15MouseClicked
        
    }//GEN-LAST:event_lbl_Menu15MouseClicked

    private void bttn_minimized10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_minimized10ActionPerformed
        
    }//GEN-LAST:event_bttn_minimized10ActionPerformed

    private void bttn_close8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_close8ActionPerformed
        
    }//GEN-LAST:event_bttn_close8ActionPerformed

    private void lbl_back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back1MouseClicked
        
    }//GEN-LAST:event_lbl_back1MouseClicked

    private void txtkodekamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodekamarActionPerformed
        
    }//GEN-LAST:event_txtkodekamarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    try {
        String kode_kamar, lokasi_kamar, Kjenis_kamar, ukuran, fasilitas;
        kode_kamar = txtkodekamar.getText();
        ukuran = txtUkuranKamar.getText();
        fasilitas = txtFasilitas.getText();
        
        Kjenis_kamar = null;
        if (Jk_kamar01.isSelected()) {
            Kjenis_kamar = "K01";
        } else if (Jk_kamar02.isSelected()) {
            Kjenis_kamar = "K02";
        }
        
        lokasi_kamar = null;
        if (Lk_atas.isSelected()) {
            lokasi_kamar = "Atas";
        } else if (Lk_bawah.isSelected()) {
            lokasi_kamar = "Bawah";
        }

        ConnectDB konek = new ConnectDB();
        konek.insertDB(kode_kamar, lokasi_kamar, Kjenis_kamar, ukuran, fasilitas);
        
        JOptionPane.showMessageDialog(rootPane, "Sukses");
        resetForm();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(rootPane, "Error");
            System.out.println(e.getMessage());
        }
        showTables();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse1ActionPerformed
        
    }//GEN-LAST:event_browse1ActionPerformed

    private void txtCari1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCari1KeyReleased
        
    }//GEN-LAST:event_txtCari1KeyReleased

    private void tabelKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKamarMouseClicked
        
    }//GEN-LAST:event_tabelKamarMouseClicked

    private void Lk_bawahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lk_bawahActionPerformed
        
    }//GEN-LAST:event_Lk_bawahActionPerformed

    private void Jk_kamar02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jk_kamar02ActionPerformed
        
    }//GEN-LAST:event_Jk_kamar02ActionPerformed

    private void Lk_atasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lk_atasActionPerformed
        
    }//GEN-LAST:event_Lk_atasActionPerformed

    private void txtUkuranKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUkuranKamarActionPerformed
        
    }//GEN-LAST:event_txtUkuranKamarActionPerformed

    private void lbl_kkamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kkamarMouseClicked
        InputDataKamar.setVisible(true);
        InputDataKamar.setEnabled(true);
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
        InputDataPelanggan.setVisible(false);
        InputDataPelanggan.setVisible(false);
    }//GEN-LAST:event_lbl_kkamarMouseClicked

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
    private javax.swing.JPanel Data_Admin;
    private javax.swing.JPanel Data_EKamar;
    private javax.swing.JPanel Data_EPelanggan;
    private javax.swing.JPanel Data_EUser;
    private javax.swing.JPanel Data_Pelanggan;
    private javax.swing.JPanel Data_Pembayaran;
    private javax.swing.JPanel Data_Pemesanan;
    private javax.swing.JPanel InputDataKamar;
    private javax.swing.JPanel InputDataPelanggan;
    private javax.swing.JRadioButton Jk_kamar01;
    private javax.swing.JRadioButton Jk_kamar02;
    private javax.swing.JPanel KamarSideBar;
    private javax.swing.JPanel LaporanSidebar;
    private javax.swing.JLabel Lbl_Alamat;
    private javax.swing.JLabel Lbl_Cari;
    private javax.swing.JLabel Lbl_Cari1;
    private javax.swing.JLabel Lbl_Data;
    private javax.swing.JLabel Lbl_Data1;
    private javax.swing.JLabel Lbl_HakAkses;
    private javax.swing.JLabel Lbl_HakAkses1;
    private javax.swing.JLabel Lbl_IdCust;
    private javax.swing.JLabel Lbl_IdCust1;
    private javax.swing.JLabel Lbl_IdUser;
    private javax.swing.JLabel Lbl_IdUser1;
    private javax.swing.JLabel Lbl_Jkl;
    private javax.swing.JLabel Lbl_KTP;
    private javax.swing.JLabel Lbl_Nama;
    private javax.swing.JLabel Lbl_NoHP;
    private javax.swing.JLabel Lbl_NoHPDarurat;
    private javax.swing.JLabel Lbl_Pass;
    private javax.swing.JLabel Lbl_Username;
    private javax.swing.JLabel Lbl_beranda;
    private javax.swing.JLabel Lbl_fasilitas;
    private javax.swing.JLabel Lbl_jeniskamar;
    private javax.swing.JLabel Lbl_kamar;
    private javax.swing.JLabel Lbl_laporan;
    private javax.swing.JLabel Lbl_lokasikamar;
    private javax.swing.JLabel Lbl_pemesanan;
    private javax.swing.JLabel Lbl_pengaturan;
    private javax.swing.JLabel Lbl_ukurankamar;
    private javax.swing.JLabel Lbl_uploadpapkmr;
    private javax.swing.JRadioButton Lk_atas;
    private javax.swing.JRadioButton Lk_bawah;
    private javax.swing.JToggleButton Masuk;
    private javax.swing.JPanel PanelChat;
    private javax.swing.JPanel PanelKamar;
    private javax.swing.JPanel PemesananSideBar;
    private javax.swing.JPanel PengaturanSideBar;
    private javax.swing.JScrollPane ScrollData;
    private javax.swing.JScrollPane ScrollData2;
    private javax.swing.JScrollPane ScrollForm;
    private javax.swing.JScrollPane ScrollForm1;
    private javax.swing.JPanel SideBarMenu;
    private javax.swing.JToggleButton Simpan;
    private javax.swing.JPanel beranda;
    private javax.swing.JToggleButton browse;
    private javax.swing.JToggleButton browse1;
    private javax.swing.JToggleButton btnEdit;
    private javax.swing.JToggleButton btnHapus;
    private javax.swing.JButton btnPilihFile;
    private javax.swing.JToggleButton btnSimpan;
    private javax.swing.JButton bttn_CekButton6;
    private javax.swing.JButton bttn_Hide2;
    private javax.swing.JToggleButton bttn_Logout;
    private javax.swing.JRadioButton bttn_Opsi_Laki;
    private javax.swing.JRadioButton bttn_Opsi_Perempuan;
    private javax.swing.JButton bttn_Show2;
    private javax.swing.JButton bttn_close1;
    private javax.swing.JButton bttn_close2;
    private javax.swing.JButton bttn_close4;
    private javax.swing.JButton bttn_close5;
    private javax.swing.JButton bttn_close6;
    private javax.swing.JButton bttn_close7;
    private javax.swing.JButton bttn_close8;
    private javax.swing.JButton bttn_minimized10;
    private javax.swing.JButton bttn_minimized2;
    private javax.swing.JButton bttn_minimized3;
    private javax.swing.JButton bttn_minimized4;
    private javax.swing.JButton bttn_minimized7;
    private javax.swing.JButton bttn_minimized8;
    private javax.swing.JButton bttn_minimized9;
    private javax.swing.JPanel button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton chatBx;
    private javax.swing.JComboBox<String> cmbAkses;
    private javax.swing.JToggleButton edit;
    public static final javax.swing.JTextField file_name = new javax.swing.JTextField();
    private javax.swing.JPanel form;
    private javax.swing.JPanel form1;
    private javax.swing.JPanel form2;
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
    private javax.swing.JToggleButton hapus;
    private javax.swing.JLabel ico_beranda;
    private javax.swing.JLabel ico_kamar;
    private javax.swing.JLabel ico_laporan;
    private javax.swing.JLabel ico_pemesanan;
    private javax.swing.JLabel ico_pengaturan;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel39;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel kamar;
    private javax.swing.JPanel laporan;
    private javax.swing.JLabel lbl_Kamar3;
    private javax.swing.JLabel lbl_Kamar4;
    private javax.swing.JLabel lbl_Menu1;
    private javax.swing.JLabel lbl_Menu10;
    private javax.swing.JLabel lbl_Menu11;
    private javax.swing.JLabel lbl_Menu12;
    private javax.swing.JLabel lbl_Menu13;
    private javax.swing.JLabel lbl_Menu14;
    private javax.swing.JLabel lbl_Menu15;
    private javax.swing.JLabel lbl_Menu2;
    private javax.swing.JLabel lbl_Menu3;
    private javax.swing.JLabel lbl_Menu4;
    private javax.swing.JLabel lbl_Menu5;
    private javax.swing.JLabel lbl_Menu7;
    private javax.swing.JLabel lbl_Menu8;
    private javax.swing.JLabel lbl_Menu9;
    public static final javax.swing.JLabel lbl_NamaUser1 = new javax.swing.JLabel();
    private javax.swing.JLabel lbl_Slide1;
    private javax.swing.JLabel lbl_Text2;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_back1;
    private javax.swing.JLabel lbl_besar;
    private javax.swing.JLabel lbl_dadmin;
    private javax.swing.JLabel lbl_datapelanggan;
    private javax.swing.JLabel lbl_datapelanggan1;
    private javax.swing.JLabel lbl_dbayar;
    private javax.swing.JLabel lbl_dkamar;
    private javax.swing.JLabel lbl_dpelanggan;
    private javax.swing.JLabel lbl_dpelanggan2;
    private javax.swing.JLabel lbl_dpesan;
    private javax.swing.JLabel lbl_duser;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_foto2;
    private javax.swing.JLabel lbl_fotopreview;
    private javax.swing.JLabel lbl_icoAdmin;
    private javax.swing.JLabel lbl_icoAdmin2;
    private javax.swing.JLabel lbl_icoPay;
    private javax.swing.JLabel lbl_icoPelanggan;
    private javax.swing.JLabel lbl_icoPelanggan2;
    private javax.swing.JLabel lbl_icoPemesanan;
    private javax.swing.JLabel lbl_icoPemesanan2;
    private javax.swing.JLabel lbl_ikonWA;
    private javax.swing.JLabel lbl_input1;
    private javax.swing.JLabel lbl_input2;
    private javax.swing.JLabel lbl_input3;
    private javax.swing.JLabel lbl_jk1no1;
    private javax.swing.JLabel lbl_jk1no2;
    private javax.swing.JLabel lbl_jk1no3;
    private javax.swing.JLabel lbl_jk1no4;
    private javax.swing.JLabel lbl_jk1no5;
    private javax.swing.JLabel lbl_jk1no6;
    private javax.swing.JLabel lbl_jk1no7;
    private javax.swing.JLabel lbl_jk1no8;
    private javax.swing.JLabel lbl_judul;
    private javax.swing.JLabel lbl_judul1;
    private javax.swing.JLabel lbl_judul2;
    private javax.swing.JLabel lbl_judul4;
    private javax.swing.JLabel lbl_judul5;
    private javax.swing.JLabel lbl_judul6;
    private javax.swing.JLabel lbl_judul7;
    private javax.swing.JLabel lbl_judul8;
    private javax.swing.JLabel lbl_kadmin;
    private javax.swing.JLabel lbl_kbayar;
    private javax.swing.JLabel lbl_kk1no1;
    private javax.swing.JLabel lbl_kk1no2;
    private javax.swing.JLabel lbl_kk1no3;
    private javax.swing.JLabel lbl_kk1no4;
    private javax.swing.JLabel lbl_kk1no5;
    private javax.swing.JLabel lbl_kk1no6;
    private javax.swing.JLabel lbl_kk1no7;
    private javax.swing.JLabel lbl_kk1no8;
    private javax.swing.JLabel lbl_kkamar;
    private javax.swing.JLabel lbl_kpelanggan;
    private javax.swing.JLabel lbl_kpelanggan2;
    private javax.swing.JLabel lbl_kpesan;
    private javax.swing.JLabel lbl_kuser;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_photos;
    private javax.swing.JLabel lbl_spasi;
    private javax.swing.JLabel lbl_tekschat;
    public static final javax.swing.JTextField nm_lengkap = new javax.swing.JTextField();
    private javax.swing.JPanel panelKamar;
    private javax.swing.JPanel panelPelanggan;
    private javax.swing.JPanel pemesanan;
    private javax.swing.JPanel pengaturan;
    private javax.swing.JTable tabel;
    private javax.swing.JTable tabelKamar;
    private com.toedter.calendar.JDateChooser tgl_masuk;
    public static final javax.swing.JTextField txtAlamat = new javax.swing.JTextField();
    private javax.swing.JTextArea txtAlmt;
    private javax.swing.JTextField txtBooking;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCari1;
    private javax.swing.JTextField txtCust;
    private javax.swing.JTextField txtCust1;
    private javax.swing.JTextArea txtFasilitas;
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
    private javax.swing.JTextField txtPath1;
    private javax.swing.JTextField txtTipeKamar;
    private javax.swing.JTextField txtTotaBayar;
    public static final javax.swing.JTextField txtUkuranKamar = new javax.swing.JTextField();
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUser1;
    private javax.swing.JTextField txtUsername;
    public static final javax.swing.JTextField txtkodekamar = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
