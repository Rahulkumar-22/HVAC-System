/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvac_system;

import java.awt.Color;
import java.awt.Toolkit;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rahul
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     * 
     */
   
    
    
    public login() {
        //Check();
        //check();
        initComponents();
        this.pack();
        jPanel1.setBackground(new Color(0,0,0,80));
        this.icone2.setVisible(false);
        this.setTitle("Login Window");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
   
    /*int check(){
        return c;
    }
    */
    /*
    void Check()
    {
         String user= User.getText();
        String pass=Pass.getText();
        if(user.equals("Admin") && pass.equals("Admin@123"))
        {
            c++;
        }
    }
    */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        Submit = new javax.swing.JButton();
        icone1 = new javax.swing.JLabel();
        icone2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                Login");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 60);

        jLabel2.setBackground(new java.awt.Color(0, 255, 0));
        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setText("User Name");
        jLabel2.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(0, 255, 0));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        jLabel4.setToolTipText("");
        jLabel4.setOpaque(true);

        User.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        User.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                UserFocusLost(evt);
            }
        });
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });

        Pass.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassMouseClicked(evt);
            }
        });
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(0, 255, 0));
        Submit.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Submit.setText("Submit");
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmitMouseEntered(evt);
            }
        });
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        icone1.setBackground(new java.awt.Color(255, 255, 255));
        icone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-eye-32.png"))); // NOI18N
        icone1.setOpaque(true);
        icone1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icone1MousePressed(evt);
            }
        });

        icone2.setBackground(new java.awt.Color(255, 255, 255));
        icone2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-invisible-32.png"))); // NOI18N
        icone2.setOpaque(true);
        icone2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icone2MousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(icone2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(icone1)))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Submit)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icone2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pass)
                        .addComponent(icone1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Submit)
                    .addComponent(jButton1))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 70, 400, 210);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iiita.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 40, 580, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        
       /* int c=0;
         String user= User.getText();
        String pass=Pass.getText();
        if(user.equals("Admin") && pass.equals("Admin@123"))
        {
            c++;
            hnav.setVisible(true);
       hcon.setVisible(true);
       this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Wrong id and password try again","Login",JOptionPane.WARNING_MESSAGE);
            User.setText(" ");
            Pass.setText(" ");
        }
        
        */
       
       
        
              
    }//GEN-LAST:event_SubmitActionPerformed

    private void icone1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone1MousePressed
        // TODO add your handling code here:
        icone2.setVisible(true);
        icone1.setVisible(false);
        Pass.setEchoChar((char)0);
    }//GEN-LAST:event_icone1MousePressed

    private void icone2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone2MousePressed
        // TODO add your handling code here:
        icone1.setVisible(true);
        icone2.setVisible(false);
        Pass.setEchoChar('*');
    }//GEN-LAST:event_icone2MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Pass.setText("");
        User.setText("");
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void UserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserFocusLost
             // TODO add your handling code here:
    }//GEN-LAST:event_UserFocusLost

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        // TODO add your handling code here:
        
        if (evt.getClickCount() == 1 && SwingUtilities.isLeftMouseButton(evt)) {
          User.selectAll();
        }
      

    
    }//GEN-LAST:event_UserMouseClicked

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void PassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassMouseClicked
        // TODO add your handling code here:
         if (evt.getClickCount() == 1 && SwingUtilities.isLeftMouseButton(evt)) {
          Pass.selectAll();
        }
    }//GEN-LAST:event_PassMouseClicked

    private void SubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseEntered
        this.setCursor(getCursor());        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitMouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        this.setCursor(getCursor());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

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
    public javax.swing.JPasswordField Pass;
    public javax.swing.JButton Submit;
    public javax.swing.JTextField User;
    private javax.swing.JLabel icone1;
    private javax.swing.JLabel icone2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
