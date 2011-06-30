package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("clientestelList")
public class ClientestelList extends EntityQuery<Clientestel> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7800195605047116118L;

	private static final String EJBQL = "select clientestel from Clientestel clientestel";

	private static final String[] RESTRICTIONS = {
			"lower(clientestel.telefone) like lower(concat(#{clientestelList.clientestel.telefone},'%'))",
			"lower(clientestel.tipo) like lower(concat(#{clientestelList.clientestel.tipo},'%'))",
			"lower(clientestel.telefonenum) like lower(concat(#{clientestelList.clientestel.telefonenum},'%'))", };

	private Clientestel clientestel = new Clientestel();

	public ClientestelList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Clientestel getClientestel() {
		return clientestel;
	}
}
