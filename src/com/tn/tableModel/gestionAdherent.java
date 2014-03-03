/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.tableModel;

import Entité.Adherent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import com.tn.doa.AdherentDAO;

/**
 *
 * @author sinda
 */
public class gestionAdherent extends AbstractTableModel{
    
     List <Adherent> adherents =new ArrayList<Adherent>();
    String[] entete = {"id_adherent","nom", "prenom", "adresse_mail","mdp","telephone","nombre_reclamation"};
    
    
    public gestionAdherent()
    {
        //adherents=new AdherentDAO().DisplayAllAdhrernt();
    }

    @Override
    public int getRowCount() {
      return adherents.size();
    }

    @Override
    public int getColumnCount() {
      return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
            case 0:
                return adherents.get(rowIndex).getIdAdherent();
            case 1:
                return adherents.get(rowIndex).getNom();
            case 2:
                return adherents.get(rowIndex).getPrenom();
            case 3:
                return adherents.get(rowIndex).getAdresseMail();
            case 4:
                return adherents.get(rowIndex).getMdp();
            case 5:
                return adherents.get(rowIndex).getTelephone();
            case 6:
                return adherents.get(rowIndex).getNombreReclamation();
            default:
                 throw new IllegalArgumentException();
        }
    }
     public String getColumnName(int column) {
        return entete[column];
    }
}
