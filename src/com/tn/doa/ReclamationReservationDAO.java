/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tn.doa;

import Entité.ReclamationReservation;
import com.tn.connect.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Invite
 */
public class ReclamationReservationDAO {
    

public void  insertSelectReclamationReservation(int id_trajet,int id_passager)
{
 int id_conducteur,nbrReclamation;
 String jours,requete="select t.id_conducteur as Conducteur, t.jours as jours from trajet t where t.id_trajet="+id_trajet;
try {
              
            Statement statement = MyConnection.getInstance().createStatement();
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            
       while(resultat.next())
          { 
                         id_conducteur=resultat.getInt("Conducteur");
			 jours=resultat.getString("jours");
                         insertReclamationReservation(id_conducteur,id_passager,id_trajet,jours);
		        
                         
          }
		 
 
 
        ReclamationReservation reclamationReservation=new ReclamationReservation();
        AdherentDAO adherentDAO=new AdherentDAO();
        TrajetDAO trajetDAO=new TrajetDAO();
    /*try {
              
            Statement statement = MyConnection.getInstance().createStatement();
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            
            
//             Reclamation reclamation =new Reclamation();
//                reclamation.setIdReclamation(resultat.getInt(1));
//                reclamation.setAdherentConcerné(adherentDAO.findAdherentByIdSa(resultat.getInt(2)));
//                reclamation.setAdherentReclamateur(adherentDAO.findAdherentByIdSa(resultat.getInt(3)));
            
       while(resultat.next())
          { 
              reclamationReservation.setConducteur(adherentDAO.findAdherentByIdSa(resultat.getInt(1)));
              reclamationReservation.setPassager(adherentDAO.findAdherentByIdSa(id_passager));
              reclamationReservation.setTrajet(trajetDAO.findTrajetById(id_trajet));
              reclamationReservation.setJours(resultat.getString(2));
              insertReclamationReservation(reclamationReservation);
	  }*/
} catch (SQLException ex) {
            
            System.out.println("erreur lors de la recherche " + ex.getMessage());
        }
 }
 
 
 public void insertReclamationReservation(int id_conducteur,int id_passager,int id_trajet,String jours)
 {
 
 String requete = "INSERT INTO reclamationreservation (id_reclamateur,id_adherentConcerné,id_trajet,jours,nbrreclamation) VALUES (?,?,?,?,0)";
 try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,id_conducteur);
            ps.setInt(2,id_passager);
            ps.setInt(3,id_trajet);
            ps.setString(4,jours);
           ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
 /* try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,reclamationReservation.getConducteur().getIdAdherent());
            ps.setInt(2,reclamationReservation.getPassager().getIdAdherent());
           ps.setInt(3,reclamationReservation.getTrajet().getIdTrajet());
            ps.setString(4,reclamationReservation.getJours());
           ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        */
 try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,id_passager);
            ps.setInt(2,id_conducteur);
            ps.setInt(3, id_trajet);
            ps.setString(4,jours);
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
 }
 
 public void updateReclamationReservation(int idReclamateur,int AdherentConcerné)
 {
 
  String requete="update reclamationReservation set nbrreclamation=1 where id_reclamateur="+idReclamateur+" and id_adherentConcerné="+AdherentConcerné+";";
	 try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
          
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        } 
 }
 
 
 public int getNombreReclamation(int id_reclamateur,int id_adherentConcerné,String jours)
 {
     int nbrReclamation=2;
	 String requete="select nbrReclamation as NbrReclamation from reclamationreservation where id_reclamateur="+id_reclamateur+" and id_adherentConcerné="+id_adherentConcerné+" and jours='"+jours+"';";
	     try {
                
            Statement statement = MyConnection.getInstance().createStatement();
            //ResultSet resultat = statement.executeQuery(requete);
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
         
            ResultSet resultat = ps.executeQuery();
               
	    while(resultat.next())
            { 
                System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"+nbrReclamation);
                nbrReclamation=resultat.getInt("NbrReclamation");
                                System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"+nbrReclamation);
             }
		 return nbrReclamation;
 } catch (SQLException ex) {
            
            System.out.println("erreur lors de la recherche " + ex.getMessage());
        }
	return nbrReclamation;		
 }
 
}
    
