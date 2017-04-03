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
@Table(name="t_cimr")
public class Cimr implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="taux")
	private double taux;
	
	@OneToMany(mappedBy="cimr")
	private Collection<Profession> professions;

	public Cimr() {
		super();
	}

	public Cimr(double taux) {
		super();
		this.taux = taux;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public Collection<Profession> getProfessions() {
		return professions;
	}

	public void setProfessions(Collection<Profession> professions) {
		this.professions = professions;
	}
	
}