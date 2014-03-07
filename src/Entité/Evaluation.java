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

public class Evaluation  {
   private int id_adherentEvalue;
    
    private int idEvaluation;
    private int note;
    private String commentaire;
    private String reponse;
    private int id_evaluateur;
    private float moyenne;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id_adherentEvalue;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evaluation other = (Evaluation) obj;
        if (this.id_adherentEvalue != other.id_adherentEvalue) {
            return false;
        }
        return true;
    }
    //private Adherent idadherentEvalué;
    private Adherent adherentEvalué,evaluateur;

    public Evaluation() {}

    public int getId_adherentEvalue() {
        return id_adherentEvalue;
    }

   

    public void setId_adherentEvalue(int id_adherentEvalue) {
        this.id_adherentEvalue = id_adherentEvalue;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
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

    public int getId_evaluateur() {
        return id_evaluateur;
    }

    public void setId_evaluateur(int id_evaluateur) {
        this.id_evaluateur = id_evaluateur;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public Adherent getAdherentEvalué() {
        return adherentEvalué;
    }

    public void setAdherentEvalué(Adherent adherentEvalué) {
        this.adherentEvalué = adherentEvalué;
    }

   

    public Adherent getEvaluateur() {
        return evaluateur;
    }

    public void setEvaluateur(Adherent evaluateur) {
        this.evaluateur = evaluateur;
    }
    
    

    
}
