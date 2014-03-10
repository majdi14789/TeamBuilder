/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.doa;
import Entité.Reclamation;
import Entité.Administrateur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.tn.connect.MyConnection;
import Entité.Adherent;
import java.sql.PreparedStatement;

/**
 *
 * @author majdi
 */
public class ReclamationDAO {
    
    AdherentDAO adherentDAO=new AdherentDAO();
    public List<Reclamation> DisplayAllReclamations (){


        
        List<Reclamation> listreclamation = new ArrayList<Reclamation>();
        
        String requete = "select r.* from reclamation r,adherent a where a.id_adherent=r.id_adherentConcerné and a.nombre_reclamation>=0";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            
            AdministrateurDAO administrateurDAO=new AdministrateurDAO();
            
            while(resultat.next()){
                System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
                
                Reclamation reclamation =new Reclamation();
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setAdherentConcerné(adherentDAO.findAdherentByIdSa(resultat.getInt(2)));
                reclamation.setAdherentReclamateur(adherentDAO.findAdherentByIdSa(resultat.getInt(3)));
                System.out.println(reclamation.getIdadherentConcerné());
                reclamation.setDescription(resultat.getString(4));
                reclamation.setAdministrateur(administrateurDAO.findAdministrateurByIdSa(resultat.getInt(5)));
                System.out.println(reclamation.getIdAdminisrateur());
                reclamation.setCause(resultat.getString(6));
                reclamation.setReport(resultat.getString(7));
                System.out.println(reclamation.getAdherentConcerné().getNom()+" test");
                System.out.println(reclamation.getAdherentConcerné().getNom()+" from reclamation dao ");
                System.out.println(reclamation.getAdherentReclamateur().getNom()+" from reclamation dao ");
                
                listreclamation.add(reclamation);
            }
            return listreclamation;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des reclamations "+ex.getMessage());
            return null;
        }
    }
    
    public List<Reclamation> DisplayAllReclamationsByReport (){


        List<Reclamation> listreclamation = new ArrayList<Reclamation>();
        
        String requete = "select r.* from reclamation r,adherent a where a.id_adherent=r.id_adherentConcerné and a.nombre_reclamation>=0";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            
            AdministrateurDAO administrateurDAO=new AdministrateurDAO();
            
            while(resultat.next()){
                Reclamation reclamation =new Reclamation();
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setAdherentConcerné(adherentDAO.findAdherentByIdSa(resultat.getInt(2)));
                System.out.println(reclamation.getAdherentConcerné().getNom()+" test");
                reclamation.getAdherentConcerné().getIdAdherent();
                
                reclamation.setAdherentReclamateur(adherentDAO.findAdherentByIdSa(resultat.getInt(3)));
                
                reclamation.setDescription(resultat.getString(4));
                reclamation.setAdministrateur(administrateurDAO.findAdministrateurByIdSa(resultat.getInt(5)));
                
                reclamation.setCause(resultat.getString(6));
                reclamation.setReport(resultat.getString(7));
                listreclamation.add(reclamation);
            }
            return listreclamation;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des reclamations "+ex.getMessage());
            return null;
        }
    }
    
    public void insert(Reclamation reclamation,Adherent adherentConcerné,Adherent adherentReclamateur)
    {
    String requete = "INSERT INTO reclamation (id_reclamateur,id_adherentConcerné,description,cause,report) VALUES (?,?,?,?,'false')";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,adherentReclamateur.getIdAdherent());
            ps.setInt(2,adherentConcerné.getIdAdherent());
            ps.setString(3,reclamation.getDescription());
            ps.setString(4,reclamation.getCause());
            System.out.println(adherentReclamateur.getIdAdherent()+"  Salmaaaa");           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
    public void delete(int id_reclamation) throws SQLException
    {
        String requete="DELETE from reclamation where id="+id_reclamation+";";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,id_reclamation);
        
          } catch (SQLException ex) {
            
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
        
        
    }
    
      public Reclamation findReclamationById(int id) {
        Reclamation reclamation = new Reclamation();
        String requete = "select * from reclamation where id_reclamation=?";
        AdministrateurDAO administrateurDAO=new AdministrateurDAO();
        try {
            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setAdherentReclamateur(adherentDAO.findAdherentByIdSa(resultat.getInt(2)));
                reclamation.setAdherentConcerné(adherentDAO.findAdherentByIdSa(resultat.getInt(3)));
                reclamation.setDescription(resultat.getString(4));
                reclamation.setAdministrateur(administrateurDAO.findAdministrateurByIdSa(resultat.getInt(5)));
                reclamation.setCause(resultat.getString(6));
                reclamation.setReport(resultat.getString(7));
              
            }
            return reclamation;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de la reclamation " + ex.getMessage());
            return null;
        }
    }
      
      
        public void updateReclamationReport(int idReclamation )
    { 
        String requete = "update reclamation set report='true' where id_reclamation="+idReclamation+";";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
          
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
        
    }
      
        
        
}


