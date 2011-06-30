package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("exbiosanguineaList")
public class ExbiosanguineaList extends EntityQuery<Exbiosanguinea> {

	private static final String EJBQL = "select exbiosanguinea from Exbiosanguinea exbiosanguinea";

	private static final String[] RESTRICTIONS = { "lower(exbiosanguinea.obs) like lower(concat(#{exbiosanguineaList.exbiosanguinea.obs},'%'))", };

	private Exbiosanguinea exbiosanguinea = new Exbiosanguinea();

	public ExbiosanguineaList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Exbiosanguinea getExbiosanguinea() {
		return exbiosanguinea;
	}
}
