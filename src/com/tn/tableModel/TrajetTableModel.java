

package com.tn.tableModel;
import Entité.*;
import Gui.Authentification;
import com.tn.doa.TrajetDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class TrajetTableModel extends AbstractTableModel{
    public static List<Integer> AllId;
    List<Trajet> monTrajet;
    String [] entete={"id","Nom","Prenom","N Place","ville de depart","ville d'arrive","Prix","date","Heure","code_html","idtrajet"};
  
    public TrajetTableModel() {
        try {
            monTrajet=new TrajetDAO().DisplayAllTrajet(Authentification.id_adherent);
        } catch (SQLException ex) {
            Logger.getLogger(TrajetTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public TrajetTableModel(String villedeart) throws SQLException{
        monTrajet=new TrajetDAO().DisplayAllTrajetByVilleDepart(villedeart,Authentification.id_adherent);
    }
    public TrajetTableModel(String villedeart,String villearrive) throws SQLException{
        monTrajet=new TrajetDAO().DisplayAllTrajetByVilleDepartETVilleArrive(villedeart,villearrive,Authentification.id_adherent);
    }
    public TrajetTableModel(String villedeart,String villearrive,String date) throws SQLException{
        monTrajet=new TrajetDAO().DisplayAllTrajetByVilleDepartETVilleArriveETdate(villedeart,villearrive,date,Authentification.id_adherent);
    }
    public TrajetTableModel(String villedeart,int n) {
        try {
            monTrajet=new TrajetDAO().DisplayAllTrajetByVilleDepartAjax(villedeart,Authentification.id_adherent);
        } catch (SQLException ex) {
            Logger.getLogger(TrajetTableModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Pobleme AJAX");
        }
    }
     public TrajetTableModel(String villedeart,String villearrivee,int n) {
        try {
            monTrajet=new TrajetDAO().DisplayAllTrajetByVilleDepartETVilleArriveAjax(villedeart, villearrivee,Authentification.id_adherent);
        } catch (SQLException ex) {
            Logger.getLogger(TrajetTableModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Pobleme AJAX");
        }
    }
    @Override
    public int getRowCount() {
        try {
           return monTrajet.size();
        } catch (Exception e) {
            return 1;
        }
   
    }
    

    @Override
    public int getColumnCount() {
     return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      //AllId=new ArrayList<Integer>();
      
        switch(columnIndex){
            case 0:{
               // AllId.add(monTrajet.get(rowIndex).getIdTrajet());
                return monTrajet.get(rowIndex).getIdTrajet();
            }
            case 1:{
                
                return monTrajet.get(rowIndex).getAdherent().getNom();
            }
            case 2:{
                return monTrajet.get(rowIndex).getAdherent().getPrenom();
            }
            case 3:{
                return monTrajet.get(rowIndex).getPlaces();
            }
            case 4:{
                return monTrajet.get(rowIndex).getVilleDepart();
            }
            case 5:{
                return monTrajet.get(rowIndex).getVilleArrivee();
            }
            case 6:{
                return monTrajet.get(rowIndex).getPrix();
            }
            case 7:{
                return monTrajet.get(rowIndex).getJours();
            }
            case 8:{
                return monTrajet.get(rowIndex).getHeure();
            }
            case 9:{
                return monTrajet.get(rowIndex).getCode_map();}
           case 10:{
                return monTrajet.get(rowIndex).getIdTrajet();}
             default:
                 throw new IllegalArgumentException();
        }
        
    }
 
    @Override
    public String getColumnName(int column) {
        
        
        return entete[column];
    }
    
  
}
