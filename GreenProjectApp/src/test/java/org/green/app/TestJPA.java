package org.green.app;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.green.app.entities.AssignationsEquipe;
import org.green.app.entities.Equipe;
import org.green.app.entities.FamilleCompetence;
import org.green.app.entities.SessionApp;
import org.green.app.entities.Utilisateur;
import org.green.app.metier.IRespoAppMetier;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {
	ClassPathXmlApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
	}

/*
	@Test
	public void testUtilisateur() {
		try {
			IRespoAppMetier metier = (IRespoAppMetier) context.getBean("metier");
			
			List<Utilisateur> sesap1=metier.listUtilisateur();
			metier.ajouterUtilisateur(new Utilisateur("lawrencekotha@gmail.com", "lkotha" , "KOTHA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("wandrilleokongo@gmail.com", "wokongo" , "OKONGO", "Wandrille", true));
			metier.ajouterUtilisateur(new Utilisateur("sylviekotha@gmail.com", "skotha" , "KOTHA", "Sylvie", true));
			metier.ajouterUtilisateur(new Utilisateur("nathaliekotha@gmail.com", "nathaliiekotha" , "KOTHA", "Nathalie", true));
			metier.ajouterUtilisateur(new Utilisateur("pouponkotha@gmail.com", "lpoupon" , "KOTHA", "Poupon", true));
			metier.ajouterUtilisateur(new Utilisateur("quetteskotha@gmail.com", "Lquettes" , "DIBANDI", "Quettes", true));
			metier.ajouterUtilisateur(new Utilisateur("carlkotha@gmail.com", "carl" , "KOTHA", "Guy", true));
			metier.ajouterUtilisateur(new Utilisateur("nellykotha@gmail.com", "nelly" , "ECKENZENGUE", "Nelly", true));
			metier.ajouterUtilisateur(new Utilisateur("lolitakotha@gmail.com", "lkotha" , "LOLITA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("axiomouele@gmail.com", "axio" , "MOUELE", "Wandrille", true));
			metier.ajouterUtilisateur(new Utilisateur("victoiriapetrova@gmail.com", "victoire" , "ABOUNGONE", "victoire", true));
			metier.ajouterUtilisateur(new Utilisateur("armelmbamve@gmail.com", "mba" , "MBA MVE", "Armel", true));
			metier.ajouterUtilisateur(new Utilisateur("mickelangedibandi@gmail.com", "mickey" , "DIBANDI", "Mickealnge", true));
			metier.ajouterUtilisateur(new Utilisateur("yoanneboussougou@gmail.com", "yoanne" , "BITOGHO", "Jean", true));
			metier.ajouterUtilisateur(new Utilisateur("tataauguqtine@gmail.com", "lkotha" , "KOTHA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("yoyarastapopuloa@gmail.com", "wokongo" , "OKONGO", "Wandrille", true));
			metier.ajouterUtilisateur(new Utilisateur("bivigoujosline@gmail.com", "lkotha" , "KOTHA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("anabellekotha@gmail.com", "wokongo" , "OKONGO", "Wandrille", true));
			metier.ajouterUtilisateur(new Utilisateur("kothamarielouise@gmail.com", "lkotha" , "KOTHA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("jeanhervekotha@gmail.com", "wokongo" , "OKONGO", "Wandrille", true));
			metier.ajouterUtilisateur(new Utilisateur("lolitakotha@gmail.com", "lkotha" , "KOTHA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("lagrangeaxel@gmail.com", "okongo" , "OKONGO", "Wandrille", true));
			metier.ajouterUtilisateur(new Utilisateur("capucinekotha@gmail.com", "lkotha" , "KOTHA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("yassoufouuu@gmail.com", "wokongo" , "OKONGO", "Wandrille", true));
			metier.ajouterUtilisateur(new Utilisateur("zeynabello@gmail.com", "lkotha" , "KOTHA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("karimlebig@gmail.com", "wokongo" , "OKONGO", "Wandrille", true));
			metier.ajouterUtilisateur(new Utilisateur("bigwazmougou@gmail.com", "lkotha" , "KOTHA", "Lawrence", true));
			metier.ajouterUtilisateur(new Utilisateur("augistinemandop@gmail.com", "wokongo" , "OKONGO", "Wandrille", true));
			
			List<Utilisateur> sesap2=metier.listUtilisateur();
			
			assertTrue(sesap1.size()+28==sesap2.size());
		}
		catch(Exception e){
			assertTrue(e.getMessage(),false);
		}
	}

	@Test
	public void testSession() {
		try {
			IRespoAppMetier metier = (IRespoAppMetier) context.getBean("metier");
			List<SessionApp> sep1=metier.listSassionApp();

			Utilisateur u [] = new Utilisateur [29];
			for(int i=1;i< 29;i++){
				u[i] = metier.getUtilisateur((long) i);
				if(i%2==0){
					metier.ajouterSessionApp(new SessionApp("APPInfosemestre1", "Description app info 2016", u[i]), (long)i);
				}
				else{
					metier.ajouterSessionApp(new SessionApp("APPElectronique1", "Description app info 2016", u[i]), (long)i);
				}
			}
			
			List<SessionApp> sep2=metier.listSassionApp();
			
			assertTrue(sep1.size()+28==sep2.size());
		}
		catch(Exception e){
			assertTrue(e.getMessage(),false);
		}
	}

	@Test
	public void testEquipe() {
		try {
			IRespoAppMetier metier = (IRespoAppMetier) context.getBean("metier");
			
			List<Equipe> equ1=metier.listEquipe();
			//Utilisateur u = new Utilisateur("sylviekotha@gmail.com", "skotha" , "KOTHA", "Sylvie", "etudiantesISEP");
			//metier.ajouterUtilisateur(u);
			SessionApp v [] = new SessionApp [29];
			for(int i=1;i< 29;i++){
				v[i] = metier.getSessionApp((long) i);
				if(i%7==6){
					metier.ajouterEquipe(new Equipe("GoupeA1", v[i]), (long)i);
				}
				else if(i%7==5){
					metier.ajouterEquipe(new Equipe("GoupeA2", v[i]), (long)i);
				}
				else if(i%7==4){
					metier.ajouterEquipe(new Equipe("GoupeA3", v[i]), (long)i);
				}
				else if(i%7==3){
					metier.ajouterEquipe(new Equipe("GoupeA4", v[i]), (long)i);
				}
				else if(i%7==2){
					metier.ajouterEquipe(new Equipe("GoupeA5", v[i]), (long)i);
				}
				else if(i%7==1){
					metier.ajouterEquipe(new Equipe("GoupeA6", v[i]), (long)i);
				}
				else if(i%7==0){
					metier.ajouterEquipe(new Equipe("GoupeA7", v[i]), (long)i);
				}	
			}
			
			List<Equipe> equ2=metier.listEquipe();
			assertTrue(equ1.size()+28==equ2.size());
		}
		catch(Exception e){
			assertTrue(e.getMessage(),false);
		}
	}

	@Test
	public void testAssignerEquipe() {
		try {
			IRespoAppMetier metier = (IRespoAppMetier) context.getBean("metier");
			
			List<AssignationsEquipe> ae1=metier.listAssignEquipe();
			
			
			Equipe e [] = new Equipe [8];
			Utilisateur u [] = new Utilisateur [29];
			//Equipe e = metier.getEquipe((long) 5);
			
			//Utilisateur u = metier.getUtilisateur((long) 8);
			//Utilisateur v = metier.getUtilisateur((long) 7);

			for(int i=1;i< 5;i++){
				u[i] = metier.getUtilisateur((long) i);
				e[1] = metier.getEquipe((long) 1);
				metier.ajouterAssignEquipe(new AssignationsEquipe(u[i],e[1]), (long)i, 1L);	
			}
			for(int i=5;i< 9;i++){
				u[i] = metier.getUtilisateur((long) i);
				e[2] = metier.getEquipe((long) 2);
				metier.ajouterAssignEquipe(new AssignationsEquipe(u[i],e[2]), (long)i, 2L);
			}
			for(int i=9;i< 13;i++){
				u[i] = metier.getUtilisateur((long) i);
				e[3] = metier.getEquipe((long) 3);
				metier.ajouterAssignEquipe(new AssignationsEquipe(u[i],e[3]), (long)i, 3L);
			}
			for(int i=13;i< 17;i++){
				u[i] = metier.getUtilisateur((long) i);
				e[4] = metier.getEquipe((long) 4);
				metier.ajouterAssignEquipe(new AssignationsEquipe(u[i],e[4]), (long)i, 4L);
			}
			for(int i=17;i< 21;i++){
				u[i] = metier.getUtilisateur((long) i);
				e[5] = metier.getEquipe((long) 5);
				metier.ajouterAssignEquipe(new AssignationsEquipe(u[i],e[5]) , (long)i, 5L);	
			}
			for(int i=21;i< 25;i++){
				u[i] = metier.getUtilisateur((long) i);
				e[6] = metier.getEquipe((long) 6);
				metier.ajouterAssignEquipe(new AssignationsEquipe(u[i],e[6]), (long)i, 6L);
			}
			for(int i=25;i< 29;i++){
				u[i] = metier.getUtilisateur((long) i);
				e[7] = metier.getEquipe((long) 7);
				metier.ajouterAssignEquipe(new AssignationsEquipe(u[i],e[7]), (long)i, 7L);
			}
			List<AssignationsEquipe> ae2=metier.listAssignEquipe();
			assertTrue(ae1.size()+28==ae2.size());
		}
		catch(Exception e){
			assertTrue(e.getMessage(),false);
		}
	}
*/
	
	
}
