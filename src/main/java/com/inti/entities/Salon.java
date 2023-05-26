package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SALONS", schema = "gestion_salon_coiffure_db")
public class Salon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSalon;
	private String nom;
	private String adresse;
	
	@ManyToOne
	private Reservation reservation;
	public Salon() {
		
	}
	public Salon(String nom, String adresse, Reservation reservation) {
		this.nom = nom;
		this.adresse = adresse;
		this.reservation = reservation;
	}
	public Long getIdSalon() {
		return idSalon;
	}
	public void setIdSalon(Long idSalon) {
		this.idSalon = idSalon;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	@Override
	public String toString() {
		return "Salon [idSalon=" + idSalon + ", nom=" + nom + ", adresse=" + adresse + ", reservation=" + reservation
				+ "]";
	}
	
	
	

}
