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
@Table(name = "administrateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrateur.findAll", query = "SELECT a FROM Administrateur a"),
    @NamedQuery(name = "Administrateur.findByIdAdministrateur", query = "SELECT a FROM Administrateur a WHERE a.idAdministrateur = :idAdministrateur"),
    @NamedQuery(name = "Administrateur.findByLogin", query = "SELECT a FROM Administrateur a WHERE a.login = :login"),
    @NamedQuery(name = "Administrateur.findByMdp", query = "SELECT a FROM Administrateur a WHERE a.mdp = :mdp"),
    @NamedQuery(name = "Administrateur.findByNom", query = "SELECT a FROM Administrateur a WHERE a.nom = :nom"),
    @NamedQuery(name = "Administrateur.findByPrenom", query = "SELECT a FROM Administrateur a WHERE a.prenom = :prenom")})
public class Administrateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_administrateur")
    private Integer idAdministrateur;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "mdp")
    
    
    
    private String mdp;

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "prenom")
    private String prenom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAdministrateur")
    private Collection<Statistique> statistiqueCollection;
    @OneToMany(mappedBy = "idAdminisrateur")
    private Collection<Reclamation> reclamationCollection;
private String image;
    public Administrateur() {
    }

    public Administrateur(Integer idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }

    public Administrateur(Integer idAdministrateur, String login, String mdp, String nom, String prenom) {
        this.idAdministrateur = idAdministrateur;
        this.login = login;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getIdAdministrateur() {
        return idAdministrateur;
    }

    public void setIdAdministrateur(Integer idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @XmlTransient
    public Collection<Statistique> getStatistiqueCollection() {
        return statistiqueCollection;
    }

    public void setStatistiqueCollection(Collection<Statistique> statistiqueCollection) {
        this.statistiqueCollection = statistiqueCollection;
    }

    @XmlTransient
    public Collection<Reclamation> getReclamationCollection() {
        return reclamationCollection;
    }

    public void setReclamationCollection(Collection<Reclamation> reclamationCollection) {
        this.reclamationCollection = reclamationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdministrateur != null ? idAdministrateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrateur)) {
            return false;
        }
        Administrateur other = (Administrateur) object;
        if ((this.idAdministrateur == null && other.idAdministrateur != null) || (this.idAdministrateur != null && !this.idAdministrateur.equals(other.idAdministrateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "salmaDAO.Administrateur[ idAdministrateur=" + idAdministrateur + " ]";
    }
    
}
