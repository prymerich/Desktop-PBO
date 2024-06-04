/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package program_data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cyber
 */
public class menu_cek_lemak extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null;
    
    /**
     * Creates new form menu_cek_lemak
     */
    public menu_cek_lemak() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBerat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTinggi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtSaran = new javax.swing.JTextField();
        txtHasil = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

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
        jButton1.setText("Back");
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
                .addGap(307, 307, 307)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(412, 412, 412))
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

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menghitung Kadar Lemak Tubuh");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Berat Badan");

        txtBerat.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("kg");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Tinggi Badan");

        txtTinggi.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("cm");

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel9.setText("Usia");

        txtUsia.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel10.setText("tahun");

        cmbGender.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel11.setText("Jenis Kelamin");

        txtSaran.setBackground(new java.awt.Color(245, 245, 245));
        txtSaran.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtSaran.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaran.setBorder(null);

        txtHasil.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtHasil.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Kadar Lemak Tubuh Anda");

        btnHitung.setBackground(new java.awt.Color(16, 74, 132));
        btnHitung.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        btnHitung.setForeground(new java.awt.Color(255, 255, 255));
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel13.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUsia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTinggi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(377, 377, 377)
                            .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(299, 299, 299)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(txtSaran, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(btnHitung)
                .addGap(36, 36, 36)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new form_menu_utama().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        float berat_b, leher, paha, tinggi_b, pinggang;
        float hasil_p, hasil_l;
        float tb_meter;
        float logPerutLeher;
        float logTinggi;
        float imt;
        int usia;
        
        try {
            if(cmbGender.getSelectedItem().equals("") || txtUsia.getText().equals("") || txtTinggi.getText().equals("") || txtBerat.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Data tidak boleh kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
            }
            else {
                tinggi_b = Integer.valueOf(txtTinggi.getText());
                berat_b = Integer.valueOf(txtBerat.getText());
                usia = Integer.valueOf(txtUsia.getText());


                tb_meter = tinggi_b / 100.0f;
                imt = berat_b/(tb_meter * tb_meter);

                String jenis_kelamin = (String) cmbGender.getSelectedItem();


                if (jenis_kelamin.equals("Laki-laki")){

                    hasil_l = (float) ((1.2*imt)+((0.23*usia)- 5.4- 10.8));

                    if((hasil_l > 1.0) && (hasil_l <= 14.0 )){
                        txtHasil.setText(String.format("%.2f", hasil_l));
                        txtSaran.setText(String.valueOf("Anda Kekurangan Lemak"));
                    }
                    else if ((hasil_l > 14.0) && (hasil_l <= 20.0 )){
                        txtHasil.setText(String.format("%.2f",hasil_l));
                        txtSaran.setText(String.valueOf("Kadar Lemak anda Cukup"));
                    }
                    else if ((hasil_l > 20.0) && (hasil_l <= 25.0 )){
                        txtHasil.setText(String.format("%.2f",hasil_l));
                        txtSaran.setText(String.valueOf("Anda Sangat Bugar"));
                    }
                    else if ((hasil_l > 25.0) && (hasil_l <= 31.0 )){
                        txtHasil.setText(String.format("%.2f",hasil_l));
                        txtSaran.setText(String.valueOf("Kadar Lemak Anda Lebih Dari Cukup"));
                    }
                    else {
                        txtHasil.setText(String.format("%.2f",hasil_l));
                        txtSaran.setText(String.valueOf("Anda Obesitas"));
                    }

                }
                else {   
                    hasil_p = (float) ((1.2*imt)+((0.23*usia)- 5.4));

                     if((hasil_p > 1.0) && (hasil_p <= 14.0 )){
                        txtHasil.setText(String.format("%.2f",hasil_p));
                        txtSaran.setText(String.valueOf("Anda Kekurangan Lemak"));
                    }
                    else if ((hasil_p > 0.14) && (hasil_p <= 20.0 )){
                        txtHasil.setText(String.format("%.2f",hasil_p));
                        txtSaran.setText(String.valueOf("Kadar Lemak anda Cukup"));
                    }
                    else if ((hasil_p > 20.0) && (hasil_p <= 25.0 )){
                        txtHasil.setText(String.format("%.2f",hasil_p));
                        txtSaran.setText(String.valueOf("Anda Sangat Bugar"));
                    }
                    else if ((hasil_p > 25.0) && (hasil_p <= 31.0)){
                        txtHasil.setText(String.format("%.2f",hasil_p));
                        txtSaran.setText(String.valueOf("Kadar Lemak Anda Lebih Dari Cukup"));
                    }
                    else {
                        txtHasil.setText(String.format("%.2f",hasil_p));
                        txtSaran.setText(String.valueOf("Anda Obesitas"));
                    }
                }
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "");
                st = con.createStatement();
                String simpan = "INSERT INTO cek_lemak(jenis_kelamin, usia, tinggi, berat, hasil, saran) VALUES ('"+cmbGender.getSelectedItem()+"', '"+txtUsia.getText()+"', '"+txtTinggi.getText()+"', '"+txtBerat.getText()+"', '"+txtHasil.getText()+"', '"+txtSaran.getText()+"')";
                st = con.createStatement();
                int SA = st.executeUpdate(simpan);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed

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
            java.util.logging.Logger.getLogger(menu_cek_lemak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_cek_lemak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_cek_lemak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_cek_lemak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_cek_lemak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtSaran;
    private javax.swing.JTextField txtTinggi;
    private javax.swing.JTextField txtUsia;
    // End of variables declaration//GEN-END:variables
}
