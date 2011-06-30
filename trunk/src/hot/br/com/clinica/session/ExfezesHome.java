package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("exfezesHome")
public class ExfezesHome extends EntityHome<Exfezes> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4965515052822416698L;
	@In(create = true)
	FichaHome fichaHome;

	public void setExfezesCodexfezes(Integer id) {
		setId(id);
	}

	public Integer getExfezesCodexfezes() {
		return (Integer) getId();
	}

	@Override
	protected Exfezes createInstance() {
		Exfezes exfezes = new Exfezes();
		return exfezes;
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

	public Exfezes getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
