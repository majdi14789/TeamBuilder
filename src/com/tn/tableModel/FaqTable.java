/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tn.tableModel;

import Entité.Faq;
import Entité.Reclamation;
import com.tn.doa.FaqDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author olfa
 */
public class FaqTable extends AbstractTableModel {
     List <Faq> faqs =new ArrayList<Faq>();
    String[] entete = {"id_Faq","Objet", "Contenu"};

    public FaqTable()
    {
        faqs=new FaqDAO().DisplayAllFaqs();
    }
    
    
    @Override
    public int getRowCount() {
      return faqs.size();
    }

    @Override
    public int getColumnCount() {
     return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
         switch (columnIndex) {
            case 0:
                return faqs.get(rowIndex).getIdFaq();
            case 1:
                return faqs.get(rowIndex).getObjet();
            case 2:
                return faqs.get(rowIndex).getContenu();
     default:
                 throw new IllegalArgumentException();
        }
    }
    @Override
    public String getColumnName(int column) {
        return entete[column];
    }
}
