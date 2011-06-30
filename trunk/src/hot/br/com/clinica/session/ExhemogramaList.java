package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("exhemogramaList")
public class ExhemogramaList extends EntityQuery<Exhemograma> {

	private static final String EJBQL = "select exhemograma from Exhemograma exhemograma";

	private static final String[] RESTRICTIONS = { "lower(exhemograma.obs) like lower(concat(#{exhemogramaList.exhemograma.obs},'%'))", };

	private Exhemograma exhemograma = new Exhemograma();

	public ExhemogramaList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Exhemograma getExhemograma() {
		return exhemograma;
	}
}
