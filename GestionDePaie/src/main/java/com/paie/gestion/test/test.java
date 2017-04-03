package com.paie.gestion.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.paie.gestion.entities.Banque;
import com.paie.gestion.metier.IMetierPaie;

public class test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IMetierPaie metier = (IMetierPaie) ctx.getBean("metier");
		
		metier.AjouterBanque(new Banque("BMCI I", "0522552261", "Abdelmoumen Rue 1 N 5", "0536987455"));
		metier.AjouterBanque(new Banque("BMCI II", "0522552262", "Abdelmoumen Rue 2 N 4", "0536987454"));
		metier.AjouterBanque(new Banque("BMCI III", "0522552263", "Abdelmoumen Rue 3 N 3", "0536987453"));
		metier.AjouterBanque(new Banque("BMCI IIII", "0522552264", "Abdelmoumen Rue 4 N 2", "0536987452"));
		metier.AjouterBanque(new Banque("BMCI IIIII", "0522552265", "Abdelmoumen Rue 5 N 1", "0536987451"));
		
		Banque bq = metier.ConsulterBanque(1L);
		System.out.println(bq.toString());
		
		List<Banque> banquesb = metier.AfficherListBanques();
		for(Banque bqs : banquesb){
			System.out.println(bqs.toString());
		}
		metier.SupprimerBanque(2L);
		
		List<Banque> banquesa = metier.AfficherListBanques();
		
		for(Banque bqs : banquesa){
			System.out.println(bqs.toString());
		}
	}

}
