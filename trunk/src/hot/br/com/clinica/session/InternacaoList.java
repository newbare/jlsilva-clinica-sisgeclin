package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("internacaoList")
public class InternacaoList extends EntityQuery<Internacao> {

	private static final String EJBQL = "select internacao from Internacao internacao";

	private static final String[] RESTRICTIONS = {
			"lower(internacao.obs) like lower(concat(#{internacaoList.internacao.obs},'%'))",
			"lower(internacao.motivosaida) like lower(concat(#{internacaoList.internacao.motivosaida},'%'))",
			"lower(internacao.obssaida) like lower(concat(#{internacaoList.internacao.obssaida},'%'))", };

	private Internacao internacao = new Internacao();

	public InternacaoList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Internacao getInternacao() {
		return internacao;
	}
}
