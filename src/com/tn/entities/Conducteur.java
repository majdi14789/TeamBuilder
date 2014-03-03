package com.tn.entities;

import java.util.ArrayList;

public class Conducteur {
	private int id_conducteur;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String mot_de_passe;
	private String adresse;
	private Integer note;
	public ArrayList<Trajet> trajet2 = new ArrayList<Trajet>();
	public Voiture voiture;

    public int getId_conducteur() {
        return id_conducteur;
    }

    public void setId_conducteur(int id_conducteur) {
        this.id_conducteur = id_conducteur;
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

    public ArrayList<Trajet> getTrajet2() {
        return trajet2;
    }

    public void setTrajet2(ArrayList<Trajet> trajet2) {
        this.trajet2 = trajet2;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
        
}