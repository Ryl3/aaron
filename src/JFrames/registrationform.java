/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class registrationform extends javax.swing.JFrame {
 
    public registrationform() {
        initComponents();

}
    
        Color enter = new Color(173,216,200);
        Color exit = new Color(173,216,250);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        yeer = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        signup = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(173, 216, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(173, 216, 250));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Last name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, 40));

        jTextField3.setBackground(new java.awt.Color(173, 216, 250));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "First name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 40));

        jTextField4.setBackground(new java.awt.Color(173, 216, 250));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Mobile number or email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 40));

        jPasswordField1.setBackground(new java.awt.Color(173, 216, 250));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 190, 40));

        jPasswordField2.setBackground(new java.awt.Color(173, 216, 250));
        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPasswordField2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "New Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 40));

        yeer.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        yeer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yeerMouseClicked(evt);
            }
        });
        jPanel1.add(yeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        month.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthMouseClicked(evt);
            }
        });
        jPanel1.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 30));

        day.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        day.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dayMouseClicked(evt);
            }
        });
        jPanel1.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Bithday");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(173, 216, 245));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCheckBox1.setText("Other");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 130, 30));

        jCheckBox2.setBackground(new java.awt.Color(173, 216, 245));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCheckBox2.setText("Male");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 30));

        jCheckBox3.setBackground(new java.awt.Color(173, 216, 245));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCheckBox3.setText("Female");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 130, 30));

        signup.setBackground(new java.awt.Color(173, 216, 250));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        signup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign up");
        signup.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, 130, 30));

        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 430, 370));

        jPanel2.setBackground(new java.awt.Color(173, 216, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 40)); // NOI18N
        jLabel3.setText("Sign up");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("It's quick and easy.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void monthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthMouseClicked
          String[] months = new String[]{"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
            month.setModel(new javax.swing.DefaultComboBoxModel<>(months));

    }//GEN-LAST:event_monthMouseClicked

    private void yeerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yeerMouseClicked
       DefaultComboBoxModel model = (DefaultComboBoxModel) yeer.getModel();
            for (int year = 2023; year >= 1905; year--) {
                model.addElement(year);
}
    }//GEN-LAST:event_yeerMouseClicked

    private void dayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayMouseClicked
       String[] days = new String[31];
            for (int i = 0; i < days.length; i++) {
            days[i] = Integer.toString(i+1);
        }
         day.setModel(new javax.swing.DefaultComboBoxModel<>(days));

    }//GEN-LAST:event_dayMouseClicked

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
       signup.setBackground(enter);
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        signup.setBackground(exit);
    }//GEN-LAST:event_signupMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> day;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JPanel signup;
    private javax.swing.JComboBox<String> yeer;
    // End of variables declaration//GEN-END:variables
}
