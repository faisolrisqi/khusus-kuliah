/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nanda
 */
public class profil extends javax.swing.JFrame {

    /**
     * Creates new form profil
     */
    public profil() {
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

        back = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        lihatan = new javax.swing.JButton();
        daftarkan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 53, 70, 30));

        close.setContentAreaFilled(false);
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 0, 30, 20));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kos 1", "Kos 2", "Kos 3", "Kos 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 300, 60));

        lihatan.setContentAreaFilled(false);
        lihatan.setOpaque(false);
        lihatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatanActionPerformed(evt);
            }
        });
        getContentPane().add(lihatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 160, 40));

        daftarkan.setContentAreaFilled(false);
        daftarkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarkanActionPerformed(evt);
            }
        });
        getContentPane().add(daftarkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 220, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/tambah lihat.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    new login().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void daftarkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarkanActionPerformed
    new simpan().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_daftarkanActionPerformed

    private void lihatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatanActionPerformed
    new kos1().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_lihatanActionPerformed

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
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JButton daftarkan;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lihatan;
    // End of variables declaration//GEN-END:variables
}
