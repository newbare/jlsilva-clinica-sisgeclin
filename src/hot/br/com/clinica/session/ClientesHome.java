package br.com.clinica.session;

import br.com.clinica.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("clientesHome")
public class ClientesHome extends EntityHome<Clientes> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9012264285829503324L;

	public void setClientesCodclientes(Integer id) {
		setId(id);
	}

	public Integer getClientesCodclientes() {
		return (Integer) getId();
	}

	@Override
	protected Clientes createInstance() {
		Clientes clientes = new Clientes();
		return clientes;
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

	public Clientes getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Animal> getAnimals() {
		return getInstance() == null ? null : new ArrayList<Animal>(
				getInstance().getAnimals());
	}

	public List<Clientestel> getClientestels() {
		return getInstance() == null ? null : new ArrayList<Clientestel>(
				getInstance().getClientestels());
	}
	
	public boolean getPodeExcluir(){		
		return getClientestels().size()>0 || getAnimals().size()>0;
	}

	

}
