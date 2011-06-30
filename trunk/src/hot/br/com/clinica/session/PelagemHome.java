package br.com.clinica.session;

import br.com.clinica.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("pelagemHome")
public class PelagemHome extends EntityHome<Pelagem> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5059168088430907980L;

	public void setPelagemCodpelagem(Integer id) {
		setId(id);
	}

	public Integer getPelagemCodpelagem() {
		return (Integer) getId();
	}

	@Override
	protected Pelagem createInstance() {
		Pelagem pelagem = new Pelagem();
		return pelagem;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public Pelagem getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Animal> getAnimals() {
		return getInstance() == null ? null : new ArrayList<Animal>(
				getInstance().getAnimals());
	}

	
}
