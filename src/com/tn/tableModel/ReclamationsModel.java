/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tn.tableModel;

import com.tn.doa.ReclamationDAO;
import Entité.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Salma
 */
public class ReclamationsModel extends AbstractTableModel{
     List <Reclamation> reclams =new ArrayList<Reclamation>();
    String[] entete = {"id_reclamation","Nom du reclamateur", "Prenom du reclamateur", "Nom de l'adherent concerné", "Prenom de l'adherent concerné ","cause","description","nombre de reclamation"};

    public ReclamationsModel()
     {
         reclams= new ReclamationDAO().DisplayAllReclamations();
     }
     public ReclamationsModel(int x)
     {
         reclams= new ReclamationDAO().DisplayAllReclamationsByReport();
     }
    @Override
    public int getRowCount() {
       return reclams.size();
    }

    @Override
    public int getColumnCount() {
       return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return reclams.get(rowIndex).getIdReclamation();
            case 1:
                return reclams.get(rowIndex).getAdherentConcerné().getNom();
            case 2:
                return reclams.get(rowIndex).getAdherentConcerné().getPrenom();
            case 3:
                return reclams.get(rowIndex).getAdherentReclamateur().getNom();
            case 4:
                return reclams.get(rowIndex).getAdherentReclamateur().getPrenom();
            case 5:
                return reclams.get(rowIndex).getCause();
            case 6:
                return reclams.get(rowIndex).getDescription();
            case 7:
                return reclams.get(rowIndex).getAdherentConcerné().getNombreReclamation();
            default:
                 throw new IllegalArgumentException();
        }
    }
    @Override
    public String getColumnName(int column) {
        return entete[column];
    }
}