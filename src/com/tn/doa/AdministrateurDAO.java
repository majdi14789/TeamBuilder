/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.doa;

import Entité.Administrateur;
import com.tn.connect.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author majdi
 */
public class AdministrateurDAO {
     public int connexion(String login,String mdp)
    {
        String requete="select * from administrateur a where a.login=? and a.mdp=?";
        int compt=0;
            try {
                
            Statement statement = MyConnection.getInstance().createStatement();
            //ResultSet resultat = statement.executeQuery(requete);
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,login);
            ps.setString(2,mdp);
            ResultSet resultat = ps.executeQuery();
            
       while(resultat.next())
          { 
              compt++;
          }
         } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         return compt;
}

    public int getId(String login,String mdp)
    {
        int id=0;
        String requete="select id_administrateur from administrateur a where a.login=? and a.mdp=?";
      
            try {
            
            Statement statement = MyConnection.getInstance().createStatement();
             
            //ResultSet resultat = statement.executeQuery(requete);
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1,login);
            ps.setString(2,mdp);
            ResultSet resultat = ps.executeQuery();
             
           
                
            
       while(resultat.next())
          { 
              id=resultat.getInt(1);
              
          }
         } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id;
    }
     public Administrateur findAdministrateurtById(Integer id) {
        Administrateur admin = new Administrateur();
        String requete = "select * from  administrateur where id_administrateur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                admin.setIdAdministrateur(resultat.getInt(1));
                admin.setLogin(resultat.getString(2));
                admin.setMdp(resultat.getString(3));
                admin.setNom(resultat.getString(4));
                admin.setPrenom(resultat.getString(5));
               
            }
            return admin;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'administrateur" + ex.getMessage());
            return null;
        }
    
    }
     
      //salma
        public int connexionSa(String login,String mdp)
    {
        String requete="select * from administrateur a where a.login=? and a.mdp=?";
        int compt=0;
            try {
                
            Statement statement = MyConnection.getInstance().createStatement();
            //ResultSet resultat = statement.executeQuery(requete);
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,login);
            ps.setString(2,mdp);
            ResultSet resultat = ps.executeQuery();
            
       while(resultat.next())
          { 
              compt++;
          }
         } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         return compt;
}

    public int getIdSa(String login,String mdp)
    {
        int id=0;
        String requete="select id_administrateur from administrateur a where a.login=? and a.mdp=?";
      
            try {
            
            Statement statement = MyConnection.getInstance().createStatement();
             
            //ResultSet resultat = statement.executeQuery(requete);
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1,login);
            ps.setString(2,mdp);
            ResultSet resultat = ps.executeQuery();
             
           
                
            
       while(resultat.next())
          { 
              id=resultat.getInt(1);
              
          }
         } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id;
    }
    
    public Administrateur findAdministrateurByIdSa(int id) {
        Administrateur administrateur = new Administrateur();
        String requete = "select * from administrateur where id_administrateur=?";
        try {
            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                administrateur.setIdAdministrateur(resultat.getInt(1));
                administrateur.setLogin(resultat.getString(2));
                administrateur.setMdp(resultat.getString(3));
                administrateur.setNom(resultat.getString(4));
                administrateur.setPrenom(resultat.getString(5));
               
            }
            return administrateur;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }
    }
    
}
