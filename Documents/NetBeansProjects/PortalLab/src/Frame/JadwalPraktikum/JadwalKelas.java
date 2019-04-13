/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.JadwalPraktikum;

import Koneksi.koneksi;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 *
 * @author Baladika
 */
public class JadwalKelas extends javax.swing.JFrame {

    /**
     * Creates new form semua
     */
    String a;
    public JadwalKelas() {
        initComponents();
        lbl1.setVisible(false);
        lblHAsil.setVisible(false);
    }
    public JadwalKelas(String cetak) throws SQLException {
        initComponents();
        lbl1.setVisible(false);
        lblHAsil.setVisible(false);
        a = cetak;
        lblHAsil.setText(cetak);
        this.setLocationRelativeTo(null);
        String kelas = lblHAsil.getText().toString();
        String sql = "SELECT * FROM jadwal_praktikum where jenis ='"+kelas+"'";
        Statement statement = koneksi.getConnection().createStatement();
        statement.execute(sql);
        try {
          Connection connection = koneksi.getConnection();
          ResultSet rs;
          rs=statement.executeQuery(sql);
          String Jenis = "";  
          String namafile = "";
          while(rs.next()){                
              Jenis = rs.getString("jenis");
              namafile = rs.getString("nama_file");
  //            if(Jenis.equals("All")){
  //                openpdf(namafile);
  //                System.out.println("NOT EMPTY COY");
  //            }


              } 
            if(Jenis.equals("")){
                  System.out.println("EMPTY COY");
                  openpdf(namafile);

           }else{
                  System.out.println("GK BERHASIL");
                  openpdf(namafile);
              }

         }
      catch(Exception e){
          
          System.out.println(e);
      }
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
        lblNamaFile = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnFile = new javax.swing.JButton();
        lblHAsil = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        lbl1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnFile.setText("Select File");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        lblHAsil.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblHAsil.setText("Nama kelas");

        lbl1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl1.setText("Kelas :");

        jPanel5.setBackground(new java.awt.Color(73, 5, 130));

        jLabel4.setFont(new java.awt.Font("Arno Pro Smbd", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JADWAL PERKELAS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblNamaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFile)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(75, 75, 75)
                        .addComponent(lbl1)
                        .addGap(18, 18, 18)
                        .addComponent(lblHAsil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFile)
                    .addComponent(lblNamaFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHAsil, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1042, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Documents", "pdf");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f  = chooser.getSelectedFile();
        fileName = f.getAbsolutePath();
        lblNamaFile.setText(fileName);

        try{
            Statement statement = Koneksi.koneksi.getConnection().createStatement();

        }catch(Exception e){

        }
    }//GEN-LAST:event_btnFileActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String kelas = lblHAsil.getText().toString();
        String sql = "SELECT * FROM jadwal_praktikum where jenis ='"+kelas+"'";
        try {
            Connection connection = koneksi.getConnection();
            ResultSet rs;
            Statement statement = connection.createStatement();
            rs=statement.executeQuery(sql);
            String Jenis="";

            while(rs.next()){
                Jenis = rs.getString("jenis");
                System.out.println(Jenis);
            }

            if(Jenis.equals(lblHAsil.getText()) && !lblNamaFile.getText().equals("")){
                try {
                    String namafile = lblNamaFile.getText();
                    String namafileF = namafile.replace("\\", "\\\\");
                    String updateSQL = "UPDATE jadwal_praktikum SET nama_file = '"+namafileF+"' WHERE jenis='"+lblHAsil.getText()+"'";
                       
                    Statement statement1 = koneksi.getConnection().createStatement();
                    statement1.execute(updateSQL);
                    JOptionPane.showMessageDialog(null, "Update Berhasil");

                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Silakan Klik Jadwal kembali");
                    
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, " ini nih Pertama\n  " + ex);
                    }
                
            } else if(Jenis.equals("") && !lblNamaFile.getText().equals("")){
                System.out.println("ALL BERHASIL NO");
                String query = "insert into jadwal_praktikum values(?,?)";
                PreparedStatement pst = koneksi.getConnection().prepareStatement(query);
                pst.setString(1, lblHAsil.getText());
                pst.setString(2, lblNamaFile.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Tersimpan");

                this.dispose();
                JOptionPane.showMessageDialog(null, "Silakan Klik Jadwal kembali");
            }else if(lblNamaFile.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Pilih file terlebih dahulu");
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"waduh \n"+ e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(JadwalKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JadwalKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JadwalKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JadwalKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JadwalKelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblHAsil;
    private javax.swing.JLabel lblNamaFile;
    // End of variables declaration//GEN-END:variables
byte[] file = null;
String fileName = null;


void openpdf(String file){
    try{
        SwingController  control = new SwingController();
        SwingViewBuilder factory = new SwingViewBuilder(control);
        JPanel viewerCompntpn1 = factory.buildViewerPanel();
        ComponentKeyBinding.install(control, viewerCompntpn1);
        control.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                control.getDocumentViewController()));
                control.openDocument(file);
                
        jScrollPane.setViewportView(viewerCompntpn1);
        
    }catch(Exception e){
        
    }
}

private void reloadForm(){
     this.dispose();
            JadwalKelas all = new JadwalKelas();
            all.setVisible(true);
}
}