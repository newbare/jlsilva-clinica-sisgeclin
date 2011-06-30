package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("exbiosanguineaHome")
public class ExbiosanguineaHome extends EntityHome<Exbiosanguinea> {

	@In(create = true)
	FichaHome fichaHome;

	public void setExbiosanguineaCodbiosanguinea(Integer id) {
		setId(id);
	}

	public Integer getExbiosanguineaCodbiosanguinea() {
		return (Integer) getId();
	}

	@Override
	protected Exbiosanguinea createInstance() {
		Exbiosanguinea exbiosanguinea = new Exbiosanguinea();
		return exbiosanguinea;
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

	public Exbiosanguinea getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
