/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.tableModel;


import Entité.Trajet;
import com.tn.doa.TrajetDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Saf
 */

//******************************************************************************************************
public class TrajetModel extends AbstractTableModel {

    List<Trajet> trajets = new ArrayList<Trajet>();
    String[] entete = {"id_trajet", "id_conducteur", "jours", "heure", "frequence","type_trajet","places", "bagages", "commentaire", "kilometrage", "id_voiture", "prix", "ville_arrivee"," ville_depart","map_html"};

    public TrajetModel() {
        trajets = new TrajetDAO().DisplayAllTrajets();
    }

    
    public TrajetModel(String ville, String jour) {
        trajets = new TrajetDAO().DisplayAll_trajet_by_ville_et_jour(ville, jour);
    }

    
    public TrajetModel(int id) {
        trajets = new TrajetDAO().DisplayAll_trajet_by_Id_Conducteur(id);
    }
   
    
    
    @Override
    public int getRowCount() {
        return trajets.size();
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return trajets.get(rowIndex).getIdTrajet();
            case 1:
                return trajets.get(rowIndex).getAdherent().getIdAdherent();
            case 2:
                return trajets.get(rowIndex).getJours();
            case 3:
                return trajets.get(rowIndex).getHeure();
       
            case 4:
                return trajets.get(rowIndex).getFrequence();
            case 5:
                return trajets.get(rowIndex).getTypeTrajet();
            case 6:
                return trajets.get(rowIndex).getPlaces();
            case 7:
                return trajets.get(rowIndex).getBagages();
            case 8:
                return trajets.get(rowIndex).getCommentaire();
            case 9:
                return trajets.get(rowIndex).getKilometrage();
            case 10:
                return trajets.get(rowIndex).getVoiture().getIdVoiture();
            case 11:
                return trajets.get(rowIndex).getPrix();
            case 12:
                return trajets.get(rowIndex).getVilleArrivee();
            case 13:
                return trajets.get(rowIndex).getVilleDepart();
            case 14 :
                    return trajets.get(rowIndex).getCode_map();
                
                default:
                 throw new IllegalArgumentException();
        }
        
    }

    @Override
    public String getColumnName(int column) {
        return entete[column];
    }
    
}
