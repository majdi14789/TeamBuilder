
package Gui;

import Gui.Authentification;

import Entité.Reservation;
import static Gui.NouveauMonProfil.tableMesReservation;

import Tools.Gmail;
import com.tn.doa.AdherentDAO;
import com.tn.doa.ReservationDAO;
import com.tn.doa.TrajetDAO;
import com.tn.tableModel.ReservationTableModel;
import com.tn.tableModel.TrajetModel;
import com.tn.tableModel.TrajetTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author majdi
 */
public class NouveauRechercherTrajetPanel extends javax.swing.JPanel {

    public NouveauRechercherTrajetPanel() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rechercher_trajetPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rechVilleDepart = new javax.swing.JTextField();
        rechVilleArrive = new javax.swing.JTextField();
        rechDate = new javax.swing.JTextField();
        rechercherBTN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        BtnReserver = new javax.swing.JButton();
        trajetMap = new javax.swing.JPanel();
        trajetlabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTrajet = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(100, 100));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(100, 100));
        setLayout(new java.awt.CardLayout());

        rechercher_trajetPanel.setBackground(new java.awt.Color(239, 228, 228));
        rechercher_trajetPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        rechercher_trajetPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        rechercher_trajetPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        rechercher_trajetPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        rechercher_trajetPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Date :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Ville d'Arrivée");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Ville de Départ");

        rechVilleDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechVilleDepartActionPerformed(evt);
            }
        });
        rechVilleDepart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rechVilleDepartKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechVilleDepartKeyReleased(evt);
            }
        });

        rechVilleArrive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechVilleArriveKeyReleased(evt);
            }
        });

        rechercherBTN.setText("Rechercher");
        rechercherBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherBTNActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 228, 174));
        jPanel4.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(138, 138, 212));
        jLabel15.setText("Les Derniers Annonces Publiées");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rechVilleDepart)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rechVilleArrive, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(rechDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(rechercherBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rechercherBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(rechVilleDepart)
                    .addComponent(rechVilleArrive)
                    .addComponent(rechDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rechercher_trajetPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));
        jPanel3.setSize(rechercher_trajetPanel.getSize());

        BtnReserver.setText("Reserver ");
        BtnReserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReserverActionPerformed(evt);
            }
        });
        rechercher_trajetPanel.add(BtnReserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 395, 169, 32));

        trajetMap.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        trajetlabel.setText("<html><head></head><body><img src='http://maps.googleapis.com/maps/api/staticmap?&amp;size=500x500&amp;maptype=roadmap\\&markers=size:mid&th=color:0xff0000ff|weight:5|Tunis|Grombalia|Nabeul&amp;sensor=true'></body></html>");
        trajetlabel.setMaximumSize(new java.awt.Dimension(355, 201));
        trajetlabel.setMinimumSize(new java.awt.Dimension(355, 201));
        trajetlabel.setPreferredSize(new java.awt.Dimension(355, 201));

        javax.swing.GroupLayout trajetMapLayout = new javax.swing.GroupLayout(trajetMap);
        trajetMap.setLayout(trajetMapLayout);
        trajetMapLayout.setHorizontalGroup(
            trajetMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trajetMapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trajetlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(121, 121, 121))
        );
        trajetMapLayout.setVerticalGroup(
            trajetMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trajetlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rechercher_trajetPanel.add(trajetMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 161, -1, -1));

        try{
            tableTrajet.setModel(new TrajetTableModel());
            tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
            tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
            tableTrajet.getColumnModel().getColumn(0).setWidth(0);
        }catch(Exception ex ){System.out.print("erreurrr affichage tableauu");}
        jScrollPane2.setViewportView(tableTrajet);

        rechercher_trajetPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, 510, 216));

        add(rechercher_trajetPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void rechVilleDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechVilleDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechVilleDepartActionPerformed

    private void rechVilleDepartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechVilleDepartKeyPressed

    }//GEN-LAST:event_rechVilleDepartKeyPressed

    private void rechVilleDepartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechVilleDepartKeyReleased
        System.out.println("pip pip from key "+rechVilleDepart.getText());
        String villedepart=rechVilleDepart.getText();
        tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel(villedepart,3));
        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setWidth(0);
    }//GEN-LAST:event_rechVilleDepartKeyReleased

    private void rechVilleArriveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechVilleArriveKeyReleased
        System.out.println("pip pip from key "+rechVilleDepart.getText());
        String villedepart=rechVilleDepart.getText();
        String villearrivee=rechVilleArrive.getText();
        tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel(villedepart, villearrivee, 1));
        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setWidth(0);
    }//GEN-LAST:event_rechVilleArriveKeyReleased

    private void rechercherBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherBTNActionPerformed
        String villedepart=rechVilleDepart.getText().toString();
        String villearrive=rechVilleArrive.getText().toString();
        String date=rechDate.getText().toString();
        if((!villedepart.equals(""))&&(!villearrive.equals(""))&&(!date.equals("")))
        {
            try {

                tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel(villedepart,villearrive,date));
                tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
                tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
                tableTrajet.getColumnModel().getColumn(0).setWidth(0);
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }}else if((!villedepart.equals(""))&&(!villearrive.equals(""))&&(date.equals("")))
            {
                try {
                    tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel(villedepart,villearrive));
                    tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
                    tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
                    tableTrajet.getColumnModel().getColumn(0).setWidth(0);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else if((!villedepart.equals(""))&&(villearrive.equals(""))&&(date.equals("")))
            {
                try {
                    tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel(villedepart));
                } catch (SQLException ex) {
                    Logger.getLogger(NouveauRechercherTrajetPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
                tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
                tableTrajet.getColumnModel().getColumn(0).setWidth(0);
            }else{
                tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel());
                tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
                tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
                tableTrajet.getColumnModel().getColumn(0).setWidth(0);
            }

            //        for(int tr : com.tn.tableModel.TrajetTableModel.AllId){
                //            System.out.println(tr);
                //        }
            //
    }//GEN-LAST:event_rechercherBTNActionPerformed

    private void BtnReserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReserverActionPerformed
        Reservation reservation=new Reservation();
        ReservationDAO reservationDAO=new ReservationDAO();
        TrajetDAO traDAO=new TrajetDAO();
        AdherentDAO adDAO=new AdherentDAO();
        Gmail gmail = new Gmail();
        int x=tableTrajet.getSelectedRow();
        int nbr=Integer.parseInt(tableTrajet.getValueAt(x,3).toString());
        System.out.println(nbr+" nombre de place disponible");
        if(nbr>=1){
        reservation.setAdhrent(adDAO.findAdherentById(Authentification.id_adherent));
        reservation.setTrajet(traDAO.DisplayAll_trajet_by_Id_trajet(Integer.parseInt(tableTrajet.getValueAt(x, 0).toString())));
        reservation.setPlaces((Integer)tableTrajet.getValueAt(x, 6));
        reservation.setDate((String) tableTrajet.getValueAt(x, 7));
        reservation.setVilleDepart(tableTrajet.getValueAt(x, 4).toString());
        reservation.setVilleArrivee(tableTrajet.getValueAt(x, 5).toString());
        reservationDAO.insertReservation(reservation);
        System.out.println(tableTrajet.getSelectedRow());
        System.out.println(Authentification.id_adherent);
        traDAO.update_Places_Trajet(traDAO.DisplayAll_trajet_by_Id_trajet(Integer.parseInt(tableTrajet.getValueAt(x, 0).toString())),nbr-1);
        tableMesReservation.setModel(new ReservationTableModel(Authentification.id_adherent));
        tableTrajet.setModel(new TrajetTableModel());
        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setWidth(0);
        }else{
            JOptionPane.showMessageDialog(this,"Trajet non disponible  ");
        }
        
//        gmail.subject = "Equipe Administration Covoiturage--Prevention";
//        gmail.contenu="ba33333";
//        gmail.adresse_destination="majdi.saadani@esprit.tn";
//
//        gmail.sendMail();
    }//GEN-LAST:event_BtnReserverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReserver;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField rechDate;
    private javax.swing.JTextField rechVilleArrive;
    private javax.swing.JTextField rechVilleDepart;
    private javax.swing.JButton rechercherBTN;
    private javax.swing.JPanel rechercher_trajetPanel;
    private javax.swing.JTable tableTrajet;
    private javax.swing.JPanel trajetMap;
    private javax.swing.JLabel trajetlabel;
    // End of variables declaration//GEN-END:variables
}
