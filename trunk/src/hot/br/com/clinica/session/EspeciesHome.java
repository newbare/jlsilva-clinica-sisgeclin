package br.com.clinica.session;

import br.com.clinica.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("especiesHome")
public class EspeciesHome extends EntityHome<Especies> {

	public void setEspeciesCodespecie(Integer id) {
		setId(id);
	}

	public Integer getEspeciesCodespecie() {
		return (Integer) getId();
	}

	@Override
	protected Especies createInstance() {
		Especies especies = new Especies();
		return especies;
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

	public Especies getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Raca> getRacas() {
		return getInstance() == null ? null : new ArrayList<Raca>(getInstance()
				.getRacas());
	}

	

}
