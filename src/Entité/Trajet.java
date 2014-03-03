/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entité;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Salma
 */
@Entity
@Table(name = "trajet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trajet.findAll", query = "SELECT t FROM Trajet t"),
    @NamedQuery(name = "Trajet.findByIdTrajet", query = "SELECT t FROM Trajet t WHERE t.idTrajet = :idTrajet"),
    @NamedQuery(name = "Trajet.findByJours", query = "SELECT t FROM Trajet t WHERE t.jours = :jours"),
    @NamedQuery(name = "Trajet.findByHeure", query = "SELECT t FROM Trajet t WHERE t.heure = :heure"),
    @NamedQuery(name = "Trajet.findByFrequence", query = "SELECT t FROM Trajet t WHERE t.frequence = :frequence"),
    @NamedQuery(name = "Trajet.findByTypeTrajet", query = "SELECT t FROM Trajet t WHERE t.typeTrajet = :typeTrajet"),
    @NamedQuery(name = "Trajet.findByPlaces", query = "SELECT t FROM Trajet t WHERE t.places = :places"),
    @NamedQuery(name = "Trajet.findByBagages", query = "SELECT t FROM Trajet t WHERE t.bagages = :bagages"),
    @NamedQuery(name = "Trajet.findByCommentaire", query = "SELECT t FROM Trajet t WHERE t.commentaire = :commentaire"),
    @NamedQuery(name = "Trajet.findByKilometrage", query = "SELECT t FROM Trajet t WHERE t.kilometrage = :kilometrage"),
    @NamedQuery(name = "Trajet.findByPrix", query = "SELECT t FROM Trajet t WHERE t.prix = :prix"),
    @NamedQuery(name = "Trajet.findByVilleArrivee", query = "SELECT t FROM Trajet t WHERE t.villeArrivee = :villeArrivee"),
    @NamedQuery(name = "Trajet.findByVilleDepart", query = "SELECT t FROM Trajet t WHERE t.villeDepart = :villeDepart")})
public class Trajet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_trajet")
    private Integer idTrajet;
    @Column(name = "jours")
    private String jours;
    @Column(name = "heure")
    private String heure;
    @Column(name = "frequence")
    private String frequence;
    @Column(name = "type_trajet")
    private String typeTrajet;
    @Column(name = "places")
    private Integer places;
    @Column(name = "bagages")
    private String bagages;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "kilometrage")
    private Integer kilometrage;
    @Basic(optional = false)
    @Column(name = "prix")
    private int prix;
    @Basic(optional = false)
    @Column(name = "ville_arrivee")
    private String villeArrivee;
    @Basic(optional = false)
    @Column(name = "ville_depart")
    private String villeDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTrajet")
    private Collection<Pointarret> pointarretCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTrajet")
    private Collection<Reservation> reservationCollection;
    @JoinColumn(name = "id_voiture", referencedColumnName = "id_ville")
    @ManyToOne
    private Voiture voiture;
    @JoinColumn(name = "id_conducteur", referencedColumnName = "id_adherent")
    @ManyToOne(optional = false)
    private Adherent adherent;

    private String code_map; 

    public String getCode_map() {
        return code_map;
    }

    public  void setCode_map(String code_map) {
        this.code_map = code_map;
    }
    
    
    public Trajet() {
    }

    public Trajet(Integer idTrajet) {
        this.idTrajet = idTrajet;
    }

    public Trajet(Integer idTrajet, int prix, String villeArrivee, String villeDepart) {
        this.idTrajet = idTrajet;
        this.prix = prix;
        this.villeArrivee = villeArrivee;
        this.villeDepart = villeDepart;
    }

    public Integer getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(Integer idTrajet) {
        this.idTrajet = idTrajet;
    }

    public String getJours() {
        return jours;
    }

    public void setJours(String jours) {
        this.jours = jours;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public String getTypeTrajet() {
        return typeTrajet;
    }

    public void setTypeTrajet(String typeTrajet) {
        this.typeTrajet = typeTrajet;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    public String getBagages() {
        return bagages;
    }

    public void setBagages(String bagages) {
        this.bagages = bagages;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Integer getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Integer kilometrage) {
        this.kilometrage = kilometrage;
    }

    
    
    
    public int getPrix() {
        return prix;
    }
//    public float getPrix() {
//        return prix;
//    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    @XmlTransient
    public Collection<Pointarret> getPointarretCollection() {
        return pointarretCollection;
    }

    public void setPointarretCollection(Collection<Pointarret> pointarretCollection) {
        this.pointarretCollection = pointarretCollection;
    }

    @XmlTransient
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrajet != null ? idTrajet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trajet)) {
            return false;
        }
        Trajet other = (Trajet) object;
        if ((this.idTrajet == null && other.idTrajet != null) || (this.idTrajet != null && !this.idTrajet.equals(other.idTrajet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "salmaDAO.Trajet[ idTrajet=" + idTrajet + " ]";
    }
    
}
