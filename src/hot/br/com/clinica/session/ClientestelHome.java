package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("clientestelHome")
public class ClientestelHome extends EntityHome<Clientestel> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 278103105143207161L;
	@In(create = true)
	ClientesHome clientesHome;

	public void setClientestelCodtel(Integer id) {
		setId(id);
	}

	public Integer getClientestelCodtel() {
		return (Integer) getId();
	}

	@Override
	protected Clientestel createInstance() {
		Clientestel clientestel = new Clientestel();
		return clientestel;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Clientes clientes = clientesHome.getDefinedInstance();
		if (clientes != null) {
			getInstance().setClientes(clientes);
		}
	}

	public boolean isWired() {
		if (getInstance().getClientes() == null)
			return false;
		return true;
	}

	public Clientestel getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
