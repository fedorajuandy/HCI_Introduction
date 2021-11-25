package program3;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

/**
 *
 * @author 2019130032 - Fedora Yoshe Juandy
 */
public class FrmP3Gaji extends javax.swing.JFrame {

    public FrmP3Gaji() {
        initComponents();
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnHitung = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        LbGaji = new javax.swing.JLabel();
        TxtProduksi = new javax.swing.JTextField();
        BtnKeluar = new javax.swing.JButton();
        LbBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hitung Gaji Insentif Staf Produksi");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnHitung.setBackground(new java.awt.Color(153, 153, 153));
        BtnHitung.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 18)); // NOI18N
        BtnHitung.setText("Hitung");
        BtnHitung.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 80, 40));

        BtnHapus.setBackground(new java.awt.Color(153, 153, 153));
        BtnHapus.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 18)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 80, 40));

        LbGaji.setFont(new java.awt.Font("Montserrat Medium", 1, 22)); // NOI18N
        LbGaji.setForeground(new java.awt.Color(204, 255, 255));
        LbGaji.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LbGaji.setToolTipText("");
        getContentPane().add(LbGaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 320, 25));

        TxtProduksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProduksiActionPerformed(evt);
            }
        });
        getContentPane().add(TxtProduksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 145, 180, 25));

        BtnKeluar.setBackground(new java.awt.Color(153, 153, 153));
        BtnKeluar.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 1, 18)); // NOI18N
        BtnKeluar.setText("Keluar");
        BtnKeluar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, 40));

        LbBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program3/Program3.png"))); // NOI18N
        LbBg.setAlignmentY(0.0F);
        getContentPane().add(LbBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
        DecimalFormat df2 = new DecimalFormat("Rp#,###,##0");
        double nilaiUMR = 4416186;
        try {
            double jumlahProduksi = Double.parseDouble(TxtProduksi.getText());
            double gaji = (nilaiUMR / 2) + (jumlahProduksi * 500);
            LbGaji.setForeground(Color.white);
            LbGaji.setText(String.valueOf(df2.format(gaji)));
        } catch(java.lang.NumberFormatException e) {
            LbGaji.setForeground(Color.red);
            LbGaji.setText("Masukkan ANGKA saja.");
        }
    }//GEN-LAST:event_BtnHitungActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        TxtProduksi.setText("");
        LbGaji.setText("");
        TxtProduksi.grabFocus();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void TxtProduksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProduksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProduksiActionPerformed

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
            java.util.logging.Logger.getLogger(FrmP3Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmP3Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmP3Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmP3Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmP3Gaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnHitung;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JLabel LbBg;
    private javax.swing.JLabel LbGaji;
    private javax.swing.JTextField TxtProduksi;
    // End of variables declaration//GEN-END:variables
}
