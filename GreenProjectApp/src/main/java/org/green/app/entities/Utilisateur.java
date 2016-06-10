package org.green.app.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String email;
	@NotEmpty
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String password;
	private boolean actived;
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.LAZY)
	private Collection<Role> roles;
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.LAZY)
	private Collection<SessionApp> sessionApps;
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.LAZY)
	private Collection<AssignationsEquipe> assignEquipes;
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.LAZY)
	private Collection<Note> notes;

	
	public Utilisateur() {
		
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(String email, String nomUtilisateur,String prenomUtilisateur, String password, boolean actived) {

		this.email = email;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		
		this.password = password;
		this.actived = actived;
		
	}
	public Utilisateur(String email, String nomUtilisateur,String prenomUtilisateur, String password) {

		this.email = email;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		
		this.password = password;
		
	}
	public Utilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
		
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public  String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public Collection<SessionApp> getSessionApps() {
		return sessionApps;
	}

	public void setSessionApps(Collection<SessionApp> sessionApps) {
		this.sessionApps = sessionApps;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	
		
}
