
package program_data;

import javax.swing.JOptionPane;

import java.io.File;


public class menu_latihan_olahraga extends javax.swing.JFrame {

    /**
     * Creates new form menu_latihan_olahraga
     */
    public menu_latihan_olahraga() {
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        olahraga1 = new javax.swing.JButton();
        latihan_pemula = new javax.swing.JLabel();
        olahraga2 = new javax.swing.JButton();
        olahraga3 = new javax.swing.JButton();
        olahraga4 = new javax.swing.JButton();
        olahraga5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(16, 16, 132));
        jPanel1.setForeground(new java.awt.Color(20, 20, 184));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 49));

        jButton1.setBackground(new java.awt.Color(16, 74, 132));
        jButton1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VitalLife");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(303, 303, 303)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        olahraga1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        olahraga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olahraga1ActionPerformed(evt);
            }
        });

        latihan_pemula.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        latihan_pemula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        latihan_pemula.setText("Latihan Pemula");

        olahraga2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_olahraga/Latihan Otot Perut (1).png"))); // NOI18N
        olahraga2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        olahraga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olahraga2ActionPerformed(evt);
            }
        });

        olahraga3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_olahraga/Latihan Lengan.png"))); // NOI18N
        olahraga3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        olahraga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olahraga3ActionPerformed(evt);
            }
        });

        olahraga4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_olahraga/Latihan Kaki.png"))); // NOI18N
        olahraga4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        olahraga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olahraga4ActionPerformed(evt);
            }
        });

        olahraga5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_olahraga/Latihan Bahu dan Punggung.png"))); // NOI18N
        olahraga5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        olahraga5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olahraga5ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(olahraga1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(olahraga2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(olahraga3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(olahraga4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(olahraga5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(latihan_pemula, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(latihan_pemula)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(olahraga3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olahraga1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olahraga2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olahraga4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olahraga5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new menu_utama_user().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void olahraga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olahraga1ActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Durasi : 20 Menit |16 Latihan|\n\n"
                    + "Loncat Bintang \t 20 detik\n"
                    + "Crunch Perut \t x16 \n"
                    + "Runtir Rusia \t x20 \n"
                    + "Pendaki Gunung \t x16 \n"
                    + "Sentuh Tumit \t x20 \n"
                    + "Angkat Kaki \t x16 \n"
                + "Plank \t 20 detik \n"
                + "Crunch Perut  \t x12 \n"
                + "Runtir Rusia  \t x32 \n"
                + "Pendaki Gunung \t x12 \n"
                + "Sentuh Tumit \t x20 \n"
                + "Angkat Kaki \t x14 \n"
                + "Plank \t 30 detik \n"
                + "Peregangan Kobra \t 30 detik \n"
                + "Peregangan Puntir Lumbar Tulang Belakang Kiri \t 30 detik \n"
                + "Peregangan Puntir Lumbar Tulang Belakang Kanan \t 30 detik \n", 
            "Melatih Otot Perut", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_olahraga1ActionPerformed

    private void olahraga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olahraga2ActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Durasi : 7 Menit |11 Latihan| \n\n"
                    + "Loncat Bintang \t 20 detik \n"
                    + "Push Up Tangan di Atas Bangku \t x6 \n"
                    + "Push Up \t x4 \n"
                    + "Push Up Tangan Melebar \t x4 \n"
                    + "Tricip Dip \t x6 \n"
                    + "Push Up Tangan Melebar \t x4 \n"
                + "Push Up Tangan di Atas Bangku \t x4 \n"
                + "Tricip Dip \t x4 \n"
                + "Push Up Lutut  \t x4 \n"
                + "Peregangan Kobra \t 20 detik \n"
                + "Peregangan Dada \t 20 detik \n",   
            "Melatih Dada", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_olahraga2ActionPerformed

    private void olahraga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olahraga4ActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Durasi : 26 Menit |23 Latihan| \n\n"
                    + "Loncat Samping \t 30 detik \n"
                    + "Squat \t x12 \n"
                    + "Squat \t x12 \n"
                    + "Angkat Kaki Sambil Berbaring Menyamping Kiri \t 12 detik \n"
                    + "Angkat Kaki Sambil Berbaring Menyamping Kanan \t 12 detik \n"
                    + "Angkat Kaki Sambil Berbaring Menyamping Kiri \t 12 detik \n"
                + "Angkat Kaki Sambil Berbaring Menyamping Kanan \t 12 detik \n"
                + "Terjang Mundur \t x14 \n"
                + "Terjang Mundur \t x14 \n"
                + "Tendangan Keledai Kiri \t x16 \n"
                + "Tendangan Keledai Kanan \t x16 \n"
                    + "Tendangan Keledai Kiri \t x16 \n"
                    + "Tendangan Keledai Kanan \t x16 \n"
                    + "Peregangan Kuadrisep Kiri di Tembok \t 30 detik \n"
                    + "Peregangan Kuadrisep Kanan di Tembok \t 30 detik \n"
                    + "Peregangan Lutut ke Dada Kiri \t 30 detik \n"
                    + "Peregangan Lutut ke Dada Kanan \t 30 detik \n"
                    + "Angkat Betis Menghadap Tembok \t x12 \n"
                    + "Angkat Betis Menghadap Tembok \t x12 \n"
                    + "Jongkok Sumo Angkat Betis di Tembok \t x12 \n"
                    + "Jongkok Sumo Angkat Betis di Tembok \t x12 \n"
                    + "Peregangan Betis Kiri \t 30 detik \n"
                    + "Peregangan Betis Kanan \t 30 detik \n",   
            "Melatih Lengan", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_olahraga4ActionPerformed

    private void olahraga3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olahraga3ActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Durasi : 17 Menit |19 Latihan| \n\n"
                    + "Angkat Tangan Sambil Berdiri \t 30 detik \n"
                    + "Angkat Lengan Kesamping \t 30 detik \n"
                    + "Tricip Dip \t x10 \n"
                    + "Putar Lengan Searah Jarum Jam \t 30 detik \n"
                    + "Putar Lengan Berlawanan Jarum Jam \t 30 detik \n"
                    + "Push Up Berlian \t x6 \n"
                + "Loncat Bintang \t 30 detik \n"
                + "Tekan Lengan Didepan Dada \t 16 detik \n"
                + "Curl Barbel Kaki Kiri  \t x8 \n"
                + "Curl Barbel Kaki Kanan \t 20 detik \n"
                + "Diagonal Plank \t 10 detik \n"
                    + "Meninju \t 30 detik \n"
                    + "Push Up \t x10 \n"
                    + "Incworms \t x8 \n"
                    + "Push Up Dinding \t x12 \n"
                    + "Peregangan Trisep Kiri \t 30 detik \n"
                    + "Peregangan Trisep Kanan \t 30 detik \n"
                    + "Peregangan Bisep Berdiri Kiri \t 30 detik \n"
                    + "Peregangan Bisep Berdiri Kanan \t 30 detik \n",   
            "Melatih Lengan", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_olahraga3ActionPerformed

    private void olahraga5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olahraga5ActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Durasi : 17 Menit |17 Latihan| \n\n"
                    + "Loncat Bintang \t 30 detik \n"
                    + "Angkat Tangan Sambil Berdiri \t 16 detik \n"
                    + "Tarikan Romboid \t x14 \n"
                    + "Angkat Lengan ke Samping \t 16 detik \n"
                    + "Push Up Lutut \t x14 \n"
                    + "Peregangan Lantai Berbaring Miring Kiri \t 30 detik  \n"
                + "Peregangan Lantai Berbaring Miring Kiri \t 30 detik \n"
                + "Gunting Lengan \t 30 detik \n"
                + "Tarikan Romboid \t x12 \n"
                + "Angkat Lengan ke Samping \t 14 detik \n"
                + "Push Up Lutut \t x12 \n"
                    + "Sikap Kucing Sapi \t 30 detik \n"
                    + "Push Up Trisep Telengkup \t x14 \n"
                    + "Remasan Romboid Duduk \t x12 \n"
                    + "Push Up Trisep Telengkup \t x14 \n"
                    + "Remasan Romboid Duduk \t x12 \n"
                    + "Sikap Anak \t 30 detik \n",
            "Melatih Bahu dan Punggung", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_olahraga5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(menu_latihan_olahraga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_latihan_olahraga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_latihan_olahraga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_latihan_olahraga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_latihan_olahraga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel latihan_pemula;
    private javax.swing.JButton olahraga1;
    private javax.swing.JButton olahraga2;
    private javax.swing.JButton olahraga3;
    private javax.swing.JButton olahraga4;
    private javax.swing.JButton olahraga5;
    // End of variables declaration//GEN-END:variables
}
