/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.doa;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entité.Faq;
import com.tn.connect.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

 
/**
 *
 * @author majdi
 */
public class FaqDAO {
  
  public static void main(String arg[])
  {
      FaqDAO fq = new FaqDAO();
    
      System.out.print( fq.findFaqByNum(2).getContenu());
      
  }
    
    
    public void insertFaq (Faq fq)
{
                 String requete = "insert into faq (objet,contenu) values (?,?)";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1,fq.getObjet());
            ps.setString(2,fq.getContenu() );
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
     public void updateFaq(Faq faq,int id_faq){
        String requete = "update faq set objet='"+faq.getObjet()+"', contenu='"+faq.getContenu()+"' where id_faq='"+id_faq+"'";
        try {
 
          Statement statement = MyConnection.getInstance().createStatement();
          PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);           
         
            ps.execute();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour de Faq"+ex.getMessage());
        }

    }
     
   
       public void deleteFaq(int id){
           
              Faq faq=new Faq();
              String requete = "delete from faq where id_faq= ?";
      
         try 
        {
       
        Statement statement = MyConnection.getInstance().createStatement();
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1,id);
        ps.execute();
       JOptionPane.showMessageDialog(null, "Faq supprimé");
       
      
       
        } catch(Exception ex ) {
           System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
        JOptionPane.showMessageDialog(null, ex);
        }
        
       
         /*String requete = "delete from faq where id_faq=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.execute();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }*/
        
    }
       
       public Faq findFaqByNum(int num){
            List<Faq> listeFaqs = new ArrayList<Faq>();
            
        String requete = "select * from faq where id_faq=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
        
        Faq fq = new Faq();
          while(resultat.next()){
               
                fq.setIdFaq(resultat.getInt(1));
                fq.setObjet(resultat.getString(2));
                fq.setContenu(resultat.getString(3));
              
                
            }
        return fq;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
       
       
       
   public List<Faq> DisplayAllFaqs (){
    List<Faq> listeFaqs = new ArrayList<Faq>();

        String requete = "select * from faq";
        
        try {
           AdministrateurDAO administrateurDAO=new AdministrateurDAO();
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            FaqDAO faqDAO = new FaqDAO();
            while(resultat.next()){
                Faq fq =new Faq();
                fq.setIdFaq(resultat.getInt(1));
                fq.setObjet(resultat.getString(2));
                fq.setContenu(resultat.getString(3));
             

                listeFaqs.add(fq);
            }
            return listeFaqs;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des Faq "+ex.getMessage());
            return null;
        }
    }

    public Faq findFaqById(int id) {
      Faq faq = new Faq();
     String requete = "select * from faq where id_faq=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,id);
         
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                faq.setIdFaq(resultat.getInt(1));
                faq.setObjet(resultat.getString(2));
                faq.setContenu(resultat.getString(3)); 
                
                
            }
            return faq;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du faq "+ex.getMessage());
            return null;
        }    }
}