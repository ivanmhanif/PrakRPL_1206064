package pembayaran.uang.sekolah;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pembayaranuas.java
 *
 * Created on 07 Jun 14, 10:10:58
 */
/**
 *
 * @author ivan
 */
public final class pembayaranuas extends javax.swing.JFrame {
    private final DefaultTableModel model;

    /** Creates new form pembayaranuas */
    public pembayaranuas() {
        initComponents();
        model = new DefaultTableModel();
       tabeluas.setModel(model);
        model.addColumn("nis");
        model.addColumn("nama_pembayar");
        model.addColumn("tanggal");
        model.addColumn("jumlah_pembayaran");
        model.addColumn("status_pembayaran");
      
        loadData();
    
    }
        public void loadData() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            Statement s = (Statement) c.createStatement();

            String sql = "SELECT * FROM pembayaran_uas";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("nis");
                o[1] = r.getString("nama_pembayar");
                o[2] = r.getString("tanggal");
                o[3] = r.getString("jumlah_pembayaran");
                o[4] = r.getString("status_pembayaran");
                
                model.addRow(o);
      }

            r.close();
            s.close();
        } catch (SQLException e) {

        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputnis = new javax.swing.JTextField();
        inputnamapembayar = new javax.swing.JTextField();
        inputjumlahpembayaran = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeluas = new javax.swing.JTable();
        inputtanggalpembayaran = new javax.swing.JTextField();
        inputstatuspembayaran = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jLabel1.setText("PEMBAYARAN UAS");

        jLabel2.setText("NIS");

        jLabel3.setText("NAMA PEMBAYAR");

        jLabel4.setText("TANGGAL PEMBAYARAN");

        jLabel5.setText("JUMLAH PEMBAYARAN");

        jLabel6.setText("STATUS PEMBAYARAN");

        inputnamapembayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnamapembayarActionPerformed(evt);
            }
        });

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabeluas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIS", "NAMA PEMBAYAR", "TANGGAL PEMBAYARAN", "JUMLAH PEMBAYARAN", "STATUS PEMBAYARAN"
            }
        ));
        tabeluas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeluasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeluas);

        inputstatuspembayaran.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LUNAS", "TUNGGAK" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(132, 132, 132))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(64, 64, 64)))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputnis, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputnamapembayar, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputjumlahpembayaran, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputtanggalpembayaran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addComponent(inputstatuspembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inputnamapembayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputtanggalpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputjumlahpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(inputstatuspembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputnamapembayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnamapembayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnamapembayarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String nis = inputnis.getText();
        String nama_pembayar = inputnamapembayar.getText();
        String tanggal = inputtanggalpembayaran.getText();
        String jumlah_pembayaran = inputjumlahpembayaran.getText();
        Object status_pembayaran = inputstatuspembayaran.getSelectedItem();
                try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();

            String sql = "INSERT INTO pembayaran_uas VALUES (?, ?, ?, ?, ?)";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, nis);
            p.setString(2, nama_pembayar);
            p.setString(3, tanggal);
            p.setString(4, jumlah_pembayaran);
            p.setObject(5, status_pembayaran);
           

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        } finally {
            loadData();
        }
                            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   int i = tabeluas.getSelectedRow();
        if (i == -1) {
            return;
        
        }
        String nis = (String) model.getValueAt(i, 0);
        String nama_pembayar = inputnamapembayar.getText();
        String tanggal = inputtanggalpembayaran.getText();
        String jumlah_pembayaran = inputjumlahpembayaran.getText();
        Object status_pembayaran = inputstatuspembayaran.getSelectedItem();
       
        
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "UPDATE pembayaran_uas SET nama_pembayar  = ?, tanggal = ?, jumlah_pembayaran= ?, status_pemabayaran= ? WHERE nis= ?";
            
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            
            p.setString(1, nis);
            p.setString(2, nama_pembayar);
            p.setString(3, tanggal);
            p.setString(4, jumlah_pembayaran);
            p.setObject(5, status_pembayaran);
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");

        } finally {
            loadData();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabeluasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeluasMouseClicked
    int i = tabeluas.getSelectedRow();
        if(i == -1){
            return;}
        String nis = (String) model.getValueAt(i, 0);
        inputnis.setText(nis);
        
        String nama_pembayar = (String) model.getValueAt(i, 1);
        inputnamapembayar.setText(nama_pembayar);
        
        String tanggal = (String)model.getValueAt(i, 2);
        inputtanggalpembayaran.setText(tanggal);
        
        String jumlah_pembayaran = (String) model.getValueAt(i, 3);
        inputjumlahpembayaran.setText(jumlah_pembayaran);
                
        Object status_pembayaran = (Object)model.getValueAt(i, 4);
        inputstatuspembayaran.setSelectedItem(status_pembayaran);
        
    }//GEN-LAST:event_tabeluasMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int i = tabeluas.getSelectedRow();
        if (i == -1) {
            return;
        }
        String nis = (String) tabeluas.getValueAt(i, 0);
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "DELETE FROM pembayaran_uas WHERE nis = ?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, nis);

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.err.println("Terjadi Error");
        } finally {
            loadData();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pembayaranuas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputjumlahpembayaran;
    private javax.swing.JTextField inputnamapembayar;
    private javax.swing.JTextField inputnis;
    private javax.swing.JComboBox inputstatuspembayaran;
    private javax.swing.JTextField inputtanggalpembayaran;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeluas;
    // End of variables declaration//GEN-END:variables
}
