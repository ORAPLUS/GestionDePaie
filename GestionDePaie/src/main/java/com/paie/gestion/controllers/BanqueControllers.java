package com.paie.gestion.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.paie.gestion.entities.Banque;
import com.paie.gestion.metier.IMetierPaie;

@Controller
@RequestMapping(value = "/GestionBanques")
public class BanqueControllers {

	@Autowired
	private IMetierPaie metier;

	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("banque", new Banque());
		model.addAttribute("listeDesBanques", metier.AfficherListBanques());
		return "banques";
	}

	@RequestMapping(value = "/SupprimerBanque")
	public String delete(@RequestParam(value = "id") Long idBanque, Model model) {
		metier.SupprimerBanque(idBanque);
		model.addAttribute("banque", new Banque());
		model.addAttribute("listeDesBanques", metier.AfficherListBanques());
		return "banques";
	}

	@RequestMapping(value = "/AjouterBanque")
	public String add(@Valid Banque bq, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("listeDesBanques", metier.AfficherListBanques());
			return "banques";
		}
		if (bq.getId() == null) {
			metier.AjouterBanque(bq);
		} else {
			metier.ModifierBanque(bq);
		}
		model.addAttribute("banque", new Banque());
		model.addAttribute("listeDesBanques", metier.AfficherListBanques());
		return "banques";
	}

	@RequestMapping(value = "/EditerBanque")
	public String edit(@RequestParam(value = "id") Long idBanque, Model model) {
		Banque bq = metier.ConsulterBanque(idBanque);
		model.addAttribute("banque", bq);
		model.addAttribute("listeDesBanques", metier.AfficherListBanques());
		return "banques";
	}
}
