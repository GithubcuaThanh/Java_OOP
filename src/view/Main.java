
package view;

import com.sun.org.apache.xerces.internal.impl.dv.xs.ListDV;
import controller.DienThoaiException;
import controller.IOFile;
import controller.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DichVu;
import model.NhanVien;


public class Main extends javax.swing.JFrame {

    DefaultTableModel tmDV,tmNV;
    String fDV,fNV;
    List<DichVu> listDV;
    List<NhanVien>listNV;
    
    public Main() {
        initComponents();
        setLocationRelativeTo(this);
        fDV="src/controller/DV.dat";
        fNV="src/controller/NV.dat";
        String[] dv={ "ma DV","Ten DV","Nhom DV","Cho phi","Cuoc"};
        String[] nv={ "ma NV","Ho Ten DV","Dia chi","Dien thoai"};
        tmDV=new DefaultTableModel(dv, 0);
        tmNV=new DefaultTableModel(nv, 0);
        jTable1.setModel(tmDV);
        jTable2.setModel(tmNV);
        loadDV();
        loadNV();
        showDV(listDV);
        showNV(listNV);
    }
    private void loadDV(){
        File f=new File(fDV);
        if(f.exists()){
            listDV=IOFile.doc(fDV);
        }else
             listDV=new ArrayList<>();
    }
    private void loadNV(){
        File f=new File(fNV);
        if(f.exists()){
            listNV=IOFile.doc(fNV);
        }else
               listNV= new ArrayList<>();
    }
    private void showDV(List<DichVu> list){
        tmDV.setRowCount(0);
        for(DichVu i:list)
            tmDV.addRow(i.toObjects());
    }
    private void showNV(List<NhanVien> list){
        tmNV.setRowCount(0);
        for(NhanVien i:list)
            tmNV.addRow(i.toObjects());
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        p1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        btThem1 = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btLuu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Ma DV:");

        jLabel2.setText("Ten DV:");

        jLabel3.setText("Nhom DV:");

        jLabel4.setText("Chi phi:");

        jLabel5.setText("Cuoc:");

        jTextField1.setEditable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " D???ch v??? thu?? bao tr??? tr?????c", " D???ch v??? thu?? bao tr??? sau", " D???ch v??? gi?? tr??? gia t??ng" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btThem.setText("Them DV");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setText("Xoa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btLuu.setText("Luu vao file");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        jLabel8.setText("Nhap thong tin tim");

        jButton1.setText("Tim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btThem)
                        .addGap(38, 38, 38)
                        .addComponent(btXoa)
                        .addGap(29, 29, 29)
                        .addComponent(btLuu)))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btLuu)
                    .addComponent(jLabel8)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thong tin dich vu", p1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setText("Ma NV:");

        jLabel7.setText("Ho ten NV:");

        jLabel9.setText("Dia chi:");

        jLabel10.setText("Dien thoai:");

        jTextField5.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btThem1.setText("Them NV");
        btThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThem1ActionPerformed(evt);
            }
        });

        btSua.setText("Sua");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btLuu1.setText("Luu");
        btLuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThem1)
                .addGap(38, 38, 38)
                .addComponent(btSua)
                .addGap(29, 29, 29)
                .addComponent(btLuu1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem1)
                    .addComponent(btSua)
                    .addComponent(btLuu1))
                .addGap(0, 119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thong tin nhan vien", p2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThem1ActionPerformed
        int n=listNV.size();
        if(n>0)
            NhanVien.setSma(listNV.get(n-1).getMa()+1);
        jTextField5.setText(NhanVien.getSma()+"");
        String hoten,dc,dt;
        try{
            hoten=jTextField6.getText();
            dc=jTextField7.getText();
            dt=jTextField8.getText();
            NhanVien nv =new NhanVien(hoten, dc,dt);
            tmNV.addRow(nv.toObjects());
            listNV.add(nv);
        }catch(TrongException e){
            JOptionPane.showMessageDialog(this, "Khong de trong");
            return;
        }catch(DienThoaiException e){
            JOptionPane.showMessageDialog(this, "Nhap vao so");
            return;
        }
    }//GEN-LAST:event_btThem1ActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        int n=listDV.size();
        if(n>0)
            DichVu.setSma(listDV.get(n-1).getMa()+1);
        jTextField1.setText(DichVu.getSma()+"");
        String ten,nhom;
        double cp,cuoc;
        try{
            ten=jTextField2.getText();
            nhom=jComboBox1.getSelectedItem().toString();
            cp=Double.parseDouble(jTextField3.getText());
            cuoc=Double.parseDouble(jTextField4.getText());
            DichVu dv =new DichVu(ten, nhom, cp, cuoc);
            tmDV.addRow(dv.toObjects());
            listDV.add(dv);
        }catch(TrongException e){
            JOptionPane.showMessageDialog(this, "Khong de trong");
            return;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Nhap vao so");
            return;
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int r=jTable1.getSelectedRow();
        if(r>=0 && r<jTable1.getRowCount()){
            tmDV.removeRow(r);
            listDV.remove(r);
        }else{
            JOptionPane.showMessageDialog(this,"Chon dich vu de xoa");
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        IOFile.viet(fDV, listDV);
    }//GEN-LAST:event_btLuuActionPerformed

    private void btLuu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuu1ActionPerformed
        IOFile.viet(fNV, listNV); 
    }//GEN-LAST:event_btLuu1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int r=jTable2.getSelectedRow();
        jTextField5.setText(tmNV.getValueAt(r,0).toString());
        jTextField6.setText(tmNV.getValueAt(r,1).toString());
        jTextField7.setText(tmNV.getValueAt(r,2).toString());
        jTextField8.setText(tmNV.getValueAt(r,3).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int r=jTable2.getSelectedRow();
        if(r>=0 && r<jTable2.getRowCount()){
            String hoten=jTextField6.getText();
            String dc=jTextField7.getText();
            String dt=jTextField8.getText();
            tmNV.setValueAt(hoten, r, 1);
            tmNV.setValueAt(dc, r, 2);
            tmNV.setValueAt(dt, r, 3);
            int ma=Integer.parseInt(jTextField5.getText());
            NhanVien nv=new NhanVien(ma,hoten,dc,dt);
            listNV.set(r, nv);
        }else{
            JOptionPane.showMessageDialog(this,"Chon nhan vien de sua");
            return;
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String key=jTextField9.getText().trim().toLowerCase();
        List<DichVu> l=new ArrayList<>();
        for(DichVu i:listDV)
            if(i.getTen().toLowerCase().contains(key) ||
                    i.getNhom().toLowerCase().contains(key))
                l.add(i);
        showDV(l);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btLuu1;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThem1;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    // End of variables declaration//GEN-END:variables
}
