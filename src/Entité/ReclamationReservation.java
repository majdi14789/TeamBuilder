/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entité;

/**
 *
 * @author Invite
 */
public class ReclamationReservation {

   
    private int  id_conducteur,id_passager,nbrReclamation;
    private Adherent conducteur,passager;
    private String jours;

    public String getJours() {
        return jours;
    }

    public void setJours(String jours) {
        this.jours = jours;
    }

    public Adherent getConducteur() {
        return conducteur;
    }

    public void setConducteur(Adherent conducteur) {
        this.conducteur = conducteur;
    }

    public Adherent getPassager() {
        return passager;
    }

    public void setPassager(Adherent passager) {
        this.passager = passager;
    }

    public Trajet getTrajet() {
        return trajet;
    }

    public void setTrajet(Trajet trajet) {
        this.trajet = trajet;
    }
    private Trajet trajet;
    

    public int getId_conducteur() {
        return id_conducteur;
    }

    public void setId_conducteur(int id_conducteur) {
        this.id_conducteur = id_conducteur;
    }

    public int getId_passager() {
        return id_passager;
    }

    public void setId_passager(int id_passager) {
        this.id_passager = id_passager;
    }

    public int getNbrReclamation() {
        return nbrReclamation;
    }

    public void setNbrReclamation(int nbrReclamation) {
        this.nbrReclamation = nbrReclamation;
    }
    
    
}
