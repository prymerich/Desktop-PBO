/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package program_data;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Cyber
 */
public class menu_pola_makan extends javax.swing.JFrame {

    /**
     * Creates new form menu_pola_makan
     */
    public menu_pola_makan() {
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
        sarapan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        s_makanan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        h_sarapan = new javax.swing.JTextPane();
        s_minuman = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        h_minuman = new javax.swing.JTextPane();
        sarapan1 = new javax.swing.JButton();
        karbohidrat = new javax.swing.JButton();
        protein = new javax.swing.JButton();
        vitamin = new javax.swing.JButton();
        Lemak = new javax.swing.JButton();
        makromineral = new javax.swing.JButton();
        antioksidan = new javax.swing.JButton();
        serat = new javax.swing.JButton();
        mikromineral = new javax.swing.JButton();

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

        sarapan.setBackground(new java.awt.Color(16, 74, 132));
        sarapan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sarapan.setForeground(new java.awt.Color(255, 255, 255));
        sarapan.setText("Sarapan");
        sarapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarapanActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(16, 74, 132));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Asupan Nutrisi");

        s_makanan.setBackground(new java.awt.Color(16, 74, 132));
        s_makanan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_makanan.setForeground(new java.awt.Color(255, 255, 255));
        s_makanan.setText("Makanan");
        s_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_makananActionPerformed(evt);
            }
        });

        h_sarapan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(h_sarapan);

        s_minuman.setBackground(new java.awt.Color(16, 74, 132));
        s_minuman.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_minuman.setForeground(new java.awt.Color(255, 255, 255));
        s_minuman.setText("Minuman");
        s_minuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_minumanActionPerformed(evt);
            }
        });

        h_minuman.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(h_minuman);

        sarapan1.setBackground(new java.awt.Color(16, 74, 132));
        sarapan1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sarapan1.setForeground(new java.awt.Color(255, 255, 255));
        sarapan1.setText("Makanan Alternatif");
        sarapan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarapan1ActionPerformed(evt);
            }
        });

        karbohidrat.setBackground(new java.awt.Color(16, 74, 132));
        karbohidrat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        karbohidrat.setForeground(new java.awt.Color(255, 255, 255));
        karbohidrat.setText("Karbohidrat");
        karbohidrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karbohidratActionPerformed(evt);
            }
        });

        protein.setBackground(new java.awt.Color(16, 74, 132));
        protein.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        protein.setForeground(new java.awt.Color(255, 255, 255));
        protein.setText("Protein");
        protein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinActionPerformed(evt);
            }
        });

        vitamin.setBackground(new java.awt.Color(16, 74, 132));
        vitamin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vitamin.setForeground(new java.awt.Color(255, 255, 255));
        vitamin.setText("Vitamin");
        vitamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitaminActionPerformed(evt);
            }
        });

        Lemak.setBackground(new java.awt.Color(16, 74, 132));
        Lemak.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lemak.setForeground(new java.awt.Color(255, 255, 255));
        Lemak.setText("Lemak");
        Lemak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LemakActionPerformed(evt);
            }
        });

        makromineral.setBackground(new java.awt.Color(16, 74, 132));
        makromineral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        makromineral.setForeground(new java.awt.Color(255, 255, 255));
        makromineral.setText("Makromineral");
        makromineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makromineralActionPerformed(evt);
            }
        });

        antioksidan.setBackground(new java.awt.Color(16, 74, 132));
        antioksidan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        antioksidan.setForeground(new java.awt.Color(255, 255, 255));
        antioksidan.setText("Antioksidan");
        antioksidan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antioksidanActionPerformed(evt);
            }
        });

        serat.setBackground(new java.awt.Color(16, 74, 132));
        serat.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        serat.setForeground(new java.awt.Color(255, 255, 255));
        serat.setText("Serat");
        serat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seratActionPerformed(evt);
            }
        });

        mikromineral.setBackground(new java.awt.Color(16, 74, 132));
        mikromineral.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mikromineral.setForeground(new java.awt.Color(255, 255, 255));
        mikromineral.setText("Mikromineral");
        mikromineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mikromineralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(s_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(sarapan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(s_minuman, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton4)
                        .addGap(173, 173, 173)
                        .addComponent(sarapan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(antioksidan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vitamin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lemak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(makromineral, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(mikromineral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(karbohidrat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protein, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sarapan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(s_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(Lemak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(14, 14, 14)
                        .addComponent(makromineral, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mikromineral, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vitamin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(serat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(antioksidan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sarapan1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(karbohidrat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(protein, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(s_minuman, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new form_menu_utama().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sarapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarapanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sarapanActionPerformed

    private void s_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_makananActionPerformed
        Random acak = new Random();
        String[] words = {
        "Bubur Ayam",
        "Oatmeal",
        "Lontong Sayur",
        "Nasi uduk",
        "Salad Buah",
        "Nasi Pecel",
        "Nasi Gudeg",
        "Omelet",
        "Sereal",
        "Bubur Sumsum",
        "Sadnwich",
        "Pancake"
        };
        
        int randomIndex = acak.nextInt(words.length);
        String randomWord = words[randomIndex];
        
        h_sarapan.setText(String.format(randomWord));
        
        
    }//GEN-LAST:event_s_makananActionPerformed

    private void s_minumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_minumanActionPerformed
        Random acak = new Random();
        String[] words = {
        "Air Putih",
        "Susu",
        "Air Lemon",
        "Air Kelapa",
        "Kopi Hitam",
        "Teh Hangat",
        "Jus Buah"
        
        };
        
        int randomIndex = acak.nextInt(words.length);
        String randomWord = words[randomIndex];
        
        h_minuman.setText(String.format(randomWord));
        
    }//GEN-LAST:event_s_minumanActionPerformed

    private void sarapan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarapan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sarapan1ActionPerformed

    private void karbohidratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karbohidratActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Alternatif dari Nasi \n\n"
                    + "Ubi Jalar \n"
                    + "Kentang \n"
                    + "Jagung \n"
                    + "Oatmeal \n"
                    + "Quinoa \n"
                    + "Singkong \n"
                    + "Beras Merah \n"
                    + "Beras Hitam \n"
                    + "Talas",      
            "Karbohidrat", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_karbohidratActionPerformed

    private void proteinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Alternatif dari Perdagingan \n\n"
                    + "Tempe \n"
                    + "Tahu \n"
                    + "Lentil\n"
                    + "Edamame \n"
                    + "Kacang Kedelai \n"
                    + "Chickpea (Kacang Arab) \n"
                    + "Rumput Laut \n"
                    + "Jamur Enoki \n"
                    + "Talas",      
            "Protein", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_proteinActionPerformed

    private void vitaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitaminActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Vitamin A \n"
                    + "Hati Sapi, Minyak Hati Ikan Kod, Telur, Ikan Salmon, Susu\n"
                    + "Ubi Jalar, Wortel, Bayam, Pepaya, Mangga \n"
          + "Vitamin B1 (Tiamin)\n"
                    + "Ragi Nutrisi, Biji Chia, Kacang Merah, Daging Babi, Ikan Salmon\n"
          + "Vitamin B2 (Riboflavin)\n"
                    + "Jamur Kancing, Kacang Almond, Bayam, Yogurt, Telur\n"
          + "Vitamin B3 (Niasin)\n"
                    + "Hati Sapi, Dada Ayam, Salmon, Tuna, Kacang Tanah\n"
          + "Vitamin B5(Asam Pantotenat)\n"
                    + "Alpukat, Jamur Kancing, Ikan Salmon, Telur, Yogurt\n"
          + "Vitamin B6 (Piridoksin)\n"
                    + "Dada Ayam, Hati Sapi, Pisang, Kentang, Bayam, Kacang Walnut, Alpukat\n"
          + "Vitamin B7 (Biotin)\n"
                    + "Telur, Kacang Tanah, Jamur, Brokoli, Bayam, Ikan Salmon, Kenari\n"
          + "Vitamin B9 (Folat)\n"
                    + "Bayam, Brokoli, Asparagus, Jeruk, Lemon, Melon, Stroberi, Pisang\n"
          + "Vitamin B12 (Cobalamin)\n"
                    + "Hati Sapi, Sarden, Jenis Kerang, Susu, Keju\n"
          + "Vitamin C\n"
                    + "Jambu, Jeruk, Stroberi, Kiwi, Papikra Merah, Brokoli, Kembang Kol\n"
                    + "Tomat, Bayam, Pepaya\n"
          + "Vitamin D\n"
                    + "Ikan Makarel, Salmon, Sarden, Tuna, Telur \n"
                    + "Jamur yang terpapar sinar matahari\n"
          + "VItamin E\n"
                    + "Hati Sapi, Ikan Salmon, Susu Sapi, Alpukat\n"
                    + "Sayuran Hijau, Brokoli, Minyal Biji Bungan Matahari\n"
          + "Vitamin K\n"
                    + "Vitamin K1 = Sayuran Hijau, Kubis Brussel, Kacang Hijau, Brokoli, Kembang Kol\n"
                    + "VItamin K2 = Keju, Natto, Yogurt, Kubis Fermentasi, Daging Fermentasi",      
            "Berbagai Jenis Vitamin", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_vitaminActionPerformed

    private void LemakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LemakActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Alpukat \n"
                    + "Minyak Zaitun \n"
                    + "Kacangn Walnut\n"
                    + "Kacang ALmond\n"
                    + "Minyak Kelapa (Sesuai Takaran) \n",
                               
            "Lemak Baik", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_LemakActionPerformed

    private void makromineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makromineralActionPerformed
       JOptionPane.showMessageDialog(
            null, 
            "Kalsium \n"
                    + "Produk Susu:\n"
                    + "Susu, Yogurt, dan Keju\n"
                    + "Brokoli, Bayam, Ubi Jalar, Kale, Tomat, Wortel\n"
                    + "Sayuran Hijau:\n"
                    + "Kale, Collard Green, dan Bok Choy\n"
                    + "Tahu\n"
                    + "Kacang Almond\n\n"
            + "Fosfor \n"
                    + "Daging Merah:"
                    + "Daging Sapi, Domba, dan Babi \n"
                    + "Unggas: \n"
                    + "Ayam dan Kalkun \n"
                    + "Ikan: \n"
                    + "Ikan Salmon, Tuna, dan Sarden\n"
                    + "Kacang-Kacangan:\n"
                    + "Kacang Merah, Lentil, dan Kacang Hitam\n"
                    + "Telur\n\n"
            + "Magnesium\n"
                    + "Sayuran Hijau:\n"
                    + "Bayam, Collard Green, dan Kangkung\n"
                    + "Kacang-Kacangan:\n"
                    + "Kacang Almond, Biji Labu, Kacang Hitam, Lentil, dan Kacang Mete\n"
                    + "Alpukat\n"
            + "Sodium\n"
                    + "Garam Meja, Sup Kaleng, Kecap, Saus tomat, dan Saus Salad\n\n"
            + "Kalium\n"
                    + "Kentang, Bayam, Alpukat, Pisang, Salmon\n\n"
            + "Klorida\n"
                    + "Zaitun, Seledri, Tomat, Telur\n\n"
            + "Sulfur\n"
                    + "Kacang-Kacangan:\n"
                    + "Kacang Merah, Lentil, dan Kacang Hitam\n"
                    + "Jenis Bawang:\n"
                    + "Bawang Putih dan Bawang Bombay\n"
                    + "Brokoli dan Telur",                 
            "Makromineral", 
            JOptionPane.PLAIN_MESSAGE); 
    }//GEN-LAST:event_makromineralActionPerformed

    private void antioksidanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antioksidanActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Buah-Buahan: \n"
                    + "Blueberry, Cranberry, Rasberry, Stroberi, Blackberry, Anggur, Jeruk \n\n"
                    + "Sayuran:\n"
                    + "Brokoli, Bayam, Ubi Jalar, Kale, Tomat, Wortel\n\n"
                    + "Kacang-Kacangan:\n"
                    + "Kacang Kenari, Kacang Almond, Kacang Chia\n\n"
                    + "Coklat Hitam dan Teh Hijau\n",                  
            "Antioksidan", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_antioksidanActionPerformed

    private void seratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seratActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Buah-Buahan: \n"
                    + "Buah Pir, Apel, Rasberry, Stroberi, Blackberry \n\n"
                    + "Sayuran\n"
                    + "Brokoli, Kembang Kol, Wortel, Kentang\n\n"
                    + "Kacang-Kacangan\n"
                    + "Kacang Hijau, Kacang Almond, Kacang Chia, Oatmeal, Quinoa, Beras Meran\n",                  
            "Serat", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_seratActionPerformed

    private void mikromineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mikromineralActionPerformed
        JOptionPane.showMessageDialog(
            null, 
            "Zat Besi \n"
                    + "Daging Sapi, Domba, dan Babi \n"
                    + "Ayam dan Kalkun \n"
                    + "Ikan Salmon, Tuna, dan Sarden\n"
                    + "Telur ayam\n"
                    + "Kacang Merah, Lentil, dan Biji Labu\n"
                    + "Bayam dan Kangkung\n\n"
            + "Seng \n"
                    + "Daging Sapi, Domba, dan Babi \n"
                    + "Ayam dan Kalkun \n"
                    + "Kacang Tanah, Kacang Mete, dan Biji Labu\n"
                    + "Tiram, Remis, dan Jenis kerang \n"
                    + "Gandum Utuh\n\n"
            + "Tembaga\n"
                    + "Daging Sapi, Domba, dan Babi \n"
                    + "Ayam dan Kalkun \n"
                    + "Kacang Almond, Kacang Mete, dan Biji Labu\n"
                    + "Tiram, Remis, dan Jenis kerang \n"
                    + "Bayam dan Kangkung\n\n"
            + "Mangan\n"
                    + "Kacang Almond, Kacang Mete, dan Biji Labu\n"
                    + "Bayam dan Kangkung\n"
                    + "Kacang Hitam dan Lentil\n"
                    + "Gandum Utuh\n"
                    + "Ubi Jalar\n\n"
            + "Yodium\n"
                    + "Ikan Salmon, Tuna, dan Sarden\n"
                    + "Susu, Yogurt, dan Keju\n"
                    + "Rumput Laut\n\n"
            + "Selium\n"
                    + "Kacang Brazil, Ikan Tuna, Udang, Daging Sapi, Telur, Jamur Brazil\n\n"
            + "Molidenum\n"
                    + "Kacang Lentil, Kacang Hijau, Kacang Hitam, Gandum\n"
                    + "Aprikot, Plum, dan Kismis\n"
                    + "Susu, Yogurt, dan Keju",                      
            "Mikromineral", 
            JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_mikromineralActionPerformed

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
            java.util.logging.Logger.getLogger(menu_pola_makan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_pola_makan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_pola_makan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_pola_makan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_pola_makan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lemak;
    private javax.swing.JButton antioksidan;
    private javax.swing.JTextPane h_minuman;
    private javax.swing.JTextPane h_sarapan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton karbohidrat;
    private javax.swing.JButton makromineral;
    private javax.swing.JButton mikromineral;
    private javax.swing.JButton protein;
    private javax.swing.JButton s_makanan;
    private javax.swing.JButton s_minuman;
    private javax.swing.JButton sarapan;
    private javax.swing.JButton sarapan1;
    private javax.swing.JButton serat;
    private javax.swing.JButton vitamin;
    // End of variables declaration//GEN-END:variables
}
