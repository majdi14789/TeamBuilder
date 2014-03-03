

package com.tn.tableModel;

import Gui.Authentification;
import Entité.Adherent;
import Entité.Reservation;
import com.sun.imageio.plugins.jpeg.JPEG;
import com.tn.doa.AdherentDAO;
import com.tn.doa.ReservationDAO;
import static com.tn.tableModel.TrajetTableModel.AllId;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class ReservationTableModel extends AbstractTableModel{
List<Reservation> mesReservation;
Adherent ad;
AdherentDAO adDAO;
  String [] entete={"id reservation","id passager","id trajet","nbr places","date","heure","depart","arrive"};   

  
  public ReservationTableModel(int id){
    try {
        Adherent ad=new Adherent();
        AdherentDAO adDAO=new AdherentDAO();
        ad=adDAO.findAdherentById(Authentification.id_adherent);
        System.out.println(ad.getNom());
        mesReservation=new ReservationDAO().DisplayAllReservationByAdherent();
    } catch (SQLException ex) {
        Logger.getLogger(ReservationTableModel.class.getName()).log(Level.SEVERE, null, ex);
    }
}
@Override
    public int getRowCount() {
     return  mesReservation.size();
    }

    @Override
    public int getColumnCount() {
   return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch(columnIndex){
            case 0:{
                //AllId.add(monTrajet.get(rowIndex).getIdTrajet());
                return mesReservation.get(rowIndex).getIdReservation();
            }
            case 1:{
                //Adherent ad;
//                Adherent ad=adDAO.findAdherentById(10);
//                System.err.println(ad.getNom());
              return  "amine";
            }
            case 2:{
                return mesReservation.get(rowIndex).getIdTrajet();
            }
            case 3:{
                return mesReservation.get(rowIndex).getPlaces();
            }
            case 4:{
                return mesReservation.get(rowIndex).getDate();
            }
            case 5:{
                return mesReservation.get(rowIndex).getHeure();
            }
            case 6:{
                return mesReservation.get(rowIndex).getVilleDepart();
            }
            case 7:{
                return mesReservation.get(rowIndex).getVilleArrivee();
            }
             default:
                 throw new IllegalArgumentException();
        }
        
    }
 
@Override
     public String getColumnName(int column) {
        
        
        return entete[column];
    }
    
}
