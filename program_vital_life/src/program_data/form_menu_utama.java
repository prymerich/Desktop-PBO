/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package program_data;

/**
 *
 * @author Cyber
 */
public class form_menu_utama extends javax.swing.JFrame {

    /**
     * Creates new form form_menu_utama
     */
    public form_menu_utama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_pola_makan = new javax.swing.JButton();
        btn_olahraga = new javax.swing.JButton();
        btn_pola_tidur = new javax.swing.JButton();
        btn_jadwal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        btn_cek_imt = new javax.swing.JButton();
        btn_cek_lemak = new javax.swing.JButton();
        btn_kegiatan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_informasi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(16, 16, 132));
        jPanel1.setForeground(new java.awt.Color(20, 20, 184));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VitalLife");

        jPanel3.setBackground(new java.awt.Color(16, 74, 132));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ICON");

        jButton1.setBackground(new java.awt.Color(16, 16, 132));
        jButton1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pola Hidup");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_pola_makan.setBackground(new java.awt.Color(16, 16, 132));
        btn_pola_makan.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_pola_makan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pola_makan.setText("Atur Pola Makan");
        btn_pola_makan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pola_makan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pola_makanActionPerformed(evt);
            }
        });

        btn_olahraga.setBackground(new java.awt.Color(16, 16, 132));
        btn_olahraga.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_olahraga.setForeground(new java.awt.Color(255, 255, 255));
        btn_olahraga.setText("Olahraga Rutin");
        btn_olahraga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_olahraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_olahragaActionPerformed(evt);
            }
        });

        btn_pola_tidur.setBackground(new java.awt.Color(16, 16, 132));
        btn_pola_tidur.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_pola_tidur.setForeground(new java.awt.Color(255, 255, 255));
        btn_pola_tidur.setText("Jaga Pola Tidur");
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
        btn_jadwal.setText("Buat Jadwal");
        btn_jadwal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jadwalActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ICON");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ICON");

        jButton6.setBackground(new java.awt.Color(16, 16, 132));
        jButton6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cek Badan");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btn_cek_imt.setBackground(new java.awt.Color(16, 16, 132));
        btn_cek_imt.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_cek_imt.setForeground(new java.awt.Color(255, 255, 255));
        btn_cek_imt.setText("Cek IMT");
        btn_cek_imt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cek_imt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cek_imtActionPerformed(evt);
            }
        });

        btn_cek_lemak.setBackground(new java.awt.Color(16, 16, 132));
        btn_cek_lemak.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btn_cek_lemak.setForeground(new java.awt.Color(255, 255, 255));
        btn_cek_lemak.setText("Cek Kadar Lemak");
        btn_cek_lemak.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cek_lemak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cek_lemakActionPerformed(evt);
            }
        });

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
        jLabel5.setText("ICON");

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
        jLabel6.setText("ICON");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ICON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_pola_makan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_olahraga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_pola_tidur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cek_lemak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cek_imt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_informasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_kegiatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_jadwal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pola_makan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_olahraga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pola_tidur)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jadwal))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cek_imt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cek_lemak)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kegiatan))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_informasi))
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
        new menu_pola_tidur().setVisible(true);
    }//GEN-LAST:event_btn_pola_tidurActionPerformed

    private void btn_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jadwalActionPerformed
        this.dispose();
        new menu_jadwal().setVisible(true);
    }//GEN-LAST:event_btn_jadwalActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_cek_imtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cek_imtActionPerformed
        this.dispose();
        new menu_cek_imt().setVisible(true);
    }//GEN-LAST:event_btn_cek_imtActionPerformed

    private void btn_cek_lemakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cek_lemakActionPerformed
        this.dispose();
        new menu_cek_lemak().setVisible(true);
    }//GEN-LAST:event_btn_cek_lemakActionPerformed

    private void btn_kegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kegiatanActionPerformed
        this.dispose();
        new menu_rekomendasi_kegiatan().setVisible(true);
    }//GEN-LAST:event_btn_kegiatanActionPerformed

    private void btn_informasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informasiActionPerformed
        this.dispose();
        new menu_informasi().setVisible(true);
    }//GEN-LAST:event_btn_informasiActionPerformed

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
            java.util.logging.Logger.getLogger(form_menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_menu_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cek_imt;
    private javax.swing.JButton btn_cek_lemak;
    private javax.swing.JButton btn_informasi;
    private javax.swing.JButton btn_jadwal;
    private javax.swing.JButton btn_kegiatan;
    private javax.swing.JButton btn_olahraga;
    private javax.swing.JButton btn_pola_makan;
    private javax.swing.JButton btn_pola_tidur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
