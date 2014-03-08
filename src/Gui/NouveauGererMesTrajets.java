/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gui;
import java.awt.TextField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import Tools.*;
import java.util.ArrayList;
import com.tn.doa.*;
import Entité.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import com.tn.tableModel.*;
/**
 *
 * @author majdi
 */
public class NouveauGererMesTrajets extends javax.swing.JPanel {
ReservationDAO reservationDAO = new ReservationDAO();
    TrajetDAO trajetDAO = new TrajetDAO();
    Gmail gmail = new Gmail();
    private final String e_mail_changement_trajet= "Cher Passager , ici le test du changement du trajet que vous avez reserve";
     
     private final String e_mail_annulation_trajet= "Cher Passager , ici le test de la suppression du trajet que vous avez reserve";

    public  ArrayList<String> list_Emails_passagers = new ArrayList<String>();

    
    /**
     * Creates new form NouveauGererMesTrajets
     */
    public NouveauGererMesTrajets() {
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

        jPanel1 = new javax.swing.JPanel();
        panelTabGererMesTrajet = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mes_trajets_table = new javax.swing.JTable();
        modifier_trajet_panel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        modifier_supprimer_trajet = new javax.swing.JPanel();
        supprimer_trajet = new javax.swing.JButton();
        options_modif_panel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        mois_modif = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Heure_combo = new javax.swing.JComboBox();
        Minutes_combo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        modifier_trajet = new javax.swing.JButton();
        jour_modif = new javax.swing.JComboBox();
        panelMapGererMesTrajet = new javax.swing.JPanel();
        label_map = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jScrollPane2.setAutoscrolls(true);

        mes_trajets_table.setModel(new TrajetModel(Authentification.id_adherent)
        );
        mes_trajets_table.getColumnModel().getColumn(1).setMinWidth(0);
        mes_trajets_table.getColumnModel().getColumn(1).setMaxWidth(0);
        mes_trajets_table.getColumnModel().getColumn(1).setWidth(0);
        mes_trajets_table.getColumnModel().getColumn(0).setMinWidth(0);
        mes_trajets_table.getColumnModel().getColumn(0).setMaxWidth(0);
        mes_trajets_table.getColumnModel().getColumn(0).setWidth(0);
        mes_trajets_table.getColumnModel().getColumn(14).setMinWidth(0);
        mes_trajets_table.getColumnModel().getColumn(14).setMaxWidth(0);
        mes_trajets_table.getColumnModel().getColumn(14).setWidth(0);
        mes_trajets_table.getColumnModel().getColumn(8).setMinWidth(0);
        mes_trajets_table.getColumnModel().getColumn(8).setMaxWidth(0);
        mes_trajets_table.getColumnModel().getColumn(8).setWidth(0);
        mes_trajets_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mes_trajets_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mes_trajets_table);

        javax.swing.GroupLayout panelTabGererMesTrajetLayout = new javax.swing.GroupLayout(panelTabGererMesTrajet);
        panelTabGererMesTrajet.setLayout(panelTabGererMesTrajetLayout);
        panelTabGererMesTrajetLayout.setHorizontalGroup(
            panelTabGererMesTrajetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabGererMesTrajetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panelTabGererMesTrajetLayout.setVerticalGroup(
            panelTabGererMesTrajetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabGererMesTrajetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        modifier_trajet_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modifier mon Trajet ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel19.setText("Selectionnez un de vos trajet(s) et modifiez le ou supprimez le si vous voulez ! Ne vous inquietez pas l'equipe de  ");

        jLabel20.setText("Covoiturage - Tunisie se chargera de notifier les passagers qui ont deja reserve sur votre trajet ! ");

        modifier_supprimer_trajet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Supprimer Le trajet Selectionne", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        supprimer_trajet.setText("Supprimer");
        supprimer_trajet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_trajetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifier_supprimer_trajetLayout = new javax.swing.GroupLayout(modifier_supprimer_trajet);
        modifier_supprimer_trajet.setLayout(modifier_supprimer_trajetLayout);
        modifier_supprimer_trajetLayout.setHorizontalGroup(
            modifier_supprimer_trajetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifier_supprimer_trajetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supprimer_trajet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        modifier_supprimer_trajetLayout.setVerticalGroup(
            modifier_supprimer_trajetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifier_supprimer_trajetLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(supprimer_trajet)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        options_modif_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vos Options de Modification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel21.setText("Modifier date et  l'heure du Depart : ");

        jLabel22.setText("Date : ");

        mois_modif.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel23.setText("Jour");

        jLabel24.setText("Mois");

        Heure_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        Minutes_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59" }));

        jLabel1.setText("H");

        jLabel2.setText("Heure:");

        modifier_trajet.setText("Modifier");
        modifier_trajet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_trajetActionPerformed(evt);
            }
        });

        jour_modif.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout options_modif_panelLayout = new javax.swing.GroupLayout(options_modif_panel);
        options_modif_panel.setLayout(options_modif_panelLayout);
        options_modif_panelLayout.setHorizontalGroup(
            options_modif_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(options_modif_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(options_modif_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(options_modif_panelLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(options_modif_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(options_modif_panelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, options_modif_panelLayout.createSequentialGroup()
                                .addComponent(jour_modif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(options_modif_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(options_modif_panelLayout.createSequentialGroup()
                                .addComponent(mois_modif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Heure_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Minutes_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modifier_trajet, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        options_modif_panelLayout.setVerticalGroup(
            options_modif_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(options_modif_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(4, 4, 4)
                .addGroup(options_modif_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(options_modif_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(mois_modif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Heure_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minutes_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(modifier_trajet)
                    .addComponent(jour_modif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout modifier_trajet_panelLayout = new javax.swing.GroupLayout(modifier_trajet_panel);
        modifier_trajet_panel.setLayout(modifier_trajet_panelLayout);
        modifier_trajet_panelLayout.setHorizontalGroup(
            modifier_trajet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifier_trajet_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(modifier_trajet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(modifier_trajet_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(modifier_trajet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(options_modif_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifier_supprimer_trajet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modifier_trajet_panelLayout.setVerticalGroup(
            modifier_trajet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifier_trajet_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(30, 30, 30)
                .addComponent(options_modif_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifier_supprimer_trajet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMapGererMesTrajet.setLayout(new java.awt.CardLayout());

        label_map.setText("<html><head></head><body><img src='http://maps.googleapis.com/maps/api/staticmap?&amp;size=500x500&amp;maptype=roadmap\\&markers=size:mid&th=color:0xff0000ff|weight:5|Tunis|Grombalia|Nabeul&amp;sensor=true'></body></html>");
        label_map.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ma Map du Trajet : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        label_map.setMaximumSize(new java.awt.Dimension(500, 500));
        label_map.setMinimumSize(new java.awt.Dimension(500, 500));
        label_map.setPreferredSize(new java.awt.Dimension(500, 500));
        panelMapGererMesTrajet.add(label_map, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabGererMesTrajet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(modifier_trajet_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelMapGererMesTrajet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabGererMesTrajet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifier_trajet_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(panelMapGererMesTrajet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1317, 1317, 1317))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void mes_trajets_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mes_trajets_tableMouseClicked

        int x = mes_trajets_table.getSelectedRow();
        String code_map = (String) mes_trajets_table.getValueAt( x,14);
        label_map.setText(code_map);

        // TODO add your handling code here:
    }//GEN-LAST:event_mes_trajets_tableMouseClicked

    private void supprimer_trajetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_trajetActionPerformed

        int id_trajet=0;

        id_trajet=(int) mes_trajets_table.getValueAt(mes_trajets_table.getSelectedRow(),0);
        list_Emails_passagers= (ArrayList<String>) reservationDAO.DisplayAllEmailsPassagers(id_trajet);

        for(int i =0 ; i<list_Emails_passagers.size(); i++) {

            gmail.subject = "Equipe Administration Covoiturage--Annulation de trajet " ;
            gmail.contenu=e_mail_annulation_trajet;
            gmail.adresse_destination=list_Emails_passagers.get(i);

//            gmail.sendMail();

        }

        trajetDAO.DeleteTrajetById(id_trajet);
mes_trajets_table.setModel(new TrajetModel(Authentification.id_adherent));

        // TODO add your handling code here:
    }//GEN-LAST:event_supprimer_trajetActionPerformed

    private void modifier_trajetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_trajetActionPerformed

        //Trajet trajet = new Trajet();

        // preparer mes modifications
        int id_trajet=0;
        String changeJour="";
        String changeHeure="";

        if(mes_trajets_table.getSelectedRowCount()==1){
            // remplire mes variables de Modification
            id_trajet=(int) mes_trajets_table.getValueAt(mes_trajets_table.getSelectedRow(),0);
            changeJour=jour_modif.getSelectedItem().toString()+"/"+mois_modif.getSelectedItem().toString()+"/2014";
            changeHeure=Heure_combo.getSelectedItem().toString()+"H"+Minutes_combo.getSelectedItem().toString();
            // Lancer la requete

            trajetDAO.update_Trajet(id_trajet, changeJour, changeHeure);

            //************* notification email******************

            list_Emails_passagers= (ArrayList<String>) reservationDAO.DisplayAllEmailsPassagers(id_trajet);

            for(int i =0 ; i<list_Emails_passagers.size(); i++) {

                gmail.subject = "Equipe Administration Covoiturage--Changement de trajet " ;
                gmail.contenu=e_mail_changement_trajet;
                gmail.adresse_destination=list_Emails_passagers.get(i);

                gmail.sendMail();

            }

        }
        else if((mes_trajets_table.getSelectedRow()==-1) || (mes_trajets_table.getSelectedRowCount()!=1)) {
            JOptionPane.showMessageDialog(this, "Selectionnez seulement Un seule Trajet");

        }

        // rafraichir la Table de la gestion des trajets

        NouveauGererMesTrajets.mes_trajets_table.setModel(new TrajetModel(Authentification.id_adherent));
        // cacher les champs
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(1).setMinWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(1).setMaxWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(1).setWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(0).setMinWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(0).setMaxWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(0).setWidth(0);

        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(14).setMinWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(14).setMaxWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(14).setWidth(0);

        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(8).setMinWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(8).setMaxWidth(0);
        NouveauGererMesTrajets.mes_trajets_table.getColumnModel().getColumn(8).setWidth(0);

        //************* notification email******************
        //    list_Emails_passagers= (ArrayList<String>) reservationDAO.DisplayAllEmailsPassagers(id_trajet);
        //
        //    for(int i =0 ; i<list_Emails_passagers.size(); i++) {
            //
            //    gmail.subject = "Equipe Administration Covoiturage--Changement de trajet " ;
            //    gmail.contenu=e_mail_changement_trajet;
            //    gmail.adresse_destination=list_Emails_passagers.get(i);
            //
            //   gmail.sendMail();
            //
            //   }

        // TODO add your handling code here:
    }//GEN-LAST:event_modifier_trajetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Heure_combo;
    private javax.swing.JComboBox Minutes_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jour_modif;
    private javax.swing.JLabel label_map;
    public static javax.swing.JTable mes_trajets_table;
    private javax.swing.JPanel modifier_supprimer_trajet;
    private javax.swing.JButton modifier_trajet;
    private javax.swing.JPanel modifier_trajet_panel;
    private javax.swing.JComboBox mois_modif;
    public static javax.swing.JPanel options_modif_panel;
    private javax.swing.JPanel panelMapGererMesTrajet;
    private javax.swing.JPanel panelTabGererMesTrajet;
    private javax.swing.JButton supprimer_trajet;
    // End of variables declaration//GEN-END:variables
}
