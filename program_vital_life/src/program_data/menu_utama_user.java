/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package program_data;

import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JTextField;

/**
 *
 * @author Cyber
 */
public class menu_utama_user extends javax.swing.JFrame {
//    private Connection con;
    
    /**
     * Creates new form menu_utama_user
     */
    public menu_utama_user() {
        initComponents();
        String username = get_username(Session.getUserId());
        lb_sapa_nama.setText("Halo, " + username + "!");
        
        userLogin(Session.getUserId());
        
        String tujuan = MenuUtilities.ambil_tujuan_user(Session.getUserId());
        
        if (MenuUtilities.cek_target_user(Session.getUserId())) {
            MenuUtilities.startDailyMenuUpdate(txtmenu_latihan);
        
            String menu_makan = MenuUtilities.ambil_menu_makan(tujuan);
            txtmenu_makan.setText(menu_makan);
            
            String menu_latihan = MenuUtilities.ambil_menu_latihan(tujuan);
            txtmenu_latihan.setText(menu_latihan);
        } else {
            txtmenu_makan.setText("");
            txtmenu_latihan.setText("");
        }
    }
    
    public class database_connection {
        private static final String DB_URL = "jdbc:mysql://localhost:3306/login_db";
        private static final String USER = "root";
        private static final String PASS = "";
        
        public static Connection connect() throws SQLException {
            return DriverManager.getConnection(DB_URL, USER, PASS);
        }
    }
    
    private String get_username(int userId) {
        String username = "";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
            con = database_connection.connect();
            
            String sql = "SELECT username FROM logs_in WHERE id = ?";
            
            pst = con.prepareStatement(sql);
            pst.setInt(1, userId);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                username = rs.getString("username");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return username;
    }
    
    private void ambil_data_user(int userId) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
            con = database_connection.connect();
            String sql = "SELECT jenis_kelamin, tinggi, berat, usia FROM logs_in WHERE id = ?";
            
            pst = con.prepareStatement(sql);
            pst.setInt(1, userId);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                String jenis_kelamin = rs.getString("jenis_kelamin");
                int tinggi = rs.getInt("tinggi");
                int berat = rs.getInt("berat");
                int usia = rs.getInt("usia");
                
                txtbb_awal.setText(String.valueOf(berat));
                txttinggi_saat_ini.setText(String.valueOf(tinggi));
                
                cek_imt(tinggi, berat);
                cek_kadar_lemak(jenis_kelamin, tinggi, berat, usia);
            } else {
                JOptionPane.showMessageDialog(null, "User tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error!", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private void ambil_target_user(int userId) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
            con = database_connection.connect();
            String sql = "SELECT berat_target, waktu FROM target WHERE id = ?";
            
            pst = con.prepareStatement(sql);
            pst.setInt(1, userId);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                txtbb_target.setText(rs.getString("berat_target"));
                txtjangka_waktu.setText(rs.getString("waktu"));
            } else {
                JOptionPane.showMessageDialog(null, "User tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error!", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
//    private void ambil_menu_makan() {
//        Connection con = null;
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//        
//        try {
////            con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
//            con = database_connection.connect();
//            String sql = "SELECT makanan FROM menu_makan ORDER BY RAND() LIMIT 1";
//            
//            pst = con.prepareStatement(sql);
//            
//            rs = pst.executeQuery();
//            
//            if (rs.next()) {
//                txtmenu_makan.setText(rs.getString("makanan"));
//            } else {
//                JOptionPane.showMessageDialog(null, "User tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Database error!", "Error", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            try {
//                if (rs != null) rs.close();
//                if (pst != null) pst.close();
//                if (con != null) con.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
    
    public class MenuUtilities {
    
        public static String ambil_menu_latihan(String tujuan) {
            String latihan = "";
            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
    //            con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
                con = database_connection.connect();
                String sql = "SELECT olahraga FROM menu_latihan WHERE tujuan = ? ORDER BY RAND() LIMIT 1";

                pst = con.prepareStatement(sql);
                pst.setString(1, tujuan);

                rs = pst.executeQuery();

                if (rs.next()) {
    //                txtmenu_latihan.setText(rs.getString("olahraga"));
                    latihan = rs.getString("olahraga");
                } else {
                    JOptionPane.showMessageDialog(null, "Opsi Latihan tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error!", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } 
            return latihan;
        }

        public static void startDailyMenuUpdate(JTextField txtmenu_latihan) {
            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

            Runnable task = () -> {
                String tujuan = ambil_tujuan_user(Session.getUserId());
                String latihan = ambil_menu_latihan(tujuan);

                txtmenu_latihan.setText(latihan);
            };

            LocalDate now = LocalDate.now();
            LocalDate nextDay = now.plusDays(1);
            long initialDelay = TimeUnit.DAYS.toMillis(1) - System.currentTimeMillis() % TimeUnit.DAYS.toMillis(1);

            scheduler.scheduleAtFixedRate(task, initialDelay, TimeUnit.DAYS.toMillis(1), TimeUnit.MILLISECONDS);
        }
        
        public static String ambil_kategori_by_time() {
            LocalTime now = LocalTime.now();
            if (now.isBefore(LocalTime.of(11, 0))) {
                return "Sarapan";
            } else if (now.isBefore(LocalTime.of(15, 0))) {
                return "Makan Siang";
            } else {
                return "Makan Malam";
            }
        }
        
        private static String ambil_menu_makan(String tujuan) {
            String makanan = "";
            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
    //            con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
                con = database_connection.connect();
                String kategori = ambil_kategori_by_time();
                String sql = "SELECT makanan FROM menu_makan WHERE kategori = ? AND tujuan = ? ORDER BY RAND() LIMIT 1";

                pst = con.prepareStatement(sql);
                pst.setString(1, kategori);
                pst.setString(2, tujuan);

                rs = pst.executeQuery();

                if (rs.next()) {
//                    txtmenu_makan.setText(rs.getString("makanan"));
                    makanan = rs.getString("makanan");
                } else {
                    JOptionPane.showMessageDialog(null, "Menu Makanan tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error!", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return makanan;
        }
        
        public static boolean cek_target_user(int userId) {
            boolean target_exists = false;
            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
        
            try {
                con = database_connection.connect();
                String sql = "SELECT COUNT(*) AS count FROM target WHERE id = ?";

                pst = con.prepareStatement(sql);
                pst.setInt(1, userId);
                rs = pst.executeQuery();

                if (rs.next()) {
                    target_exists = rs.getInt("count") > 0;
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error!", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return target_exists;
        }
        
        
        public static String ambil_tujuan_user(int userId) {
            String tujuan = "";
            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
    //            con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
                con = database_connection.connect();
                String sql = "SELECT tujuan FROM target WHERE id = ?";

                pst = con.prepareStatement(sql);
                pst.setInt(1, userId);

                rs = pst.executeQuery();

                if (rs.next()) {
    //                txtmenu_latihan.setText(rs.getString("olahraga"));
                    tujuan = rs.getString("tujuan");
                } else {
                    JOptionPane.showMessageDialog(null, "Tujuan tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error!", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } 
            return tujuan;
        }
    
    }
    
    
    
    
    public void cek_imt(int tinggi_b, int berat_b) {
        float tb_meter = tinggi_b / 100.0f;
        float hasil = berat_b / (tb_meter * tb_meter);
        
        if (hasil <= 18.5) {
            txtHasil_imt.setText(String.format("%.2f", hasil));
            txtSaran_imt.setText("Anda Kurang Gizi");
        } else if (hasil > 18.5 && hasil <= 25.0) {
            txtHasil_imt.setText(String.format("%.2f", hasil));
            txtSaran_imt.setText("Berat Badan Anda Ideal");
        } else {
            txtHasil_imt.setText(String.format("%.2f", hasil));
            txtSaran_imt.setText("Anda Berisiko Terkenal Obesitas");
        }
    }
    
    public void cek_kadar_lemak(String jenis_kelamin, int tinggi_b, int berat_b, int usia) {
        float tb_meter = tinggi_b / 100.0f;
        float imt = berat_b / (tb_meter * tb_meter);
        float hasil;
        
        if (jenis_kelamin.equals("Laki-laki")) {
            hasil = (float) ((1.2 * imt) + ((0.23 * usia) - 5.4 - 10.8));
        } else {
            hasil = (float) ((1.2 * imt) + ((0.23 * usia) - 5.4));
        }
        
        if (hasil > 1.0 && hasil <= 14.0) {
            txtHasil_lemak.setText(String.format("%.2f", hasil));
            txtSaran_lemak.setText("Anda Kekurangan Lemak");
        } else if (hasil > 14.0 && hasil <= 20.0) {
            txtHasil_lemak.setText(String.format("%.2f", hasil));
            txtSaran_lemak.setText("Kadar Lemak Anda Cukup");
        } else if (hasil > 20.0 && hasil <= 25.0) {
            txtHasil_lemak.setText(String.format("%.2f", hasil));
            txtSaran_lemak.setText("Anda Sangat Bugar");
        } else if (hasil > 25.0 && hasil <= 31.0) {
            txtHasil_lemak.setText(String.format("%.2f", hasil));
            txtSaran_lemak.setText("Kadar Lemak Anda Lebih Dari Cukup");
        } else {
            txtHasil_lemak.setText(String.format("%.2f", hasil));
            txtSaran_lemak.setText("Anda Obesitas");
        }
    }
    
    public void userLogin(int userId) {
        ambil_data_user(userId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lb_sapa_nama = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHasil_lemak = new javax.swing.JTextField();
        txtSaran_imt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHasil_imt = new javax.swing.JTextField();
        txtSaran_lemak = new javax.swing.JTextField();
        btn_buat_target = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtbb_awal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtbb_target = new javax.swing.JTextField();
        btn_edit_target = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txttinggi_saat_ini = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtjangka_waktu = new javax.swing.JTextField();
        txtprogres = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtmenu_makan = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtmenu_latihan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_pola_makan = new javax.swing.JButton();
        btn_olahraga = new javax.swing.JButton();
        btn_pola_tidur = new javax.swing.JButton();
        btn_jadwal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_kegiatan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_informasi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(16, 16, 132));
        jPanel1.setForeground(new java.awt.Color(20, 20, 184));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VitalLife");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(16, 74, 132));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        lb_sapa_nama.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        lb_sapa_nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_sapa_nama.setText("Halo, ");

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Indeks Massa Tubuh Anda :");

        txtHasil_lemak.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtHasil_lemak.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHasil_lemak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHasil_lemakActionPerformed(evt);
            }
        });

        txtSaran_imt.setBackground(new java.awt.Color(245, 245, 245));
        txtSaran_imt.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtSaran_imt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSaran_imt.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Kadar Lemak Tubuh Anda :");

        txtHasil_imt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtHasil_imt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHasil_imt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHasil_imtActionPerformed(evt);
            }
        });

        txtSaran_lemak.setBackground(new java.awt.Color(245, 245, 245));
        txtSaran_lemak.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtSaran_lemak.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSaran_lemak.setBorder(null);

        btn_buat_target.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        btn_buat_target.setText("Buat Target");

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Berat Awal");

        txtbb_awal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtbb_awal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtbb_awal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbb_awalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Berat Target");

        txtbb_target.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtbb_target.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtbb_target.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbb_targetActionPerformed(evt);
            }
        });

        btn_edit_target.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        btn_edit_target.setText("Perbarui Target");

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Tinggi Saat Ini");

        txttinggi_saat_ini.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txttinggi_saat_ini.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txttinggi_saat_ini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttinggi_saat_iniActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Jangka Waktu");

        txtjangka_waktu.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtjangka_waktu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtjangka_waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjangka_waktuActionPerformed(evt);
            }
        });

        txtprogres.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtprogres.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtprogres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprogresActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Menu Makan");

        txtmenu_makan.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtmenu_makan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtmenu_makan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmenu_makanActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Latihan");

        txtmenu_latihan.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtmenu_latihan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtmenu_latihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmenu_latihanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lb_sapa_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtmenu_latihan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtmenu_makan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_buat_target, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_edit_target, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtprogres, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbb_awal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbb_target, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txttinggi_saat_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtjangka_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSaran_lemak, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtHasil_lemak, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHasil_imt))
                                .addComponent(txtSaran_imt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lb_sapa_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbb_awal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbb_target, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttinggi_saat_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtjangka_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtprogres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buat_target)
                    .addComponent(jLabel16)
                    .addComponent(txtmenu_makan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit_target)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtmenu_latihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHasil_imt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSaran_imt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHasil_lemak, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaran_lemak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyber\\Downloads\\Semester 2\\Kuliah\\Pemrograman Berorientasi Obyek\\Tugas Besar\\Desktop-PBO\\program_vital_life\\src\\Icon\\icons8-tableware-20(1).png")); // NOI18N

        btn_pola_makan.setBackground(new java.awt.Color(16, 16, 132));
        btn_pola_makan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_pola_makan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pola_makan.setText("Perbaiki Makan");
        btn_pola_makan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pola_makan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pola_makanActionPerformed(evt);
            }
        });

        btn_olahraga.setBackground(new java.awt.Color(16, 16, 132));
        btn_olahraga.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_olahraga.setForeground(new java.awt.Color(255, 255, 255));
        btn_olahraga.setText("Latihan Fisik");
        btn_olahraga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_olahraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_olahragaActionPerformed(evt);
            }
        });

        btn_pola_tidur.setBackground(new java.awt.Color(16, 16, 132));
        btn_pola_tidur.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_pola_tidur.setForeground(new java.awt.Color(255, 255, 255));
        btn_pola_tidur.setText("Cek Pola Tidur");
        btn_pola_tidur.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pola_tidur.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_pola_tidur.setIconTextGap(0);
        btn_pola_tidur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pola_tidurActionPerformed(evt);
            }
        });

        btn_jadwal.setBackground(new java.awt.Color(16, 16, 132));
        btn_jadwal.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_jadwal.setForeground(new java.awt.Color(255, 255, 255));
        btn_jadwal.setText("Jadwal Mingguan");
        btn_jadwal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jadwalActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyber\\Downloads\\Semester 2\\Kuliah\\Pemrograman Berorientasi Obyek\\Tugas Besar\\Desktop-PBO\\program_vital_life\\src\\Icon\\icons8-schedule-20.png")); // NOI18N

        btn_kegiatan.setBackground(new java.awt.Color(16, 16, 132));
        btn_kegiatan.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_kegiatan.setForeground(new java.awt.Color(255, 255, 255));
        btn_kegiatan.setText("Kegiatan Lain");
        btn_kegiatan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_kegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kegiatanActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyber\\Downloads\\Semester 2\\Kuliah\\Pemrograman Berorientasi Obyek\\Tugas Besar\\Desktop-PBO\\program_vital_life\\src\\Icon\\icons8-yoga-20.png")); // NOI18N

        btn_informasi.setBackground(new java.awt.Color(16, 16, 132));
        btn_informasi.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_informasi.setForeground(new java.awt.Color(255, 255, 255));
        btn_informasi.setText("Cari Informasi");
        btn_informasi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_informasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informasiActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyber\\Downloads\\Semester 2\\Kuliah\\Pemrograman Berorientasi Obyek\\Tugas Besar\\Desktop-PBO\\program_vital_life\\src\\Icon\\2_icons8-page-20.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyber\\Downloads\\Semester 2\\Kuliah\\Pemrograman Berorientasi Obyek\\Icon\\1x\\Asset 1.png")); // NOI18N

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyber\\Downloads\\Semester 2\\Kuliah\\Pemrograman Berorientasi Obyek\\Tugas Besar\\Desktop-PBO\\program_vital_life\\src\\Icon\\icons8-running-20.png")); // NOI18N

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyber\\Downloads\\Semester 2\\Kuliah\\Pemrograman Berorientasi Obyek\\Tugas Besar\\Desktop-PBO\\program_vital_life\\src\\Icon\\icons8-sleep-20.png")); // NOI18N

        jLabel4.setBackground(new java.awt.Color(16, 16, 132));
        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pola Hidup");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_pola_makan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(btn_olahraga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_pola_tidur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btn_kegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(btn_informasi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_pola_makan)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_olahraga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pola_tidur))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_jadwal)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_kegiatan)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_informasi)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pola_makanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pola_makanActionPerformed
        this.dispose();
        new menu_pola_makan().setVisible(true);

    }//GEN-LAST:event_btn_pola_makanActionPerformed

    private void btn_olahragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_olahragaActionPerformed
        this.dispose();
        new menu_latihan_olahraga().setVisible(true);
    }//GEN-LAST:event_btn_olahragaActionPerformed

    private void btn_pola_tidurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pola_tidurActionPerformed
        this.dispose();
        new menu_cek_pola_tidur().setVisible(true);
    }//GEN-LAST:event_btn_pola_tidurActionPerformed

    private void btn_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jadwalActionPerformed
        this.dispose();
        new menu_jadwal().setVisible(true);
    }//GEN-LAST:event_btn_jadwalActionPerformed

    private void btn_kegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kegiatanActionPerformed
        this.dispose();
//        new menu_rekomendasi_kegiatan().setVisible(true);
    }//GEN-LAST:event_btn_kegiatanActionPerformed

    private void btn_informasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informasiActionPerformed
        this.dispose();
        new Artikel().setVisible(true);
    }//GEN-LAST:event_btn_informasiActionPerformed

    private void txtHasil_lemakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHasil_lemakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHasil_lemakActionPerformed

    private void txtHasil_imtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHasil_imtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHasil_imtActionPerformed

    private void txtbb_awalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbb_awalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbb_awalActionPerformed

    private void txtbb_targetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbb_targetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbb_targetActionPerformed

    private void txttinggi_saat_iniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttinggi_saat_iniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttinggi_saat_iniActionPerformed

    private void txtjangka_waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjangka_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjangka_waktuActionPerformed

    private void txtprogresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprogresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprogresActionPerformed

    private void txtmenu_makanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmenu_makanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmenu_makanActionPerformed

    private void txtmenu_latihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmenu_latihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmenu_latihanActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu_utama_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buat_target;
    private javax.swing.JButton btn_edit_target;
    private javax.swing.JButton btn_informasi;
    private javax.swing.JButton btn_jadwal;
    private javax.swing.JButton btn_kegiatan;
    private javax.swing.JButton btn_olahraga;
    private javax.swing.JButton btn_pola_makan;
    private javax.swing.JButton btn_pola_tidur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_sapa_nama;
    private javax.swing.JTextField txtHasil_imt;
    private javax.swing.JTextField txtHasil_lemak;
    private javax.swing.JTextField txtSaran_imt;
    private javax.swing.JTextField txtSaran_lemak;
    private javax.swing.JTextField txtbb_awal;
    private javax.swing.JTextField txtbb_target;
    private javax.swing.JTextField txtjangka_waktu;
    private javax.swing.JTextField txtmenu_latihan;
    private javax.swing.JTextField txtmenu_makan;
    private javax.swing.JTextField txtprogres;
    private javax.swing.JTextField txttinggi_saat_ini;
    // End of variables declaration//GEN-END:variables
}
