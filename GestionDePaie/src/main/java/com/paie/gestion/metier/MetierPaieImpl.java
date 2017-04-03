package com.paie.gestion.metier;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.paie.gestion.dao.IDaoPaie;
import com.paie.gestion.entities.Banque;
import com.paie.gestion.entities.Cimr;
import com.paie.gestion.entities.Profession;
import com.paie.gestion.entities.Role;
import com.paie.gestion.entities.Utilisateur;

@Transactional
public class MetierPaieImpl implements IMetierPaie {

	private IDaoPaie dao;
	
	
	public IDaoPaie getDao() {
		return dao;
	}

	public void setDao(IDaoPaie dao) {
		this.dao = dao;
	}

	@Override
	public Banque AjouterBanque(Banque banque) {
		// TODO Auto-generated method stub
		return dao.AjouterBanque(banque);
	}

	@Override
	public Banque ConsulterBanque(Long idBanque) {
		// TODO Auto-generated method stub
		return dao.ConsulterBanque(idBanque);
	}

	@Override
	public void SupprimerBanque(Long idBanque) {
		dao.SupprimerBanque(idBanque);
		
	}

	@Override
	public List<Banque> AfficherListBanques() {
		// TODO Auto-generated method stub
		return dao.AfficherListBanques();
	}

	@Override
	public Profession AjouterProfession(Profession profession, Long idCimr) {
		// TODO Auto-generated method stub
		return dao.AjouterProfession(profession, idCimr);
	}

	@Override
	public Profession ConsulterProfession(Long idProfession) {
		// TODO Auto-generated method stub
		return dao.ConsulterProfession(idProfession);
	}

	@Override
	public void SupprimerProfession(Long idProfession) {
		dao.SupprimerProfession(idProfession);
		
	}

	@Override
	public List<Profession> AfficherListProfessions() {
		// TODO Auto-generated method stub
		return dao.AfficherListProfessions();
	}

	@Override
	public Cimr AjouterCimr(Cimr cimr) {
		// TODO Auto-generated method stub
		return dao.AjouterCimr(cimr);
	}

	@Override
	public Cimr ConsulterCimr(Long idCimr) {
		// TODO Auto-generated method stub
		return dao.ConsulterCimr(idCimr);
	}

	@Override
	public void SupprimerCimr(Long idCimr) {
		dao.SupprimerCimr(idCimr);
		
	}

	@Override
	public List<Cimr> AfficherListCimrs() {
		// TODO Auto-generated method stub
		return dao.AfficherListCimrs();
	}

	@Override
	public Utilisateur AjouterUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return dao.AjouterUtilisateur(utilisateur);
	}

	@Override
	public Utilisateur ConsulterUtilisateur(Long idUtilisateur) {
		// TODO Auto-generated method stub
		return dao.ConsulterUtilisateur(idUtilisateur);
	}

	@Override
	public List<Utilisateur> AfficherListUtilisateurs() {
		// TODO Auto-generated method stub
		return dao.AfficherListUtilisateurs();
	}

	@Override
	public Role AjouterRole(Role role, Long idUtilisateur) {
		// TODO Auto-generated method stub
		return dao.AjouterRole(role, idUtilisateur);
	}

	@Override
	public List<Role> AfficherListRoles() {
		// TODO Auto-generated method stub
		return dao.AfficherListRoles();
	}

}
