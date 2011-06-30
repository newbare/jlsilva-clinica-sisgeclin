package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("tiporetornovacinacaoList")
public class TiporetornovacinacaoList extends EntityQuery<Tiporetornovacinacao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5980063394244886349L;

	private static final String EJBQL = "select tiporetornovacinacao from Tiporetornovacinacao tiporetornovacinacao";

	private static final String[] RESTRICTIONS = { "lower(tiporetornovacinacao.retorno) like lower(concat(#{tiporetornovacinacaoList.tiporetornovacinacao.retorno},'%'))", };

	private Tiporetornovacinacao tiporetornovacinacao = new Tiporetornovacinacao();

	public TiporetornovacinacaoList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Tiporetornovacinacao getTiporetornovacinacao() {
		return tiporetornovacinacao;
	}
}
