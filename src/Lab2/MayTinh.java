package Lab2;

public class MayTinh extends javax.swing.JFrame {

    long a;
    String tinh;

    public MayTinh() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSo = new javax.swing.JTextField();
        btnSo4 = new javax.swing.JButton();
        btnSo1 = new javax.swing.JButton();
        btnSo7 = new javax.swing.JButton();
        btnSo0 = new javax.swing.JButton();
        btnSo2 = new javax.swing.JButton();
        btnSo5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnSo8 = new javax.swing.JButton();
        btnSo3 = new javax.swing.JButton();
        btnSo6 = new javax.swing.JButton();
        btnSo9 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnPTram = new javax.swing.JButton();
        btnPSo = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();

        jButton12.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CASIO");

        btnSo4.setText("4");
        btnSo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo4ActionPerformed(evt);
            }
        });

        btnSo1.setText("1");
        btnSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });

        btnSo7.setText("7");
        btnSo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo7ActionPerformed(evt);
            }
        });

        btnSo0.setText("0");
        btnSo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo0ActionPerformed(evt);
            }
        });

        btnSo2.setText("2");
        btnSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo2ActionPerformed(evt);
            }
        });

        btnSo5.setText("5");
        btnSo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo5ActionPerformed(evt);
            }
        });

        jButton7.setText("+/-");

        btnSo8.setText("8");
        btnSo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo8ActionPerformed(evt);
            }
        });

        btnSo3.setText("3");
        btnSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo3ActionPerformed(evt);
            }
        });

        btnSo6.setText("6");
        btnSo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo6ActionPerformed(evt);
            }
        });

        btnSo9.setText("9");
        btnSo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo9ActionPerformed(evt);
            }
        });

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });

        btnAC.setText("C");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });

        btnSqrt.setText("sqrt");

        btnPTram.setText("%");

        btnPSo.setText("1/x");

        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(txtSo, javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addComponent(btnSo1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSo2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSo3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnChia)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSqrt))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addComponent(btnSo0)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnAC)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnCong)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBang))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addComponent(btnSo4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSo5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSo6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnNhan)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnPTram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addComponent(btnSo7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSo8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSo9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnTru)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnPSo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAC, btnBang, btnChia, btnCong, btnNhan, btnSo0, btnSo1, btnSo2, btnSo3, btnSo4, btnSo5, btnSo6, btnSo7, btnSo8, btnSo9, btnSqrt, btnTru, jButton7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSo1)
                    .addComponent(btnSo2)
                    .addComponent(btnSo3)
                    .addComponent(btnChia)
                    .addComponent(btnSqrt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSo4)
                    .addComponent(btnSo5)
                    .addComponent(btnSo6)
                    .addComponent(btnNhan)
                    .addComponent(btnPTram))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSo7)
                    .addComponent(btnSo8)
                    .addComponent(btnSo9)
                    .addComponent(btnTru)
                    .addComponent(btnPSo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSo0)
                    .addComponent(jButton7)
                    .addComponent(btnAC)
                    .addComponent(btnCong)
                    .addComponent(btnBang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo1ActionPerformed
        // TODO add your handling code here:
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo1.getText());
        }
    }//GEN-LAST:event_btnSo1ActionPerformed

    private void btnSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo2ActionPerformed
        // TODO add your handling code here:
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo2.getText());
        }
    }//GEN-LAST:event_btnSo2ActionPerformed

    private void btnSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo3ActionPerformed
        // TODO add your handling code here:
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo3.getText());
        }
    }//GEN-LAST:event_btnSo3ActionPerformed

    private void btnSo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo4ActionPerformed
        // TODO add your handling code here:
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo4.getText());
        }
    }//GEN-LAST:event_btnSo4ActionPerformed

    private void btnSo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo5ActionPerformed
        // TODO add your handling code here:
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo5.getText());
        }
    }//GEN-LAST:event_btnSo5ActionPerformed

    private void btnSo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo6ActionPerformed

        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo6.getText());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSo6ActionPerformed

    private void btnSo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo7ActionPerformed
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo7.getText());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSo7ActionPerformed

    private void btnSo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo8ActionPerformed
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo8.getText());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSo8ActionPerformed

    private void btnSo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo9ActionPerformed
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo9.getText());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSo9ActionPerformed

    private void btnSo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo0ActionPerformed
        String so = txtSo.getText();
        if (so.length() < 12) {
            if (so.equals("0")) {
                so = "";
            }
            txtSo.setText(so + btnSo0.getText());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSo0ActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        // TODO add your handling code here:
        txtSo.setText("");
    }//GEN-LAST:event_btnACActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        // TODO add your handling code here:
        a = Long.parseLong(txtSo.getText());
        if (a != 0) {
            txtSo.setText("");
            tinh = "Chia";
        }
    }//GEN-LAST:event_btnChiaActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        // TODO add your handling code here:
        a = Long.parseLong(txtSo.getText());
        if (a != 0) {
            txtSo.setText("");
            tinh = "Nhân";
        }
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        // TODO add your handling code here:
        a = Long.parseLong(txtSo.getText());
        if (a != 0) {
            txtSo.setText("");
            tinh = "Trừ";
        }

    }//GEN-LAST:event_btnTruActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:
        a = Long.parseLong(txtSo.getText());
        if (a != 0) {
            txtSo.setText("");
            tinh = "Cộng";
        }
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        // TODO add your handling code here:
        long b = Long.parseLong(txtSo.getText());

        if (tinh.equalsIgnoreCase("cộng")) {
            txtSo.setText(String.valueOf(a + b));
        }
        if (tinh.equalsIgnoreCase("trừ")) {
            txtSo.setText(String.valueOf(a - b));
        }
        if (tinh.equalsIgnoreCase("nhân")) {
            txtSo.setText(String.valueOf(a * b));
        }
        if (tinh.equalsIgnoreCase("chia")) {
            txtSo.setText(String.valueOf(a / b));
        }
    }//GEN-LAST:event_btnBangActionPerformed

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
            java.util.logging.Logger.getLogger(MayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MayTinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnPSo;
    private javax.swing.JButton btnPTram;
    private javax.swing.JButton btnSo0;
    private javax.swing.JButton btnSo1;
    private javax.swing.JButton btnSo2;
    private javax.swing.JButton btnSo3;
    private javax.swing.JButton btnSo4;
    private javax.swing.JButton btnSo5;
    private javax.swing.JButton btnSo6;
    private javax.swing.JButton btnSo7;
    private javax.swing.JButton btnSo8;
    private javax.swing.JButton btnSo9;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtSo;
    // End of variables declaration//GEN-END:variables
}
