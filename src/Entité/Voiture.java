/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entité;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Salma
 */
@Entity
@Table(name = "voiture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voiture.findAll", query = "SELECT v FROM Voiture v"),
    @NamedQuery(name = "Voiture.findByIdVoiture", query = "SELECT v FROM Voiture v WHERE v.idVoiture = :idVoiture"),
    @NamedQuery(name = "Voiture.findByMarque", query = "SELECT v FROM Voiture v WHERE v.marque = :marque"),
    @NamedQuery(name = "Voiture.findByModel", query = "SELECT v FROM Voiture v WHERE v.model = :model"),
    @NamedQuery(name = "Voiture.findByCarburant", query = "SELECT v FROM Voiture v WHERE v.carburant = :carburant")})
public class Voiture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_voiture")
   // private Integer idVoiture;
   private String idVoiture;
   
    @Basic(optional = false)
    @Column(name = "marque")
    private String marque;
    @Basic(optional = false)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @Column(name = "carburant")
    private String carburant;
    public Voiture() {
    }
//    public Voiture(Integer idVoiture) {
//        this.idVoiture = idVoiture;
//    }
//
//    public Voiture(Integer idVoiture, String marque, String model, String carburant) {
//        this.idVoiture = idVoiture;
//        this.marque = marque;
//        this.model = model;
//        this.carburant = carburant;
//    }
//
//    public Integer getIdVoiture() {
//        return idVoiture;
//    }
//
//    public void setIdVoiture(Integer idVoiture) {
//        this.idVoiture = idVoiture;
//    }
    
    
    
     public Voiture(String idVoiture) {
        this.idVoiture = idVoiture;
    }
    public Voiture(String idVoiture, String marque, String model, String carburant) {
        this.idVoiture = idVoiture;
        this.marque = marque;
        this.model = model;
        this.carburant = carburant;
    }
    public String getIdVoiture() {
        return idVoiture;
    }
    public void setIdVoiture(String idVoiture) {
        this.idVoiture = idVoiture;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCarburant() {
        return carburant;
    }
    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVoiture != null ? idVoiture.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voiture)) {
            return false;
        }
        Voiture other = (Voiture) object;
        if ((this.idVoiture == null && other.idVoiture != null) || (this.idVoiture != null && !this.idVoiture.equals(other.idVoiture))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "salmaDAO.Voiture[ idVoiture=" + idVoiture + " ]";
    }
}