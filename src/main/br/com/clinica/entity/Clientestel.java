package br.com.clinica.entity;


// Generated 26/03/2011 00:27:00 by Hibernate Tools 3.2.4.GA

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

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Clientestel generated by hbm2java
 */
@Entity
@Table(name = "clientestel", schema = "public")
public class Clientestel implements java.io.Serializable {

	private int codtel;
	private Clientes clientes;
	private String telefone;
	private String tipo;
	private String telefonenum;

	public Clientestel() {
	}

	public Clientestel(int codtel, Clientes clientes) {
		this.codtel = codtel;
		this.clientes = clientes;
	}

	public Clientestel(int codtel, Clientes clientes, String telefone,
			String tipo, String telefonenum) {
		this.codtel = codtel;
		this.clientes = clientes;
		this.telefone = telefone;
		this.tipo = tipo;
		this.telefonenum = telefonenum;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_tel")
	@SequenceGenerator( name = "id_tel", sequenceName = "id_tel")
	@Column(name = "codtel", unique = true, nullable = false)
	public int getCodtel() {
		return this.codtel;
	}

	public void setCodtel(int codtel) {
		this.codtel = codtel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codclientes", nullable = false)
	@NotNull
	public Clientes getClientes() {
		return this.clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@Column(name = "telefone", length = 15)
	@Length(max = 15)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "tipo", length = 20)
	@Length(max = 20)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "telefonenum", length = 50)
	@Length(max = 50)
	public String getTelefonenum() {
		return this.telefonenum;
	}

	public void setTelefonenum(String telefonenum) {
		this.telefonenum = telefonenum;
	}

}
