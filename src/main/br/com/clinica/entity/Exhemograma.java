package br.com.clinica.entity;


// Generated 26/03/2011 00:27:00 by Hibernate Tools 3.2.4.GA

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.NotNull;

/**
 * Exhemograma generated by hbm2java
 */
@Entity
@Table(name = "exhemograma", schema = "public")
public class Exhemograma implements java.io.Serializable {

	private int codhemograma;
	private Ficha ficha;
	private Date dtregistro;
	private Float hemacias;
	private Float hemoglobina;
	private Float hematocrito;
	private Float vcm;
	private Float hcm;
	private Float chcm;
	private Float leuctotais;
	private Float metamielocitos;
	private Float bastonetes;
	private Float segmentados;
	private Float eosinofilos;
	private Float basofilos;
	private Float linfocitos;
	private Float monocitos;
	private String obs;
	private Float proteinastotais;
	private Float plaquetas;

	public Exhemograma() {
	}

	public Exhemograma(int codhemograma, Ficha ficha) {
		this.codhemograma = codhemograma;
		this.ficha = ficha;
	}

	public Exhemograma(int codhemograma, Ficha ficha, Date dtregistro,
			Float hemacias, Float hemoglobina, Float hematocrito, Float vcm,
			Float hcm, Float chcm, Float leuctotais, Float metamielocitos,
			Float bastonetes, Float segmentados, Float eosinofilos,
			Float basofilos, Float linfocitos, Float monocitos, String obs,
			Float proteinastotais, Float plaquetas) {
		this.codhemograma = codhemograma;
		this.ficha = ficha;
		this.dtregistro = dtregistro;
		this.hemacias = hemacias;
		this.hemoglobina = hemoglobina;
		this.hematocrito = hematocrito;
		this.vcm = vcm;
		this.hcm = hcm;
		this.chcm = chcm;
		this.leuctotais = leuctotais;
		this.metamielocitos = metamielocitos;
		this.bastonetes = bastonetes;
		this.segmentados = segmentados;
		this.eosinofilos = eosinofilos;
		this.basofilos = basofilos;
		this.linfocitos = linfocitos;
		this.monocitos = monocitos;
		this.obs = obs;
		this.proteinastotais = proteinastotais;
		this.plaquetas = plaquetas;
	}
@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_hemo")
	@SequenceGenerator( name = "id_hemo", sequenceName = "id_hemo")
	@Column(name = "codhemograma", unique = true, nullable = false)
	public int getCodhemograma() {
		return this.codhemograma;
	}
	public void setCodhemograma(int codhemograma) {
		this.codhemograma = codhemograma;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codficha", nullable = false)
	@NotNull
	public Ficha getFicha() {
		return this.ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dtregistro", length = 13)
	public Date getDtregistro() {
		return this.dtregistro;
	}

	public void setDtregistro(Date dtregistro) {
		this.dtregistro = dtregistro;
	}

	@Column(name = "hemacias", precision = 8, scale = 8)
	public Float getHemacias() {
		return this.hemacias;
	}

	public void setHemacias(Float hemacias) {
		this.hemacias = hemacias;
	}

	@Column(name = "hemoglobina", precision = 8, scale = 8)
	public Float getHemoglobina() {
		return this.hemoglobina;
	}

	public void setHemoglobina(Float hemoglobina) {
		this.hemoglobina = hemoglobina;
	}

	@Column(name = "hematocrito", precision = 8, scale = 8)
	public Float getHematocrito() {
		return this.hematocrito;
	}

	public void setHematocrito(Float hematocrito) {
		this.hematocrito = hematocrito;
	}

	@Column(name = "vcm", precision = 8, scale = 8)
	public Float getVcm() {
		return this.vcm;
	}

	public void setVcm(Float vcm) {
		this.vcm = vcm;
	}

	@Column(name = "hcm", precision = 8, scale = 8)
	public Float getHcm() {
		return this.hcm;
	}

	public void setHcm(Float hcm) {
		this.hcm = hcm;
	}

	@Column(name = "chcm", precision = 8, scale = 8)
	public Float getChcm() {
		return this.chcm;
	}

	public void setChcm(Float chcm) {
		this.chcm = chcm;
	}

	@Column(name = "leuctotais", precision = 8, scale = 8)
	public Float getLeuctotais() {
		return this.leuctotais;
	}

	public void setLeuctotais(Float leuctotais) {
		this.leuctotais = leuctotais;
	}

	@Column(name = "metamielocitos", precision = 8, scale = 8)
	public Float getMetamielocitos() {
		return this.metamielocitos;
	}

	public void setMetamielocitos(Float metamielocitos) {
		this.metamielocitos = metamielocitos;
	}

	@Column(name = "bastonetes", precision = 8, scale = 8)
	public Float getBastonetes() {
		return this.bastonetes;
	}

	public void setBastonetes(Float bastonetes) {
		this.bastonetes = bastonetes;
	}

	@Column(name = "segmentados", precision = 8, scale = 8)
	public Float getSegmentados() {
		return this.segmentados;
	}

	public void setSegmentados(Float segmentados) {
		this.segmentados = segmentados;
	}

	@Column(name = "eosinofilos", precision = 8, scale = 8)
	public Float getEosinofilos() {
		return this.eosinofilos;
	}

	public void setEosinofilos(Float eosinofilos) {
		this.eosinofilos = eosinofilos;
	}

	@Column(name = "basofilos", precision = 8, scale = 8)
	public Float getBasofilos() {
		return this.basofilos;
	}

	public void setBasofilos(Float basofilos) {
		this.basofilos = basofilos;
	}

	@Column(name = "linfocitos", precision = 8, scale = 8)
	public Float getLinfocitos() {
		return this.linfocitos;
	}

	public void setLinfocitos(Float linfocitos) {
		this.linfocitos = linfocitos;
	}

	@Column(name = "monocitos", precision = 8, scale = 8)
	public Float getMonocitos() {
		return this.monocitos;
	}

	public void setMonocitos(Float monocitos) {
		this.monocitos = monocitos;
	}

	@Column(name = "obs")
	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Column(name = "proteinastotais", precision = 8, scale = 8)
	public Float getProteinastotais() {
		return this.proteinastotais;
	}

	public void setProteinastotais(Float proteinastotais) {
		this.proteinastotais = proteinastotais;
	}

	@Column(name = "plaquetas", precision = 8, scale = 8)
	public Float getPlaquetas() {
		return this.plaquetas;
	}

	public void setPlaquetas(Float plaquetas) {
		this.plaquetas = plaquetas;
	}

}
