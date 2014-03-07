/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tn.doa;
import com.tn.connect.MyConnection;
import Entité.ReclamationAdherent;
import com.tn.doa.AdherentDAO;
import Entité.Adherent;
import Entité.Reclamation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Salma
 */
public class reclamationAdherentDAO {
    public void insert(ReclamationAdherent reclamationadherent,Adherent adherentConcerné)
    {
         String requete = "INSERT INTO ReclamationAdherent (id_adherentConcerné,cause,description) VALUES (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,adherentConcerné.getIdAdherent());
            ps.setString(2,reclamationadherent.getCause());
            ps.setString(3,reclamationadherent.getDescription());
           ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
    
    public List<ReclamationAdherent> findReclamationAdherentById(int id){
    
        AdherentDAO adherentDAO=new AdherentDAO();
        ReclamationAdherent reclamationadherent=new ReclamationAdherent();
        Reclamation reclamation=new Reclamation();
        ReclamationDAO reclamationDAO=new ReclamationDAO();
        Adherent adherent = new Adherent();
         List<ReclamationAdherent> reclamationadherents = new ArrayList<ReclamationAdherent>();
        String requete = "select * from reclamationAdherent where id_adherent=?";
        try {
            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                reclamationadherent.setIdreclamationAdherent(resultat.getInt(1));
                 reclamationadherent.setAdherent(adherentDAO.findAdherentByIdSa(resultat.getInt(2)));
                 reclamationadherent.setCause(resultat.getString(3));
                 reclamationadherent.setDescription(resultat.getString(4));
              
            }
            return reclamationadherents;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche  " + ex.getMessage());
            return null;
        }


    }
    
    public int findNbrFauxProfil(int id)
    {
       int nbrFauxProfil=0;
       String requete="SELECT SUM(IF(cause='Faux profil',1,0)) AS nbrFauxProfil  from reclamationadherent ra where ra.id_adherentConcerné="+id+";";
        try {
            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                nbrFauxProfil=resultat.getInt("nbrFauxProfil");
            }
            return nbrFauxProfil;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche  " + ex.getMessage());
            return 0;
        }
   }
     
}