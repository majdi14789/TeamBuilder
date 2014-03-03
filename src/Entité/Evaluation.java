/*
 * To change this template, choose Tools | Templates
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
 * @author PC
 */
@Entity
@Table(name = "evaluation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluation.findAll", query = "SELECT e FROM Evaluation e"),
    @NamedQuery(name = "Evaluation.findByIdEvaluation", query = "SELECT e FROM Evaluation e WHERE e.idEvaluation = :idEvaluation"),
    @NamedQuery(name = "Evaluation.findByNote", query = "SELECT e FROM Evaluation e WHERE e.note = :note"),
    @NamedQuery(name = "Evaluation.findByCommentaire", query = "SELECT e FROM Evaluation e WHERE e.commentaire = :commentaire"),
    @NamedQuery(name = "Evaluation.findByReponse", query = "SELECT e FROM Evaluation e WHERE e.reponse = :reponse")})
public class Evaluation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_evaluation")
    private Integer idEvaluation;
    @Basic(optional = false)
    @Column(name = "note")
    private int note;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "reponse")
    private String reponse;
    @JoinColumn(name = "id_evaluateur", referencedColumnName = "id_adherent")
    @ManyToOne(optional = false)
    private Adherent idEvaluateur;
    @JoinColumn(name = "id_adherentEvalu\u00e9", referencedColumnName = "id_adherent")
    @ManyToOne(optional = false)
    //private Adherent idadherentEvalué;
    private Adherent adherent;

    public Evaluation() {
    }

    public Evaluation(Integer idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public Evaluation(Integer idEvaluation, int note) {
        this.idEvaluation = idEvaluation;
        this.note = note;
    }

    public Integer getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(Integer idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Adherent getIdEvaluateur() {
        return idEvaluateur;
    }

    public void setIdEvaluateur(Adherent idEvaluateur) {
        this.idEvaluateur = idEvaluateur;
    }

//    public Adherent getIdadherentEvalué() {
//        return idadherentEvalué;
//    }
//
//    public void setIdadherentEvalué(Adherent idadherentEvalué) {
//        this.idadherentEvalué = idadherentEvalué;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvaluation != null ? idEvaluation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluation)) {
            return false;
        }
        Evaluation other = (Evaluation) object;
        if ((this.idEvaluation == null && other.idEvaluation != null) || (this.idEvaluation != null && !this.idEvaluation.equals(other.idEvaluation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entit\u00e9.Evaluation[ idEvaluation=" + idEvaluation + " ]";
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
