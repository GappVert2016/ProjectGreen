package org.green.app.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Equipe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEquipe;
	@NotEmpty
	private String nomEquipe;
	@ManyToOne
	@JoinColumn(name="idApp")
	private SessionApp sessionApp;
	@OneToMany(mappedBy="equipe", fetch=FetchType.LAZY)
	private Collection<AssignationsEquipe> assignEquipes;
	@OneToMany(mappedBy="equipe", fetch=FetchType.LAZY)
	private Collection<Note> notes;

	
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Equipe(String nomEquipe, SessionApp sessionApp) {
		super();
		this.nomEquipe = nomEquipe;
		this.sessionApp = sessionApp;
	}
	public Long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public SessionApp getSessionApp() {
		return sessionApp;
	}
	public void setSessionApp(SessionApp sessionApp) {
		this.sessionApp = sessionApp;
	}
	public Collection<AssignationsEquipe> getAssignEquipes() {
		return assignEquipes;
	}
	public void setAssignEquipes(Collection<AssignationsEquipe> assignEquipes) {
		this.assignEquipes = assignEquipes;
	}
	public Collection<Note> getNotes() {
		return notes;
	}
	public void setNotes(Collection<Note> notes) {
		this.notes = notes;
	}
	
	

}
