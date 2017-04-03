package com.paie.gestion.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_professions")
public class Profession implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="nom")
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="id_cimr")
	private Cimr cimr;
	@OneToMany(mappedBy="profession")
	private Collection<Contrat> contrats;
	
	public Profession() {
		super();
	}
	public Profession(String nom, Cimr cimr) {
		super();
		this.nom = nom;
		this.cimr = cimr;
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
	public Cimr getCimr() {
		return cimr;
	}
	public void setCimr(Cimr cimr) {
		this.cimr = cimr;
	}
	public Collection<Contrat> getContrats() {
		return contrats;
	}
	public void setContrats(Collection<Contrat> contrats) {
		this.contrats = contrats;
	}
	
}