/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

/**
 *
 * @author ADMIN
 */
public class services_mainproject extends javax.swing.JFrame {

    /**
     * Creates new form services_mainproject
     */
    public services_mainproject() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbtn_accommodation = new javax.swing.JButton();
        jbtn_finance = new javax.swing.JButton();
        jbtn_back = new javax.swing.JButton();
        jbtn_register = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SERVICES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_accommodation.setBackground(new java.awt.Color(153, 153, 153));
        jbtn_accommodation.setForeground(new java.awt.Color(255, 51, 102));
        jbtn_accommodation.setText("ACCOMMODATION");
        jbtn_accommodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_accommodationActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_accommodation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 35));

        jbtn_finance.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_finance.setForeground(new java.awt.Color(255, 51, 102));
        jbtn_finance.setText("FINANCE");
        jbtn_finance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_financeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_finance, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 125, 36));

        jbtn_back.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_back.setForeground(new java.awt.Color(255, 51, 102));
        jbtn_back.setText("LOG OUT");
        jbtn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_backActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 125, 36));

        jbtn_register.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_register.setForeground(new java.awt.Color(255, 51, 102));
        jbtn_register.setText("REGISTER");
        jbtn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_registerActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 58, 125, 35));

        jButton1.setForeground(new java.awt.Color(255, 51, 102));
        jButton1.setText("REPORT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 125, 36));

        jButton2.setForeground(new java.awt.Color(255, 51, 102));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 125, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, 393, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_registerActionPerformed
         registration registration =new registration ();
     registration.setVisible(true);
     // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_registerActionPerformed

    private void jbtn_accommodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_accommodationActionPerformed
     accomodation accomodation =new accomodation();
     accomodation.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jbtn_accommodationActionPerformed

    private void jbtn_financeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_financeActionPerformed
     finance finance =new finance ();
     finance.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jbtn_financeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
      new PRINT().setVisible(true);
      super.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
        //System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_backActionPerformed
        // TODO add your handling code here:
        dispose();
        main_project main_project = new main_project();
        main_project.setVisible(true);
    }//GEN-LAST:event_jbtn_backActionPerformed

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
            java.util.logging.Logger.getLogger(services_mainproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(services_mainproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(services_mainproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(services_mainproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new services_mainproject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_accommodation;
    private javax.swing.JButton jbtn_back;
    private javax.swing.JButton jbtn_finance;
    private javax.swing.JButton jbtn_register;
    // End of variables declaration//GEN-END:variables
}
