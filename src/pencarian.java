/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nanda
 */
public class pencarian extends javax.swing.JFrame {

    /**
     * Creates new form pencarian
     */
    public pencarian() {
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

        ketikcari = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        close = new javax.swing.JButton();
        back = new javax.swing.JButton();
        gbr1 = new javax.swing.JButton();
        gbr2 = new javax.swing.JButton();
        gbr3 = new javax.swing.JButton();
        kos1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ketikcari.setText("cari alamat");
        getContentPane().add(ketikcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 150, 20));

        cari.setContentAreaFilled(false);
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 60, 20));

        close.setContentAreaFilled(false);
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 20));

        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 30));

        gbr1.setContentAreaFilled(false);
        getContentPane().add(gbr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, 140));

        gbr2.setContentAreaFilled(false);
        getContentPane().add(gbr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 160, 140));

        gbr3.setContentAreaFilled(false);
        getContentPane().add(gbr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 160, 140));

        kos1.setBorderPainted(false);
        kos1.setContentAreaFilled(false);
        kos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kos1ActionPerformed(evt);
            }
        });
        getContentPane().add(kos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 240, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Userinterfacediagram2_1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 820, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    new klikPencari().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void kos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kos1ActionPerformed
    new tampilankost().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_kos1ActionPerformed

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
            java.util.logging.Logger.getLogger(pencarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pencarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pencarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pencarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pencarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cari;
    private javax.swing.JButton close;
    private javax.swing.JButton gbr1;
    private javax.swing.JButton gbr2;
    private javax.swing.JButton gbr3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField ketikcari;
    private javax.swing.JButton kos1;
    // End of variables declaration//GEN-END:variables
}
