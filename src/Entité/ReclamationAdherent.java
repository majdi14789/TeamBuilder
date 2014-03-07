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
@Table(name = "reclamationadherent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reclamationadherent.findAll", query = "SELECT r FROM Reclamationadherent r"),
    @NamedQuery(name = "Reclamationadherent.findByIdreclamationAdherent", query = "SELECT r FROM Reclamationadherent r WHERE r.idreclamationAdherent = :idreclamationAdherent"),
    @NamedQuery(name = "Reclamationadherent.findByIdadherentConcern\u00e9", query = "SELECT r FROM Reclamationadherent r WHERE r.idadherentConcern\u00e9 = :idadherentConcern\u00e9"),
    @NamedQuery(name = "Reclamationadherent.findByCause", query = "SELECT r FROM Reclamationadherent r WHERE r.cause = :cause"),
    @NamedQuery(name = "Reclamationadherent.findByDescription", query = "SELECT r FROM Reclamationadherent r WHERE r.description = :description")})
public class ReclamationAdherent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_reclamationAdherent")
    private Integer idreclamationAdherent;
    @Basic(optional = false)
    @Column(name = "id_adherentConcern\u00e9")
    private int idadherentConcerné;
    @Basic(optional = false)
    @Column(name = "cause")
    private String cause;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public ReclamationAdherent() {
    }

    
    private Adherent adherent;
    public ReclamationAdherent(Integer idreclamationAdherent) {
        this.idreclamationAdherent = idreclamationAdherent;
    }

    public ReclamationAdherent(Integer idreclamationAdherent, int idadherentConcerné, String cause, String description) {
        this.idreclamationAdherent = idreclamationAdherent;
        this.idadherentConcerné = idadherentConcerné;
        this.cause = cause;
        this.description = description;
    }

    public Integer getIdreclamationAdherent() {
        return idreclamationAdherent;
    }

    public void setIdreclamationAdherent(Integer idreclamationAdherent) {
        this.idreclamationAdherent = idreclamationAdherent;
    }

    public int getIdadherentConcerné() {
        return idadherentConcerné;
    }

    public void setIdadherentConcerné(int idadherentConcerné) {
        this.idadherentConcerné = idadherentConcerné;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreclamationAdherent != null ? idreclamationAdherent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReclamationAdherent)) {
            return false;
        }
        ReclamationAdherent other = (ReclamationAdherent) object;
        if ((this.idreclamationAdherent == null && other.idreclamationAdherent != null) || (this.idreclamationAdherent != null && !this.idreclamationAdherent.equals(other.idreclamationAdherent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entit\u00e9.Reclamationadherent[ idreclamationAdherent=" + idreclamationAdherent + " ]";
    }
    
    public Adherent getAdherent()
    {
        return adherent;
    }
    public void setAdherent(Adherent adherent)
    {
        this.adherent=adherent;
    }
}

