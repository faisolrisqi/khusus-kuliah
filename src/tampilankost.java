/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nanda
 */
public class tampilankost extends javax.swing.JFrame {

    /**
     * Creates new form tampilankost
     */
    public tampilankost() {
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
        fasilitasKamar = new javax.swing.JComboBox<>();
        fasilitasKM = new javax.swing.JComboBox<>();
        fasilitasUmum = new javax.swing.JComboBox<>();
        aksesLingkungan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        daerah = new javax.swing.JTextField();
        kota = new javax.swing.JTextField();
        jmlkmr = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 30));

        close.setContentAreaFilled(false);
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 20));

        fasilitasKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasur", "Bantal", "Slimut", "Guling" }));
        fasilitasKamar.setName(""); // NOI18N
        fasilitasKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasilitasKamarActionPerformed(evt);
            }
        });
        getContentPane().add(fasilitasKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 20));

        fasilitasKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ember", "Gayung", "Toilet duduk", "Gantungan" }));
        fasilitasKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasilitasKMActionPerformed(evt);
            }
        });
        getContentPane().add(fasilitasKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 185, 200, 20));

        fasilitasUmum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TV", "Kulkas", " " }));
        getContentPane().add(fasilitasUmum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 235, 200, -1));

        aksesLingkungan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATM", "Masjid", "Warung" }));
        getContentPane().add(aksesLingkungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 200, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 380, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 380, -1));
        getContentPane().add(daerah, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 180, -1));
        getContentPane().add(kota, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 180, -1));

        jmlkmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlkmrActionPerformed(evt);
            }
        });
        getContentPane().add(jmlkmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 180, -1));

        book.setContentAreaFilled(false);
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/MelihatKost.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 820, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    new pencarian().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void fasilitasKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasilitasKamarActionPerformed

    }//GEN-LAST:event_fasilitasKamarActionPerformed

    private void fasilitasKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasilitasKMActionPerformed
    
    }//GEN-LAST:event_fasilitasKMActionPerformed

    private void jmlkmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlkmrActionPerformed
     
    }//GEN-LAST:event_jmlkmrActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
    new bookinguser().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_bookActionPerformed

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
            java.util.logging.Logger.getLogger(tampilankost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilankost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilankost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilankost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilankost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aksesLingkungan;
    private javax.swing.JButton back;
    private javax.swing.JButton book;
    private javax.swing.JButton close;
    private javax.swing.JTextField daerah;
    private javax.swing.JComboBox<String> fasilitasKM;
    private javax.swing.JComboBox<String> fasilitasKamar;
    private javax.swing.JComboBox<String> fasilitasUmum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jmlkmr;
    private javax.swing.JTextField kota;
    // End of variables declaration//GEN-END:variables
}
