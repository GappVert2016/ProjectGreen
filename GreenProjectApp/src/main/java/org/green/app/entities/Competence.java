package org.green.app.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
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
public class Competence implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCompetence;
	@NotEmpty
	private String nomCompetence;
	private String descriptionCompetence;
	private boolean bloqueCompetence;
	private long coefficient;
	@ManyToOne
	@JoinColumn(name="idFamille")
	private FamilleCompetence familleCompetence;
	@OneToMany(mappedBy="comptence", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	//, fetch = FetchType.EAGER, cascade = CascadeType.ALL
	private Collection<Note> notes;
	
	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Competence(String nomCompetence, String descriptionCompetence, boolean bloqueCompetence,
			long coefficient, FamilleCompetence familleCompetence) {
		super();
		this.nomCompetence = nomCompetence;
		this.descriptionCompetence = descriptionCompetence;
		this.bloqueCompetence = bloqueCompetence;
		this.coefficient = coefficient;
		this.familleCompetence = familleCompetence;
	}
	
	public Competence(String nomCompetence, FamilleCompetence familleCompetence) {
		super();
		this.nomCompetence = nomCompetence;
		this.familleCompetence = familleCompetence;
	}
	
	public Long getIdCompetence() {
		return idCompetence;
	}
	public void setIdCompetence(Long idCompetence) {
		this.idCompetence = idCompetence;
	}
	public String getNomCompetence() {
		return nomCompetence;
	}
	public void setNomCompetence(String nomCompetence) {
		this.nomCompetence = nomCompetence;
	}
	public String getDescriptionCompetence() {
		return descriptionCompetence;
	}
	public void setDescriptionCompetence(String descriptionCompetence) {
		this.descriptionCompetence = descriptionCompetence;
	}
	public boolean isBloqueCompetence() {
		return bloqueCompetence;
	}
	public void setBloqueCompetence(boolean bloqueCompetence) {
		this.bloqueCompetence = bloqueCompetence;
	}
	public long getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(long coefficient) {
		this.coefficient = coefficient;
	}
	public FamilleCompetence getFamilleCompetence() {
		return familleCompetence;
	}
	public void setFamilleCompetence(FamilleCompetence familleCompetence) {
		this.familleCompetence = familleCompetence;
	}
	public Collection<Note> getNotes() {
		return notes;
	}
	public void setNotes(Collection<Note> notes) {
		this.notes = notes;
	}
	
	

}
