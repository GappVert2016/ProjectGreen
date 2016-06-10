package org.green.app.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AssignationsEquipe implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAssignationsEquipe;
	@ManyToOne
	@JoinColumn(name="idUtilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="idEquipe")
	private Equipe equipe;
	
	public AssignationsEquipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AssignationsEquipe(Utilisateur utilisateur, Equipe equipe) {
		super();
		this.utilisateur = utilisateur;
		this.equipe = equipe;
	}


	public Long getIdAssignationsEquipe() {
		return idAssignationsEquipe;
	}
	public void setIdAssignationsEquipe(Long idAssignationsEquipe) {
		this.idAssignationsEquipe = idAssignationsEquipe;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	

}
