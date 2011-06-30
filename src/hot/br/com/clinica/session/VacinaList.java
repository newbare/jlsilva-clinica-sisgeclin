package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("vacinaList")
public class VacinaList extends EntityQuery<Vacina> {

	private static final String EJBQL = "select vacina from Vacina vacina";

	private static final String[] RESTRICTIONS = { "lower(vacina.nomevacina) like lower(concat(#{vacinaList.vacina.nomevacina},'%'))", };

	private Vacina vacina = new Vacina();

	public VacinaList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Vacina getVacina() {
		return vacina;
	}
}
