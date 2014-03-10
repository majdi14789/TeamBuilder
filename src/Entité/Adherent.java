package Entité;
import java.util.Collection;
import java.util.logging.Logger;
/**
 *
 * @author Salma
 */
public class Adherent  {
    
   
   
    private Integer idAdherent;
   
    private String nom;
   
    private String prenom;
    
    private String adresseMail;
    
  
    private String mdp;
 
    private Integer telephone;
    
    private Collection<Reclamation> reclamationCollection;
    
    private Collection<Reclamation> reclamationCollection1;
   
    private Collection<Reservation> reservationCollection;
   
    private Collection<Evaluation> evaluationCollection;
    
    private Collection<Evaluation> evaluationCollection1;
   
    private Collection<Trajet> trajetCollection;
    private int nombreReclamation;
    
    private int nombre_reclamation;
    
    private String etat;

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getNombre_reclamation() {
        return nombre_reclamation;
    }

    public String getEtat() {
        return etat;
    }
    public Adherent() {
    }
    public Adherent(Integer idAdherent) {
        this.idAdherent = idAdherent;
    }
    public Adherent(Integer idAdherent, String nom, String prenom, String adresseMail, String mdp) {
        this.idAdherent = idAdherent;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.mdp = mdp;
    }
    
    public int getNombreReclamation() {
        return nombreReclamation;
    }
    public void setNombreReclamation(int nombreReclamation) {
        this.nombreReclamation = nombreReclamation;
    }
    public Integer getIdAdherent() {
        return idAdherent;
    }
    public void setIdAdherent(Integer idAdherent) {
        this.idAdherent = idAdherent;
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
    public String getAdresseMail() {
        return adresseMail;
    }
    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }
    public String getMdp() {
        return mdp;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public Integer getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public Collection<Reclamation> getReclamationCollection() {
        return reclamationCollection;
    }
    public void setReclamationCollection(Collection<Reclamation> reclamationCollection) {
        this.reclamationCollection = reclamationCollection;
    }
   
    public Collection<Reclamation> getReclamationCollection1() {
        return reclamationCollection1;
    }
    public void setReclamationCollection1(Collection<Reclamation> reclamationCollection1) {
        this.reclamationCollection1 = reclamationCollection1;
    }
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }
    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }
   
    public Collection<Evaluation> getEvaluationCollection() {
        return evaluationCollection;
    }
    public void setEvaluationCollection(Collection<Evaluation> evaluationCollection) {
        this.evaluationCollection = evaluationCollection;
    }
    
    public Collection<Evaluation> getEvaluationCollection1() {
        return evaluationCollection1;
    }
    public void setEvaluationCollection1(Collection<Evaluation> evaluationCollection1) {
        this.evaluationCollection1 = evaluationCollection1;
    }
  
    public Collection<Trajet> getTrajetCollection() {
        return trajetCollection;
    }
    public void setTrajetCollection(Collection<Trajet> trajetCollection) {
        this.trajetCollection = trajetCollection;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdherent != null ? idAdherent.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adherent)) {
            return false;
        }
        Adherent other = (Adherent) object;
        if ((this.idAdherent == null && other.idAdherent != null) || (this.idAdherent != null && !this.idAdherent.equals(other.idAdherent))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "salmaDAO.Adherent[ idAdherent=" + idAdherent + " ]";
    }
    public void setNombre_reclamation(int nombre_reclamation) {
        this.nombre_reclamation = nombre_reclamation;
    }
  
    
   
    
    
    
}