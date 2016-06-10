package org.green.app.metier;

import java.util.ArrayList;
import java.util.List;

import org.green.app.entities.AssignationsEquipe;
import org.green.app.entities.Competence;
import org.green.app.entities.Equipe;
import org.green.app.entities.Note;
import org.green.app.entities.Utilisateur;

public interface ITuteurMetier extends IEtudiantMetier {
	
	public List<Utilisateur> listUtilisateur();
	public List<Utilisateur> utilisateurParMotCle(String mc);	
	public Utilisateur getUtilisateur(Long idUtilisateur);
	
	public Long ajouterNote(Note n);
	public void supprimerNote(Long idNt);
	public void modifierNote(Note n);


	/*** LISTES DES EQUIPES ACCESIBLE PAR LE TUTEUR ***/
	public List<Equipe> listEquipe();
	
	/*** LISTES DES UTILISATEURS PAR GROUPE ACCESIBLE PAR LE TUTEUR ***/
	public List<Utilisateur> listUtilisateurParGroupe(Long identifiant);
	
	/*** NOMBRE EQUIPE ***/
	public int  nombreEquipe();
	/***NOMBRE FAMILLE COMPETENCE**/
	public int nombreFamilleComp();
	
	/** AVOIR UNE EQUIPE PAR ID**/
	public Equipe getEquipe(Long idEquipe);
	
	/***LISTER LES COMPETENCES PAR FAMILLE COMPETENCE ET PAR ETUDIANT****/
	public List<Competence> listCompetenceParFamCompParEtudiant(Long idFamComp, Long id);
	
	/**LISTE DES NOTES PAR UTILISATEUR DONT ON CONNAIT L'IDENTIFIANT ET PAR FAMILLE COMPETENCE**/
	public List<Note> listNotesParUtilisateurParFamComp(Long id,Long idFam);

}
