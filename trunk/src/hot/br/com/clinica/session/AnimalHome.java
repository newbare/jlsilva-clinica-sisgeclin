package br.com.clinica.session;

import java.util.ArrayList;
import java.util.List;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import br.com.clinica.entity.Animal;
import br.com.clinica.entity.Clientes;
import br.com.clinica.entity.Ficha;
import br.com.clinica.entity.Pelagem;
import br.com.clinica.entity.Raca;

@Name("animalHome")
public class AnimalHome extends EntityHome<Animal> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6344500651242495241L;
	@In(create = true)
	ClientesHome clientesHome;
	@In(create = true)
	RacaHome racaHome;
	@In(create = true)
	PelagemHome pelagemHome;

	public void setAnimalCodanimal(Integer id) {
		setId(id);
	}

	public Integer getAnimalCodanimal() {
		return (Integer) getId();
	}

	@Override
	protected Animal createInstance() {
		Animal animal = new Animal();
		return animal;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Clientes clientes = clientesHome.getDefinedInstance();
		if (clientes != null) {
			getInstance().setClientes(clientes);
		}
		Raca raca = racaHome.getDefinedInstance();
		if (raca != null) {
			getInstance().setRaca(raca);
		}
		Pelagem pelagem = pelagemHome.getDefinedInstance();
		if (pelagem != null) {
			getInstance().setPelagem(pelagem);
		}
	}

	public boolean isWired() {
		if (getInstance().getClientes() == null)
			return false;
		if (getInstance().getPelagem() == null)
			return false;
		return true;
	}

	public Animal getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Ficha> getFichas() {
		return getInstance() == null ? null : new ArrayList<Ficha>(
				getInstance().getFichas());
	}

	

}
