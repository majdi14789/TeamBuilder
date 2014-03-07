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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Salma
 */
@Entity
@Table(name = "reclamation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reclamation.findAll", query = "SELECT r FROM Reclamation r"),
    @NamedQuery(name = "Reclamation.findByIdReclamation", query = "SELECT r FROM Reclamation r WHERE r.idReclamation = :idReclamation"),
    @NamedQuery(name = "Reclamation.findByDescription", query = "SELECT r FROM Reclamation r WHERE r.description = :description"),
    @NamedQuery(name = "Reclamation.findByCause", query = "SELECT r FROM Reclamation r WHERE r.cause = :cause"),
    @NamedQuery(name = "Reclamation.findByReport", query = "SELECT r FROM Reclamation r WHERE r.report = :report")})
public class Reclamation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reclamation")
    private Integer idReclamation;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "cause")
    private String cause;
    @Basic(optional = false)
    @Column(name = "report")
    private String report;
    @JoinColumn(name = "id_adminisrateur", referencedColumnName = "id_administrateur")
    @ManyToOne
    private Administrateur idAdminisrateur;
    @JoinColumn(name = "id_adherentConcern\u00e9", referencedColumnName = "id_adherent")
    @ManyToOne(optional = false)
    private Adherent idadherentConcerné;
    @JoinColumn(name = "id_reclamateur", referencedColumnName = "id_adherent")
    @ManyToOne(optional = false)
    private Adherent idReclamateur;

    public Reclamation() {
    }

    public Reclamation(Integer idReclamation) {
        this.idReclamation = idReclamation;
    }

    private Adherent adherent,adherentConcerné,AdherentReclamateur;

    public Adherent getAdherentConcerné() {
        return adherentConcerné;
    }

    public void setAdherentConcerné(Adherent adherentConcerné) {
        this.adherentConcerné = adherentConcerné;
    }

    public Adherent getAdherentReclamateur() {
        return AdherentReclamateur;
    }

    public void setAdherentReclamateur(Adherent AdherentReclamateur) {
        this.AdherentReclamateur = AdherentReclamateur;
    }
    private Administrateur administrateur;
    
    public Reclamation(Integer idReclamation, String description, String cause, String report) {
        this.idReclamation = idReclamation;
        this.description = description;
        this.cause = cause;
        this.report = report;
    }
    public Adherent getAdherent()
    {
        return adherent;
    }
    public void setAdherent(Adherent adherent)
    {
        this.adherent=adherent;
    }
    public void setAdministrateur(Administrateur administrateur)
    {
        this.administrateur=administrateur;
    }
    public Administrateur getAdministrateur()
    {
        return administrateur;
    }
    public Integer getIdReclamation() {
        return idReclamation;
    }

    public void setIdReclamation(Integer idReclamation) {
        this.idReclamation = idReclamation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Administrateur getIdAdminisrateur() {
        return idAdminisrateur;
    }

    public void setIdAdminisrateur(Administrateur idAdminisrateur) {
        this.idAdminisrateur = idAdminisrateur;
    }

    public Adherent getIdadherentConcerné() {
        return idadherentConcerné;
    }

    public void setIdadherentConcerné(Adherent idadherentConcerné) {
        this.idadherentConcerné = idadherentConcerné;
    }

    public Adherent getIdReclamateur() {
        return idReclamateur;
    }

    public void setIdReclamateur(Adherent idReclamateur) {
        this.idReclamateur = idReclamateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReclamation != null ? idReclamation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reclamation)) {
            return false;
        }
        Reclamation other = (Reclamation) object;
        if ((this.idReclamation == null && other.idReclamation != null) || (this.idReclamation != null && !this.idReclamation.equals(other.idReclamation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entit\u00e9.Reclamation[ idReclamation=" + idReclamation + " ]";
    }
    
}
