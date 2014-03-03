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
@Entity
@Table(name = "pointarret")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pointarret.findAll", query = "SELECT p FROM Pointarret p"),
    @NamedQuery(name = "Pointarret.findByIdpointArret", query = "SELECT p FROM Pointarret p WHERE p.idpointArret = :idpointArret"),
    @NamedQuery(name = "Pointarret.findByDateArrivee", query = "SELECT p FROM Pointarret p WHERE p.dateArrivee = :dateArrivee"),
    @NamedQuery(name = "Pointarret.findByHeureArrivee", query = "SELECT p FROM Pointarret p WHERE p.heureArrivee = :heureArrivee"),
    @NamedQuery(name = "Pointarret.findByPtPrix", query = "SELECT p FROM Pointarret p WHERE p.ptPrix = :ptPrix")})
public class Pointarret implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pointArret")
    private Integer idpointArret;
    @Basic(optional = false)
    @Column(name = "date_arrivee")
    @Temporal(TemporalType.DATE)
    private Date dateArrivee;
    @Basic(optional = false)
    @Column(name = "heure_arrivee")
    @Temporal(TemporalType.TIME)
    private Date heureArrivee;
    @Basic(optional = false)
    @Column(name = "pt_prix")
    private float ptPrix;
    @JoinColumn(name = "id_ville", referencedColumnName = "id_ville")
    @ManyToOne(optional = false)
    private Ville idVille;
    @JoinColumn(name = "id_trajet", referencedColumnName = "id_trajet")
    @ManyToOne(optional = false)
    private Trajet idTrajet;

    public Pointarret() {
    }

    public Pointarret(Integer idpointArret) {
        this.idpointArret = idpointArret;
    }

    public Pointarret(Integer idpointArret, Date dateArrivee, Date heureArrivee, float ptPrix) {
        this.idpointArret = idpointArret;
        this.dateArrivee = dateArrivee;
        this.heureArrivee = heureArrivee;
        this.ptPrix = ptPrix;
    }

    public Integer getIdpointArret() {
        return idpointArret;
    }

    public void setIdpointArret(Integer idpointArret) {
        this.idpointArret = idpointArret;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Date getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(Date heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public float getPtPrix() {
        return ptPrix;
    }

    public void setPtPrix(float ptPrix) {
        this.ptPrix = ptPrix;
    }

    public Ville getIdVille() {
        return idVille;
    }

    public void setIdVille(Ville idVille) {
        this.idVille = idVille;
    }

    public Trajet getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(Trajet idTrajet) {
        this.idTrajet = idTrajet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpointArret != null ? idpointArret.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pointarret)) {
            return false;
        }
        Pointarret other = (Pointarret) object;
        if ((this.idpointArret == null && other.idpointArret != null) || (this.idpointArret != null && !this.idpointArret.equals(other.idpointArret))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "salmaDAO.Pointarret[ idpointArret=" + idpointArret + " ]";
    }
    
}
