/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.doa;

import Entité.Adherent;
import com.tn.connect.MyConnection;
import Entité.Evaluation;
import Gui.Authentification;
import java.sql.PreparedStatement;
//import entité.Reclamation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author majdi
 */
public class EvaluationDAO {
    
//     public List<Evaluation> DisplayAllEvaluation (){
//
//
//        List<Evaluation> listEvaluation = new ArrayList<Evaluation>();
//        
//        String requete = "select * from evaluation";
//        try {
//            AdministrateurDAO administrateurDAO=new AdministrateurDAO();
//           Statement statement = MyConnection.getInstance()
//                   .createStatement();
//            ResultSet resultat = statement.executeQuery(requete);
//            
//            AdherentDAO adherentDAO=new AdherentDAO();
//
//            
//            while(resultat.next()){
//                Evaluation evaluation =new Evaluation();
//                evaluation.setIdEvaluation(resultat.getInt(1));
//                Majdiiiii
//                evaluation.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
//                Majdiiiiii
//                evaluation.setAdherent(adherentDAO.findAdherentById(resultat.getInt(3)));
//                evaluation.setNote(resultat.getInt(4));
//                evaluation.setCommentaire(resultat.getString(5));
//                evaluation.setReponse(resultat.getString(6));
//
//                listEvaluation.add(evaluation);
//            }
//            return listEvaluation;
//        } catch (SQLException ex) {
//           Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors du chargement des reclamations "+ex.getMessage());
//            return null;
//        }
//     }
     
     public void InsertEvaluation(Evaluation ev,int id_evalue){
         try {
             String req="INSERT INTO `evaluation`(`id_adherentEvalué`, `id_evaluateur`, `note`, `commentaire`, `reponse`) VALUES (?,?,?,?,?)";
             
             PreparedStatement ps=MyConnection.getInstance().prepareStatement(req);
             ps.setInt(1, id_evalue);
             ps.setInt(2, Authentification.id_adherent);
             ps.setInt(3, ev.getNote());
             ps.setString(4, ev.getCommentaire());
             ps.setString(5, ev.getReponse());
            
                ps.executeUpdate();
         } catch (SQLException ex) {
             System.out.println("Probleme lors de l'insertion de l'evaluation "+ex.getMessage());
             Logger.getLogger(EvaluationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
                 }



  public List<Evaluation> DisplayAllEvaluation (){


        List<Evaluation> listEvaluation = new ArrayList<Evaluation>();
        
        String requete = "select * from evaluation";
        try {
            AdministrateurDAO administrateurDAO=new AdministrateurDAO();
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            AdherentDAO adherentDAO=new AdherentDAO();

            
            while(resultat.next()){
                Evaluation evaluation =new Evaluation();
                evaluation.setIdEvaluation(resultat.getInt(1));
               
                evaluation.setAdherentEvalué(adherentDAO.findAdherentById(resultat.getInt(2)));
                evaluation.setId_adherentEvalue(1);
                evaluation.setId_evaluateur(2);
                evaluation.setEvaluateur(adherentDAO.findAdherentById(resultat.getInt(3)));
                evaluation.setNote(resultat.getInt(4));
                evaluation.setCommentaire(resultat.getString(5));
                evaluation.setReponse(resultat.getString(6));

                listEvaluation.add(evaluation);
            }
            return listEvaluation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des reclamations "+ex.getMessage());
            return null;
        }
        
        
     }
     
        // méthode sinda pour calcul moyenne 
         public float getMoyenneByAdherent (int id){
             
             

        String requete = "select AVG(note) as moyenne from evaluation where id_adherentEvalué="+id;
       float moyenne=0;
       Evaluation evaluation=new Evaluation();
       try{
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next())
            {
               evaluation.setMoyenne(resultat.getFloat("moyenne"));
            }
            moyenne=evaluation.getMoyenne();
            System.out.println("moyenne "+moyenne);
           return moyenne;
       } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des reclamations "+ex.getMessage());
            return 0;
        }
       
       
       
         }    
     
}
