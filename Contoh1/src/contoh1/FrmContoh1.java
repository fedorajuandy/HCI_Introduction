package contoh1;

/**
 *
 * @author 2019130032 - Fedora Yoshe Juandy
 */
public class FrmContoh1 extends javax.swing.JFrame {

    public FrmContoh1() {
        initComponents();
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbJumlah = new javax.swing.JLabel();
        jLbHarga = new javax.swing.JLabel();
        jLbBayar = new javax.swing.JLabel();
        jBtnHitung = new javax.swing.JButton();
        jBtnHapus = new javax.swing.JButton();
        jBtnKeluar = new javax.swing.JButton();
        jTxtJumlah = new javax.swing.JTextField();
        jTxtHarga = new javax.swing.JTextField();
        jTxtBayar = new javax.swing.JTextField();
        jLbBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbJumlah.setForeground(new java.awt.Color(255, 255, 255));
        jLbJumlah.setText("Jumlah");
        getContentPane().add(jLbJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLbHarga.setForeground(new java.awt.Color(255, 255, 255));
        jLbHarga.setText("Harga");
        getContentPane().add(jLbHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLbBayar.setForeground(new java.awt.Color(255, 255, 255));
        jLbBayar.setText("Bayar");
        getContentPane().add(jLbBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jBtnHitung.setText("Hitung");
        jBtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jBtnHapus.setText("Hapus");
        jBtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jBtnKeluar.setText("Keluar");
        jBtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jTxtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 150, -1));

        jTxtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtHargaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, -1));

        jTxtBayar.setEditable(false);
        jTxtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBayarActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, -1));

        jLbBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contoh1/Bg.png"))); // NOI18N
        jLbBg.setPreferredSize(new java.awt.Dimension(340, 180));
        getContentPane().add(jLbBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHapusActionPerformed
        jTxtJumlah.setText("");
        jTxtHarga.setText("");
        jTxtBayar.setText("");
        jTxtJumlah.grabFocus();
    }//GEN-LAST:event_jBtnHapusActionPerformed

    private void jTxtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtJumlahActionPerformed

    private void jTxtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtHargaActionPerformed

    private void jTxtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBayarActionPerformed

    private void jBtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHitungActionPerformed
        int jumlah = Integer.parseInt(jTxtJumlah.getText());
        int harga = Integer.parseInt(jTxtHarga.getText());
        int bayar = jumlah * harga;
        jTxtBayar.setText(String.valueOf(bayar));
    }//GEN-LAST:event_jBtnHitungActionPerformed

    private void jBtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmContoh1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmContoh1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmContoh1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmContoh1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmContoh1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnHapus;
    private javax.swing.JButton jBtnHitung;
    private javax.swing.JButton jBtnKeluar;
    private javax.swing.JLabel jLbBayar;
    private javax.swing.JLabel jLbBg;
    private javax.swing.JLabel jLbHarga;
    private javax.swing.JLabel jLbJumlah;
    private javax.swing.JTextField jTxtBayar;
    private javax.swing.JTextField jTxtHarga;
    private javax.swing.JTextField jTxtJumlah;
    // End of variables declaration//GEN-END:variables
}
