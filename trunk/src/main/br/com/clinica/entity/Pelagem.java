package br.com.clinica.entity;

// Generated 26/03/2011 00:27:00 by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.Length;

/**
 * Pelagem generated by hbm2java
 */
@Entity
@Table(name = "pelagem", schema = "public")
public class Pelagem implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4013893076099038582L;
	private int codpelagem;
	private String pelagem;
	private Set<Animal> animals = new HashSet<Animal>(0);

	public Pelagem() {
	}

	public Pelagem(int codpelagem) {
		this.codpelagem = codpelagem;
	}

	public Pelagem(int codpelagem, String pelagem, Set<Animal> animals) {
		this.codpelagem = codpelagem;
		this.pelagem = pelagem;
		this.animals = animals;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_pelo")
	@SequenceGenerator( name = "id_pelo", sequenceName = "id_pelo")
	@Column(name = "codpelagem", unique = true, nullable = false)
	public int getCodpelagem() {
		return this.codpelagem;
	}

	public void setCodpelagem(int codpelagem) {
		this.codpelagem = codpelagem;
	}

	@Column(name = "pelagem", length = 30)
	@Length(max = 30)
	public String getPelagem() {
		return this.pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pelagem")
	public Set<Animal> getAnimals() {
		return this.animals;
	}

	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}

}
