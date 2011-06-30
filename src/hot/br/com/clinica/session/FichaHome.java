package br.com.clinica.session;

import br.com.clinica.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("fichaHome")
public class FichaHome extends EntityHome<Ficha> {

	@In(create = true)
	AnimalHome animalHome;

	public void setFichaCodficha(Integer id) {
		setId(id);
	}

	public Integer getFichaCodficha() {
		return (Integer) getId();
	}

	@Override
	protected Ficha createInstance() {
		Ficha ficha = new Ficha();
		return ficha;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Animal animal = animalHome.getDefinedInstance();
		if (animal != null) {
			getInstance().setAnimal(animal);
		}
	}

	public boolean isWired() {
		if (getInstance().getAnimal() == null)
			return false;
		return true;
	}

	public Ficha getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Internacao> getInternacaos() {
		return getInstance() == null ? null : new ArrayList<Internacao>(
				getInstance().getInternacaos());
	}

	public List<Exbiosanguinea> getExbiosanguineas() {
		return getInstance() == null ? null : new ArrayList<Exbiosanguinea>(
				getInstance().getExbiosanguineas());
	}

	

	public List<Vacinacao> getVacinacaos() {
		return getInstance() == null ? null : new ArrayList<Vacinacao>(
				getInstance().getVacinacaos());
	}

	public List<Exurinalise> getExurinalises() {
		return getInstance() == null ? null : new ArrayList<Exurinalise>(
				getInstance().getExurinalises());
	}

	public List<Exhemograma> getExhemogramas() {
		return getInstance() == null ? null : new ArrayList<Exhemograma>(
				getInstance().getExhemogramas());
	}

	public List<Exfezes> getExfezeses() {
		return getInstance() == null ? null : new ArrayList<Exfezes>(
				getInstance().getExfezeses());
	}

	

	

}
