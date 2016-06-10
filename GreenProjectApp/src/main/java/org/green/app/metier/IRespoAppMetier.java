package org.green.app.metier;

import java.util.List;

import org.green.app.entities.AssignationsEquipe;
import org.green.app.entities.Competence;
import org.green.app.entities.Equipe;
import org.green.app.entities.FamilleCompetence;
import org.green.app.entities.Role;
import org.green.app.entities.SessionApp;
import org.green.app.entities.Utilisateur;

public interface IRespoAppMetier extends ITuteurMetier {
	
	public Long ajouterCompetence(Competence c, Long idFamComp);
	public void supprimerComptence(Long idComp);
	public void modifierCompetence(Competence c);
	
	public Long ajouterUtilisateur(Utilisateur u);
	public void supprimerUtilisateur(Long idUtilisa);
	public void modifierUtilisateur(Utilisateur u);

	//public List<Utilisateur> listUtilisateurParGroupe(Long identifiant);
	
	public void attribuerRole(Role r, Long idUtilisateur);
	
	public Long ajouterEquipe(Equipe e);
	//public List<Equipe> listEquipe();
	//public Equipe getEquipe(Long idEquipe);
	public void supprimerEquipe(Long idEquip);
	public void modifierEquipe(Equipe e);
	
	public Long ajouterFamComp(FamilleCompetence fc);
	public void supprimerFamComp(Long idFamC);
	public void modifierFamComp(FamilleCompetence fc);
	
	public void ajouterAssignEquipe(AssignationsEquipe ae);
	public void supprimerAssignEquipe(Long idAssignEqu);
	public void modifierAssignEquipe(AssignationsEquipe ae);
	
	public Long ajouterSessionApp(SessionApp sa);
	public List<SessionApp> listSassionApp();
	public SessionApp getSessionApp(Long idApp);
	public void supprimerSessionApp(Long idSessionA);
	public void modifierSessionApp(SessionApp sa);

}
