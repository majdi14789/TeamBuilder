/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entité;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Salma
 */
public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reservation")
    private Integer idReservation;
    @Basic(optional = false)
    @Column(name = "places")
    private int places;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @Column(name = "heure")
    @Temporal(TemporalType.TIME)
    private String heure;
    @Basic(optional = false)
    @Column(name = "ville_depart")
    private String villeDepart;
    @Basic(optional = false)
    @Column(name = "ville_arrivee")
    private String villeArrivee;
    @JoinColumn(name = "id_trajet", referencedColumnName = "id_trajet")
    @ManyToOne(optional = false)
    private Trajet Trajet;
    private int idTrajet;
    @JoinColumn(name = "id_passager", referencedColumnName = "id_adherent")
    @ManyToOne(optional = false)
    private Adherent adherent;
    private int idadherent;
   
    
    private String code_html; 

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public void setCode_html(String code_html) {
        this.code_html = code_html;
    }

    public String getCode_html() {
        return code_html;
    }
    
    
    public Reservation() {
    }

    public Reservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Reservation(Integer idReservation, int places, String date, String heure, String villeDepart, String villeArrivee) {
        this.idReservation = idReservation;
        this.places = places;
        this.date = date;
        this.heure = heure;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public Trajet getTrajet() {
        return Trajet;
    }

    public void setIdTrajet(int idTrajet) {
        this.idTrajet = idTrajet;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setTrajet(Trajet Trajet) {
        this.Trajet = Trajet;
    }

    public void setAdhrent(Adherent adherent) {
        this.adherent = adherent;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdTrajet() {
        return idTrajet;
    }

    public int getIdadherent() {
        return idadherent;
    }

    public void setIdAdherent(int idAdherent) {
        this.idadherent = idAdherent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReservation != null ? idReservation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.idReservation == null && other.idReservation != null) || (this.idReservation != null && !this.idReservation.equals(other.idReservation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "salmaDAO.Reservation[ idReservation=" + idReservation + " ]";
    }
    
}
