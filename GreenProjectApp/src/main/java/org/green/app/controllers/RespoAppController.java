package org.green.app.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.green.app.entities.AssignationsEquipe;
import org.green.app.entities.Competence;
import org.green.app.entities.Equipe;
import org.green.app.entities.FamilleCompetence;
import org.green.app.entities.SessionApp;
import org.green.app.entities.Utilisateur;
import org.green.app.metier.IRespoAppMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
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
=======
	@RequestMapping(value="/index")
	public String index(Model model){
		return "gestionRespo";
		
	}
	
	
	
	@RequestMapping(value="/indexUtilisateur")
	public String gestionRespoUtilisateur(Model model){
		model.addAttribute("utilisateurForm", new Utilisateur());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());	
		return "gestionRespoUtilisateurs";
	}
	
	
	@RequestMapping(value="/saveUtilisateur", method=RequestMethod.POST) 
	public String saveUtilisateur(@Valid Utilisateur u, BindingResult bindingResult, Model model) throws IOException {
>>>>>>> 7afaf68b964825d2d626def5b42c655669cc0c87
		if(bindingResult.hasErrors()){
			model.addAttribute("listUtilisateurs", metier.listUtilisateur());
			return "gestionRespoUtilisateurs";
		}
		if(u.getIdUtilisateur() == null){
			metier.ajouterUtilisateur(u); 
			System.out.println("saveUtilisateur u : " + u.getIdUtilisateur());
			
		}
		else {
			metier.modifierUtilisateur(u);
			System.out.println("saveUtilisateur u1 : " + u.getNomUtilisateur());
			
		}
		System.out.println("saveUtilisateur u1 : " + u.getNomUtilisateur());		
		model.addAttribute("utilisateurForm", new Utilisateur());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());
		//model.addAttribute("sessionapps", metier.listSassionApp());
		return "gestionRespoUtilisateurs";
		
	}
<<<<<<< HEAD
	*/
	/*
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
=======
	
	/*public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
>>>>>>> 7afaf68b964825d2d626def5b42c655669cc0c87
			Exception ex) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception", ex.getMessage());
		mv.setViewName("listUtilisateurs");
		return mv;
	}*/

	/*
	@RequestMapping(value="/suppFam")
	public String supp(Long idFamille, Model model){
		metier.supprimerFamComp(idFamille);
		model.addAttribute("famillecompetence", new FamilleCompetence());
		model.addAttribute("famillecompetences", metier.listFamComp());
=======
	
	@RequestMapping(value="/editUtilisateur")
	public String editUtilisateur(Long idUtilisateur, Model model){
		Utilisateur u = metier.getUtilisateur(idUtilisateur);
		model.addAttribute("utilisateurForm", u);
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());
		return "gestionRespoUtilisateurs";		
	}
	@RequestMapping(value="/suppUtilisateur")
	public String suppUtilisateur(Long idUtilisateur, Model model){
		metier.supprimerUtilisateur(idUtilisateur);
		model.addAttribute("utilisateurForm", new Utilisateur());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());
		return "gestionRespoUtilisateurs";		
	}
		
	
	/* Gestion des �quipes*/
	@RequestMapping(value="/indexEquipe")
	public String gestionRespoEquipe(Model model){
		model.addAttribute("equipeForm", new Equipe());
		model.addAttribute("listEquipes", metier.listEquipe());
		model.addAttribute("sessionapps", metier.listSassionApp());
		return "gestionRespoEquipe";
	}
	
	@RequestMapping(value="/saveEquipe", method=RequestMethod.POST) 
	public String saveEquipe(@Valid Equipe e, /*BindingResult bindingResult,*/ Model model) /*throws IOException*/{
		/*if(bindingResult.hasErrors()){
			model.addAttribute("sessionapps",metier.listSassionApp());
			model.addAttribute("famillecompetences",metier.listFamComp());
			return "famillecompetences";
		}*/
		System.out.println("saveEquipe u : " + e.getNomEquipe());
		if(e.getIdEquipe()==null)
			metier.ajouterEquipe(e, e.getSessionApp().getIdApp());
		else {
			metier.modifierEquipe(e);
		}
		model.addAttribute("equipeForm", new Equipe());
		model.addAttribute("listEquipes", metier.listEquipe());
		model.addAttribute("sessionapps", metier.listSassionApp());
		return "gestionRespoEquipe";
		

	}
	/*
	@RequestMapping(value="/editFam")
	public String edit(Long idFamille, Model model){
		FamilleCompetence fc = metier.getFamComp(idFamille);
		model.addAttribute("famillecompetence", fc);
		model.addAttribute("famillecompetences", metier.listFamComp());
=======
	}
	
	@RequestMapping(value="/editEquipe")
	public String editEquipe(Long idEquipe, Model model){
		Equipe e = metier.getEquipe(idEquipe);
		model.addAttribute("equipeForm", e);
		model.addAttribute("listEquipes", metier.listEquipe());
		model.addAttribute("sessionapps", metier.listSassionApp());
		return "gestionRespoEquipe";		
	}
	
	@RequestMapping(value="/suppEquipe")
	public String suppEquipe(Long idEquipe, Model model){
		metier.supprimerEquipe(idEquipe);
		model.addAttribute("equipeForm", new Equipe());
		model.addAttribute("listEquipes", metier.listEquipe());
		model.addAttribute("sessionapps", metier.listSassionApp());
		return "gestionRespoEquipe";		
	}
	
	
	
	/* Gestion des assignations*/
	@RequestMapping(value="/indexAssign")
	public String gestionRespoAssignEquipe(Model model){
		model.addAttribute("assignEquipeForm", new AssignationsEquipe());
		model.addAttribute("listAssigns", metier.listAssignEquipe());	
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());		
		model.addAttribute("listEquipes", metier.listEquipe());
		return "gestionRespoAssign";
	}
	
	@RequestMapping(value="/saveAssign", method=RequestMethod.POST) 
	public String saveAssign(@Valid AssignationsEquipe ae, /*BindingResult bindingResult,*/ Model model) /*throws IOException*/{
		/*if(bindingResult.hasErrors()){
			model.addAttribute("sessionapps",metier.listSassionApp());
			model.addAttribute("famillecompetences",metier.listFamComp());
			return "famillecompetences";
		}*/
		if(ae.getIdAssignationsEquipe()==null)
			metier.ajouterAssignEquipe(ae, ae.getEquipe().getIdEquipe(), ae.getUtilisateur().getIdUtilisateur());
		else {
			metier.modifierAssignEquipe(ae);
		}
		model.addAttribute("assignEquipeForm", new AssignationsEquipe());
		model.addAttribute("listAssigns", metier.listAssignEquipe());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());		
		model.addAttribute("listEquipes", metier.listEquipe());
		return "gestionRespoAssign";
		
	}
	
	@RequestMapping(value="/editAssign")
	public String editAssign(Long idAssignationsEquipe, Model model){
		AssignationsEquipe ae = metier.getAssignEquipe(idAssignationsEquipe);
		model.addAttribute("assignEquipeForm", ae);
		model.addAttribute("listAssigns", metier.listAssignEquipe());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());		
		model.addAttribute("listEquipes", metier.listEquipe());		
		return "gestionRespoAssign";		
	}
	
	@RequestMapping(value="/suppAssign")
	public String suppAssign(Long idAssignationsEquipe, Model model){
		metier.supprimerAssignEquipe(idAssignationsEquipe);
		model.addAttribute("assignEquipeForm", new AssignationsEquipe());
		model.addAttribute("listAssigns", metier.listAssignEquipe());		
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());		
		model.addAttribute("listEquipes", metier.listEquipe());
		return "gestionRespoAssign";		
	}
	
	/* Gestions de la grille d'App partie familleCompetence*/
	
	@RequestMapping(value="/indexFamComp")
	public String gestionRespoFamComp(Model model){
		/*formulaire famillleCompentence */
		model.addAttribute("familleForm", new FamilleCompetence());
		model.addAttribute("listFamComps", metier.listFamComp());
		model.addAttribute("sessionapps", metier.listSassionApp());
		
		/*formulaire session App*/
		/*model.addAttribute("sessionAppForm", new SessionApp());
>>>>>>> 7afaf68b964825d2d626def5b42c655669cc0c87
		model.addAttribute("sessionapps", metier.listSassionApp());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());*/
		
		/*formulaire competence */
		/*model.addAttribute("competenceForm", new Competence());
		model.addAttribute("listCompetences", metier.listComptence());
		model.addAttribute("listFamComps", metier.listFamComp());*/
				return "gestionRespoFamComp";	

	}
	
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
	
	@RequestMapping(value="/saveFamille", method=RequestMethod.POST) 
	public String saveFamComp(@Valid FamilleCompetence fc, /*BindingResult bindingResult,*/ Model model) /*throws IOException*/{
		/*if(bindingResult.hasErrors()){
			model.addAttribute("sessionapps",metier.listSassionApp());
			model.addAttribute("famillecompetences",metier.listFamComp());
			return "famillecompetences";
		}*/
		if(fc.getIdFamille()==null){
			metier.ajouterFamComp(fc, fc.getSessionApp().getIdApp());
		}
		else metier.modifierFamComp(fc);
		model.addAttribute("familleForm", new FamilleCompetence());
		model.addAttribute("listFamComps", metier.listFamComp());
		model.addAttribute("sessionapps", metier.listSassionApp());
		return "gestionRespoFamComp";
		
	}
	
	@RequestMapping(value="/editFamille")
	public String editFamille(Long idFamille, Model model){
		FamilleCompetence fc = metier.getFamComp(idFamille);
		model.addAttribute("familleForm", fc);
		model.addAttribute("listFamComps", metier.listFamComp());
		model.addAttribute("sessionapps", metier.listSassionApp());
		return "gestionRespoGrille";		
	}
	
	@RequestMapping(value="/suppFamille")
	public String suppFamille(Long idFamille, Model model){
		metier.supprimerFamComp(idFamille);
		model.addAttribute("familleForm", new FamilleCompetence());
		model.addAttribute("listFamComps", metier.listFamComp());
		model.addAttribute("sessionapps", metier.listSassionApp());
		return "gestionRespoFamComp";	
	}
	
	
	/* Gestions de la grille d'App partie Competence*/
	
	@RequestMapping(value="/indexComp")
	public String gestionRespoCompetence(Model model){
		model.addAttribute("competenceForm", new Competence());
		model.addAttribute("listCompetences", metier.listComptence());
		model.addAttribute("listFamComps", metier.listFamComp());
		return "gestionRespoCompetence";
	}
	
	@RequestMapping(value="/saveCompetence", method=RequestMethod.POST) 
	public String saveCompetence(@Valid Competence c, /*BindingResult bindingResult,*/ Model model) /*throws IOException*/{
		/*if(bindingResult.hasErrors()){
			model.addAttribute("sessionapps",metier.listSassionApp());
			model.addAttribute("famillecompetences",metier.listFamComp());
			return "famillecompetences";
		}*/
		if(c.getIdCompetence() == null){
			metier.ajouterCompetence(c, c.getFamilleCompetence().getIdFamille());
		}
		else metier.modifierCompetence(c);
		model.addAttribute("competenceForm", new Competence());
		model.addAttribute("listCompetences", metier.listComptence());
		model.addAttribute("listFamComps", metier.listFamComp());
		return "gestionRespoCompetence";
		
	}
	
	@RequestMapping(value="/editCompetence")
	public String editCompetence(Long idCompetence, Model model){
		Competence c = metier.getCompetence(idCompetence);
		model.addAttribute("competenceForm", c);
		model.addAttribute("listCompetences", metier.listComptence());
		model.addAttribute("listFamComps", metier.listFamComp());
		return "gestionRespoCompetence";		
	}
	
	@RequestMapping(value="/suppCompetence")
	public String suppCompetence(Long idCompetence, Model model){
		metier.supprimerEquipe(idCompetence);
		model.addAttribute("competenceForm", new Competence());
		model.addAttribute("listCompetences", metier.listComptence());
		model.addAttribute("listFamComps", metier.listFamComp());
		return "gestionRespoCompetence";		
	}
	
/* Gestions de la grille d'App partie Session App*/
	
	@RequestMapping(value="/indexSession")
	public String gestionRespoSessionApp(Model model){
		model.addAttribute("sessionAppForm", new SessionApp());
		model.addAttribute("sessionapps", metier.listSassionApp());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());
		return "gestionRespoSession";
	}
	
	@RequestMapping(value="/saveSessionApp", method=RequestMethod.POST) 
	public String saveSessionApp(@Valid SessionApp sa, /*BindingResult bindingResult,*/ Model model) /*throws IOException*/{
		/*if(bindingResult.hasErrors()){
			model.addAttribute("sessionapps",metier.listSassionApp());
			model.addAttribute("famillecompetences",metier.listFamComp());
			return "famillecompetences";
		}*/
		
		if(sa.getIdApp() == null){
			metier.ajouterSessionApp(sa, sa.getUtilisateur().getIdUtilisateur());		
		}
		else metier.modifierSessionApp(sa);
		model.addAttribute("sessionAppForm", new SessionApp());
		model.addAttribute("sessionapps", metier.listSassionApp());	
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());
		return "gestionRespoSession";
		
	}
	
	@RequestMapping(value="/editSessionApp")
	public String editSesionApp(Long idApp, Model model){
		SessionApp sa = metier.getSessionApp(idApp);
		model.addAttribute("sessionAppForm", sa);
		model.addAttribute("sessionapps", metier.listSassionApp());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());
		return "gestionRespoSession";		
	}
	
	@RequestMapping(value="/suppSessionApp")
	public String suppSessionApp(Long idApp, Model model){
		metier.supprimerSessionApp(idApp);
		model.addAttribute("sessionAppForm", new SessionApp());
		model.addAttribute("sessionapps", metier.listSassionApp());
		model.addAttribute("listUtilisateurs", metier.listUtilisateur());
		return "gestionRespoSession";		
	}

}
