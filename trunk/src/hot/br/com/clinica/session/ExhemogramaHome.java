package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("exhemogramaHome")
public class ExhemogramaHome extends EntityHome<Exhemograma> {

	@In(create = true)
	FichaHome fichaHome;

	public void setExhemogramaCodhemograma(Integer id) {
		setId(id);
	}

	public Integer getExhemogramaCodhemograma() {
		return (Integer) getId();
	}

	@Override
	protected Exhemograma createInstance() {
		Exhemograma exhemograma = new Exhemograma();
		return exhemograma;
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

	public Exhemograma getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
