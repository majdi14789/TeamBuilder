/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.doa;

import Entité.Adherent;
import Gui.Authentification;
import Entité.Reservation;
import Entité.Trajet;
import com.tn.connect.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author majdi
 */
public class ReservationDAO {
  
    public void insertReservation(Reservation reser){
    String requete="insert into reservation (id_passager,id_trajet,places,date,heure,ville_depart,ville_arrivee,code_html) values (?,?,?,?,?,?,?,?)";
            try {
                
            //Statement statement = MyConnection.getInstance().createStatement();

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            //********************************************************
                System.out.println("Id "+reser.getIdReservation());
                
            //ps.setInt(1,reser.getIdReservation());
            ps.setInt(1,Authentification.id_adherent);
            ps.setInt(2,reser.getTrajet().getIdTrajet());
            ps.setInt(3,reser.getPlaces());
            ps.setString(5,reser.getHeure());
            ps.setString(4,reser.getDate());
            ps.setString(6,reser.getVilleDepart());
            ps.setString(7,reser.getVilleArrivee());
            ps.setString(8,reser.getCode_html());
            ps.executeUpdate();
            //***********************************************************
    }
        catch (SQLException ex) { 
            System.out.println("erruerrrr dans inseert reservation "+ex.getMessage());
        }
        }
    


 public List<Reservation> DisplayAllReservationByAdherent() throws SQLException{
       List<Reservation> listeReservation=new ArrayList<Reservation>();
        String requete="select * from reservation where id_passager=?";
         
        try{
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       TrajetDAO traDAO=new TrajetDAO();
       AdherentDAO adDAO=new AdherentDAO();
       ps.setInt(1, Authentification.id_adherent);
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
          
           
           Reservation reservation=new Reservation();
          
           reservation.setIdReservation(resultat.getInt(1));
           reservation.setAdhrent(adDAO.findAdherentById(resultat.getInt(2)));
           reservation.setTrajet(traDAO.DisplayAll_trajet_by_Id_trajet(resultat.getInt(3)));
           reservation.setPlaces(resultat.getInt(4));
           reservation.setDate(resultat.getString(5));
           reservation.setHeure(resultat.getString(6));
           reservation.setVilleDepart(resultat.getString(7));
           reservation.setVilleArrivee(resultat.getString(8));
           reservation.setCode_html(resultat.getString(9));
           listeReservation.add(reservation);
           
       
       }
            System.out.println(listeReservation);
        return listeReservation;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de reservation"+ex.getMessage());
            return null;
    }

 }

public void DeleteById(int id){
    
    String requete="delete from reservation where id_trajet=?";
    try {
        
     PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       
       ps.setInt(1, id);
       ps.execute();   
        
        
        
    } catch (Exception e) {
        System.out.println("erruer lors supprission"+e.getMessage());
    }
}
public List<Reservation> DisplayAllReservation() throws SQLException{
       List<Reservation> listeReservation=new ArrayList<Reservation>();
        String requete="select * from reservation";
         Trajet trajet=new Trajet();
         TrajetDAO traDAO=new TrajetDAO();
        try{
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       
      
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
          
           
           Reservation reservation=new Reservation();
          
           reservation.setIdReservation(resultat.getInt(1));
           reservation.setIdAdherent(resultat.getInt(2));
           reservation.setTrajet(traDAO.findTrajetById(resultat.getInt(3)));
           //reservation.setIdTrajet(resultat.getInt(3));
           reservation.setPlaces(resultat.getInt(4));
           reservation.setDate(resultat.getString(5));
           reservation.setHeure(resultat.getString(6));
           reservation.setVilleDepart(resultat.getString(7));
           reservation.setVilleArrivee(resultat.getString(8));
           reservation.setCode_html(resultat.getString(9));
           
           listeReservation.add(reservation);
           
       
       }
            System.out.println(listeReservation);
        return listeReservation;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de reservation"+ex.getMessage());
            return null;
    }

 }

 public Adherent findAdherentByTrajet(int id) {
        Adherent adherent = new Adherent();
        String requete = "select a.* from trajet t,adherent a where id_trajet=? and a.id_adherent=id_conducteur;";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                adherent.setIdAdherent(resultat.getInt(1));
                adherent.setNom(resultat.getString(2));
                adherent.setPrenom(resultat.getString(3));
                adherent.setAdresseMail(resultat.getString(4));
                adherent.setMdp(resultat.getString(5));
                adherent.setTelephone(resultat.getInt(6));
                adherent.setNombre_reclamation(resultat.getInt(6));

            
            }
            return adherent;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du recherche du adherent " + ex.getMessage());
            return null;
        }
    
    }
 
 // safouen *******
 public List<String> DisplayAllEmailsPassagers (int id_trajet){
 List<String> listeEmailPassagers = new ArrayList<String>();
        String requete = "SELECT adresse_mail FROM adherent,trajet,reservation where reservation.id_trajet = trajet.id_trajet and reservation.id_passager = adherent.id_adherent and trajet.id_trajet="+id_trajet+";";
        
        String email="";
        try {
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
          // ps.setInt(1, id_trajet);
           ResultSet resultat = ps.executeQuery(requete);
         
            
            while(resultat.next()){
              
              email=resultat.getString("adresse_mail");
                 listeEmailPassagers.add(email);
            }
            return listeEmailPassagers;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" "+ex.getMessage());
            return null;
        }
    }

 public Boolean DisplayAllReservationTrajet(int id_trajet) {
       List<Reservation> listeReservation=new ArrayList<Reservation>();
        String requete="select * from reservation where id_passager=? and id_trajet=?";
         
        try{
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       TrajetDAO traDAO=new TrajetDAO();
       AdherentDAO adDAO=new AdherentDAO();
       ps.setInt(1, Authentification.id_adherent);
       ps.setInt(2,id_trajet);
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
          
           
           Reservation reservation=new Reservation();
          
           reservation.setIdReservation(resultat.getInt(1));
           reservation.setAdhrent(adDAO.findAdherentById(resultat.getInt(2)));
           reservation.setTrajet(traDAO.DisplayAll_trajet_by_Id_trajet(resultat.getInt(3)));
           reservation.setPlaces(resultat.getInt(4));
           reservation.setDate(resultat.getString(5));
           reservation.setHeure(resultat.getString(6));
           reservation.setVilleDepart(resultat.getString(7));
           reservation.setVilleArrivee(resultat.getString(8));
           reservation.setCode_html(resultat.getString(9));
           listeReservation.add(reservation);
           
       
       }
            //System.out.println(listeReservation);
       if(listeReservation.size()!=0){
         return true;  
       }else {
           return false;
       }
               
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de reservation"+ex.getMessage());
            return false;
    }

 }



}
