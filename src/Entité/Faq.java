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
@Table(name = "faq")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Faq.findAll", query = "SELECT f FROM Faq f"),
    @NamedQuery(name = "Faq.findByIdFaq", query = "SELECT f FROM Faq f WHERE f.idFaq = :idFaq"),
    @NamedQuery(name = "Faq.findByObjet", query = "SELECT f FROM Faq f WHERE f.objet = :objet"),
    @NamedQuery(name = "Faq.findByContenu", query = "SELECT f FROM Faq f WHERE f.contenu = :contenu")})
public class Faq implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_faq")
    private Integer idFaq;
    @Basic(optional = false)
    @Column(name = "objet")
    private String objet;
    @Basic(optional = false)
    @Column(name = "contenu")
    private String contenu;

    public Faq() {
    }

    public Faq(Integer idFaq) {
        this.idFaq = idFaq;
    }

    public Faq(Integer idFaq, String objet, String contenu) {
        this.idFaq = idFaq;
        this.objet = objet;
        this.contenu = contenu;
    }

    public Integer getIdFaq() {
        return idFaq;
    }

    public void setIdFaq(Integer idFaq) {
        this.idFaq = idFaq;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFaq != null ? idFaq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faq)) {
            return false;
        }
        Faq other = (Faq) object;
        if ((this.idFaq == null && other.idFaq != null) || (this.idFaq != null && !this.idFaq.equals(other.idFaq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "salmaDAO.Faq[ idFaq=" + idFaq + " ]";
    }
    
}
