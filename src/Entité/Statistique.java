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
@Table(name = "statistique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statistique.findAll", query = "SELECT s FROM Statistique s"),
    @NamedQuery(name = "Statistique.findByIdStatistique", query = "SELECT s FROM Statistique s WHERE s.idStatistique = :idStatistique"),
    @NamedQuery(name = "Statistique.findByDate", query = "SELECT s FROM Statistique s WHERE s.date = :date")})
public class Statistique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_statistique")
    private Integer idStatistique;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @JoinColumn(name = "id_administrateur", referencedColumnName = "id_administrateur")
    @ManyToOne(optional = false)
    private Administrateur idAdministrateur;

    public Statistique() {
    }

    public Statistique(Integer idStatistique) {
        this.idStatistique = idStatistique;
    }

    public Statistique(Integer idStatistique, String date) {
        this.idStatistique = idStatistique;
        this.date = date;
    }

    public Integer getIdStatistique() {
        return idStatistique;
    }

    public void setIdStatistique(Integer idStatistique) {
        this.idStatistique = idStatistique;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Administrateur getIdAdministrateur() {
        return idAdministrateur;
    }

    public void setIdAdministrateur(Administrateur idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatistique != null ? idStatistique.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statistique)) {
            return false;
        }
        Statistique other = (Statistique) object;
        if ((this.idStatistique == null && other.idStatistique != null) || (this.idStatistique != null && !this.idStatistique.equals(other.idStatistique))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "salmaDAO.Statistique[ idStatistique=" + idStatistique + " ]";
    }
    
}
