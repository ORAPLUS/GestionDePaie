package com.paie.gestion.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_bulletin_paie")
public class BulletinPaie implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="date_saisie")
	private String dateSaisie;
	@Column(name="mms")
	private double mms;
	@Column(name="mt")
	private double mt;
	@Column(name="retenus")
	private double retenus;
	@Column(name="snap")
	private double snap;
	
	@ManyToOne
	@JoinColumn(name="id_employe")
	private Employe employe;

	public BulletinPaie() {
		super();
	}

	public BulletinPaie(String dateSaisie, double mms, double mt, double retenus, double snap) {
		super();
		this.dateSaisie = dateSaisie;
		this.mms = mms;
		this.mt = mt;
		this.retenus = retenus;
		this.snap = snap;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateSaisie() {
		return dateSaisie;
	}

	public void setDateSaisie(String dateSaisie) {
		this.dateSaisie = dateSaisie;
	}

	public double getMms() {
		return mms;
	}

	public void setMms(double mms) {
		this.mms = mms;
	}

	public double getMt() {
		return mt;
	}

	public void setMt(double mt) {
		this.mt = mt;
	}

	public double getRetenus() {
		return retenus;
	}

	public void setRetenus(double retenus) {
		this.retenus = retenus;
	}

	public double getSnap() {
		return snap;
	}

	public void setSnap(double snap) {
		this.snap = snap;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
}