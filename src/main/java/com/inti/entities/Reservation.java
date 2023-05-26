package com.inti.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATIONS", schema = "gestion_salon_coiffure_db")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Date date;

	@OneToMany(mappedBy = "reservation")
	private List<Salon> salons;

	@ManyToOne
	private Utilisateur utilisateur;

	@OneToMany(mappedBy = "reservation")
	private List<Prestation> prestations;

	public Reservation() {

	}

	public Reservation(Date date, List<Salon> salons, Utilisateur utilisateur, List<Prestation> prestations) {
		this.date = date;
		this.salons = salons;
		this.utilisateur = utilisateur;
		this.prestations = prestations;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Salon> getSalons() {
		return salons;
	}

	public void setSalons(List<Salon> salons) {
		this.salons = salons;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(List<Prestation> prestations) {
		this.prestations = prestations;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", date=" + date + ", salons=" + salons
				+ ", utilisateur=" + utilisateur + ", prestations=" + prestations + "]";
	}
	

}
