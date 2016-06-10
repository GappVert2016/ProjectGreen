package org.green.app.controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.green.app.entities.Competence;
import org.green.app.entities.Equipe;
import org.green.app.entities.Note;
import org.green.app.entities.Utilisateur;
import org.green.app.metier.ITuteurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/tutorApp")
public class TutorAppController {
		@Autowired
		private ITuteurMetier metier;
		
		@RequestMapping(value="/selectToNote")
		public String index(Model model){

			
			System.out.println("sdffsd");
			
			model.addAttribute("listAssigneEquipes", metier.listAssignEquipe());
			model.addAttribute("listEquipes", metier.listEquipe());
			
			ArrayList<List<Utilisateur>> list = new ArrayList<List<Utilisateur>>();
			int nb = metier.nombreEquipe();
			for(int i=1; i<=nb;i++){
				list.add(metier.listUtilisateurParGroupe((long)i));
			}
	
			model.addAttribute("listElevesParGroupe", list);
			
			return "SelectToNote";
			
		}
		
		@RequestMapping(value = "/grilleNotes", method = RequestMethod.GET)
		public String grilleNote(Model model, @ModelAttribute("idUtilisateur") Long idUtilisateur
				,@ModelAttribute("idUtilisateur") Long idEquipe){
					
			
			Utilisateur u = metier.getUtilisateur(idUtilisateur);
			model.addAttribute("utilisateur",u);
			System.out.println(u.getNomUtilisateur());
		//	model.addAttribute("listCompetence", metier.listCompetenceParFamCompParEtudiant((long) 1, (long) 1));
			model.addAttribute("listCompetence", metier.listNotesParUtilisateur((long) 1));
			ArrayList<List<Note>> list = new ArrayList<List<Note>>();
			int nb = metier.nombreFamilleComp();
			System.out.println(nb);
			for(int i=1; i<=nb;i++){
				list.add(metier.listNotesParUtilisateurParFamComp(idUtilisateur, (long)i));				
			}
			model.addAttribute("listCompetenceParFam", list);
			/*
			model.addAttribute("listCompetenceParFam", metier.listNotesParUtilisateurParFamComp((long) 1, (long) 1));
			model.addAttribute("listCompetenceParFam1", metier.listNotesParUtilisateurParFamComp((long) 1, (long) 2));
			model.addAttribute("listCompetenceParFam2", metier.listNotesParUtilisateurParFamComp((long) 1, (long) 3));
			model.addAttribute("listCompetenceParFam3", metier.listNotesParUtilisateurParFamComp((long) 1, (long) 4));
			model.addAttribute("listCompetenceParFam4", metier.listNotesParUtilisateurParFamComp((long) 1, (long) 5));
			 */
		


			return "GrilleNotes";
		}
			  
		
		@RequestMapping(value="/index")
		public String accueilTuteur(Model model){
			return "AccueilTuteur";	
		}
		
}
