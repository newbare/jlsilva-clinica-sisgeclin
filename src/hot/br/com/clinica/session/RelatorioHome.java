package br.com.clinica.session;

import java.util.ArrayList;
import java.util.List;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import br.com.clinica.entity.Animal;
import br.com.clinica.entity.Ficha;

@Name("relatorioHome")
public class RelatorioHome extends EntityHome<Animal> {
	public void setAnimalCodanimal(Integer id) {
		setId(id);
	}

	public Integer getAnimalCodanimal() {
		return (Integer) getId();
	}
	
	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}
	
	public void wire() {}
	
	public boolean isWired() {
		return true;
	}
	
	@Override
	protected Animal createInstance() {
		Animal animal = new Animal();
		return animal;
	}

	public Animal getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}
	
	public List<Ficha> getFichas() {
		return getInstance() == null ? null : new ArrayList<Ficha>(
				getInstance().getFichas());
	}
}
