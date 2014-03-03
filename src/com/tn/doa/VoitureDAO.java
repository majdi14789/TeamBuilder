package com.tn.doa;
import Entité.Voiture;
import com.tn.*;
import com.tn.connect.MyConnection;
//import com.tn.entities.Voiture;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class VoitureDAO {
//import Entité.*;
    
    
    
    
    
    
    //*************************************************************************************
    public void insertVoiture(Voiture v1){
        
        
        String req="insert into voiture values(?,?,?,?)";
        try {
            PreparedStatement ps= MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,v1.getIdVoiture());
            ps.setString(2,v1.getMarque());
            ps.setString(3, v1.getModel());
            ps.setString(4,v1.getCarburant());
            ps.executeUpdate();
            System.out.println("Ajout avec Succes");
            
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'insertion de la voiture"+e.getMessage()); }
        
        
    }

    
    
    
    
    //**********************************************************************
    public Voiture findVoitureById(int id) {
        Voiture voiture = new Voiture();
        String requete = "select * from voiture where id_voiture=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                voiture.setIdVoiture(resultat.getInt(1));
                voiture.setMarque(resultat.getString(2));
                voiture.setModel(resultat.getString(3));
                voiture.setCarburant(resultat.getString(4));
           
            
            }
            return voiture;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }
    
    }
    
    
    
}
