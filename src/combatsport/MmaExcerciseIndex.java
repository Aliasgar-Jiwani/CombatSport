/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatsport;

import mmaExcercise.MmaEx1;
import mmaExcercise.MmaEx2;
import mmaExcercise.MmaEx3;
import mmaExcercise.MmaEx4;
import mmaExcercise.MmaEx5;

/**
 *
 * @author Lenovo
 */
public class MmaExcerciseIndex extends javax.swing.JFrame {

    /**
     * Creates new form MmaExcerciseIndex
     */
    public MmaExcerciseIndex() {
     this.setResizable(false);
     
        this.setLocation(300,70);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ExcerciseButton1 = new javax.swing.JButton();
        ExcerciseButton2 = new javax.swing.JButton();
        ExcerciseButton3 = new javax.swing.JButton();
        ExcerciseButton4 = new javax.swing.JButton();
        ExcerciseButton5 = new javax.swing.JButton();
        timerButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 8, 156));

        jPanel2.setBackground(new java.awt.Color(17, 17, 18));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MMA");

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\java_netbeans_ali\\CombatSport\\resources\\button\\mma.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ExcerciseButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        ExcerciseButton1.setText("EXCERCISE 1");
        ExcerciseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcerciseButton1ActionPerformed(evt);
            }
        });

        ExcerciseButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        ExcerciseButton2.setText("EXCERCISE 2");
        ExcerciseButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcerciseButton2ActionPerformed(evt);
            }
        });

        ExcerciseButton3.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        ExcerciseButton3.setText("EXCERCISE 3");
        ExcerciseButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcerciseButton3ActionPerformed(evt);
            }
        });

        ExcerciseButton4.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        ExcerciseButton4.setText("EXCERCISE 4");
        ExcerciseButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcerciseButton4ActionPerformed(evt);
            }
        });

        ExcerciseButton5.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        ExcerciseButton5.setText("EXCERCISE 5");
        ExcerciseButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcerciseButton5ActionPerformed(evt);
            }
        });

        timerButton.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        timerButton.setText("TIMER");
        timerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backButton)
                .addGap(174, 174, 174)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExcerciseButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcerciseButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcerciseButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcerciseButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcerciseButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ExcerciseButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(backButton)))
                .addGap(18, 18, 18)
                .addComponent(ExcerciseButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExcerciseButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExcerciseButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExcerciseButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new IndexPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void ExcerciseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcerciseButton1ActionPerformed
        new MmaEx1().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_ExcerciseButton1ActionPerformed

    private void ExcerciseButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcerciseButton2ActionPerformed
      new MmaEx2().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ExcerciseButton2ActionPerformed

    private void ExcerciseButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcerciseButton3ActionPerformed
         new MmaEx3().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_ExcerciseButton3ActionPerformed

    private void ExcerciseButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcerciseButton4ActionPerformed
         new MmaEx4().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_ExcerciseButton4ActionPerformed

    private void ExcerciseButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcerciseButton5ActionPerformed
          new MmaEx5().setVisible(true);
           this.dispose();
    }//GEN-LAST:event_ExcerciseButton5ActionPerformed

    private void timerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerButtonActionPerformed
      StopWatch s=new StopWatch();
      s.start();
      s.stop();
      s.reset();
    }//GEN-LAST:event_timerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MmaExcerciseIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MmaExcerciseIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MmaExcerciseIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MmaExcerciseIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MmaExcerciseIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcerciseButton1;
    private javax.swing.JButton ExcerciseButton2;
    private javax.swing.JButton ExcerciseButton3;
    private javax.swing.JButton ExcerciseButton4;
    private javax.swing.JButton ExcerciseButton5;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton timerButton;
    // End of variables declaration//GEN-END:variables
}