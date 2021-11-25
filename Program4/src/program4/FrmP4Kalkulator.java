package program4;

import java.awt.Color;
import java.text.DecimalFormat;

/**
 *
 * @author 2019130032 - Fedora Yoshe Juandy
 */
public class FrmP4Kalkulator extends javax.swing.JFrame {
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private int operator = 5;

    public FrmP4Kalkulator() {
        initComponents();
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtNilai2 = new javax.swing.JTextField();
        TxtNilai4 = new javax.swing.JTextField();
        BtnSisa = new javax.swing.JButton();
        BtnKali = new javax.swing.JButton();
        BtnBagi = new javax.swing.JButton();
        BtnTambah = new javax.swing.JButton();
        BtnKurang = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnHitung = new javax.swing.JButton();
        LbHasil = new javax.swing.JLabel();
        TxtBil2 = new javax.swing.JTextField();
        TxtBil1 = new javax.swing.JTextField();
        LbBg = new javax.swing.JLabel();
        BtnKeluar = new javax.swing.JButton();

        TxtNilai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNilai2ActionPerformed(evt);
            }
        });

        TxtNilai4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNilai4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNilai4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkuator Mini");

        BtnSisa.setBackground(java.awt.Color.darkGray);
        BtnSisa.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnSisa.setForeground(new java.awt.Color(255, 255, 255));
        BtnSisa.setText("%");
        BtnSisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSisaActionPerformed(evt);
            }
        });

        BtnKali.setBackground(java.awt.Color.darkGray);
        BtnKali.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnKali.setForeground(new java.awt.Color(255, 255, 255));
        BtnKali.setText("*");
        BtnKali.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKaliActionPerformed(evt);
            }
        });

        BtnBagi.setBackground(java.awt.Color.darkGray);
        BtnBagi.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnBagi.setForeground(new java.awt.Color(255, 255, 255));
        BtnBagi.setText("/");
        BtnBagi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBagiActionPerformed(evt);
            }
        });

        BtnTambah.setBackground(java.awt.Color.darkGray);
        BtnTambah.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnTambah.setForeground(new java.awt.Color(255, 255, 255));
        BtnTambah.setText("+");
        BtnTambah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        BtnKurang.setBackground(java.awt.Color.darkGray);
        BtnKurang.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnKurang.setForeground(new java.awt.Color(255, 255, 255));
        BtnKurang.setText("-");
        BtnKurang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKurangActionPerformed(evt);
            }
        });

        BtnHapus.setBackground(new java.awt.Color(204, 204, 255));
        BtnHapus.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        BtnHitung.setBackground(new java.awt.Color(204, 204, 255));
        BtnHitung.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnHitung.setText("Hitung");
        BtnHitung.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });

        LbHasil.setFont(new java.awt.Font("Montserrat Medium", 1, 20)); // NOI18N
        LbHasil.setForeground(new java.awt.Color(204, 255, 255));
        LbHasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbHasil.setToolTipText("");

        TxtBil2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtBil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBil2ActionPerformed(evt);
            }
        });

        TxtBil1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtBil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBil1ActionPerformed(evt);
            }
        });

        LbBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program4/Program4.png"))); // NOI18N
        LbBg.setAlignmentY(0.0F);

        BtnKeluar.setBackground(new java.awt.Color(204, 204, 255));
        BtnKeluar.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnKeluar.setText("Keluar");
        BtnKeluar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(BtnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(TxtBil1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(LbHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BtnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(TxtBil2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LbBg)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BtnSisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BtnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BtnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(TxtBil1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(LbHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(BtnKali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(TxtBil2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LbBg)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(BtnSisa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(BtnBagi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(BtnTambah))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(BtnKurang)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(0, 0, 370, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSisaActionPerformed
        BtnTambah.setBackground(Color.DARK_GRAY);
        BtnKurang.setBackground(Color.DARK_GRAY);
        BtnKali.setBackground(Color.DARK_GRAY);
        BtnBagi.setBackground(Color.DARK_GRAY);
        BtnSisa.setBackground(Color.BLUE);
        operator = 4;
    }//GEN-LAST:event_BtnSisaActionPerformed

    private void BtnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKaliActionPerformed
        BtnTambah.setBackground(Color.DARK_GRAY);
        BtnKurang.setBackground(Color.DARK_GRAY);
        BtnKali.setBackground(Color.BLUE);
        BtnBagi.setBackground(Color.DARK_GRAY);
        BtnSisa.setBackground(Color.DARK_GRAY);
        operator = 2;
    }//GEN-LAST:event_BtnKaliActionPerformed

    private void BtnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBagiActionPerformed
        BtnTambah.setBackground(Color.DARK_GRAY);
        BtnKurang.setBackground(Color.DARK_GRAY);
        BtnKali.setBackground(Color.DARK_GRAY);
        BtnBagi.setBackground(Color.BLUE);
        BtnSisa.setBackground(Color.DARK_GRAY);
        operator = 3;
    }//GEN-LAST:event_BtnBagiActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        BtnTambah.setBackground(Color.BLUE);
        BtnKurang.setBackground(Color.DARK_GRAY);
        BtnKali.setBackground(Color.DARK_GRAY);
        BtnBagi.setBackground(Color.DARK_GRAY);
        BtnSisa.setBackground(Color.DARK_GRAY);
        operator = 0;
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKurangActionPerformed
        BtnTambah.setBackground(Color.DARK_GRAY);
        BtnKurang.setBackground(Color.BLUE);
        BtnKali.setBackground(Color.DARK_GRAY);
        BtnBagi.setBackground(Color.DARK_GRAY);
        BtnSisa.setBackground(Color.DARK_GRAY);
        operator = 1;
    }//GEN-LAST:event_BtnKurangActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        BtnTambah.setBackground(Color.DARK_GRAY);
        BtnKurang.setBackground(Color.DARK_GRAY);
        BtnKali.setBackground(Color.DARK_GRAY);
        BtnBagi.setBackground(Color.DARK_GRAY);
        BtnSisa.setBackground(Color.DARK_GRAY);
        
        TxtBil1.setText("");
        TxtBil2.setText("");
        LbHasil.setText("");
        operator = 5;
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
        try {
            double b1 = Double.parseDouble(TxtBil1.getText());
            double b2 = Double.parseDouble(TxtBil2.getText());
            double hasil= 0;
            
            switch(operator) {
                case 0:
                    hasil = b1 + b2;
                    break;
                case 1:
                    hasil = b1 - b2;
                    break;
                case 2:
                    hasil = b1 * b2;
                    break;
                case 3:
                    hasil = b1 / b2;
                    break;
                case 4:
                    hasil = b1 % b2;
                    break;
            }
            
            if(operator <= 4) {
                LbHasil.setForeground(Color.WHITE);
                LbHasil.setText(String.valueOf(df2.format(hasil)));
            }
            else {
                LbHasil.setForeground(Color.RED);
                LbHasil.setText("Pilih salah satu operator.");
            }
        } catch(java.lang.NumberFormatException e) {
            LbHasil.setForeground(Color.RED);
            LbHasil.setText("Masukkan ANGKA saja.");
        }
    }//GEN-LAST:event_BtnHitungActionPerformed

    private void TxtNilai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNilai2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNilai2ActionPerformed

    private void TxtBil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBil2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBil2ActionPerformed

    private void TxtNilai4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNilai4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNilai4ActionPerformed

    private void TxtBil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBil1ActionPerformed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmP4Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmP4Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmP4Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmP4Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmP4Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBagi;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnHitung;
    private javax.swing.JButton BtnKali;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JButton BtnKurang;
    private javax.swing.JButton BtnSisa;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JLabel LbBg;
    private javax.swing.JLabel LbHasil;
    private javax.swing.JTextField TxtBil1;
    private javax.swing.JTextField TxtBil2;
    private javax.swing.JTextField TxtNilai2;
    private javax.swing.JTextField TxtNilai4;
    // End of variables declaration//GEN-END:variables
}
