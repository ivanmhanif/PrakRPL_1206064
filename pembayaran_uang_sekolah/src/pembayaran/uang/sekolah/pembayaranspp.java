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
 * pembayaranspp.java
 *
 * Created on 07 Jun 14, 10:10:31
 */
/**
 *
 * @author ivan
 */
public final class pembayaranspp extends javax.swing.JFrame {

    private static class tabelsiswa {

        public tabelsiswa() {
        }
    }
    private final DefaultTableModel model;

    private static class model {

        public model() {
        }
    }

    private static class tabelspp {

        
        public tabelspp() {
        }
    }

    /** Creates new form pembayaranspp */
    public pembayaranspp() {
        initComponents();
        model = new DefaultTableModel();
       tabelspp.setModel(model);
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

            String sql = "SELECT * FROM pembayaran_spp";
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputnis = new javax.swing.JTextField();
        inputnamapembayar = new javax.swing.JTextField();
        inputjumlahpembayaran = new javax.swing.JTextField();
        inputstatuspembayaran = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelspp = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        inputtanggalpembayaran = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("PEMBAYARAN SPP");

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

        tabelspp.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "nis", "nama pembayar", "tanggal pembayaran", "jumlah pembayaran", "status pembayaran"
            }
        ));
        tabelspp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelsppMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelsppMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabelspp);

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

        inputtanggalpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputtanggalpembayaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputnis, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inputnamapembayar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputtanggalpembayaran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inputjumlahpembayaran, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputstatuspembayaran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inputnamapembayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputtanggalpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputjumlahpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(inputstatuspembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void inputnamapembayarActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void tabelsppMouseClicked(java.awt.event.MouseEvent evt) {                                      
      int i = tabelspp.getSelectedRow();
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
                
        String status_pembayaran = (String)model.getValueAt(i, 4);
        inputstatuspembayaran.setText(status_pembayaran);
        
        
    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String nis = inputnis.getText();
        String nama_pembayar = inputnamapembayar.getText();
        String tanggal = inputtanggalpembayaran.getText();
        String jumlah_pembayaran = inputjumlahpembayaran.getText();
        String status_pembayaran = inputstatuspembayaran.getText();
                try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();

            String sql = "INSERT INTO pembayaran_spp VALUES (?, ?, ?, ?, ?)";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, nis);
            p.setString(2, nama_pembayar);
            p.setString(3, tanggal);
            p.setString(4, jumlah_pembayaran);
            p.setString(5, status_pembayaran);
           

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        } finally {
            loadData();
        }
                                            

                           
      
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       int i = tabelspp.getSelectedRow();
        if (i == -1) {
            return;
        
        }
        String nis = (String) model.getValueAt(i, 0);
        String nama_pembayar = inputnamapembayar.getText();
        String tanggal = inputtanggalpembayaran.getText();
        String jumlah_pembayaran = inputjumlahpembayaran.getText();
        String status_pembayaran = inputstatuspembayaran.getText();
       
        
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "UPDATE pembayaran_spp SET nama_pembayar  = ?, tanggal = ?, jumlah_pembayaran = ?, status_pembayaran = ? WHERE nis= ?";
            
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            
            p.setString(1, nis);
            p.setString(2, nama_pembayar);
            p.setString(3, tanggal);
            p.setString(4, jumlah_pembayaran);
            p.setString(5, status_pembayaran);
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");

        } finally {
            loadData();
        }
        
    }                                        
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int i = tabelspp.getSelectedRow();
        if (i == -1) {
            return;
        }
        String nis = (String) tabelspp.getValueAt(i, 0);
        try {
            Connection c = (Connection) KoneksiDatabase.getKoneksi();
            String sql = "DELETE FROM pembayaran_spp WHERE nis = ?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);

            p.setString(1, nis);

            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.err.println("Terjadi Error");
        } finally {
            loadData();
        }
                                        

    }                                        

    private void tabelsppMousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void inputtanggalpembayaranActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new pembayaranspp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JTextField inputjumlahpembayaran;
    private javax.swing.JTextField inputnamapembayar;
    private javax.swing.JTextField inputnis;
    private javax.swing.JTextField inputstatuspembayaran;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelspp;
    // End of variables declaration                   
}
