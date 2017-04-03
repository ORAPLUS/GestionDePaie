package com.paie.gestion.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_contrats")
public class Contrat implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="date_embauche")
	private Date dateEmbauche;
	@Column(name="mode_reglement")
	private String modeReglement;
	@Column(name="salaire_base")
	private double salaireBase;
	
	@ManyToOne
	@JoinColumn(name="id_type_contrat")
	private TypeContrat typeContrat;
	@ManyToOne
	@JoinColumn(name="id_type_profession")
	private Profession profession;
	@ManyToOne
	@JoinColumn(name="id_employe")
	private Employe employe;
	
	public Contrat() {
		super();
	}
	public Contrat(Date dateEmbauche, String modeReglement, double salaireBase) {
		super();
		this.dateEmbauche = dateEmbauche;
		this.modeReglement = modeReglement;
		this.salaireBase = salaireBase;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public String getModeReglement() {
		return modeReglement;
	}
	public void setModeReglement(String modeReglement) {
		this.modeReglement = modeReglement;
	}
	public double getSalaireBase() {
		return salaireBase;
	}
	public void setSalaireBase(double salaireBase) {
		this.salaireBase = salaireBase;
	}
	public TypeContrat getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(TypeContrat typeContrat) {
		this.typeContrat = typeContrat;
	}
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
}
