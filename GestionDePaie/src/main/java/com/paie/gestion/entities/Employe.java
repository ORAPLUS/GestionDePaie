package com.paie.gestion.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
@Table(name="t_employees")
public class Employe implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="matricule")
	private String matricule;
	@Column(name="nom")
	private String nom;
	@Column(name="cin")
	private String cin;
	@Column(name="adresse")
	private String adresse;
	@Column(name="sexe")
	private String sexe;
	@Column(name="date_naissance")
	private Date dateNaissance;
	@Column(name="sf")
	private String sf;
	@Column(name="nbr_enfants")
	private int nbrEnfants;
	@Column(name="tel")
	private String tel;
	@Column(name="email")
	private String email;
	@Column(name="cp")
	private int cp;
	@Column(name="num_cnss")
	private int numCnss;
	@Column(name="num_cimr")
	private int numCimr;
	@Column(name="num_mutuelle")
	private int numMutuelle;
	
	@OneToMany(mappedBy="employe")
	private Collection<Contrat> contrats;
	@OneToMany(mappedBy="employe")
	private Collection<Conge> conges;
	@OneToMany(mappedBy="employe")
	private Collection<BulletinPaie> bulletinPaies;
	@ManyToOne
	@JoinColumn(name="id_banque")
	private Banque banque;
	@ManyToOne
	@JoinColumn(name="id_societe")
	private Societe societe;
	
	
	public Employe() {
		super();
	}
	
	
	public Employe(String matricule, String nom, String cin, String adresse, String sexe, Date dateNaissance, String sf,
			int nbrEnfants, String tel, String email, int cp, int numCnss, int numCimr, int numMutuelle) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.cin = cin;
		this.adresse = adresse;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.sf = sf;
		this.nbrEnfants = nbrEnfants;
		this.tel = tel;
		this.email = email;
		this.cp = cp;
		this.numCnss = numCnss;
		this.numCimr = numCimr;
		this.numMutuelle = numMutuelle;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getSf() {
		return sf;
	}
	public void setSf(String sf) {
		this.sf = sf;
	}
	public int getNbrEnfants() {
		return nbrEnfants;
	}
	public void setNbrEnfants(int nbrEnfants) {
		this.nbrEnfants = nbrEnfants;
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
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public int getNumCnss() {
		return numCnss;
	}
	public void setNumCnss(int numCnss) {
		this.numCnss = numCnss;
	}
	public int getNumCimr() {
		return numCimr;
	}
	public void setNumCimr(int numCimr) {
		this.numCimr = numCimr;
	}
	public int getNumMutuelle() {
		return numMutuelle;
	}
	public void setNumMutuelle(int numMutuelle) {
		this.numMutuelle = numMutuelle;
	}
	public Collection<Contrat> getContrats() {
		return contrats;
	}
	public void setContrats(Collection<Contrat> contrats) {
		this.contrats = contrats;
	}
	public Collection<Conge> getConges() {
		return conges;
	}
	public void setConges(Collection<Conge> conges) {
		this.conges = conges;
	}
	public Collection<BulletinPaie> getBulletinPaies() {
		return bulletinPaies;
	}
	public void setBulletinPaies(Collection<BulletinPaie> bulletinPaies) {
		this.bulletinPaies = bulletinPaies;
	}
	public Banque getBanque() {
		return banque;
	}
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	public Societe getSociete() {
		return societe;
	}
	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	
	
}
