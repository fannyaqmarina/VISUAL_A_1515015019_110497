/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import javax.swing.JOptionPane;

/**
 *
 * @author ASPIRE E 14
 */
public class pelanggan extends javax.swing.JFrame {

    /**
     * Creates new form pelanggan
     */
    public pelanggan() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tlp = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        bb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        aturdisc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        diskon = new javax.swing.JSlider();
        persen = new javax.swing.JLabel();
        regular = new javax.swing.JRadioButton();
        express = new javax.swing.JRadioButton();
        total = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        proses = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(231, 231, 253));

        jLabel1.setFont(new java.awt.Font("KG Second Chances Solid", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULIR PELANGGAN");

        jLabel10.setFont(new java.awt.Font("Kawaii Food Font", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("joabelubfiwdoebgsbwjdbxieldndtsng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel3.setBackground(new java.awt.Color(217, 236, 252));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("KG Second Chances Solid", 0, 14)); // NOI18N
        jLabel2.setText("Nama :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("KG Second Chances Solid", 0, 14)); // NOI18N
        jLabel3.setText("No. Tlp :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        jLabel4.setFont(new java.awt.Font("KG Second Chances Solid", 0, 14)); // NOI18N
        jLabel4.setText("Berat Barang :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        tlp.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        tlp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlpActionPerformed(evt);
            }
        });
        jPanel3.add(tlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, 282, 37));

        nama.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel3.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 282, 37));

        bb.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        jPanel3.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 169, 47, 34));

        jLabel5.setFont(new java.awt.Font("KG Second Chances Solid", 0, 14)); // NOI18N
        jLabel5.setText("kg");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 176, -1, -1));

        jPanel4.setBackground(new java.awt.Color(217, 236, 252));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aturdisc.setFont(new java.awt.Font("KG Second Chances Solid", 0, 14)); // NOI18N
        aturdisc.setText("Atur Diskon :");
        jPanel4.add(aturdisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel7.setFont(new java.awt.Font("KG Second Chances Solid", 0, 14)); // NOI18N
        jLabel7.setText("Total Harga :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, -1, -1));

        jLabel8.setFont(new java.awt.Font("KG Second Chances Solid", 0, 14)); // NOI18N
        jLabel8.setText("Jenis Jasa :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        diskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                diskonStateChanged(evt);
            }
        });
        jPanel4.add(diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        persen.setDisplayedMnemonic('t');
        persen.setFont(new java.awt.Font("KG Second Chances Solid", 0, 14)); // NOI18N
        persen.setText("%");
        jPanel4.add(persen, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 48, -1, -1));

        buttonGroup1.add(regular);
        regular.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        regular.setText("Regular");
        jPanel4.add(regular, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 100, -1, -1));

        buttonGroup1.add(express);
        express.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        express.setText("Express");
        express.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expressActionPerformed(evt);
            }
        });
        jPanel4.add(express, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 100, -1, -1));

        total.setEditable(false);
        total.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel4.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 213, 37));

        exit.setBackground(new java.awt.Color(231, 231, 253));
        exit.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(231, 231, 253));
        reset.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(102, 102, 102));
        reset.setText("Ulangi");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        proses.setBackground(new java.awt.Color(231, 231, 253));
        proses.setFont(new java.awt.Font("KG Second Chances Solid", 0, 12)); // NOI18N
        proses.setForeground(new java.awt.Color(102, 102, 102));
        proses.setText("Process");
        proses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prosesMouseEntered(evt);
            }
        });
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(proses)
                                .addGap(18, 18, 18)
                                .addComponent(reset))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit)
                                .addGap(108, 108, 108))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addComponent(jSeparator2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(proses)
                        .addComponent(reset)))
                .addGap(27, 27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tlpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlpActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void expressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expressActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        nama.setText("");
        tlp.setText("");
        bb.setText("0");
        total.setText("");
        buttonGroup1.clearSelection();
        diskon.setValue(0);
        
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void diskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_diskonStateChanged
        
            String disc = String.valueOf(diskon.getValue());
        persen.setText(disc+"%");
    }//GEN-LAST:event_diskonStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nama.setText("");
        tlp.setText("");
        bb.setText("0");
        total.setText("");
        buttonGroup1.clearSelection();
        diskon.setValue(0);
    }//GEN-LAST:event_formWindowOpened

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        
        String berat=bb.getText();
        String disc=String.valueOf(diskon.getValue());
        float brt,disk;
        
        brt=Float.parseFloat(berat);
        disk=Float.parseFloat(disc);
        
        if(regular.isSelected()&&brt>=10){
            double hasil;
            hasil=(brt*11500)-((brt*11500)*(disk/100));
            total.setText(String.valueOf(hasil));
        }
        else if(regular.isSelected()&&brt<10){
            double hasil;
            hasil=(brt*11500);
            total.setText(String.valueOf(hasil));
        }
        else if(express.isSelected()&&brt<10){
            double hasil;
            hasil=(brt*11500*1.5);
            total.setText(String.valueOf(hasil));
        }
        else if(express.isSelected()&&brt>=10){
            double hasil;
            hasil=(brt*11500)-((brt*11500)*(disk/100));
            hasil=hasil*1.5;
            total.setText(String.valueOf(hasil));
        }
                      
                
    }//GEN-LAST:event_prosesActionPerformed

    private void prosesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prosesMouseEntered
                    proses.setEnabled(true);
                 if(nama.getText().equals("") || tlp.getText().equals("")||bb.getText().equals("0")||bb.getText().equals("")){
                     proses.setEnabled(false);
                 }
    }//GEN-LAST:event_prosesMouseEntered

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
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aturdisc;
    private javax.swing.JTextField bb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSlider diskon;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton express;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel persen;
    private javax.swing.JButton proses;
    private javax.swing.JRadioButton regular;
    private javax.swing.JButton reset;
    private javax.swing.JTextField tlp;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
