/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.doa;

import Entité.Adherent;
import Entité.Trajet;
import com.tn.connect.MyConnection;
import com.tn.entities.Conducteur;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Entité.*;
import Gui.Authentification;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 
 */
public class TrajetDAO {

  
    // Display de tous les trajets d'un seule adherent**************************************************
 public List<Trajet> DisplayAll_trajet_by_Id_Conducteur (int id){
 List<Trajet> mesTrajets = new ArrayList<Trajet>();
 String requete = "select * from trajet where id_conducteur=?";
        
        
        try {
        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
           
            while(resultat.next()){
             Trajet trajet =new Trajet();
                VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();   
                trajet.setIdTrajet(resultat.getInt(1));
                trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
                trajet.setJours(resultat.getString(3));
                trajet.setHeure(resultat.getString(4));
                trajet.setFrequence(resultat.getString(5));
                trajet.setTypeTrajet(resultat.getString(6));
                trajet.setPlaces(resultat.getInt(7));
                trajet.setBagages(resultat.getString(8));
                trajet.setCommentaire(resultat.getString(9));
                trajet.setKilometrage(resultat.getInt(10));
                trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
                trajet.setPrix(resultat.getInt(12));
                trajet.setVilleArrivee(resultat.getString(13));
                trajet.setVilleDepart(resultat.getString(14));
                trajet.setCode_map(resultat.getString(15));
               

                mesTrajets.add(trajet);
            }
            return mesTrajets;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }

    
  //********************************************************************************************************* 
    
    public void insererTrajet (Trajet t, Voiture v, int Id) throws SQLException {
     

        
        String requete="insert into trajet (id_conducteur,jours,heure,frequence,type_trajet,places,bagages,commentaire,kilometrage,id_voiture,prix,ville_arrivee,ville_depart,code_html)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                
            //Statement statement = MyConnection.getInstance().createStatement();

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            //********************************************************
                System.out.println("Id "+Id);
                
            ps.setInt(1,Id);
            ps.setString(2,t.getJours());
            ps.setString(3,t.getHeure());
            ps.setString(4,t.getFrequence());
            ps.setString(5,t.getTypeTrajet());
            ps.setInt(6,t.getPlaces());
            ps.setString(7,t.getBagages());
            ps.setString(8,t.getCommentaire());
            ps.setInt(9,t.getKilometrage());
            ps.setString(10,v.getIdVoiture());
            ps.setInt(11,t.getPrix());
            ps.setString(12,t.getVilleArrivee());
            ps.setString(13,t.getVilleDepart());
            ps.setString(14,t.getCode_map());

            ps.executeUpdate();
            //***********************************************************
    }
        catch (SQLException ex) {
    }
    
    
    }

  

//***************************************************************************************
 public List<Trajet> DisplayAllTrajets (){


        List<Trajet> listeTrajets = new ArrayList<Trajet>();

        String requete = "select * from trajet";
        
        
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
           
            while(resultat.next()){
             Trajet trajet =new Trajet();
                VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();   
                trajet.setIdTrajet(resultat.getInt(1));
                trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
                trajet.setJours(resultat.getString(3));
                trajet.setHeure(resultat.getString(4));
                trajet.setFrequence(resultat.getString(5));
                trajet.setTypeTrajet(resultat.getString(6));
                trajet.setPlaces(resultat.getInt(7));
                trajet.setBagages(resultat.getString(8));
                trajet.setCommentaire(resultat.getString(9));
                trajet.setKilometrage(resultat.getInt(10));
                trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
                trajet.setPrix(resultat.getInt(12));
                trajet.setVilleArrivee(resultat.getString(13));
                trajet.setVilleDepart(resultat.getString(14));

               

                listeTrajets.add(trajet);
            }
            return listeTrajets;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }

 
 
 
 ///*******************************************************************
 public List<String> DisplayAllEmails (String ville, String jours){
 List<String> listeEmailTrajet = new ArrayList<String>();

        String requete = "select adresse_mail from adherent,trajet where adherent.id_adherent = trajet.id_conducteur and trajet.ville_arrivee='"+ville+"' and trajet.jours ='"+jours+"'";
        String email="";

        try {
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
          
            
      ResultSet resultat = ps.executeQuery(requete);
         
            
            while(resultat.next()){
              
              email=resultat.getString("adresse_mail");
                 listeEmailTrajet.add(email);

            }

            return listeEmailTrajet;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" "+ex.getMessage());
            return null;
        }
    }

 
 
 
 // pour la notification par emails **********************************************************************
  public List<Trajet> DisplayAll_trajet_by_ville_et_jour (String ville, String jours){
 
        List<Trajet> listeTrajets = new ArrayList<Trajet>();

        String requete = "select * from trajet where trajet.ville_arrivee='"+ville+"' and trajet.jours ='"+jours+"'";
        
        
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
           
            while(resultat.next()){
             Trajet trajet =new Trajet();
                VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();   
                trajet.setIdTrajet(resultat.getInt(1));
                trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
                trajet.setJours(resultat.getString(3));
                trajet.setHeure(resultat.getString(4));
                trajet.setFrequence(resultat.getString(5));
                trajet.setTypeTrajet(resultat.getString(6));
                trajet.setPlaces(resultat.getInt(7));
                trajet.setBagages(resultat.getString(8));
                trajet.setCommentaire(resultat.getString(9));
                trajet.setKilometrage(resultat.getInt(10));
                trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
                trajet.setPrix(resultat.getInt(12));
                trajet.setVilleArrivee(resultat.getString(13));
                trajet.setVilleDepart(resultat.getString(14));

               

                listeTrajets.add(trajet);
            }
            return listeTrajets;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }

 public List<Trajet> DisplayAllTrajet(int id) throws SQLException{
       List<Trajet> listeTrajet=new ArrayList<Trajet>();
        String requete="select * from trajet where `id_conducteur` != "+id+" ";
        //SELECT * FROM  `trajet` WHERE  `id_conducteur` <>10
        VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();
        try{
       Statement statement=MyConnection.getInstance().createStatement();
       ResultSet resultat =statement.executeQuery(requete);
       
       while(resultat.next()){
         Trajet trajet=new Trajet();
           trajet.setIdTrajet(resultat.getInt(1));
           trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
           trajet.setJours(resultat.getString(3));
           trajet.setHeure(resultat.getString(4));
           trajet.setFrequence(resultat.getString(5));
           trajet.setTypeTrajet(resultat.getString(6));
           trajet.setPlaces(resultat.getInt(7));
           trajet.setBagages(resultat.getString(8));
           trajet.setCommentaire(resultat.getString(9));
           trajet.setKilometrage(resultat.getInt(10));
           trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
           trajet.setPrix(resultat.getInt(12));
           trajet.setVilleArrivee(resultat.getString(13));
           trajet.setVilleDepart(resultat.getString(14));
           trajet.setCode_map(resultat.getString(15));
           listeTrajet.add(trajet);
           
       
       }
        return listeTrajet;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de tout les trajet "+ex.getMessage());
            return null;
    }
    }
 public List<Trajet> DisplayAllTrajetByVilleDepart(String villedepart,int id) throws SQLException{
       List<Trajet> listeTrajet=new ArrayList<Trajet>();
        String requete="select * from trajet where ville_depart=? and `id_conducteur` != "+id+"";
         VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();
        try{
            
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       ps.setString(1,villedepart);
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
         Trajet trajet=new Trajet();
           trajet.setIdTrajet(resultat.getInt(1));
           trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
           trajet.setJours(resultat.getString(3));
           trajet.setHeure(resultat.getString(4));
           trajet.setFrequence(resultat.getString(5));
           trajet.setTypeTrajet(resultat.getString(6));
           trajet.setPlaces(resultat.getInt(7));
           trajet.setBagages(resultat.getString(8));
           trajet.setCommentaire(resultat.getString(9));
           trajet.setKilometrage(resultat.getInt(10));
           trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
           trajet.setPrix(resultat.getInt(12));
           trajet.setVilleArrivee(resultat.getString(13));
           trajet.setVilleDepart(resultat.getString(14));
           trajet.setCode_map(resultat.getString(15));
           listeTrajet.add(trajet);
           
       
       }
        return listeTrajet;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de trajet recherche par ville"+ex.getMessage());
            return null;
    }
    }

     public List<Trajet> DisplayAllTrajetByVilleDepartETVilleArrive(String villedepart,String villearrive,int id) throws SQLException{
       List<Trajet> listeTrajet=new ArrayList<Trajet>();
        String requete="select * from trajet where ville_depart=? and ville_arrivee=? and `id_conducteur` != "+id+"";
         VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();
        try{
            
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       ps.setString(1,villedepart);
       ps.setString(2,villearrive);
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
         Trajet trajet=new Trajet();
           trajet.setIdTrajet(resultat.getInt(1));
           trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
           trajet.setJours(resultat.getString(3));
           trajet.setHeure(resultat.getString(4));
           trajet.setFrequence(resultat.getString(5));
           trajet.setTypeTrajet(resultat.getString(6));
           trajet.setPlaces(resultat.getInt(7));
           trajet.setBagages(resultat.getString(8));
           trajet.setCommentaire(resultat.getString(9));
           trajet.setKilometrage(resultat.getInt(10));
           trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
           trajet.setPrix(resultat.getInt(12));
           trajet.setVilleArrivee(resultat.getString(13));
           trajet.setVilleDepart(resultat.getString(14));
           trajet.setCode_map(resultat.getString(15));
           listeTrajet.add(trajet);
           
       
       }
        return listeTrajet;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de trajet ville depart et arrive "+ex.getMessage());
            return null;
    }
    }
     
      public List<Trajet> DisplayAllTrajetByVilleDepartETVilleArriveETdate(String villedepart,String villearrive,String date,int id) throws SQLException{
       List<Trajet> listeTrajet=new ArrayList<Trajet>();
        String requete="select * from trajet where ville_depart=? and ville_arrivee=? and jours=? and `id_conducteur` != "+id+"";
         VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();
        try{
            
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       ps.setString(1,villedepart);
       ps.setString(2,villearrive);
       ps.setString(3, date);
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
         Trajet trajet=new Trajet();
           trajet.setIdTrajet(resultat.getInt(1));
           trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
           trajet.setJours(resultat.getString(3));
           trajet.setHeure(resultat.getString(4));
           trajet.setFrequence(resultat.getString(5));
           trajet.setTypeTrajet(resultat.getString(6));
           trajet.setPlaces(resultat.getInt(7));
           trajet.setBagages(resultat.getString(8));
           trajet.setCommentaire(resultat.getString(9));
           trajet.setKilometrage(resultat.getInt(10));
           trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
           trajet.setPrix(resultat.getInt(12));
           trajet.setVilleArrivee(resultat.getString(13));
           trajet.setVilleDepart(resultat.getString(14));
           trajet.setCode_map(resultat.getString(15));
           listeTrajet.add(trajet);
           
       
       }
        return listeTrajet;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de trajet depart et arrive et jours "+ex.getMessage());
            return null;
    }
    }
      
      
   public List<Trajet> DisplayAllTrajetByVilleDepartAjax(String villedepart,int id) throws SQLException{
       List<Trajet> listeTrajet=new ArrayList<Trajet>();
        String requete="select * from trajet where ville_depart LIKE '"+villedepart+"%' and `id_conducteur` != "+id+"";//`ville_depart` LIKE  'biz%'
         
        VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();
        try{
            
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       //ps.setString(1,villedepart);
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
         Trajet trajet=new Trajet();
           trajet.setIdTrajet(resultat.getInt(1));
           trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
           trajet.setJours(resultat.getString(3));
           trajet.setHeure(resultat.getString(4));
           trajet.setFrequence(resultat.getString(5));
           trajet.setTypeTrajet(resultat.getString(6));
           trajet.setPlaces(resultat.getInt(7));
           trajet.setBagages(resultat.getString(8));
           trajet.setCommentaire(resultat.getString(9));
           trajet.setKilometrage(resultat.getInt(10));
           trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
           trajet.setPrix(resultat.getInt(12));
           trajet.setVilleArrivee(resultat.getString(13));
           trajet.setVilleDepart(resultat.getString(14));
           trajet.setCode_map(resultat.getString(15));
           listeTrajet.add(trajet);
           
       
       }
        return listeTrajet;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de  trajet 3ajax "+ex.getMessage());
            return null;
    }
    }
   public List<Trajet> DisplayAllTrajetByVilleDepartETVilleArriveAjax(String villedepart,String villearrive,int id) throws SQLException{
       List<Trajet> listeTrajet=new ArrayList<Trajet>();
        //String requete="select * from trajet where ville_depart LIKE '"+villedepart+"%' and ville_arrivee LIKE '"+villearrive+"'";
         String req="SELECT * \n" +
"FROM trajet\n" +
"WHERE ville_depart LIKE  '"+villedepart+"%'\n" +
"AND ville_arrivee LIKE  '"+villearrive+"%' and `id_conducteur` != "+id+"";
        VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();
        try{
            
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(req);
//       ps.setString(1,villedepart);
//       ps.setString(2,villearrive);
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
         Trajet trajet=new Trajet();
           trajet.setIdTrajet(resultat.getInt(1));
           trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
           trajet.setJours(resultat.getString(3));
           trajet.setHeure(resultat.getString(4));
           trajet.setFrequence(resultat.getString(5));
           trajet.setTypeTrajet(resultat.getString(6));
           trajet.setPlaces(resultat.getInt(7));
           trajet.setBagages(resultat.getString(8));
           trajet.setCommentaire(resultat.getString(9));
           trajet.setKilometrage(resultat.getInt(10));
           trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
           trajet.setPrix(resultat.getInt(12));
           trajet.setVilleArrivee(resultat.getString(13));
           trajet.setVilleDepart(resultat.getString(14));
           trajet.setCode_map(resultat.getString(15));
           listeTrajet.add(trajet);
           
       
       }
        return listeTrajet;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de trajet ville depart et arrive AJAX"+ex.getMessage());
            return null;
    }
    }

   public  Trajet DisplayAll_trajet_by_Id_trajet(int id) {
   Trajet trajet = new Trajet();
 String requete = "select * from trajet where id_trajet=?";
        
        
        try {
        
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
           
            while(resultat.next()){
             
                VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();   
                trajet.setIdTrajet(resultat.getInt(1));
                trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
                trajet.setJours(resultat.getString(3));
                trajet.setHeure(resultat.getString(4));
                trajet.setFrequence(resultat.getString(5));
                trajet.setTypeTrajet(resultat.getString(6));
                trajet.setPlaces(resultat.getInt(7));
                trajet.setBagages(resultat.getString(8));
                trajet.setCommentaire(resultat.getString(9));
                trajet.setKilometrage(resultat.getInt(10));
                trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
                trajet.setPrix(resultat.getInt(12));
                trajet.setVilleArrivee(resultat.getString(13));
                trajet.setVilleDepart(resultat.getString(14));
                trajet.setCode_map(resultat.getString(15));
                

                
            }
            return trajet;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    
    }
   
   public void DeleteTrajetById(int id){
    
    String requete="delete from trajet where id_trajet=?";
    try {
        
     PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       
       ps.setInt(1, id);
       ps.execute();   
        
        
        
    } catch (Exception e) {
        System.out.println("erruer lors supprission"+e.getMessage());
    }
}


public Trajet findTrajetById(int id_trajet) {
      //  Trajet trajet = new Trajet();
       VoitureDAO voitureDAO = new VoitureDAO();
       AdherentDAO adherentDAO = new AdherentDAO();
       Trajet trajet = new  Trajet();

                String requete = "select * from trajet where id_trajet=?";
        
          try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_trajet);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
           trajet.setIdTrajet(resultat.getInt(1));
           trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
           trajet.setJours(resultat.getString(3));
           trajet.setHeure(resultat.getString(4));
           trajet.setFrequence(resultat.getString(5));
           trajet.setTypeTrajet(resultat.getString(6));
           trajet.setPlaces(resultat.getInt(7));
           trajet.setBagages(resultat.getString(8));
           trajet.setCommentaire(resultat.getString(9));
           trajet.setKilometrage(resultat.getInt(10));
           trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
           trajet.setPrix(resultat.getInt(12));
           trajet.setVilleArrivee(resultat.getString(13));
           trajet.setVilleDepart(resultat.getString(14));
           trajet.setCode_map(resultat.getString(15));
           
            }
            return trajet;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du recherche du trajet " + ex.getMessage());
            return null;
        }
    
    }
 
      
      // safouen : requete Update 
      
      
      
      
       public void update_Trajet(int id_trajet, String modif_Jour , String modif_Heur){
               
        String req="UPDATE trajet SET jours=? , heure=? where id_trajet=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setString(1,modif_Jour);
            ps.setString(2, modif_Heur);
            ps.setInt(3, id_trajet);
             ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
      
      
  public void update_Places_Trajet(Trajet tra, int place ){
               
        String req="UPDATE trajet SET places=? where id_trajet=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,place);
            ps.setInt(2,tra.getIdTrajet());
            
             ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
       
 public List<Trajet> DisplayAllTrajetByVilleDepartArriveDateAjax(String villedepart,String villearrive,String date,int id) throws SQLException{
       List<Trajet> listeTrajet=new ArrayList<Trajet>();
        //String requete="select * from trajet where ville_depart LIKE '"+villedepart+"%' and ville_arrivee LIKE '"+villearrive+"%' and jours = '"+date+"%' and `id_conducteur` != "+id+"";//`ville_depart` LIKE  'biz%'
        String requete="select * from trajet where jours = '"+date+"' and `id_conducteur` != '"+id+"' and ville_arrivee LIKE '"+villearrive+"%' and ville_depart LIKE '"+villedepart+"%'";
        //select * from trajet where jours = '01/01/2014' and `id_conducteur` != "10"
        VoitureDAO voitureDAO = new VoitureDAO();
                AdherentDAO adherentDAO = new AdherentDAO();
        try{
            
       PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
       //ps.setString(1,villedepart);
       ResultSet resultat =ps.executeQuery();
       
       while(resultat.next()){
         Trajet trajet=new Trajet();
           trajet.setIdTrajet(resultat.getInt(1));
           trajet.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
           trajet.setJours(resultat.getString(3));
           trajet.setHeure(resultat.getString(4));
           trajet.setFrequence(resultat.getString(5));
           trajet.setTypeTrajet(resultat.getString(6));
           trajet.setPlaces(resultat.getInt(7));
           trajet.setBagages(resultat.getString(8));
           trajet.setCommentaire(resultat.getString(9));
           trajet.setKilometrage(resultat.getInt(10));
           trajet.setVoiture(voitureDAO.findVoitureById(resultat.getString(11)));
           trajet.setPrix(resultat.getInt(12));
           trajet.setVilleArrivee(resultat.getString(13));
           trajet.setVilleDepart(resultat.getString(14));
           trajet.setCode_map(resultat.getString(15));
           listeTrajet.add(trajet);
           
       
       }
        return listeTrajet;
       
    }catch (SQLException ex){
            System.out.println("Erreurrrrr de chargement de  trajet date mnin el win 3ajax "+ex.getMessage());
            return null;
    }
    }
}

