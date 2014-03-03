/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.doa;
import Entité.Adherent;
import Gui.Authentification;
import com.tn.connect.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AdherentDAO {
    
    
    
    public int connexion(String login,String mdp)
    {
        String requete="select * from adherent a where a.adresse_mail=? and a.mdp=?";
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
        String requete="select id_adherent from adherent a where a.adresse_mail=? and a.mdp=?";
      
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

     public Adherent findAdherentById(int id) {
        Adherent adherent = new Adherent();
        String requete = "select * from adherent where id_adherent=?";
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
 
     
     
     public void deleteAdherent(int id)
        {
              Adherent adherent=new Adherent();
              String requete = "delete from adherent where id_adherent= ?";
      
         try 
        {
       
        Statement statement = MyConnection.getInstance().createStatement();
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1,id);
        ps.execute();
       // JOptionPane.showMessageDialog(null, "Adhérent supprimé");
      
       
        } catch(Exception e ) {
        
        //JOptionPane.showMessageDialog(null, e);
        }
        
       
} 
     public void update_adherent(Adherent ad){
               
        String req="UPDATE `adherent` SET `nom`=?,`prenom`=?,`adresse_mail`=?,`mdp`=?,`telephone`=?,`nombre_reclamation`=? WHERE `id_adherent`=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setString(1, ad.getNom());
            ps.setString(2, ad.getPrenom());
            ps.setString(3, ad.getAdresseMail());
            ps.setString(4, ad.getMdp());
            ps.setInt(5, ad.getTelephone());
            ps.setInt(6, ad.getNombreReclamation());
            ps.setInt(7, ad.getIdAdherent());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
  public void updateAdherent(int id,String nom,String prenom,String adresseMail,String mdp,int tel,int nbrReclamation)
      {
          try 
        {
          // String value1 =idadherenttxt.getText();
          
           String requete="update adherent set nom='"+nom+"',prenom='"+prenom+"',adresse_mail='"+adresseMail+"',"
                   + "mdp='"+mdp+"',telephone='"+tel+"',nombre_reclamation='"+nbrReclamation+"' where id_adherent='"+id+"' ";
           
          Statement statement = MyConnection.getInstance().createStatement();
          PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
          ps.execute();
          JOptionPane.showMessageDialog(null, "table updated");
          
        
        
        }
        
        catch(Exception e)
        {
        
        
          JOptionPane.showMessageDialog(null, e);
        
        }
      }   
  public List<Adherent> DisplayAllAdhrernt (){
        List<Adherent> listreclamation = new ArrayList<Adherent>();
        
        String requete = "select * from Adherent";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
         
            while(resultat.next()){
                Adherent adherent =new Adherent();
                adherent.setIdAdherent(resultat.getInt(1));
               
                adherent.setNom(resultat.getString(2));
                
                adherent.setPrenom(resultat.getString(3));
               
                adherent.setAdresseMail(resultat.getString(4));
                adherent.setMdp(resultat.getString(5));
               
               adherent.setTelephone(resultat.getInt(6));
                adherent.setNombreReclamation(resultat.getInt(7));

                listreclamation.add(adherent);
            }
            return listreclamation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des reclamations "+ex.getMessage());
            return null;
        }}
      
}

