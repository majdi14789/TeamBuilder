
package com.tn.doa;

import Entité.Reclamation;
import Entité.Trajet;
import com.tn.connect.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReclamationDAO {

    public ReclamationDAO() {
    }
  
    public List<Reclamation>DisplayallReclamation() throws SQLException{
      List<Reclamation> listReclamation=new ArrayList<Reclamation>();
        AdherentDAO adhDAO=new AdherentDAO();
         AdministrateurDAO adminDAO=new AdministrateurDAO();
       String requete="select * from reclamation";
      
       
       Statement statement=MyConnection.getInstance().createStatement();
       ResultSet resultat =statement.executeQuery(requete);
       
       while(resultat.next()){
         Reclamation reclamation=new Reclamation();
           reclamation.setIdReclamation(resultat.getInt(1));
           reclamation.setIdReclamateur(adhDAO.findAdherentById(resultat.getInt(2)));
           reclamation.setIdadherentConcerné(adhDAO.findAdherentById(resultat.getInt(3)));
           reclamation.setDescription(resultat.getString(4));
           reclamation.setIdAdminisrateur(adminDAO.findAdministrateurtById(resultat.getInt(5)).getIdAdministrateur());
           reclamation.setCause(resultat.getString(6));
           reclamation.setReprot(resultat.getString(7));
           
           listReclamation.add(reclamation);
           
 
    }return listReclamation;
    
    }
}
