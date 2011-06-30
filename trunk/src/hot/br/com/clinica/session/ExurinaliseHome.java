package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("exurinaliseHome")
public class ExurinaliseHome extends EntityHome<Exurinalise> {

	@In(create = true)
	FichaHome fichaHome;

	public void setExurinaliseCodurinalise(Integer id) {
		setId(id);
	}

	public Integer getExurinaliseCodurinalise() {
		return (Integer) getId();
	}

	@Override
	protected Exurinalise createInstance() {
		Exurinalise exurinalise = new Exurinalise();
		return exurinalise;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Ficha ficha = fichaHome.getDefinedInstance();
		if (ficha != null) {
			getInstance().setFicha(ficha);
		}
	}

	public boolean isWired() {
		if (getInstance().getFicha() == null)
			return false;
		return true;
	}

	public Exurinalise getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
