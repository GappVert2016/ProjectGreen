package org.green.app.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.green.app.entities.FamilleCompetence;
import org.green.app.entities.SessionApp;
import org.green.app.metier.IRespoAppMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/respoApp")
public class RespoAppController /*implements HandlerExceptionResolver*/{
	@Autowired
	private IRespoAppMetier metier;
/*
	@RequestMapping(value="/saveFamiComp", method=RequestMethod.POST)
	public String saveFamiComp(@Valid @ModelAttribute("famillecompetence") FamilleCompetence fc, BindingResult bindingResult, Model model){
		if(bindingResult.hasErrors()){
			model.addAttribute("sessionapps", metier.listSassionApp());
			model.addAttribute("famillecompetences", metier.listFamComp());
			return "famillecompetences";
		}		
		metier.ajouterFamComp(fc);
		model.addAttribute("famillecompetence", new FamilleCompetence());
		model.addAttribute("famillecompetences", metier.listFamComp());
		return "famillecompetences";
		
	}
	*/
	/*
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception ex) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception", ex.getMessage());
		mv.setViewName("famillecompetences");
		return mv;
	}*/
	/*
	@RequestMapping(value="/suppFam")
	public String supp(Long idFamille, Model model){
		metier.supprimerFamComp(idFamille);
		model.addAttribute("famillecompetence", new FamilleCompetence());
		model.addAttribute("famillecompetences", metier.listFamComp());
		model.addAttribute("sessionapps", metier.listSassionApp());
		return "famillecompetences";
		
	}*/
	/*
	@RequestMapping(value="/editFam")
	public String edit(Long idFamille, Model model){
		FamilleCompetence fc = metier.getFamComp(idFamille);
		model.addAttribute("famillecompetence", fc);
		model.addAttribute("famillecompetences", metier.listFamComp());
		model.addAttribute("sessionapps", metier.listSassionApp());
		
		return "famillecompetences";
		
	}*/
	
	@RequestMapping(value="/listUtilisateurs")
	public String listUtilisateurs(Model model){
		model.addAttribute("utilisateurs", metier.listUtilisateur());
		model.addAttribute("listEquipes" , metier.listEquipe());
		model.addAttribute("sessionApps", metier.listSassionApp());
	
		model.addAttribute("assignation", metier.listAssignEquipe());
	
		model.addAttribute("sessionApps", metier.listSassionApp());
	
			for(int i=1; i<3;i++){
				model.addAttribute("groupe"+i, metier.getEquipe((long) i));
				model.addAttribute("utilisateurGroupe"+i, metier.listUtilisateurParGroupe((long) i));
				}	

		return "ListUtilisateurs";	
	}
	
	@RequestMapping(value="/listEquipes")
	public String listEquipes(Model model){
		model.addAttribute("listEquipes" , metier.listEquipe());
		return "ListGroupe";	
	}
	
	@RequestMapping(value="/listCompetences")
	public String listCompetences(Model model){
		model.addAttribute("competences" , metier.listComptence());
		model.addAttribute("familleCompetences" , metier.listFamComp());
		model.addAttribute("sessionApps", metier.listSassionApp());
	
		/*	for(int i=1; i<3;i++){
				model.addAttribute("famille"+i, metier.getFamComp((long) i));
				model.addAttribute("familleC"+i, metier.listCompetenceParFamComp((long) i));
			}*/
	
		return "ListCompetences";
	
	}
	
/*	@RequestMapping(value="/suppCom")
	public String suppC(Long idCompetence, Model model){
		metier.supprimerComptence(idCompetence);
	
		for(int i=1; i<3;i++){
			model.addAttribute("famille"+i, metier.getFamComp((long) i));
			model.addAttribute("familleC"+i, metier.listCompetenceParFamComp((long) i));
		}
		return "ListCompetences";
		}
*/	
}
