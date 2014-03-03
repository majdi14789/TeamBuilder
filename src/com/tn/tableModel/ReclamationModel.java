/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tn.tableModel;

import Entité.Reclamation;
import com.tn.doa.ReclamationDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;

/**
 *
 * @author majdi
 */
public class ReclamationModel extends AbstractListModel{
List<Reclamation> mesReclamations;
public ReclamationModel() {
    try {
        mesReclamations=new ReclamationDAO().DisplayallReclamation();
    } catch (SQLException ex) {
        Logger.getLogger(ReclamationModel.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    @Override
    public int getSize() {
     
    return mesReclamations.size();
    }

    @Override
    public Object getElementAt(int index) {
     return mesReclamations.get(index).getDescription();
    }
    
}
