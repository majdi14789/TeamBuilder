package com.tn.entities;
import com.tn.entities.Conducteur;

public class Voiture {
	private String immatriculation;
	private String marque;
	private Integer nombre_place;
	public Conducteur id_conducteur;

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Integer getNombre_place() {
        return nombre_place;
    }

    public void setNombre_place(Integer nombre_place) {
        this.nombre_place = nombre_place;
    }

    public Conducteur getId_conducteur() {
        return id_conducteur;
    }

    public void setId_conducteur(Conducteur id_conducteur) {
        this.id_conducteur = id_conducteur;
    }


}