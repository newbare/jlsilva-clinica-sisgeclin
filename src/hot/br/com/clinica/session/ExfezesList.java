package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("exfezesList")
public class ExfezesList extends EntityQuery<Exfezes> {

	private static final String EJBQL = "select exfezes from Exfezes exfezes";

	private static final String[] RESTRICTIONS = {
			"lower(exfezes.resultado) like lower(concat(#{exfezesList.exfezes.resultado},'%'))",
			"lower(exfezes.metodo) like lower(concat(#{exfezesList.exfezes.metodo},'%'))", };

	private Exfezes exfezes = new Exfezes();

	public ExfezesList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Exfezes getExfezes() {
		return exfezes;
	}
}
