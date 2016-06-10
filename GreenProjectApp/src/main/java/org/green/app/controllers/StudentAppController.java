package org.green.app.controllers;

import org.green.app.entities.Utilisateur;
import org.green.app.metier.IEtudiantMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/studentApp")
public class StudentAppController {
	@Autowired
	private IEtudiantMetier metier;
/*	@RequestMapping(value="/index")
	public String index(Model model){
		model.addAttribute("notes", metier.listNote());

		return "gestionStudent";
		
	}*/
	

	   @RequestMapping(value = "/student", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("utilisateur", "command", new Utilisateur());
	   }
	   
	   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")Utilisateur utilisateur, 
	   ModelMap model) {
	      model.addAttribute("name", Utilisateur.getNomUtilisateur());
	      model.addAttribute("age", Utilisateur.getPrenomUtilisateur());
	      model.addAttribute("id", Utilisateur.getEmail());
	      
	      return "result";
	   }
}
