package org.green.app.metier;

import java.util.List;

import org.green.app.entities.AssignationsEquipe;
import org.green.app.entities.Competence;
import org.green.app.entities.Equipe;
import org.green.app.entities.FamilleCompetence;
import org.green.app.entities.Note;
import org.green.app.entities.Utilisateur;

public interface IEtudiantMetier {
	
	public List<Competence> listComptence();
	public List<Competence> listCompetenceParMotCle(String mc);
	public List<Competence> listCompetenceParFamComp(Long idFamComp);	
	public Competence getCompetence(Long idCompetence);
	
	public Utilisateur getUtilisateur(Long idUtilisateur);
	
	
	public List<FamilleCompetence> listFamComp();
	public FamilleCompetence getFamComp(Long idFamComp);
	
	public List<Note> listNote();
	
	/*LISTE DES NOTES PAR UTILISATEUR DONT ON CONNAIT L'ID**/	
	public List<Note> listNotesParUtilisateur(Long id);
	
	public Note getNote(Long idNote);
	
	public List<AssignationsEquipe> listAssignEquipe();
	public AssignationsEquipe getAssignEquipe(Long idAssignationsEquipe);
	
	

}
