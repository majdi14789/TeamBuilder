/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gui;


import Entité.Adherent;

import com.tn.doa.ReservationDAO;
import com.tn.tableModel.ReservationTableModel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author majdi
 */
public class NouveauMonProfil extends javax.swing.JPanel {

    /**
     * Creates new form NouveauMonProfil
     */
    public NouveauMonProfil() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        monNom = new javax.swing.JLabel();
        monPrenom = new javax.swing.JLabel();
        monMail = new javax.swing.JLabel();
        monTelephone = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nomConducteurLabel = new javax.swing.JLabel();
        prenomConducteurLabel = new javax.swing.JLabel();
        emailConducteurLabel = new javax.swing.JLabel();
        numConducteurLabel = new javax.swing.JLabel();
        conteneurtableaureservation = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMesReservation = new javax.swing.JTable();
        panelmape = new javax.swing.JPanel();
        labemmapmonprofil = new javax.swing.JLabel();
        AnnulerButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(100, 100));
        setLayout(new java.awt.CardLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(669, 389));
        jPanel2.setMinimumSize(new java.awt.Dimension(669, 389));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setMaximumSize(new java.awt.Dimension(199, 209));
        jPanel4.setMinimumSize(new java.awt.Dimension(199, 209));
        jPanel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel4ComponentShown(evt);
            }
        });

        jLabel5.setText("Nom :");

        jLabel6.setText("Prenom:");

        jLabel7.setText("Adresse Mail:");

        jLabel8.setText("Telephone :");

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        monNom.setText("jLabel1");

        monPrenom.setText("jLabel1");

        monMail.setText("jLabel1");

        monTelephone.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monNom)
                    .addComponent(monPrenom)
                    .addComponent(monMail)
                    .addComponent(monTelephone))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(monPrenom))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(monMail))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(monTelephone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("information du conducteur"));
        jPanel1.setMaximumSize(new java.awt.Dimension(141, 170));
        jPanel1.setMinimumSize(new java.awt.Dimension(141, 170));

        jLabel9.setText("Nom Conducteur :");

        jLabel10.setText("E-Mail Conducteur:");

        jLabel11.setText("Prenom Conducteur :");

        jLabel12.setText("Num Telephone :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomConducteurLabel)
                            .addComponent(prenomConducteurLabel)
                            .addComponent(emailConducteurLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numConducteurLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nomConducteurLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(prenomConducteurLabel))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailConducteurLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(numConducteurLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        conteneurtableaureservation.setMaximumSize(new java.awt.Dimension(355, 187));
        conteneurtableaureservation.setMinimumSize(new java.awt.Dimension(355, 187));

        tableMesReservation.setModel(new ReservationTableModel(Authentification.id_adherent));
        tableMesReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMesReservationMousePressed(evt);
            }
        });
        tableMesReservation.getColumnModel().getColumn(0).setMinWidth(0);
        tableMesReservation.getColumnModel().getColumn(0).setMaxWidth(0);
        tableMesReservation.getColumnModel().getColumn(0).setWidth(0);

        tableMesReservation.getColumnModel().getColumn(2).setMinWidth(0);
        tableMesReservation.getColumnModel().getColumn(2).setMaxWidth(0);
        tableMesReservation.getColumnModel().getColumn(2).setWidth(0);
        jScrollPane1.setViewportView(tableMesReservation);

        javax.swing.GroupLayout conteneurtableaureservationLayout = new javax.swing.GroupLayout(conteneurtableaureservation);
        conteneurtableaureservation.setLayout(conteneurtableaureservationLayout);
        conteneurtableaureservationLayout.setHorizontalGroup(
            conteneurtableaureservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteneurtableaureservationLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        conteneurtableaureservationLayout.setVerticalGroup(
            conteneurtableaureservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conteneurtableaureservationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelmape.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelmape.setMaximumSize(new java.awt.Dimension(397, 191));
        panelmape.setMinimumSize(new java.awt.Dimension(397, 191));

        labemmapmonprofil.setText("<html><head></head><body><img src='http://maps.googleapis.com/maps/api/staticmap?&amp;size=500x500&amp;maptype=roadmap\\&markers=size:mid&th=color:0xff0000ff|weight:5|Tunis|Grombalia|Nabeul&amp;sensor=true'></body></html>");

        javax.swing.GroupLayout panelmapeLayout = new javax.swing.GroupLayout(panelmape);
        panelmape.setLayout(panelmapeLayout);
        panelmapeLayout.setHorizontalGroup(
            panelmapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labemmapmonprofil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelmapeLayout.setVerticalGroup(
            panelmapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labemmapmonprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AnnulerButton.setText("Annuler");
        AnnulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AnnulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelmape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conteneurtableaureservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(conteneurtableaureservation, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelmape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AnnulerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ModifierMonProfil md;
        try {
            md = new ModifierMonProfil();
            md.setVisible(true);
            md.setLocationRelativeTo(null);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Gui.NouveauMonProfil.class.getName()).log(Level.SEVERE, null, ex);
        }catch (OutOfMemoryError e){
            System.out.println("out of memory");
        } catch (ParseException ex) {
            Logger.getLogger(Gui.NouveauMonProfil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel4ComponentShown

    }//GEN-LAST:event_jPanel4ComponentShown

    private void tableMesReservationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMesReservationMousePressed
        Adherent ad=new Adherent();
        ReservationDAO resDAO=new ReservationDAO();
        int x=tableMesReservation.getSelectedRow();
        int id=Integer.parseInt(tableMesReservation.getValueAt(x, 2).toString());
        System.out.println("vous aver selectioner "+x+"  id="+id);
        ad=resDAO.findAdherentByTrajet(id);
        nomConducteurLabel.setText(ad.getNom());
        prenomConducteurLabel.setText(ad.getPrenom());
        emailConducteurLabel.setText(ad.getAdresseMail());
        numConducteurLabel.setText(ad.getTelephone().toString());
    }//GEN-LAST:event_tableMesReservationMousePressed

    private void AnnulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerButtonActionPerformed
          
        int x =tableMesReservation.getSelectedRow();
        int id=(Integer)tableMesReservation.getValueAt(x, 2);
        ReservationDAO resDAO=new ReservationDAO();
        resDAO.DeleteById(id);
        tableMesReservation.setModel(new com.tn.tableModel.ReservationTableModel(Authentification.id_adherent));
        System.out.println(tableMesReservation.getSelectedRow());
        System.out.println("du table mes reservation "+Authentification.id_adherent);
    }//GEN-LAST:event_AnnulerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnnulerButton;
    private javax.swing.JPanel conteneurtableaureservation;
    private javax.swing.JLabel emailConducteurLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labemmapmonprofil;
    public static javax.swing.JLabel monMail;
    public static javax.swing.JLabel monNom;
    public static javax.swing.JLabel monPrenom;
    public static javax.swing.JLabel monTelephone;
    private javax.swing.JLabel nomConducteurLabel;
    private javax.swing.JLabel numConducteurLabel;
    private javax.swing.JPanel panelmape;
    private javax.swing.JLabel prenomConducteurLabel;
    public static javax.swing.JTable tableMesReservation;
    // End of variables declaration//GEN-END:variables
}
