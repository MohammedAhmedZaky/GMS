

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Color;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        btn_incorrcet.setVisible(false);
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        lab_login = new javax.swing.JLabel();
        btn_incorrcet = new javax.swing.JLabel();
        edt_text_username = new javax.swing.JTextField();
        ptext_password = new javax.swing.JPasswordField();
        btn_exit = new javax.swing.JButton();
        cbox_show = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login background.PNG"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setForeground(new java.awt.Color(0, 103, 211));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Picture3.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(157, 157, 157));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1263, -1, -1));

        btn_login.setBackground(new java.awt.Color(0, 0, 0));
        btn_login.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btn_login.setForeground(java.awt.Color.orange);
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 100, 30));

        lab_login.setBackground(new java.awt.Color(0, 102, 255));
        lab_login.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lab_login.setForeground(java.awt.Color.orange);
        lab_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_login.setText("LOGIN");
        jPanel1.add(lab_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, 174, 47));

        btn_incorrcet.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_incorrcet.setForeground(new java.awt.Color(237, 222, 222));
        btn_incorrcet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_incorrcet.setText("Incorrcet Username or Password ");
        jPanel1.add(btn_incorrcet, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, -1, -1));

        edt_text_username.setBackground(new java.awt.Color(0, 0, 0));
        edt_text_username.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        edt_text_username.setForeground(new java.awt.Color(255, 204, 0));
        edt_text_username.setSelectionColor(java.awt.Color.orange);
        jPanel1.add(edt_text_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 346, 30));

        ptext_password.setBackground(new java.awt.Color(0, 0, 0));
        ptext_password.setForeground(java.awt.Color.orange);
        ptext_password.setSelectionColor(java.awt.Color.orange);
        jPanel1.add(ptext_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 346, 31));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 30, 30, -1));

        cbox_show.setBackground(new java.awt.Color(0, 0, 0,80));
        cbox_show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbox_show.setForeground(java.awt.Color.orange);
        cbox_show.setText("show/hide");
        cbox_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbox_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_showActionPerformed(evt);
            }
        });
        jPanel1.add(cbox_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 520, 100, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, 40, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 50, 80));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 50, 50));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, -1, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Picture5.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        
        
         int a=JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application ","select",JOptionPane.YES_NO_OPTION);
    if (a==0)
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        
        if (edt_text_username.getText().equals("5MS")&&ptext_password.getText().equals("12345"))
        {
             setVisible(false);
             new home ().setVisible(true);
             
        }
        else 
            btn_incorrcet.setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed

    private void cbox_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_showActionPerformed
        // TODO add your handling code here:
        
        if (cbox_show.isSelected())
        {
            ptext_password.setEchoChar((char)0);
        }
        else 
            ptext_password.setEchoChar('???');
        
    }//GEN-LAST:event_cbox_showActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel btn_incorrcet;
    private javax.swing.JButton btn_login;
    private javax.swing.JCheckBox cbox_show;
    private javax.swing.JTextField edt_text_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lab_login;
    private javax.swing.JPasswordField ptext_password;
    // End of variables declaration//GEN-END:variables
}
