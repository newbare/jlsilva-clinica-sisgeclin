package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("clientesList")
public class ClientesList extends EntityQuery<Clientes> {

	private static final String EJBQL = "select clientes from Clientes clientes";
	/**
	 * FIXME: verificar a necessidade dos filtros!
	 */
	private static final String[] RESTRICTIONS = {
			"lower(clientes.nome) like lower(concat(#{clientesList.clientes.nome},'%'))",
			"lower(clientes.cpf) like lower(concat(#{clientesList.clientes.cpf},'%'))",
			"lower(clientes.rg) like lower(concat(#{clientesList.clientes.rg},'%'))",			
			"lower(clientes.endereco) like lower(concat(#{clientesList.clientes.endereco},'%'))",
			"lower(clientes.profissao) like lower(concat(#{clientesList.clientes.profissao},'%'))",
			"lower(clientes.complemento) like lower(concat(#{clientesList.clientes.complemento},'%'))",
			"lower(clientes.cidade) like lower(concat(#{clientesList.clientes.cidade},'%'))",
			"lower(clientes.estado) like lower(concat(#{clientesList.clientes.estado},'%'))",
			"lower(clientes.cep) like lower(concat(#{clientesList.clientes.cep},'%'))",
			"lower(clientes.email) like lower(concat(#{clientesList.clientes.email},'%'))",
			"lower(clientes.bairro) like lower(concat(#{clientesList.clientes.bairro},'%'))",
			"lower(clientes.contato1) like lower(concat(#{clientesList.clientes.contato1},'%'))",
			"lower(clientes.telefone1) like lower(concat(#{clientesList.clientes.telefone1},'%'))",
			"lower(clientes.contato2) like lower(concat(#{clientesList.clientes.contato2},'%'))",
			"lower(clientes.telefone2) like lower(concat(#{clientesList.clientes.telefone2},'%'))",
			"lower(clientes.numero) like lower(concat(#{clientesList.clientes.numero},'%'))", };

	private Clientes clientes = new Clientes();

	public ClientesList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Clientes getClientes() {
		return clientes;
	}
}
