/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASPIRE E 14
 */
public class formdatabuku extends javax.swing.JFrame {
private DefaultTableModel model;
private Connection con = koneksi.getConnection();
private Statement stt;
private ResultSet rrs;

private int baris;
private boolean cek=true;
    public formdatabuku() {
        initComponents();
    }
    private void InitTable(){
        model = new DefaultTableModel();
         model.addColumn("Id");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Harga");
       
        
        table.setModel(model);
    }
    private void Tampildata(){
        try{
            String sql = "SELECT *FROM buku";
            stt=con.createStatement();
            ResultSet rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o =new Object[4];
                o[0]=rss.getInt("id_buku");
                o[1]=rss.getString("JUDUL");
                o[2]=rss.getString("PENULIS");
                o[3]=rss.getInt("HARGA");
                model.addRow(o);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private void TambahData(String jud, String nulis, String price){
        try{
            String sql = "INSERT INTO buku values (NULL,'"+jud+"','"+nulis+"',"
+price+")";
        stt = con.createStatement();
        stt.executeUpdate(sql);
        }
    catch(SQLException e){
        System.out.println(e.getMessage());
    }}
    private void Hapusdata(String id, int baris){
        try{
            String sqldelete =
                    "DELETE FROM buku WHERE id_buku='"+id+"'";
            stt = con. createStatement();
            stt.executeUpdate(sqldelete);
            model.removeRow(baris);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private void updatedata(String jud, String nulis, String price, String id){
         try{
           String sql = "UPDATE buku SET "
                   +"judul='"+jud+"',"
                   +"penulis='"+nulis+"',"
                   +"harga='"+price+"'"
                   +"where id_buku='"+id+"'";
           stt=con.createStatement();
           stt.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private void validasidata(String jud, String nulis, String price) {
        try{
            String sql ="SELECT *FROM buku";
            stt = con.createStatement();
            ResultSet rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o = new Object[2];
                o[0]=rss.getString("judul").toLowerCase();
                o[1]=rss.getString("penulis").toLowerCase();
                
                if(o[0].equals(jud.toLowerCase())&&o[1].equals(nulis.toLowerCase())){
                    JOptionPane.showMessageDialog(null,"DATA TELAH ADA");
                    cek=false;
                    break;                    
                }
            }
            if(cek==true){
                TambahData(jud, nulis, price);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private void caridatajud(){
        try{
            String sql ="SELECT *FROM buku where judul='"+cari.getText()+"'";
            stt = con.createStatement();
            ResultSet rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o =new Object[4];
                o[0]=rss.getInt("id_buku");
                o[1]=rss.getString("JUDUL");
                o[2]=rss.getString("PENULIS");
                o[3]=rss.getInt("HARGA");
                model.addRow(o);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private void caridataharga(){
        try{
            String sql ="SELECT *FROM buku where harga='"+cari.getText()+"'";
            stt = con.createStatement();
            ResultSet rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o =new Object[4];
                o[0]=rss.getInt("id_buku");
                o[1]=rss.getString("JUDUL");
                o[2]=rss.getString("PENULIS");
                o[3]=rss.getInt("HARGA");
                model.addRow(o);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private void caridatanulis(){
        try{
            String sql ="SELECT *FROM buku where penulis='"+cari.getText()+"'";
            stt = con.createStatement();
            ResultSet rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o =new Object[4];
                o[0]=rss.getInt("id_buku");
                o[1]=rss.getString("JUDUL");
                o[2]=rss.getString("PENULIS");
                o[3]=rss.getInt("HARGA");
                model.addRow(o);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private void caridataid(){
        try{
            String sql ="SELECT *FROM buku where id_buku='"+cari.getText()+"'";
            stt = con.createStatement();
            ResultSet rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o =new Object[4];
                o[0]=rss.getInt("id_buku");
                o[1]=rss.getString("JUDUL");
                o[2]=rss.getString("PENULIS");
                o[3]=rss.getInt("HARGA");
                model.addRow(o);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.desc
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_harga = new javax.swing.JTextField();
        t_penulis = new javax.swing.JComboBox();
        t_judul = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        by = new javax.swing.JComboBox();
        search = new javax.swing.JButton();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 239, 247));

        jLabel1.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM DATA BUKU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Penulis :");

        jLabel3.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Judul    :");

        jLabel4.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Harga :");

        t_harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_hargaKeyPressed(evt);
            }
        });

        t_penulis.setFont(new java.awt.Font("KG Second Chances Solid", 0, 11)); // NOI18N
        t_penulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "WS. Rendra", "Felix Siauw", "Asma Nadia", "Dewi Lestari", " ", " " }));

        t_judul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_judulKeyPressed(evt);
            }
        });

        simpan.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        simpan.setText("Simpan");
        simpan.setActionCommand("");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        ubah.setText("Ubah");
        ubah.setActionCommand("");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        hapus.setText("Hapus");
        hapus.setActionCommand("");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        keluar.setText("Keluar");
        keluar.setActionCommand("");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(28, 28, 28)
                            .addComponent(t_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(23, 23, 23)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t_judul, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(t_penulis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addGap(18, 18, 18)
                        .addComponent(ubah)
                        .addGap(18, 18, 18)
                        .addComponent(hapus)
                        .addGap(18, 18, 18)
                        .addComponent(keluar)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel3)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(t_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(keluar)
                    .addComponent(hapus)
                    .addComponent(ubah))
                .addGap(34, 34, 34))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel3)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Cari :");

        jLabel6.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("by");

        by.setFont(new java.awt.Font("KG Second Chances Solid", 0, 11)); // NOI18N
        by.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Judul", "Penulis", "Harga" }));

        search.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        search.setText("Cari");
        search.setActionCommand("");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("KG Second Chances Sketch", 1, 14)); // NOI18N
        show.setText("Tampilkan data");
        show.setActionCommand("");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search)
                .addGap(18, 18, 18)
                .addComponent(show)
                .addGap(69, 69, 69))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 468, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      InitTable();
      Tampildata();
    }//GEN-LAST:event_formComponentShown

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
     if(t_judul.getText().equals("")||t_harga.getText().equals("")){
         JOptionPane.showMessageDialog(null,"DATA BELUM LENGKAP","Danger!!",JOptionPane.INFORMATION_MESSAGE);
         t_judul.requestFocus();
     }
        String jud = t_judul.getText();
      String nulis = t_penulis.getSelectedItem().toString();
      String price = t_harga.getText();
     
      validasidata(jud,nulis,price);
      
      InitTable();
      Tampildata();
      t_judul.setText("");
      t_penulis.getSelectedItem();
      t_harga.setText("");
     
    }//GEN-LAST:event_simpanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
      System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       int baris=table.getSelectedRow();
       
       String e_judul=table.getValueAt(baris, 1).toString();
       String e_tulis=table.getValueAt(baris, 2).toString();
       String e_harga=table.getValueAt(baris, 3).toString();
       
       t_judul.setText(e_judul);
       t_penulis.setSelectedItem(e_tulis);
       t_harga.setText(e_harga);
    }//GEN-LAST:event_tableMouseClicked

    private void t_judulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_judulKeyPressed
       
    }//GEN-LAST:event_t_judulKeyPressed

    private void t_hargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_hargaKeyPressed
      
    }//GEN-LAST:event_t_hargaKeyPressed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        try {
             int baris = table.getSelectedRow();
      
      table.setValueAt(t_judul.getText(), baris,1);
      table.setValueAt(t_penulis.getSelectedItem(), baris,2);
      table.setValueAt(t_harga.getText(), baris,3);
      
    String e_judul=table.getValueAt(baris, 1).toString();
       String e_tulis=table.getValueAt(baris, 2).toString();
       String e_harga=table.getValueAt(baris, 3).toString();
       String id=table.getValueAt(baris, 0).toString();
       
       t_judul.setText(e_judul);
       t_penulis.setSelectedItem(e_tulis);
       t_harga.setText(e_harga);
       
       updatedata(e_judul,e_tulis,e_harga,id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"DATA BELUM DIPILIH","Danger!!",JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
  try{
      int baris = table.getSelectedRow();
  
       String id = table.getValueAt(baris, 0).toString();
        Hapusdata(id,baris);
    
        t_judul.setText("");
        t_penulis.setSelectedItem(null);
        t_harga.setText("");
  }catch(Exception e){
      JOptionPane.showMessageDialog(null,"DATA BELUM DIPILIH","Danger!!",JOptionPane.INFORMATION_MESSAGE);
  }
    }//GEN-LAST:event_hapusActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(cari.getText().equals("")){
             JOptionPane.showMessageDialog(null,"MAU CARI APA ?","WARNING!!",JOptionPane.INFORMATION_MESSAGE);
         }
        else{
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        if(by.getSelectedItem().equals("ID")){
            caridataid();
        }
        else if(by.getSelectedItem().equals("Penulis")){
            caridatanulis();
        }
         else if(by.getSelectedItem().equals("Judul")){
            caridatajud();
        }
         else{
             caridataharga();
         }
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        InitTable();
        Tampildata();
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(formdatabuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formdatabuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formdatabuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formdatabuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formdatabuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox by;
    private javax.swing.JTextField cari;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton search;
    private javax.swing.JButton show;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_judul;
    private javax.swing.JComboBox t_penulis;
    private javax.swing.JTable table;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables

   
       
    
}
