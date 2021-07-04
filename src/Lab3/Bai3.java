/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Calendar;
import java.util.Hashtable;
import javax.swing.JLabel;

/**
 *
 * @author Thuy Linh
 */
public class Bai3 extends javax.swing.JFrame {

    /**
     * Creates new form Bai3
     */
    public Bai3() {
        initComponents();
        setLocationRelativeTo(null);
        Hashtable data = new Hashtable();
        String [] so = {"0","5","10","15","20","25","30","35","40","45","50"};
        for (int i =0 ; i<so.length;i++){
            data.put(i, new JLabel(so[i]));
        }
        sldFont.setLabelTable(data);
        Calendar can = Calendar.getInstance();
        sldFont.setValue(can.get(Calendar.MINUTE));
        displaySize();
    }
    public void displaySize(){
        int value = sldFont.getValue();
        txtSize.setText(String.valueOf(value));
        lblFont.setFont(new java.awt.Font("Arial",1,value));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sldFont = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        btnSetValue = new javax.swing.JButton();
        lblFont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sldFont.setMajorTickSpacing(1);
        sldFont.setMaximum(50);
        sldFont.setMinorTickSpacing(1);
        sldFont.setValue(1);
        sldFont.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldFontStateChanged(evt);
            }
        });

        jLabel1.setText("Giá trị hiện tại");

        btnSetValue.setText("Set Value");
        btnSetValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetValueActionPerformed(evt);
            }
        });

        lblFont.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        lblFont.setText("Font Size");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFont, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSetValue))
                        .addComponent(sldFont, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(sldFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetValue))
                .addGap(18, 18, 18)
                .addComponent(lblFont, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldFontStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldFontStateChanged
        // TODO add your handling code here:
        displaySize();
    }//GEN-LAST:event_sldFontStateChanged

    private void btnSetValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetValueActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(txtSize.getText());
        sldFont.setValue(value);
    }//GEN-LAST:event_btnSetValueActionPerformed

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
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFont;
    private javax.swing.JSlider sldFont;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
