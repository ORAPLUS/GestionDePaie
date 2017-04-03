package com.paie.gestion.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_societes")
public class Societe implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="adresse")
	private String adresse;
	@Column(name="tel")
	private String tel;
	@Column(name="email")
	private String email;
	
	@OneToMany(mappedBy="societe")
	private Collection<Employe> employees;

	public Societe() {
		super();
	}

	public Societe(String nom, String adresse, String tel, String email) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Employe> getEmployees() {
		return employees;
	}

	public void setEmployees(Collection<Employe> employees) {
		this.employees = employees;
	}
	
	
	

}