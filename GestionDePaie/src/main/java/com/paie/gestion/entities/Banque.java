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
@Table(name="t_banques")
public class Banque implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="tel")
	private String tel;
	@Column(name="adresse")
	private String adresse;
	@Column(name="fax")
	private String fax;
	@OneToMany(mappedBy="banque")
	private Collection<Employe> employees;
	
	public Banque() {
		super();
	}
	public Banque(String nom, String tel, String adresse, String fax) {
		super();
		this.nom = nom;
		this.tel = tel;
		this.adresse = adresse;
		this.fax = fax;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Collection<Employe> getEmployees() {
		return employees;
	}
	public void setEmployees(Collection<Employe> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + ", tel=" + tel + ", adresse=" + adresse + ", fax=" + fax;
	}
	
	

}
