package br.com.clinica.session;

import br.com.clinica.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("racaHome")
public class RacaHome extends EntityHome<Raca> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3661884414256407506L;
	@In(create = true)
	EspeciesHome especiesHome;

	public void setRacaCodraca(Integer id) {
		setId(id);
	}

	public Integer getRacaCodraca() {
		return (Integer) getId();
	}

	@Override
	protected Raca createInstance() {
		Raca raca = new Raca();
		return raca;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Especies especies = especiesHome.getDefinedInstance();
		if (especies != null) {
			getInstance().setEspecies(especies);
		}
	}

	public boolean isWired() {
		if (getInstance().getEspecies() == null)
			return false;
		return true;
	}

	public Raca getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Animal> getAnimals() {
		return getInstance() == null ? null : new ArrayList<Animal>(
				getInstance().getAnimals());
	}

	

}
