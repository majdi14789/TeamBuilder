

package com.tn.tableModel;

import Entité.Adherent;
import com.tn.doa.AdherentDAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class AdherentEvaluationTable extends AbstractTableModel{
private List<Adherent> mesAdherent;
 String []entete={"id","Nom","Prenom","Telephone"};
public AdherentEvaluationTable(){
    mesAdherent=new AdherentDAO().DisplayAllAdhrernt();
}
public AdherentEvaluationTable(String nom){
    mesAdherent=new AdherentDAO().DisplayAllAdhrerntAjax(nom);
}
    @Override
    public int getRowCount() {
       return mesAdherent.size();
    
    }

    @Override
    public int getColumnCount() {
   return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      switch(columnIndex){
          case 0:return mesAdherent.get(rowIndex).getIdAdherent();
        case 1: return mesAdherent.get(rowIndex).getNom(); 
        case 2:return mesAdherent.get(rowIndex).getPrenom();
        case 3:return mesAdherent.get(rowIndex).getTelephone();
     default:
                 throw new IllegalArgumentException();
    
}}

    @Override
    public String getColumnName(int column) {
        return entete[column]; //To change body of generated methods, choose Tools | Templates.
    }


}
