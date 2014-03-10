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
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author majdi
 */
public class NouveauRechercherTrajetPanel extends javax.swing.JPanel {

    public NouveauRechercherTrajetPanel() throws UnsupportedLookAndFeelException, ParseException {
        javax.swing.UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
        initComponents();
        //System.out.println(jour_combo.getSelectedItem().toString()+"/"+ mois_combo.getSelectedItem().toString() +"/"+annee_combo.getSelectedItem().toString());
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
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        annee_combo = new javax.swing.JComboBox();
        mois_combo = new javax.swing.JComboBox();
        jour_combo = new javax.swing.JComboBox();
        BtnReserver = new javax.swing.JButton();
        trajetMap = new javax.swing.JPanel();
        trajetlabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTrajet = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setMaximumSize(new java.awt.Dimension(980, 557));
        setMinimumSize(new java.awt.Dimension(980, 557));
        setPreferredSize(new java.awt.Dimension(980, 557));
        setLayout(new java.awt.CardLayout());

        rechercher_trajetPanel.setBackground(new java.awt.Color(239, 228, 228));
        rechercher_trajetPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        rechercher_trajetPanel.setMaximumSize(new java.awt.Dimension(980, 557));
        rechercher_trajetPanel.setMinimumSize(new java.awt.Dimension(980, 557));
        rechercher_trajetPanel.setPreferredSize(new java.awt.Dimension(980, 557));
        rechercher_trajetPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap(600, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        annee_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014" }));

        mois_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        jour_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jour_combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jour_comboMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jour_comboMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jour_comboMouseReleased(evt);
            }
        });
        jour_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jour_comboItemStateChanged(evt);
            }
        });

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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jour_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mois_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(annee_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 712, Short.MAX_VALUE))
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
                    .addComponent(rechVilleDepart)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jour_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mois_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(annee_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rechVilleArrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rechercher_trajetPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));
        jPanel3.setSize(rechercher_trajetPanel.getSize());

        BtnReserver.setText("Reserver ");
        BtnReserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReserverActionPerformed(evt);
            }
        });
        rechercher_trajetPanel.add(BtnReserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 395, 169, 32));

        trajetMap.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        trajetMap.setLayout(new java.awt.CardLayout());

        trajetlabel.setText("<html><head></head><body><img src='http://maps.googleapis.com/maps/api/staticmap?&amp;size=500x500&amp;maptype=roadmap\\&markers=size:mid&th=color:0xff0000ff|weight:5|Tunis|Grombalia|Nabeul&amp;sensor=true'></body></html>");
        trajetlabel.setMaximumSize(new java.awt.Dimension(355, 201));
        trajetlabel.setMinimumSize(new java.awt.Dimension(355, 201));
        trajetlabel.setPreferredSize(new java.awt.Dimension(355, 201));
        trajetMap.add(trajetlabel, "card2");

        rechercher_trajetPanel.add(trajetMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 161, 460, 390));

        try{
            tableTrajet.setModel(new TrajetTableModel());
            tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
            tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
            tableTrajet.getColumnModel().getColumn(0).setWidth(0);

            tableTrajet.getColumnModel().getColumn(9).setMinWidth(0);
            tableTrajet.getColumnModel().getColumn(9).setMaxWidth(0);
            tableTrajet.getColumnModel().getColumn(9).setWidth(0);

            tableTrajet.getColumnModel().getColumn(10).setMinWidth(0);
            tableTrajet.getColumnModel().getColumn(10).setMaxWidth(0);
            tableTrajet.getColumnModel().getColumn(10).setWidth(0);

        }catch(Exception ex ){System.out.print("erreurrr affichage tableauu");}
        tableTrajet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTrajetMouseClicked(evt);
            }
        });
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
        System.out.println("pip pip from key " + rechVilleDepart.getText());
        String villedepart = rechVilleDepart.getText();
        tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel(villedepart, 3));
//        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
//        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
//        tableTrajet.getColumnModel().getColumn(0).setWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setWidth(0);

        tableTrajet.getColumnModel().getColumn(9).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(9).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(9).setWidth(0);

        tableTrajet.getColumnModel().getColumn(10).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(10).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(10).setWidth(0);
    }//GEN-LAST:event_rechVilleDepartKeyReleased

    private void rechVilleArriveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechVilleArriveKeyReleased
        System.out.println("pip pip from key " + rechVilleDepart.getText());
        String villedepart = rechVilleDepart.getText();
        String villearrivee = rechVilleArrive.getText();
        tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel(villedepart, villearrivee, 1));
//        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
//        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
//        tableTrajet.getColumnModel().getColumn(0).setWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setWidth(0);

        tableTrajet.getColumnModel().getColumn(9).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(9).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(9).setWidth(0);

        tableTrajet.getColumnModel().getColumn(10).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(10).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(10).setWidth(0);
    }//GEN-LAST:event_rechVilleArriveKeyReleased

    private void BtnReserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReserverActionPerformed
        Reservation reservation = new Reservation();
        ReservationDAO reservationDAO = new ReservationDAO();
        TrajetDAO traDAO = new TrajetDAO();
        AdherentDAO adDAO = new AdherentDAO();
        Gmail gmail = new Gmail();

//         int x=tableTrajet.getSelectedRow();
//        
//        System.out.println("l'id du trajet "+id_trajet);
        int x = tableTrajet.getSelectedRow();
        int id_trajet, nbr;

        if (tableTrajet.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "veuillez selectionner une ligne de la table reservation ");
        } else {
            {
                nbr = Integer.parseInt(tableTrajet.getValueAt(x, 3).toString());
                if (nbr != 0) {
                    id_trajet = Integer.parseInt(tableTrajet.getValueAt(x, 10).toString());
                    JOptionPane.showMessageDialog(this, " id_trajet=  " + id_trajet);
                    if (reservationDAO.DisplayAllReservationTrajet(id_trajet) == false) {
                        System.out.println(nbr + " nombre de place disponible");
                        System.out.println("l'index est " + x);
                        reservation.setAdhrent(adDAO.findAdherentById(Authentification.id_adherent));
                        reservation.setTrajet(traDAO.DisplayAll_trajet_by_Id_trajet(Integer.parseInt(tableTrajet.getValueAt(x, 0).toString())));
                        reservation.setPlaces((Integer) tableTrajet.getValueAt(x, 3) - 1);
                        reservation.setDate((String) tableTrajet.getValueAt(x, 7));
                        reservation.setVilleDepart(tableTrajet.getValueAt(x, 4).toString());
                        reservation.setVilleArrivee(tableTrajet.getValueAt(x, 5).toString());
                        reservation.setCode_html(tableTrajet.getValueAt(x, 9).toString());
                        reservation.setHeure(tableTrajet.getValueAt(x, 8).toString());
                        System.out.println(reservation.toString());
                        reservationDAO.insertReservation(reservation);

                        traDAO.update_Places_Trajet(traDAO.DisplayAll_trajet_by_Id_trajet(Integer.parseInt(tableTrajet.getValueAt(x, 0).toString())), nbr - 1);
                        Gui.NouveauMonProfil.tableMesReservation.setModel(new ReservationTableModel(Authentification.id_adherent));
                        tableTrajet.setModel(new TrajetTableModel());
                        tableMesReservation.getColumnModel().getColumn(0).setMinWidth(0);
                        tableMesReservation.getColumnModel().getColumn(0).setMaxWidth(0);
                        tableMesReservation.getColumnModel().getColumn(0).setWidth(0);

                        tableMesReservation.getColumnModel().getColumn(2).setMinWidth(0);
                        tableMesReservation.getColumnModel().getColumn(2).setMaxWidth(0);
                        tableMesReservation.getColumnModel().getColumn(2).setWidth(0);

                        tableMesReservation.getColumnModel().getColumn(8).setMinWidth(0);
                        tableMesReservation.getColumnModel().getColumn(8).setMaxWidth(0);
                        tableMesReservation.getColumnModel().getColumn(8).setWidth(0);
                        JOptionPane.showMessageDialog(this, "tu as reserver");
                    } else {
                        JOptionPane.showMessageDialog(this, " vous avez deja reserver mesieur ");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, " nombre de places =0 ");
                }

            }
        }

//        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
//        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
//        tableTrajet.getColumnModel().getColumn(0).setWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setWidth(0);

        tableTrajet.getColumnModel().getColumn(9).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(9).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(9).setWidth(0);

        tableTrajet.getColumnModel().getColumn(10).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(10).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(10).setWidth(0);

//        gmail.subject = "Equipe Administration Covoiturage--Prevention";
//        gmail.contenu="ba33333";
//        gmail.adresse_destination="majdi.saadani@esprit.tn";
//
//        gmail.sendMail();
    }//GEN-LAST:event_BtnReserverActionPerformed

    private void tableTrajetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTrajetMouseClicked

        trajetlabel.setText(tableTrajet.getValueAt(tableTrajet.getSelectedRow(), 9).toString());

// TODO add your handling code here:
    }//GEN-LAST:event_tableTrajetMouseClicked

    private void jour_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jour_comboItemStateChanged
        String date = jour_combo.getSelectedItem().toString() + "/" + mois_combo.getSelectedItem().toString() + "/" + annee_combo.getSelectedItem().toString();
        //System.out.println(date);
        String x = date.substring(0, 10);
        System.out.println("la chaine est:" + x);
        String villedepart = rechVilleDepart.getText().toString();
        String villearrive = rechVilleArrive.getText().toString();
        //if(rechVilleDepart.getText().isEmpty()&&(rechVilleArrive.getText().isEmpty())){
        tableTrajet.setModel(new com.tn.tableModel.TrajetTableModel(villedepart, villearrive, x, Authentification.id_adherent));
        tableTrajet.getColumnModel().getColumn(0).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(0).setWidth(0);

        tableTrajet.getColumnModel().getColumn(9).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(9).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(9).setWidth(0);

        tableTrajet.getColumnModel().getColumn(10).setMinWidth(0);
        tableTrajet.getColumnModel().getColumn(10).setMaxWidth(0);
        tableTrajet.getColumnModel().getColumn(10).setWidth(0);
//}


    }//GEN-LAST:event_jour_comboItemStateChanged

    private void jour_comboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jour_comboMouseClicked

    }//GEN-LAST:event_jour_comboMouseClicked

    private void jour_comboMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jour_comboMouseReleased

    }//GEN-LAST:event_jour_comboMouseReleased

    private void jour_comboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jour_comboMousePressed

    }//GEN-LAST:event_jour_comboMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReserver;
    private javax.swing.JComboBox annee_combo;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jour_combo;
    private javax.swing.JComboBox mois_combo;
    private javax.swing.JTextField rechVilleArrive;
    private javax.swing.JTextField rechVilleDepart;
    private javax.swing.JPanel rechercher_trajetPanel;
    public static javax.swing.JTable tableTrajet;
    private javax.swing.JPanel trajetMap;
    private javax.swing.JLabel trajetlabel;
    // End of variables declaration//GEN-END:variables
}
