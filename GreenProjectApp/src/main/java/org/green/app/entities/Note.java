package org.green.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Note implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idNote;
	@NotEmpty
	private long valeurNote;
	private String commentaire;
	private Date dateNote;
	@ManyToOne
	@JoinColumn(name="idCompetence")
	private Competence comptence;
	@ManyToOne
	@JoinColumn(name="idEquipe")
	private Equipe equipe;
	@ManyToOne
	@JoinColumn(name="idUtilisateur")
	private Utilisateur utilisateur;
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(long valeurNote, String commentaire, Date dateNote, Competence comptence, Equipe equipe) {
		super();
		this.valeurNote = valeurNote;
		this.commentaire = commentaire;
		this.dateNote = dateNote;
		this.comptence = comptence;
		this.equipe = equipe;
	}
	public long getIdNote() {
		return idNote;
	}
	public void setIdNote(long idNote) {
		this.idNote = idNote;
	}
	public long getValeurNote() {
		return valeurNote;
	}
	public void setValeurNote(long valeurNote) {
		this.valeurNote = valeurNote;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Date getDateNote() {
		return dateNote;
	}
	public void setDateNote(Date dateNote) {
		this.dateNote = dateNote;
	}
	public Competence getComptence() {
		return comptence;
	}
	public void setComptence(Competence comptence) {
		this.comptence = comptence;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	

}
