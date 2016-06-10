package org.green.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.green.app.entities.AssignationsEquipe;
import org.green.app.entities.Competence;
import org.green.app.entities.Equipe;
import org.green.app.entities.FamilleCompetence;
import org.green.app.entities.Note;
import org.green.app.entities.Role;
import org.green.app.entities.SessionApp;
import org.green.app.entities.Utilisateur;

public class GappDaoImpl implements IGappDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Long ajouterCompetence(Competence c, Long idFamComp) {
		FamilleCompetence fc = getFamComp(idFamComp); 
		c.setFamilleCompetence(fc);
		em.persist(c);
		return c.getIdCompetence();
	}

	@Override
	public List<Competence> listComptence() {
		Query req = em.createQuery("select c from Competence c");
		return req.getResultList();
	}

	@Override
	public List<Competence> listCompetenceParMotCle(String mc) {
		Query req = em.createQuery("select c from Competence c where c.nomCompetence like :x or c.descriptionCompetence like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}
/***LISTE DDES NOTES PAR FAMMILLE DE COMPETENCE***/
	@Override
	public List<Competence> listCompetenceParFamComp(Long idFamComp) {
		Query req = em.createQuery("select c from Competence c where c.fammilleCompetence.idFamille=:x");
		req.setParameter("x", idFamComp);
		return req.getResultList();
	}
/***LISTE DDES NOTES PAR FAMMILLE DE COMPETENCE PAR ETUDIANT***/
	@Override
	public List<Competence> listCompetenceParFamCompParEtudiant(Long idFamComp, Long idUtilisateur) {
		Query req = em.createQuery("select c from Competence c where c.familleCompetence.idFamille=:x "
				+ "AND c.familleCompetence.sessionApp.utilisateur.idUtilisateur=:y");
		req.setParameter("x", idFamComp);
		req.setParameter("y", idUtilisateur);
		return req.getResultList();
	}

	@Override
	public Competence getCompetence(Long idCompetence) {
		return em.find(Competence.class, idCompetence);
	}

	@Override
	public void supprimerComptence(Long idComp) {
		Competence c=getCompetence(idComp);
		em.remove(c);
		
	}

	@Override
	public void modifierCompetence(Competence c) {
		em.merge(c);
		
	}

	@Override
	public Long ajouterUtilisateur(Utilisateur u) {
		em.persist(u);
		return u.getIdUtilisateur();
		
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		Query req = em.createQuery("SELECT u FROM Utilisateur u");
		return req.getResultList();
	}

	@Override
	public List<Utilisateur> utilisateurParMotCle(String mc) {
		Query req = em.createQuery("select u from Utilisateur u where u.nomUtilisateur like :x or u.prenomUtilisateur like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}

	@Override
	public Utilisateur getUtilisateur(Long idUtilisateur) {
		return em.find(Utilisateur.class, idUtilisateur);
	}

	@Override
	public void supprimerUtilisateur(Long idUtilisa) {
		Utilisateur u=getUtilisateur(idUtilisa);
		em.remove(u);
		
	}

	@Override
	public void modifierUtilisateur(Utilisateur u) {
		em.merge(u);
		
	}

	@Override
	public void attribuerRole(Role r,Long idUtilisateur) {
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.getRoles().add(r);
		em.persist(r);
		
	}

	@Override
	public Long ajouterEquipe(Equipe e, Long idApp) {
		SessionApp sa = getSessionApp(idApp);
		e.setSessionApp(sa);
		em.persist(e);
		return e.getIdEquipe();
	}
	
/** 
 * Modification de la requete pour la liste des equipes, Fonction ajouté dans ItutorMetier
 * **/
	
	@Override
	public List<Equipe> listEquipe() {
		Query req = em.createQuery("select distinct e.nomEquipe from Equipe e ");
		return req.getResultList();
	}
	
/****
 *  Fonction pour avoir le nombre d'Equipe 
 *  ***/	
	
/*	public List<Equipe> nombreEquipe() {
		Query req = em.createQuery("select count(distinct e.nomEquipe) from Equipe e ");
		return req.getResultList();
	}*/

	@Override
	public Equipe getEquipe(Long idEquipe) {
		return em.find(Equipe.class, idEquipe);
	}

	@Override
	public void supprimerEquipe(Long idEquipe) {
		Equipe e=getEquipe(idEquipe);
		em.remove(e);
		
	}

	@Override
	public void modifierEquipe(Equipe e) {
		em.merge(e);
		
	}

	@Override
	public Long ajouterFamComp(FamilleCompetence fc, Long idApp) {
		SessionApp sa = getSessionApp(idApp);
		fc.setSessionApp(sa);
		em.persist(fc);
		return fc.getIdFamille();
	}

	@Override
	public List<FamilleCompetence> listFamComp() {
		Query req=em.createQuery("select fc from FamilleCompetence fc");
		return req.getResultList();
	}

	@Override
	public FamilleCompetence getFamComp(Long idFamComp) {
		return em.find(FamilleCompetence.class, idFamComp);
	}

	@Override
	public void supprimerFamComp(Long idFamC) {
		FamilleCompetence fc = em.find(FamilleCompetence.class, idFamC);
		em.remove(fc);
		
	}

	@Override
	public void modifierFamComp(FamilleCompetence fc) {
		em.merge(fc);
		
	}

	@Override
	public Long ajouterNote(Note n, Long idCompetence, Long idEquipe, Long idUtilisateur) {
		Competence c = getCompetence(idCompetence);
		n.setComptence(c);
		Equipe e = getEquipe(idEquipe);
		n.setEquipe(e);
		Utilisateur u = getUtilisateur(idUtilisateur);
		n.setUtilisateur(u);
		em.persist(n);
		return n.getIdNote();
	}

	@Override
	public List<Note> listNote() {
		Query req=em.createQuery("select n from Note n");
		return req.getResultList();
	}

	@Override
	public Note getNote(Long idNote) {
		return em.find(Note.class, idNote);
	}

	@Override
	public void supprimerNote(Long idNt) {
		Note n = em.find(Note.class, idNt);
		em.remove(n);
		
	}

	@Override
	public void modifierNote(Note n) {
		em.merge(n);
		
	}

	@Override
	public void ajouterAssignEquipe(AssignationsEquipe ae, Long idEquipe, Long idUtilisateur) {
		Equipe e = getEquipe(idEquipe);
		ae.setEquipe(e);
		Utilisateur u = getUtilisateur(idUtilisateur);
		ae.setUtilisateur(u);		
		em.persist(ae);
		
	}

	@Override
	public List<AssignationsEquipe> listAssignEquipe() {
		Query req=em.createQuery("select ae from AssignationsEquipe ae");
		return req.getResultList();
	}

	@Override
	public AssignationsEquipe getAssignEquipe(Long idAssignationsEquipe) {
		return em.find(AssignationsEquipe.class, idAssignationsEquipe);
	}

	@Override
	public void supprimerAssignEquipe(Long idAssignEqu) {
		AssignationsEquipe ae = em.find(AssignationsEquipe.class, idAssignEqu);
		em.remove(ae);
		
	}

	@Override
	public void modifierAssignEquipe(AssignationsEquipe ae) {
		em.merge(ae);
		
	}

	@Override
	public Long ajouterSessionApp(SessionApp sa, Long idUtilisateur) {
		Utilisateur u = getUtilisateur(idUtilisateur);
		sa.setUtilisateur(u);
		em.persist(sa);
		return sa.getIdApp();
	}

	@Override
	public List<SessionApp> listSassionApp() {
		Query req=em.createQuery("select sa from SessionApp sa");
		return req.getResultList();
	}

	@Override
	public SessionApp getSessionApp(Long idApp) {
		return em.find(SessionApp.class, idApp);
	}

	@Override
	public void supprimerSessionApp(Long idSessionA) {
		SessionApp sa = em.find(SessionApp.class, idSessionA);
		em.remove(sa);
		
	}

	@Override
	public void modifierSessionApp(SessionApp sa) {
		em.merge(sa);
		
	}
/**LISTE DES UTILISATEUR PAR GROUPE A PARTIR DE L'ID DU GROUPE**/	
	@Override
	public List<Utilisateur> listUtilisateurParGroupe(Long identifiant) {
	Query req = em.createQuery("select ae from AssignationsEquipe ae where ae.equipe.idEquipe=:x");
	req.setParameter("x", identifiant);
	return req.getResultList();
	}
/***COMPTER LE NOMBRE D'EQUIPE**/
	@Override
	public int  nombreEquipe() {
		Query req = em.createQuery("select count(distinct e.nomEquipe) from Equipe e ");
		String nb=req.getSingleResult().toString();
		return Integer.parseInt(nb);
	}
/***COMPTER LE NOMBRE DE FAMILLE DE COMPETENCE**/
	@Override
	public int  nombreFamilleComp() {
		Query req = em.createQuery("select count(distinct f.nomFamille) from FamilleCompetence f ");
		String nb=req.getSingleResult().toString();
		return Integer.parseInt(nb);
	}

	
/**LISTE DES NOTES PAR UTILISATEUR DONT ON CONNAIT L'IDENTIFIANT**/
	@Override
	public List<Note> listNotesParUtilisateur(Long id) {
		Query req = em.createQuery("select n from Note n where n.utilisateur.idUtilisateur=:x");
		req.setParameter("x", id);
		return req.getResultList();
	}
/**LISTE DES NOTES PAR UTILISATEUR DONT ON CONNAIT L'IDENTIFIANT ET PAR FAMILLE COMPETENCE**/
	public List<Note> listNotesParUtilisateurParFamComp(Long id,Long idFam) {
		Query req = em.createQuery("select n from Note n  "
				+ " where n.utilisateur.idUtilisateur=:x AND n.comptence.familleCompetence.idFamille=:y");
		req.setParameter("x", id);
		req.setParameter("y", idFam);
		return req.getResultList();
	}
	

}
