package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("especiesList")
public class EspeciesList extends EntityQuery<Especies> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2578605596479042768L;

	private static final String EJBQL = "select especies from Especies especies";

	private static final String[] RESTRICTIONS = { "lower(especies.nomeespecie) like lower(concat(#{especiesList.especies.nomeespecie},'%'))", };

	private Especies especies = new Especies();

	public EspeciesList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Especies getEspecies() {
		return especies;
	}
}
