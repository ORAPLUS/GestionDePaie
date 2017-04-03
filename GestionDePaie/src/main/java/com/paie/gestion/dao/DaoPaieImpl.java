package com.paie.gestion.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.paie.gestion.dao.IDaoPaie;
import com.paie.gestion.entities.*;

@SuppressWarnings("unchecked")
public class DaoPaieImpl implements IDaoPaie {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Banque AjouterBanque(Banque banque) {
		em.persist(banque);
		return banque;
	}

	@Override
	public Banque ConsulterBanque(Long idBanque) {
		Banque banque = em.find(Banque.class, idBanque);
		if(banque == null) throw new RuntimeException("cette banque est introuvable !!!");
		return banque;
	}

	@Override
	public void SupprimerBanque(Long idBanque) {
		Banque banque = ConsulterBanque(idBanque);
		em.remove(banque);
	}

	
	@Override
	public List<Banque> AfficherListBanques() {
		Query req = em.createQuery("select bqs_ from Banque bqs_");
		return req.getResultList();
	}

	@Override
	public Profession AjouterProfession(Profession profession, Long idCimr) {
		Cimr cimr = ConsulterCimr(idCimr);
		profession.setCimr(cimr);
		cimr.getProfessions().add(profession);
		em.persist(profession);
		return profession;
	}

	@Override
	public Profession ConsulterProfession(Long idProfession) {
		Profession profession = em.find(Profession.class, idProfession);
		if(profession == null) throw new RuntimeException("Cette profession est introuvable !!!");
		return profession;
	}

	@Override
	public void SupprimerProfession(Long idProfession) {
		Profession profession = ConsulterProfession(idProfession);
		em.remove(profession);
	}

	@Override
	public List<Profession> AfficherListProfessions() {
		Query req = em.createQuery("select prof_ from Profession prof_");
		return req.getResultList();
	}

	@Override
	public Cimr AjouterCimr(Cimr cimr) {
		em.persist(cimr);
		return cimr;
	}

	@Override
	public Cimr ConsulterCimr(Long idCimr) {
		Cimr cimr = em.find(Cimr.class, idCimr);
		if(cimr == null) throw new RuntimeException("cette Cimr est introuvable !!!");
		return cimr;
	}

	@Override
	public void SupprimerCimr(Long idCimr) {
		Cimr cimr = ConsulterCimr(idCimr);
		em.remove(cimr);
	}

	@Override
	public List<Cimr> AfficherListCimrs() {
		Query req = em.createQuery("select cmr_ from Cimr cmr_");
		return req.getResultList();
	}

	@Override
	public Utilisateur AjouterUtilisateur(Utilisateur utilisateur) {
		em.persist(utilisateur);
		return utilisateur;
	}

	@Override
	public Utilisateur ConsulterUtilisateur(Long idUtilisateur) {
		Utilisateur utilisateur = em.find(Utilisateur.class, idUtilisateur);
		if(utilisateur == null) throw new RuntimeException("Cette Utilisateur est introuvable !!!");
		return utilisateur;
	}
	
	@Override
	public List<Utilisateur> AfficherListUtilisateurs() {
		Query req = em.createQuery("select user_ from Utilisateur user_");
		return req.getResultList();
	}

	@Override
	public Role AjouterRole(Role role, Long idUtilisateur) {
		Utilisateur utilisateur = ConsulterUtilisateur(idUtilisateur);
		role.setUtilisateur(utilisateur);
		utilisateur.getRoles().add(role);
		em.persist(role);
		return role;
	}

	@Override
	public List<Role> AfficherListRoles() {
		Query req = em.createQuery("select role_ from Role role_");
		return req.getResultList();
	}

	

}