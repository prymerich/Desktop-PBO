/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package program_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Cyber
 */
public class menu_jadwal extends javax.swing.JFrame {
    private int userId;
    private Connection con;

    /**
     * Creates new form menu_jadwal
     */
    public menu_jadwal() {
        initComponents();
        tanggal_hari_ini();
        userId = Session.getUserId();
        koneksi_database();
        
        tampilkan_jadwal("Senin");
        tampilkan_jadwal("Selasa");
        tampilkan_jadwal("Rabu");
        tampilkan_jadwal("Kamis");
        tampilkan_jadwal("Jumat");
        tampilkan_jadwal("Sabtu");
        tampilkan_jadwal("Minggu");
    }
    
    private void koneksi_database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal terkoneksi karena" + ex);
        }
    }
    
    private void tampilkan_jadwal(String hari) {
//        jadwal_terurut jarut = new jadwal_terurut(con);
//        List<Schedule> jadwal = jarut.jadwal_hari(userId, hari);

        List<Schedule> jadwal = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement("SELECT * FROM jadwal_mingguan WHERE id_user = ? AND hari = ? ORDER BY waktu ASC")) {
            ps.setInt(1, userId);
            ps.setString(2, hari);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    jadwal.add(new Schedule(rs.getTime("Waktu"), rs.getString("kegiatan")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i < 9; i++) {
            if (i < jadwal.size()) {
                Schedule schedule = jadwal.get(i);
                set_label_for_day(hari, i + 1, schedule.getWaktu().toString(), schedule.getKegiatan());
            } else {
                set_label_for_day(hari, i + 1, "", "");
            }
        }
    }
    
    private void set_label_for_day(String hari, int index, String waktu, String kegiatan) {
        switch (hari) {
            case "Senin":
                switch (index) {
                    case 1:
                        lb_senin_jam1.setText(waktu);
                        lb_senin_kegiatan1.setText(kegiatan);
                        break;
                    case 2:
                        lb_senin_jam2.setText(waktu);
                        lb_senin_kegiatan2.setText(kegiatan);
                        break;
                    case 3:
                        lb_senin_jam3.setText(waktu);
                        lb_senin_kegiatan3.setText(kegiatan);
                        break;
                    case 4:
                        lb_senin_jam4.setText(waktu);
                        lb_senin_kegiatan4.setText(kegiatan);
                        break;
                    case 5:
                        lb_senin_jam5.setText(waktu);
                        lb_senin_kegiatan5.setText(kegiatan);
                        break;
                    case 6:
                        lb_senin_jam6.setText(waktu);
                        lb_senin_kegiatan6.setText(kegiatan);
                        break;
                    case 7:
                        lb_senin_jam7.setText(waktu);
                        lb_senin_kegiatan7.setText(kegiatan);
                        break;
                    case 8:
                        lb_senin_jam8.setText(waktu);
                        lb_senin_kegiatan8.setText(kegiatan);
                        break;
                }
            break;
            
            case "Selasa":
                switch (index) {
                    case 1:
                        lb_selasa_jam1.setText(waktu);
                        lb_selasa_kegiatan1.setText(kegiatan);
                        break;
                    case 2:
                        lb_selasa_jam2.setText(waktu);
                        lb_selasa_kegiatan2.setText(kegiatan);
                        break;
                    case 3:
                        lb_selasa_jam3.setText(waktu);
                        lb_selasa_kegiatan3.setText(kegiatan);
                        break;
                    case 4:
                        lb_selasa_jam4.setText(waktu);
                        lb_selasa_kegiatan4.setText(kegiatan);
                        break;
                    case 5:
                        lb_selasa_jam5.setText(waktu);
                        lb_selasa_kegiatan5.setText(kegiatan);
                        break;
                    case 6:
                        lb_selasa_jam6.setText(waktu);
                        lb_selasa_kegiatan6.setText(kegiatan);
                        break;
                    case 7:
                        lb_selasa_jam7.setText(waktu);
                        lb_selasa_kegiatan7.setText(kegiatan);
                        break;
                    case 8:
                        lb_selasa_jam8.setText(waktu);
                        lb_selasa_kegiatan8.setText(kegiatan);
                        break;
                }
            break;
            
            case "Rabu":
                switch (index) {
                    case 1:
                        lb_rabu_jam1.setText(waktu);
                        lb_rabu_kegiatan1.setText(kegiatan);
                        break;
                    case 2:
                        lb_rabu_jam2.setText(waktu);
                        lb_rabu_kegiatan2.setText(kegiatan);
                        break;
                    case 3:
                        lb_rabu_jam3.setText(waktu);
                        lb_rabu_kegiatan3.setText(kegiatan);
                        break;
                    case 4:
                        lb_rabu_jam4.setText(waktu);
                        lb_rabu_kegiatan4.setText(kegiatan);
                        break;
                    case 5:
                        lb_rabu_jam5.setText(waktu);
                        lb_rabu_kegiatan5.setText(kegiatan);
                        break;
                    case 6:
                        lb_rabu_jam6.setText(waktu);
                        lb_rabu_kegiatan6.setText(kegiatan);
                        break;
                    case 7:
                        lb_rabu_jam7.setText(waktu);
                        lb_rabu_kegiatan7.setText(kegiatan);
                        break;
                    case 8:
                        lb_rabu_jam8.setText(waktu);
                        lb_rabu_kegiatan8.setText(kegiatan);
                        break;
                }
            break;
            
            case "Kamis":
                switch (index) {
                    case 1:
                        lb_kamis_jam1.setText(waktu);
                        lb_kamis_kegiatan1.setText(kegiatan);
                        break;
                    case 2:
                        lb_kamis_jam2.setText(waktu);
                        lb_kamis_kegiatan2.setText(kegiatan);
                        break;
                    case 3:
                        lb_kamis_jam3.setText(waktu);
                        lb_kamis_kegiatan3.setText(kegiatan);
                        break;
                    case 4:
                        lb_kamis_jam4.setText(waktu);
                        lb_kamis_kegiatan4.setText(kegiatan);
                        break;
                    case 5:
                        lb_kamis_jam5.setText(waktu);
                        lb_kamis_kegiatan5.setText(kegiatan);
                        break;
                    case 6:
                        lb_kamis_jam6.setText(waktu);
                        lb_kamis_kegiatan6.setText(kegiatan);
                        break;
                    case 7:
                        lb_kamis_jam7.setText(waktu);
                        lb_kamis_kegiatan7.setText(kegiatan);
                        break;
                    case 8:
                        lb_kamis_jam8.setText(waktu);
                        lb_kamis_kegiatan8.setText(kegiatan);
                        break;
                }
            break;
            
            case "Jumat":
                switch (index) {
                    case 1:
                        lb_jumat_jam1.setText(waktu);
                        lb_jumat_kegiatan1.setText(kegiatan);
                        break;
                    case 2:
                        lb_jumat_jam2.setText(waktu);
                        lb_jumat_kegiatan2.setText(kegiatan);
                        break;
                    case 3:
                        lb_jumat_jam3.setText(waktu);
                        lb_jumat_kegiatan3.setText(kegiatan);
                        break;
                    case 4:
                        lb_jumat_jam4.setText(waktu);
                        lb_jumat_kegiatan4.setText(kegiatan);
                        break;
                    case 5:
                        lb_jumat_jam5.setText(waktu);
                        lb_jumat_kegiatan5.setText(kegiatan);
                        break;
                    case 6:
                        lb_jumat_jam6.setText(waktu);
                        lb_jumat_kegiatan6.setText(kegiatan);
                        break;
                    case 7:
                        lb_jumat_jam7.setText(waktu);
                        lb_jumat_kegiatan7.setText(kegiatan);
                        break;
                    case 8:
                        lb_jumat_jam8.setText(waktu);
                        lb_jumat_kegiatan8.setText(kegiatan);
                        break;
                }
            break;
            
            case "Sabtu":
                switch (index) {
                    case 1:
                        lb_sabtu_jam1.setText(waktu);
                        lb_sabtu_kegiatan1.setText(kegiatan);
                        break;
                    case 2:
                        lb_sabtu_jam2.setText(waktu);
                        lb_sabtu_kegiatan2.setText(kegiatan);
                        break;
                    case 3:
                        lb_sabtu_jam3.setText(waktu);
                        lb_sabtu_kegiatan3.setText(kegiatan);
                        break;
                    case 4:
                        lb_sabtu_jam4.setText(waktu);
                        lb_sabtu_kegiatan4.setText(kegiatan);
                        break;
                    case 5:
                        lb_sabtu_jam5.setText(waktu);
                        lb_sabtu_kegiatan5.setText(kegiatan);
                        break;
                    case 6:
                        lb_sabtu_jam6.setText(waktu);
                        lb_sabtu_kegiatan6.setText(kegiatan);
                        break;
                    case 7:
                        lb_sabtu_jam7.setText(waktu);
                        lb_sabtu_kegiatan7.setText(kegiatan);
                        break;
                    case 8:
                        lb_sabtu_jam8.setText(waktu);
                        lb_sabtu_kegiatan8.setText(kegiatan);
                        break;
                }
            break;
            
            case "Minggu":
                switch (index) {
                    case 1:
                        lb_minggu_jam1.setText(waktu);
                        lb_minggu_kegiatan1.setText(kegiatan);
                        break;
                    case 2:
                        lb_minggu_jam2.setText(waktu);
                        lb_minggu_kegiatan2.setText(kegiatan);
                        break;
                    case 3:
                        lb_minggu_jam3.setText(waktu);
                        lb_minggu_kegiatan3.setText(kegiatan);
                        break;
                    case 4:
                        lb_minggu_jam4.setText(waktu);
                        lb_minggu_kegiatan4.setText(kegiatan);
                        break;
                    case 5:
                        lb_minggu_jam5.setText(waktu);
                        lb_minggu_kegiatan5.setText(kegiatan);
                        break;
                    case 6:
                        lb_minggu_jam6.setText(waktu);
                        lb_minggu_kegiatan6.setText(kegiatan);
                        break;
                    case 7:
                        lb_minggu_jam7.setText(waktu);
                        lb_minggu_kegiatan7.setText(kegiatan);
                        break;
                    case 8:
                        lb_minggu_jam8.setText(waktu);
                        lb_minggu_kegiatan8.setText(kegiatan);
                        break;
                }
            break;
        }
    }
    
    class Schedule {
        private Time waktu;
        private String kegiatan;
        
        public Schedule(Time waktu, String kegiatan) {
            this.waktu = waktu;
            this.kegiatan = kegiatan;
        }
        
        public Time getWaktu() {
            return waktu;
        }
        
        public String getKegiatan() {
            return kegiatan;
        }
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_tanggal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lb_hari = new javax.swing.JLabel();
        Senin = new javax.swing.JLabel();
        Selasa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        lb_senin_jam1 = new javax.swing.JLabel();
        lb_senin_kegiatan1 = new javax.swing.JLabel();
        lb_senin_kegiatan2 = new javax.swing.JLabel();
        lb_senin_jam2 = new javax.swing.JLabel();
        lb_senin_kegiatan3 = new javax.swing.JLabel();
        lb_senin_jam3 = new javax.swing.JLabel();
        lb_senin_jam4 = new javax.swing.JLabel();
        lb_senin_kegiatan4 = new javax.swing.JLabel();
        lb_senin_kegiatan5 = new javax.swing.JLabel();
        lb_senin_jam5 = new javax.swing.JLabel();
        lb_senin_kegiatan6 = new javax.swing.JLabel();
        lb_senin_jam6 = new javax.swing.JLabel();
        lb_senin_kegiatan7 = new javax.swing.JLabel();
        lb_senin_jam7 = new javax.swing.JLabel();
        lb_senin_jam8 = new javax.swing.JLabel();
        lb_senin_kegiatan8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        lb_selasa_jam1 = new javax.swing.JLabel();
        lb_selasa_kegiatan1 = new javax.swing.JLabel();
        lb_selasa_kegiatan2 = new javax.swing.JLabel();
        lb_selasa_jam2 = new javax.swing.JLabel();
        lb_selasa_kegiatan3 = new javax.swing.JLabel();
        lb_selasa_jam3 = new javax.swing.JLabel();
        lb_selasa_jam4 = new javax.swing.JLabel();
        lb_selasa_kegiatan4 = new javax.swing.JLabel();
        lb_selasa_kegiatan5 = new javax.swing.JLabel();
        lb_selasa_jam5 = new javax.swing.JLabel();
        lb_selasa_kegiatan6 = new javax.swing.JLabel();
        lb_selasa_jam6 = new javax.swing.JLabel();
        lb_selasa_kegiatan7 = new javax.swing.JLabel();
        lb_selasa_jam7 = new javax.swing.JLabel();
        lb_selasa_jam8 = new javax.swing.JLabel();
        lb_selasa_kegiatan8 = new javax.swing.JLabel();
        Rabu = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        lb_rabu_jam1 = new javax.swing.JLabel();
        lb_rabu_kegiatan1 = new javax.swing.JLabel();
        lb_rabu_kegiatan2 = new javax.swing.JLabel();
        lb_rabu_jam2 = new javax.swing.JLabel();
        lb_rabu_kegiatan3 = new javax.swing.JLabel();
        lb_rabu_jam3 = new javax.swing.JLabel();
        lb_rabu_jam4 = new javax.swing.JLabel();
        lb_rabu_kegiatan4 = new javax.swing.JLabel();
        lb_rabu_kegiatan5 = new javax.swing.JLabel();
        lb_rabu_jam5 = new javax.swing.JLabel();
        lb_rabu_kegiatan6 = new javax.swing.JLabel();
        lb_rabu_jam6 = new javax.swing.JLabel();
        lb_rabu_kegiatan7 = new javax.swing.JLabel();
        lb_rabu_jam7 = new javax.swing.JLabel();
        lb_rabu_jam8 = new javax.swing.JLabel();
        lb_rabu_kegiatan8 = new javax.swing.JLabel();
        Kamis = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        lb_kamis_jam1 = new javax.swing.JLabel();
        lb_kamis_kegiatan1 = new javax.swing.JLabel();
        lb_kamis_kegiatan2 = new javax.swing.JLabel();
        lb_kamis_jam2 = new javax.swing.JLabel();
        lb_kamis_kegiatan3 = new javax.swing.JLabel();
        lb_kamis_jam3 = new javax.swing.JLabel();
        lb_kamis_jam4 = new javax.swing.JLabel();
        lb_kamis_kegiatan4 = new javax.swing.JLabel();
        lb_kamis_kegiatan5 = new javax.swing.JLabel();
        lb_kamis_jam5 = new javax.swing.JLabel();
        lb_kamis_kegiatan6 = new javax.swing.JLabel();
        lb_kamis_jam6 = new javax.swing.JLabel();
        lb_kamis_kegiatan7 = new javax.swing.JLabel();
        lb_kamis_jam7 = new javax.swing.JLabel();
        lb_kamis_jam8 = new javax.swing.JLabel();
        lb_kamis_kegiatan8 = new javax.swing.JLabel();
        Jumat = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        lb_jumat_jam1 = new javax.swing.JLabel();
        lb_jumat_kegiatan1 = new javax.swing.JLabel();
        lb_jumat_kegiatan2 = new javax.swing.JLabel();
        lb_jumat_jam2 = new javax.swing.JLabel();
        lb_jumat_kegiatan3 = new javax.swing.JLabel();
        lb_jumat_jam3 = new javax.swing.JLabel();
        lb_jumat_jam4 = new javax.swing.JLabel();
        lb_jumat_kegiatan4 = new javax.swing.JLabel();
        lb_jumat_kegiatan5 = new javax.swing.JLabel();
        lb_jumat_jam5 = new javax.swing.JLabel();
        lb_jumat_kegiatan6 = new javax.swing.JLabel();
        lb_jumat_jam6 = new javax.swing.JLabel();
        lb_jumat_kegiatan7 = new javax.swing.JLabel();
        lb_jumat_jam7 = new javax.swing.JLabel();
        lb_jumat_jam8 = new javax.swing.JLabel();
        lb_jumat_kegiatan8 = new javax.swing.JLabel();
        Sabtu = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        lb_sabtu_jam1 = new javax.swing.JLabel();
        lb_sabtu_kegiatan1 = new javax.swing.JLabel();
        lb_sabtu_kegiatan2 = new javax.swing.JLabel();
        lb_sabtu_jam2 = new javax.swing.JLabel();
        lb_sabtu_kegiatan3 = new javax.swing.JLabel();
        lb_sabtu_jam3 = new javax.swing.JLabel();
        lb_sabtu_jam4 = new javax.swing.JLabel();
        lb_sabtu_kegiatan4 = new javax.swing.JLabel();
        lb_sabtu_kegiatan5 = new javax.swing.JLabel();
        lb_sabtu_jam5 = new javax.swing.JLabel();
        lb_sabtu_kegiatan6 = new javax.swing.JLabel();
        lb_sabtu_jam6 = new javax.swing.JLabel();
        lb_sabtu_kegiatan7 = new javax.swing.JLabel();
        lb_sabtu_jam7 = new javax.swing.JLabel();
        lb_sabtu_jam8 = new javax.swing.JLabel();
        lb_sabtu_kegiatan8 = new javax.swing.JLabel();
        Minggu = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        lb_minggu_jam1 = new javax.swing.JLabel();
        lb_minggu_kegiatan1 = new javax.swing.JLabel();
        lb_minggu_kegiatan2 = new javax.swing.JLabel();
        lb_minggu_jam2 = new javax.swing.JLabel();
        lb_minggu_kegiatan3 = new javax.swing.JLabel();
        lb_minggu_jam3 = new javax.swing.JLabel();
        lb_minggu_jam4 = new javax.swing.JLabel();
        lb_minggu_kegiatan4 = new javax.swing.JLabel();
        lb_minggu_kegiatan5 = new javax.swing.JLabel();
        lb_minggu_jam5 = new javax.swing.JLabel();
        lb_minggu_kegiatan6 = new javax.swing.JLabel();
        lb_minggu_jam6 = new javax.swing.JLabel();
        lb_minggu_kegiatan7 = new javax.swing.JLabel();
        lb_minggu_jam7 = new javax.swing.JLabel();
        lb_minggu_jam8 = new javax.swing.JLabel();
        lb_minggu_kegiatan8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(16, 16, 132));
        jPanel1.setForeground(new java.awt.Color(20, 20, 184));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VitalLife");

        jButton1.setBackground(new java.awt.Color(16, 74, 132));
        jButton1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(301, 301, 301)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane8.setPreferredSize(new java.awt.Dimension(588, 1265));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jadwal Mingguan");

        jLabel2.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        jLabel2.setText("Tanggal :");

        lb_tanggal.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lb_tanggal.setText(".......");

        jButton2.setBackground(new java.awt.Color(16, 74, 132));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cyber\\Downloads\\Semester 2\\Kuliah\\Pemrograman Berorientasi Obyek\\Tugas Besar\\Desktop-PBO\\program_vital_life\\src\\Icon\\icons8-plus-32.png")); // NOI18N
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        jLabel10.setText("Hari :");

        lb_hari.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lb_hari.setText(".......");

        Senin.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        Senin.setText("Senin");

        Selasa.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        Selasa.setText("Selasa");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(961, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(16, 74, 132)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 95));

        lb_senin_jam1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_senin_jam1.setText("jLabel5");

        lb_senin_kegiatan1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_senin_kegiatan1.setText("jLabel5");

        lb_senin_kegiatan2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_senin_kegiatan2.setText("jLabel5");

        lb_senin_jam2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_senin_jam2.setText("jLabel5");

        lb_senin_kegiatan3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_senin_kegiatan3.setText("jLabel5");

        lb_senin_jam3.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_senin_jam3.setText("jLabel5");

        lb_senin_jam4.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_senin_jam4.setText("jLabel5");

        lb_senin_kegiatan4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_senin_kegiatan4.setText("jLabel5");

        lb_senin_kegiatan5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_senin_kegiatan5.setText("jLabel5");

        lb_senin_jam5.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_senin_jam5.setText("jLabel5");

        lb_senin_kegiatan6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_senin_kegiatan6.setText("jLabel5");

        lb_senin_jam6.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_senin_jam6.setText("jLabel5");

        lb_senin_kegiatan7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_senin_kegiatan7.setText("jLabel5");

        lb_senin_jam7.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_senin_jam7.setText("jLabel5");

        lb_senin_jam8.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_senin_jam8.setText("jLabel5");

        lb_senin_kegiatan8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_senin_kegiatan8.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_senin_jam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senin_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_senin_jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senin_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_senin_jam3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senin_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_senin_jam4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senin_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_senin_jam5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senin_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_senin_jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senin_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_senin_jam7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senin_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_senin_jam8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senin_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_senin_jam8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_senin_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_senin_jam7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_senin_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_senin_jam6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_senin_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_senin_jam5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_senin_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_senin_jam4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_senin_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_senin_jam3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_senin_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_senin_jam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_senin_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_senin_jam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_senin_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(961, 120));

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(16, 74, 132)));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 95));

        lb_selasa_jam1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_selasa_jam1.setText("jLabel5");

        lb_selasa_kegiatan1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_selasa_kegiatan1.setText("jLabel5");

        lb_selasa_kegiatan2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_selasa_kegiatan2.setText("jLabel5");

        lb_selasa_jam2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_selasa_jam2.setText("jLabel5");

        lb_selasa_kegiatan3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_selasa_kegiatan3.setText("jLabel5");

        lb_selasa_jam3.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_selasa_jam3.setText("jLabel5");

        lb_selasa_jam4.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_selasa_jam4.setText("jLabel5");

        lb_selasa_kegiatan4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_selasa_kegiatan4.setText("jLabel5");

        lb_selasa_kegiatan5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_selasa_kegiatan5.setText("jLabel5");

        lb_selasa_jam5.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_selasa_jam5.setText("jLabel5");

        lb_selasa_kegiatan6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_selasa_kegiatan6.setText("jLabel5");

        lb_selasa_jam6.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_selasa_jam6.setText("jLabel5");

        lb_selasa_kegiatan7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_selasa_kegiatan7.setText("jLabel5");

        lb_selasa_jam7.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_selasa_jam7.setText("jLabel5");

        lb_selasa_jam8.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_selasa_jam8.setText("jLabel5");

        lb_selasa_kegiatan8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_selasa_kegiatan8.setText("jLabel5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selasa_jam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_selasa_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selasa_jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_selasa_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selasa_jam3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_selasa_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selasa_jam4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_selasa_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selasa_jam5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_selasa_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selasa_jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_selasa_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selasa_jam7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_selasa_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selasa_jam8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_selasa_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_selasa_jam8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_selasa_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_selasa_jam7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_selasa_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_selasa_jam6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_selasa_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_selasa_jam5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_selasa_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_selasa_jam4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_selasa_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_selasa_jam3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_selasa_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_selasa_jam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_selasa_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_selasa_jam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_selasa_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        Rabu.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        Rabu.setText("Rabu");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(961, 120));

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(16, 74, 132)));
        jPanel4.setPreferredSize(new java.awt.Dimension(1500, 95));

        lb_rabu_jam1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_rabu_jam1.setText("jLabel5");

        lb_rabu_kegiatan1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_rabu_kegiatan1.setText("jLabel5");

        lb_rabu_kegiatan2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_rabu_kegiatan2.setText("jLabel5");

        lb_rabu_jam2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_rabu_jam2.setText("jLabel5");

        lb_rabu_kegiatan3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_rabu_kegiatan3.setText("jLabel5");

        lb_rabu_jam3.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_rabu_jam3.setText("jLabel5");

        lb_rabu_jam4.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_rabu_jam4.setText("jLabel5");

        lb_rabu_kegiatan4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_rabu_kegiatan4.setText("jLabel5");

        lb_rabu_kegiatan5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_rabu_kegiatan5.setText("jLabel5");

        lb_rabu_jam5.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_rabu_jam5.setText("jLabel5");

        lb_rabu_kegiatan6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_rabu_kegiatan6.setText("jLabel5");

        lb_rabu_jam6.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_rabu_jam6.setText("jLabel5");

        lb_rabu_kegiatan7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_rabu_kegiatan7.setText("jLabel5");

        lb_rabu_jam7.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_rabu_jam7.setText("jLabel5");

        lb_rabu_jam8.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_rabu_jam8.setText("jLabel5");

        lb_rabu_kegiatan8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_rabu_kegiatan8.setText("jLabel5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rabu_jam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rabu_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rabu_jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rabu_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rabu_jam3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rabu_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rabu_jam4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rabu_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rabu_jam5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rabu_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rabu_jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rabu_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rabu_jam7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rabu_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_rabu_jam8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rabu_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_rabu_jam8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_rabu_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_rabu_jam7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_rabu_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_rabu_jam6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_rabu_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_rabu_jam5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_rabu_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_rabu_jam4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_rabu_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_rabu_jam3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_rabu_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_rabu_jam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_rabu_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_rabu_jam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_rabu_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel4);

        Kamis.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        Kamis.setText("Kamis");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(961, 120));

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(16, 74, 132)));
        jPanel5.setPreferredSize(new java.awt.Dimension(1500, 95));

        lb_kamis_jam1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_kamis_jam1.setText("jLabel5");

        lb_kamis_kegiatan1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_kamis_kegiatan1.setText("jLabel5");

        lb_kamis_kegiatan2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_kamis_kegiatan2.setText("jLabel5");

        lb_kamis_jam2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_kamis_jam2.setText("jLabel5");

        lb_kamis_kegiatan3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_kamis_kegiatan3.setText("jLabel5");

        lb_kamis_jam3.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_kamis_jam3.setText("jLabel5");

        lb_kamis_jam4.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_kamis_jam4.setText("jLabel5");

        lb_kamis_kegiatan4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_kamis_kegiatan4.setText("jLabel5");

        lb_kamis_kegiatan5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_kamis_kegiatan5.setText("jLabel5");

        lb_kamis_jam5.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_kamis_jam5.setText("jLabel5");

        lb_kamis_kegiatan6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_kamis_kegiatan6.setText("jLabel5");

        lb_kamis_jam6.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_kamis_jam6.setText("jLabel5");

        lb_kamis_kegiatan7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_kamis_kegiatan7.setText("jLabel5");

        lb_kamis_jam7.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_kamis_jam7.setText("jLabel5");

        lb_kamis_jam8.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_kamis_jam8.setText("jLabel5");

        lb_kamis_kegiatan8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_kamis_kegiatan8.setText("jLabel5");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kamis_jam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kamis_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kamis_jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kamis_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kamis_jam3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kamis_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kamis_jam4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kamis_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kamis_jam5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kamis_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kamis_jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kamis_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kamis_jam7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kamis_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kamis_jam8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_kamis_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_kamis_jam8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_kamis_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_kamis_jam7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_kamis_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_kamis_jam6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_kamis_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_kamis_jam5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_kamis_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_kamis_jam4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_kamis_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_kamis_jam3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_kamis_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_kamis_jam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_kamis_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb_kamis_jam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_kamis_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel5);

        Jumat.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        Jumat.setText("Jumat");

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setPreferredSize(new java.awt.Dimension(961, 120));

        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(16, 74, 132)));
        jPanel6.setPreferredSize(new java.awt.Dimension(1500, 95));

        lb_jumat_jam1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_jumat_jam1.setText("jLabel5");

        lb_jumat_kegiatan1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_jumat_kegiatan1.setText("jLabel5");

        lb_jumat_kegiatan2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_jumat_kegiatan2.setText("jLabel5");

        lb_jumat_jam2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_jumat_jam2.setText("jLabel5");

        lb_jumat_kegiatan3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_jumat_kegiatan3.setText("jLabel5");

        lb_jumat_jam3.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_jumat_jam3.setText("jLabel5");

        lb_jumat_jam4.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_jumat_jam4.setText("jLabel5");

        lb_jumat_kegiatan4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_jumat_kegiatan4.setText("jLabel5");

        lb_jumat_kegiatan5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_jumat_kegiatan5.setText("jLabel5");

        lb_jumat_jam5.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_jumat_jam5.setText("jLabel5");

        lb_jumat_kegiatan6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_jumat_kegiatan6.setText("jLabel5");

        lb_jumat_jam6.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_jumat_jam6.setText("jLabel5");

        lb_jumat_kegiatan7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_jumat_kegiatan7.setText("jLabel5");

        lb_jumat_jam7.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_jumat_jam7.setText("jLabel5");

        lb_jumat_jam8.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_jumat_jam8.setText("jLabel5");

        lb_jumat_kegiatan8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_jumat_kegiatan8.setText("jLabel5");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumat_jam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_jumat_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumat_jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_jumat_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumat_jam3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_jumat_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumat_jam4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_jumat_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumat_jam5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_jumat_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumat_jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_jumat_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumat_jam7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_jumat_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumat_jam8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_jumat_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_jumat_jam8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumat_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_jumat_jam7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumat_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_jumat_jam6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumat_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_jumat_jam5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumat_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_jumat_jam4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumat_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_jumat_jam3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumat_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_jumat_jam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumat_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_jumat_jam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumat_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel6);

        Sabtu.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        Sabtu.setText("Sabtu");

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setPreferredSize(new java.awt.Dimension(961, 120));

        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(16, 74, 132)));
        jPanel7.setPreferredSize(new java.awt.Dimension(1500, 95));

        lb_sabtu_jam1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_sabtu_jam1.setText("jLabel5");

        lb_sabtu_kegiatan1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_sabtu_kegiatan1.setText("jLabel5");

        lb_sabtu_kegiatan2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_sabtu_kegiatan2.setText("jLabel5");

        lb_sabtu_jam2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_sabtu_jam2.setText("jLabel5");

        lb_sabtu_kegiatan3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_sabtu_kegiatan3.setText("jLabel5");

        lb_sabtu_jam3.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_sabtu_jam3.setText("jLabel5");

        lb_sabtu_jam4.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_sabtu_jam4.setText("jLabel5");

        lb_sabtu_kegiatan4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_sabtu_kegiatan4.setText("jLabel5");

        lb_sabtu_kegiatan5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_sabtu_kegiatan5.setText("jLabel5");

        lb_sabtu_jam5.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_sabtu_jam5.setText("jLabel5");

        lb_sabtu_kegiatan6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_sabtu_kegiatan6.setText("jLabel5");

        lb_sabtu_jam6.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_sabtu_jam6.setText("jLabel5");

        lb_sabtu_kegiatan7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_sabtu_kegiatan7.setText("jLabel5");

        lb_sabtu_jam7.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_sabtu_jam7.setText("jLabel5");

        lb_sabtu_jam8.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_sabtu_jam8.setText("jLabel5");

        lb_sabtu_kegiatan8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_sabtu_kegiatan8.setText("jLabel5");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_sabtu_jam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sabtu_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_sabtu_jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sabtu_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_sabtu_jam3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sabtu_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_sabtu_jam4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sabtu_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_sabtu_jam5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sabtu_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_sabtu_jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sabtu_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_sabtu_jam7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sabtu_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_sabtu_jam8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sabtu_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_sabtu_jam8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_sabtu_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_sabtu_jam7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_sabtu_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_sabtu_jam6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_sabtu_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_sabtu_jam5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_sabtu_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_sabtu_jam4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_sabtu_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_sabtu_jam3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_sabtu_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_sabtu_jam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_sabtu_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_sabtu_jam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_sabtu_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel7);

        Minggu.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        Minggu.setText("Minggu");

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane7.setPreferredSize(new java.awt.Dimension(961, 120));

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(16, 74, 132)));
        jPanel8.setPreferredSize(new java.awt.Dimension(1500, 95));

        lb_minggu_jam1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_minggu_jam1.setText("jLabel5");

        lb_minggu_kegiatan1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_minggu_kegiatan1.setText("jLabel5");

        lb_minggu_kegiatan2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_minggu_kegiatan2.setText("jLabel5");

        lb_minggu_jam2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_minggu_jam2.setText("jLabel5");

        lb_minggu_kegiatan3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_minggu_kegiatan3.setText("jLabel5");

        lb_minggu_jam3.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_minggu_jam3.setText("jLabel5");

        lb_minggu_jam4.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_minggu_jam4.setText("jLabel5");

        lb_minggu_kegiatan4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_minggu_kegiatan4.setText("jLabel5");

        lb_minggu_kegiatan5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_minggu_kegiatan5.setText("jLabel5");

        lb_minggu_jam5.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_minggu_jam5.setText("jLabel5");

        lb_minggu_kegiatan6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_minggu_kegiatan6.setText("jLabel5");

        lb_minggu_jam6.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_minggu_jam6.setText("jLabel5");

        lb_minggu_kegiatan7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_minggu_kegiatan7.setText("jLabel5");

        lb_minggu_jam7.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_minggu_jam7.setText("jLabel5");

        lb_minggu_jam8.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lb_minggu_jam8.setText("jLabel5");

        lb_minggu_kegiatan8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lb_minggu_kegiatan8.setText("jLabel5");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_minggu_jam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_minggu_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_minggu_jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_minggu_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_minggu_jam3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_minggu_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_minggu_jam4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_minggu_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_minggu_jam5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_minggu_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_minggu_jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_minggu_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_minggu_jam7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_minggu_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_minggu_jam8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_minggu_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lb_minggu_jam8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_minggu_kegiatan8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lb_minggu_jam7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_minggu_kegiatan7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lb_minggu_jam6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_minggu_kegiatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lb_minggu_jam5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_minggu_kegiatan5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lb_minggu_jam4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_minggu_kegiatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lb_minggu_jam3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_minggu_kegiatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lb_minggu_jam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_minggu_kegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lb_minggu_jam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_minggu_kegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rabu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Kamis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jumat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Sabtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Minggu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(585, 585, 585))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Senin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Selasa))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(269, 269, 269)
                                .addComponent(jButton2)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_hari, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_tanggal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lb_hari))
                .addGap(18, 18, 18)
                .addComponent(Senin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Selasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rabu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Kamis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jumat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sabtu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Minggu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane8.setViewportView(jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new menu_utama_user().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new form_tambah_jadwal().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void tanggal_hari_ini() {
        LocalDate today = LocalDate.now();
        
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        
        DateTimeFormatter dayformatter = DateTimeFormatter.ofPattern("EEEE", new Locale("id", "ID"));
//        int tanggal = today.getDayOfMonth();
//        int bulan = today.getMonthValue();
//        int tahun = today.getYear();
        
        String tanggal_sekarang = today.format(dateformatter);
        String hari_ini = today.format(dayformatter);
        
        lb_tanggal.setText(tanggal_sekarang);
        lb_hari.setText(hari_ini);
    }
    
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
            java.util.logging.Logger.getLogger(menu_jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_jadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jumat;
    private javax.swing.JLabel Kamis;
    private javax.swing.JLabel Minggu;
    private javax.swing.JLabel Rabu;
    private javax.swing.JLabel Sabtu;
    private javax.swing.JLabel Selasa;
    private javax.swing.JLabel Senin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lb_hari;
    private javax.swing.JLabel lb_jumat_jam1;
    private javax.swing.JLabel lb_jumat_jam2;
    private javax.swing.JLabel lb_jumat_jam3;
    private javax.swing.JLabel lb_jumat_jam4;
    private javax.swing.JLabel lb_jumat_jam5;
    private javax.swing.JLabel lb_jumat_jam6;
    private javax.swing.JLabel lb_jumat_jam7;
    private javax.swing.JLabel lb_jumat_jam8;
    private javax.swing.JLabel lb_jumat_kegiatan1;
    private javax.swing.JLabel lb_jumat_kegiatan2;
    private javax.swing.JLabel lb_jumat_kegiatan3;
    private javax.swing.JLabel lb_jumat_kegiatan4;
    private javax.swing.JLabel lb_jumat_kegiatan5;
    private javax.swing.JLabel lb_jumat_kegiatan6;
    private javax.swing.JLabel lb_jumat_kegiatan7;
    private javax.swing.JLabel lb_jumat_kegiatan8;
    private javax.swing.JLabel lb_kamis_jam1;
    private javax.swing.JLabel lb_kamis_jam2;
    private javax.swing.JLabel lb_kamis_jam3;
    private javax.swing.JLabel lb_kamis_jam4;
    private javax.swing.JLabel lb_kamis_jam5;
    private javax.swing.JLabel lb_kamis_jam6;
    private javax.swing.JLabel lb_kamis_jam7;
    private javax.swing.JLabel lb_kamis_jam8;
    private javax.swing.JLabel lb_kamis_kegiatan1;
    private javax.swing.JLabel lb_kamis_kegiatan2;
    private javax.swing.JLabel lb_kamis_kegiatan3;
    private javax.swing.JLabel lb_kamis_kegiatan4;
    private javax.swing.JLabel lb_kamis_kegiatan5;
    private javax.swing.JLabel lb_kamis_kegiatan6;
    private javax.swing.JLabel lb_kamis_kegiatan7;
    private javax.swing.JLabel lb_kamis_kegiatan8;
    private javax.swing.JLabel lb_minggu_jam1;
    private javax.swing.JLabel lb_minggu_jam2;
    private javax.swing.JLabel lb_minggu_jam3;
    private javax.swing.JLabel lb_minggu_jam4;
    private javax.swing.JLabel lb_minggu_jam5;
    private javax.swing.JLabel lb_minggu_jam6;
    private javax.swing.JLabel lb_minggu_jam7;
    private javax.swing.JLabel lb_minggu_jam8;
    private javax.swing.JLabel lb_minggu_kegiatan1;
    private javax.swing.JLabel lb_minggu_kegiatan2;
    private javax.swing.JLabel lb_minggu_kegiatan3;
    private javax.swing.JLabel lb_minggu_kegiatan4;
    private javax.swing.JLabel lb_minggu_kegiatan5;
    private javax.swing.JLabel lb_minggu_kegiatan6;
    private javax.swing.JLabel lb_minggu_kegiatan7;
    private javax.swing.JLabel lb_minggu_kegiatan8;
    private javax.swing.JLabel lb_rabu_jam1;
    private javax.swing.JLabel lb_rabu_jam2;
    private javax.swing.JLabel lb_rabu_jam3;
    private javax.swing.JLabel lb_rabu_jam4;
    private javax.swing.JLabel lb_rabu_jam5;
    private javax.swing.JLabel lb_rabu_jam6;
    private javax.swing.JLabel lb_rabu_jam7;
    private javax.swing.JLabel lb_rabu_jam8;
    private javax.swing.JLabel lb_rabu_kegiatan1;
    private javax.swing.JLabel lb_rabu_kegiatan2;
    private javax.swing.JLabel lb_rabu_kegiatan3;
    private javax.swing.JLabel lb_rabu_kegiatan4;
    private javax.swing.JLabel lb_rabu_kegiatan5;
    private javax.swing.JLabel lb_rabu_kegiatan6;
    private javax.swing.JLabel lb_rabu_kegiatan7;
    private javax.swing.JLabel lb_rabu_kegiatan8;
    private javax.swing.JLabel lb_sabtu_jam1;
    private javax.swing.JLabel lb_sabtu_jam2;
    private javax.swing.JLabel lb_sabtu_jam3;
    private javax.swing.JLabel lb_sabtu_jam4;
    private javax.swing.JLabel lb_sabtu_jam5;
    private javax.swing.JLabel lb_sabtu_jam6;
    private javax.swing.JLabel lb_sabtu_jam7;
    private javax.swing.JLabel lb_sabtu_jam8;
    private javax.swing.JLabel lb_sabtu_kegiatan1;
    private javax.swing.JLabel lb_sabtu_kegiatan2;
    private javax.swing.JLabel lb_sabtu_kegiatan3;
    private javax.swing.JLabel lb_sabtu_kegiatan4;
    private javax.swing.JLabel lb_sabtu_kegiatan5;
    private javax.swing.JLabel lb_sabtu_kegiatan6;
    private javax.swing.JLabel lb_sabtu_kegiatan7;
    private javax.swing.JLabel lb_sabtu_kegiatan8;
    private javax.swing.JLabel lb_selasa_jam1;
    private javax.swing.JLabel lb_selasa_jam2;
    private javax.swing.JLabel lb_selasa_jam3;
    private javax.swing.JLabel lb_selasa_jam4;
    private javax.swing.JLabel lb_selasa_jam5;
    private javax.swing.JLabel lb_selasa_jam6;
    private javax.swing.JLabel lb_selasa_jam7;
    private javax.swing.JLabel lb_selasa_jam8;
    private javax.swing.JLabel lb_selasa_kegiatan1;
    private javax.swing.JLabel lb_selasa_kegiatan2;
    private javax.swing.JLabel lb_selasa_kegiatan3;
    private javax.swing.JLabel lb_selasa_kegiatan4;
    private javax.swing.JLabel lb_selasa_kegiatan5;
    private javax.swing.JLabel lb_selasa_kegiatan6;
    private javax.swing.JLabel lb_selasa_kegiatan7;
    private javax.swing.JLabel lb_selasa_kegiatan8;
    private javax.swing.JLabel lb_senin_jam1;
    private javax.swing.JLabel lb_senin_jam2;
    private javax.swing.JLabel lb_senin_jam3;
    private javax.swing.JLabel lb_senin_jam4;
    private javax.swing.JLabel lb_senin_jam5;
    private javax.swing.JLabel lb_senin_jam6;
    private javax.swing.JLabel lb_senin_jam7;
    private javax.swing.JLabel lb_senin_jam8;
    private javax.swing.JLabel lb_senin_kegiatan1;
    private javax.swing.JLabel lb_senin_kegiatan2;
    private javax.swing.JLabel lb_senin_kegiatan3;
    private javax.swing.JLabel lb_senin_kegiatan4;
    private javax.swing.JLabel lb_senin_kegiatan5;
    private javax.swing.JLabel lb_senin_kegiatan6;
    private javax.swing.JLabel lb_senin_kegiatan7;
    private javax.swing.JLabel lb_senin_kegiatan8;
    private javax.swing.JLabel lb_tanggal;
    // End of variables declaration//GEN-END:variables
}
