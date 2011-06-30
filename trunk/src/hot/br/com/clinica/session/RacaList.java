package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("racaList")
public class RacaList extends EntityQuery<Raca> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1385642584216949297L;

	private static final String EJBQL = "select raca from Raca raca";

	private static final String[] RESTRICTIONS = { "lower(raca.nomeraca) like lower(concat(#{racaList.raca.nomeraca},'%'))", };

	private Raca raca = new Raca();

	public RacaList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Raca getRaca() {
		return raca;
	}
}
