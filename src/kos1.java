/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nanda
 */
public class kos1 extends javax.swing.JFrame {

    /**
     * Creates new form kos12
     */
    public kos1() {
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
        fasilitasKamar = new javax.swing.JComboBox<>();
        fasilitasKM = new javax.swing.JComboBox<>();
        fasilitasUmum = new javax.swing.JComboBox<>();
        aksesLingkungan = new javax.swing.JComboBox<>();
        close = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        namaKos = new javax.swing.JTextField();
        kota = new javax.swing.JTextField();
        daerah = new javax.swing.JTextField();
        kamarr = new javax.swing.JTextField();
        book2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 50, 20));

        fasilitasKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasur", "Bantal", "Slimut", "Guling" }));
        fasilitasKamar.setName(""); // NOI18N
        fasilitasKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasilitasKamarActionPerformed(evt);
            }
        });
        getContentPane().add(fasilitasKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 158, 150, 20));

        fasilitasKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ember", "Gayung", "Toilet duduk", "Gantungan" }));
        getContentPane().add(fasilitasKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 185, 150, 20));

        fasilitasUmum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TV", "Kulkas", " " }));
        getContentPane().add(fasilitasUmum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 150, -1));

        aksesLingkungan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATM", "Masjid", "Warung" }));
        getContentPane().add(aksesLingkungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 237, 150, -1));

        close.setContentAreaFilled(false);
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 0, 30, 20));

        edit.setContentAreaFilled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 90, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 380, 90));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 380, -1));

        namaKos.setText("Rahmat Indah");
        getContentPane().add(namaKos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 200, -1));

        kota.setText("Jakarta");
        getContentPane().add(kota, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 200, -1));

        daerah.setText("Soebandi");
        getContentPane().add(daerah, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 200, -1));

        kamarr.setText("Habis");
        getContentPane().add(kamarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 200, -1));

        book2.setContentAreaFilled(false);
        book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book2ActionPerformed(evt);
            }
        });
        getContentPane().add(book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Editnya.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    new profil().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
    new simpan().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_editActionPerformed

    private void fasilitasKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasilitasKamarActionPerformed
   
    }//GEN-LAST:event_fasilitasKamarActionPerformed

    private void book2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book2ActionPerformed
    new bookingpemilik().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_book2ActionPerformed

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
            java.util.logging.Logger.getLogger(kos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kos1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aksesLingkungan;
    private javax.swing.JButton back;
    private javax.swing.JButton book2;
    private javax.swing.JButton close;
    private javax.swing.JTextField daerah;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<String> fasilitasKM;
    private javax.swing.JComboBox<String> fasilitasKamar;
    private javax.swing.JComboBox<String> fasilitasUmum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField kamarr;
    private javax.swing.JTextField kota;
    private javax.swing.JTextField namaKos;
    // End of variables declaration//GEN-END:variables
}
