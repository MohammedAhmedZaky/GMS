
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MERVAT
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_newmember = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(java.awt.Color.orange);
        jLabel5.setFont(new java.awt.Font("Aldhabi", 3, 200)); // NOI18N
        jLabel5.setForeground(java.awt.Color.orange);
        jLabel5.setText("WELCOME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 780, 310));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1760));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        btn_newmember.setForeground(java.awt.Color.orange);
        btn_newmember.setIcon(new javax.swing.ImageIcon("C:\\Users\\MERVAT\\Pictures\\nwmember.png")); // NOI18N
        btn_newmember.setText("New Member ");
        btn_newmember.setFont(new java.awt.Font("SimSun-ExtB", 3, 26)); // NOI18N
        btn_newmember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_newmemberMouseClicked(evt);
            }
        });
        jMenuBar1.add(btn_newmember);

        jMenu2.setForeground(java.awt.Color.orange);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-48.png"))); // NOI18N
        jMenu2.setText("Update &Delete Member");
        jMenu2.setFont(new java.awt.Font("SimSun-ExtB", 3, 24)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(java.awt.Color.orange);
        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MERVAT\\Desktop\\icons8-search-in-list-50.png")); // NOI18N
        jMenu3.setText("List Of Members");
        jMenu3.setFont(new java.awt.Font("SimSun-ExtB", 3, 24)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(java.awt.Color.orange);
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment.png"))); // NOI18N
        jMenu4.setText("Payment");
        jMenu4.setFont(new java.awt.Font("SimSun-ExtB", 3, 24)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(java.awt.Color.orange);
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-rounded-left-50.png"))); // NOI18N
        jMenu5.setText("Logout");
        jMenu5.setFont(new java.awt.Font("SimSun-ExtB", 3, 24)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(java.awt.Color.orange);
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-50.png"))); // NOI18N
        jMenu6.setText("Exit");
        jMenu6.setFont(new java.awt.Font("SimSun-ExtB", 3, 24)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        
        int a=JOptionPane.showConfirmDialog(null, "Do you Really want to Logout ","select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        
         int a=JOptionPane.showConfirmDialog(null, "Do you Really want to Exit ","select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
          System.exit(0);
          
        }
        
    }//GEN-LAST:event_jMenu6MouseClicked

    private void btn_newmemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newmemberMouseClicked
        // TODO add your handling code here:
        new Newmember().setVisible(true);
        
    }//GEN-LAST:event_btn_newmemberMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        new UpdateOrDelete().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        new ListOfMembers().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        
        
        new payment().setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btn_newmember;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
