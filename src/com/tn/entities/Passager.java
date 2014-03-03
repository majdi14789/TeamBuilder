package com.tn.entities;
import java.util.ArrayList;

public class Passager {
	private int id_passager;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String mot_de_passe;
	private String adresse;
	private Integer note;
	public ArrayList<Trajet> id_trajet = new ArrayList<Trajet>();

    public int getId_passager() {
        return id_passager;
    }

    public void setId_passager(int id_passager) {
        this.id_passager = id_passager;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public ArrayList<Trajet> getId_trajet() {
        return id_trajet;
    }

    public void setId_trajet(ArrayList<Trajet> id_trajet) {
        this.id_trajet = id_trajet;
    }
        
}