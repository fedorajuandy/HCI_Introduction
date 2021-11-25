package program2;

import java.text.DecimalFormat;

/**
 *
 * @author 2019130032 - Fedora Yoshe Juandy
 */
public class FrmP2MeanNilai extends javax.swing.JFrame {

    public FrmP2MeanNilai() {
        initComponents();
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtNilai1 = new javax.swing.JTextField();
        TxtNilai2 = new javax.swing.JTextField();
        TxtNilai3 = new javax.swing.JTextField();
        BtnHitung = new javax.swing.JButton();
        LbError = new javax.swing.JLabel();
        LbMean = new javax.swing.JLabel();
        BtnHapus = new javax.swing.JButton();
        BtnKeluar = new javax.swing.JButton();
        LbBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hitung Nilai Rata-Rata");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtNilai1.setToolTipText("");
        getContentPane().add(TxtNilai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, -1));

        TxtNilai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNilai2ActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNilai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, 150, -1));
        getContentPane().add(TxtNilai3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, -1));

        BtnHitung.setBackground(new java.awt.Color(204, 204, 255));
        BtnHitung.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnHitung.setText("Hitung");
        BtnHitung.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 175, -1, -1));

        LbError.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        LbError.setForeground(new java.awt.Color(255, 0, 0));
        LbError.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(LbError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 17));

        LbMean.setFont(new java.awt.Font("Montserrat Medium", 1, 20)); // NOI18N
        LbMean.setForeground(new java.awt.Color(204, 255, 255));
        LbMean.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LbMean.setToolTipText("");
        getContentPane().add(LbMean, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 75, 25));

        BtnHapus.setBackground(new java.awt.Color(204, 204, 255));
        BtnHapus.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 175, 50, -1));

        BtnKeluar.setBackground(new java.awt.Color(204, 204, 255));
        BtnKeluar.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 14)); // NOI18N
        BtnKeluar.setText("Keluar");
        BtnKeluar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnKeluar.setName(""); // NOI18N
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 175, 50, -1));

        LbBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program2/Program2.png"))); // NOI18N
        getContentPane().add(LbBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNilai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNilai2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNilai2ActionPerformed

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
        DecimalFormat df2 = new DecimalFormat("#.##");
        
        try {
            double n1 = Double.parseDouble(TxtNilai1.getText());
            double n2 = Double.parseDouble(TxtNilai2.getText());
            double n3 = Double.parseDouble(TxtNilai3.getText());
            LbError.setText("");
            double mean = (n1 + n2 + n3) / 3;
            LbMean.setText(String.valueOf(df2.format(mean)));
        } catch(java.lang.NumberFormatException e) {
            LbError.setText("Masukkan ANGKA saja.");
        }
    }//GEN-LAST:event_BtnHitungActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        TxtNilai1.setText("");
        TxtNilai2.setText("");
        TxtNilai3.setText("");
        LbError.setText("");
        LbMean.setText("");
        TxtNilai1.grabFocus();
    }//GEN-LAST:event_BtnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(FrmP2MeanNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmP2MeanNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmP2MeanNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmP2MeanNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmP2MeanNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnHitung;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JLabel LbBg;
    private javax.swing.JLabel LbError;
    private javax.swing.JLabel LbMean;
    private javax.swing.JTextField TxtNilai1;
    private javax.swing.JTextField TxtNilai2;
    private javax.swing.JTextField TxtNilai3;
    // End of variables declaration//GEN-END:variables
}
