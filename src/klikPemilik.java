
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nanda
 */
public class klikPemilik extends javax.swing.JFrame {

    /**
     * Creates new form klikPemilik
     */
    public klikPemilik() {
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
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();
        isiusername = new javax.swing.JTextField();
        isinoregister = new javax.swing.JTextField();
        isipasswordregister = new javax.swing.JPasswordField();
        isinologin = new javax.swing.JTextField();
        isipasswordlogin = new javax.swing.JPasswordField();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setContentAreaFilled(false);
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, 20));

        register.setContentAreaFilled(false);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 90, 30));

        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 100, 30));

        isiusername.setCaretColor(new java.awt.Color(255, 255, 255));
        isiusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                isiusernameMouseEntered(evt);
            }
        });
        getContentPane().add(isiusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 50));

        isinoregister.setOpaque(false);
        getContentPane().add(isinoregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 220, 50));

        isipasswordregister.setOpaque(false);
        getContentPane().add(isipasswordregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 220, 50));
        getContentPane().add(isinologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 180, 50));
        getContentPane().add(isipasswordlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 180, 50));

        close.setContentAreaFilled(false);
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 3, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masuk.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -40, 830, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
    JOptionPane.showMessageDialog(this, "Anda telah terdaftar");
    new profil().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    new profil().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void isiusernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isiusernameMouseEntered
    
    }//GEN-LAST:event_isiusernameMouseEntered

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
            java.util.logging.Logger.getLogger(klikPemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(klikPemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(klikPemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(klikPemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new klikPemilik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JTextField isinologin;
    private javax.swing.JTextField isinoregister;
    private javax.swing.JPasswordField isipasswordlogin;
    private javax.swing.JPasswordField isipasswordregister;
    private javax.swing.JTextField isiusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
