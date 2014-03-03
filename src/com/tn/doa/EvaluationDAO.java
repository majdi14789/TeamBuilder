/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.doa;

import com.tn.connect.MyConnection;
import Entité.Evaluation;
//import entité.Reclamation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author majdi
 */
public class EvaluationDAO {
    
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
               // Majdiiiii
                //evaluation.setAdherent(adherentDAO.findAdherentById(resultat.getInt(2)));
                //Majdiiiiii
                //evaluation.setAdherent(adherentDAO.findAdherentById(resultat.getInt(3)));
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
}
