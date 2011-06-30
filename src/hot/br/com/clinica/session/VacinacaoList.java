package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("vacinacaoList")
public class VacinacaoList extends EntityQuery<Vacinacao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8496691878469449908L;

	private static final String EJBQL = "select vacinacao from Vacinacao vacinacao";

	private static final String[] RESTRICTIONS = {
			"lower(vacinacao.nomelaboratorio) like lower(concat(#{vacinacaoList.vacinacao.nomelaboratorio},'%'))",
			"lower(vacinacao.lote) like lower(concat(#{vacinacaoList.vacinacao.lote},'%'))", };

	private Vacinacao vacinacao = new Vacinacao();

	public VacinacaoList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Vacinacao getVacinacao() {
		return vacinacao;
	}
}
