package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRESTATIONS", schema = "gestion_salon_coiffure_db")
public class Prestation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestation;
	private String nom;
	
	@ManyToOne
	private Reservation reservation;

	public Prestation() {
		
	}
	public Prestation(String nom, Reservation reservation) {
		this.nom = nom;
		this.reservation = reservation;
	}
	public Long getIdPrestation() {
		return idPrestation;
	}
	public void setIdPrestation(Long idPrestation) {
		this.idPrestation = idPrestation;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	@Override
	public String toString() {
		return "Prestation [idPrestation=" + idPrestation + ", nom=" + nom + ", reservation=" + reservation + "]";
	}
	
	

}
