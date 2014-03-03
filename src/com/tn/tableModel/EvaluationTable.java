/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.tableModel;

import com.tn.doa.EvaluationDAO;
import Entité.Evaluation;
import Entité.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class EvaluationTable extends AbstractTableModel{
     
    List <Evaluation> evaluations =new ArrayList<Evaluation>();
    String[] entete = {"id Evaluation","id _adherent evalué", "id evaluateur", "note","commentaire","reponse"};

   

     public EvaluationTable()
     {
        evaluations = new EvaluationDAO().DisplayAllEvaluation();
     }
    @Override
    public int getRowCount() {
       return evaluations.size();
    }
    
    
    
    
   
    @Override
    public int getColumnCount() {
       return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return evaluations.get(rowIndex).getIdEvaluation();
            case 1:
                //return evaluations.get(rowIndex).getAdherent().getIdAdherent(); Majdi
            return "";
            case 2:
                //return evaluations.get(rowIndex).getAdherent().getIdAdherent(); // Majdi
            return "";
            case 3:
                return evaluations.get(rowIndex).getNote();
            case 4:
                return evaluations.get(rowIndex).getCommentaire();
            case 5:
                return evaluations.get(rowIndex).getReponse();
            default:
                 throw new IllegalArgumentException();
        }
    }
    @Override
    public String getColumnName(int column) {
        return entete[column];
    }
    
}
