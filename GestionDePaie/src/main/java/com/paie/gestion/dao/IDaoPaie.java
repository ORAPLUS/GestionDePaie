package com.paie.gestion.dao;

import java.util.List;

import com.paie.gestion.entities.*;

//Le besoin de client.
public interface IDaoPaie {
	
	// Banque :
	public Banque AjouterBanque(Banque banque);
	public Banque ConsulterBanque(Long idBanque);
	public void SupprimerBanque(Long idBanque);
	public void ModifierBanque(Banque Banque);
	public List<Banque> AfficherListBanques();
	
	//Profession :
	public Profession AjouterProfession(Profession profession,Long idCimr);
	public Profession ConsulterProfession(Long idProfession);
	public void SupprimerProfession(Long idProfession);
	public List<Profession> AfficherListProfessions();
	
	//CIMR :
	public Cimr AjouterCimr(Cimr cimr);
	public Cimr ConsulterCimr(Long idCimr);
	public void SupprimerCimr(Long idCimr);
	public List<Cimr> AfficherListCimrs();
	
	//Utilisateur :
	public Utilisateur AjouterUtilisateur(Utilisateur utilisateur);
	public Utilisateur ConsulterUtilisateur(Long idUtilisateur);
	public List<Utilisateur> AfficherListUtilisateurs();
		
	//Role :
	public Role AjouterRole(Role role,Long idUtilisateur);
	public List<Role> AfficherListRoles();
	
}