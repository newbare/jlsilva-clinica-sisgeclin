package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("pelagemList")
public class PelagemList extends EntityQuery<Pelagem> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3518726115443134740L;

	private static final String EJBQL = "select pelagem from Pelagem pelagem";

	private static final String[] RESTRICTIONS = { "lower(pelagem.pelagem) like lower(concat(#{pelagemList.pelagem.pelagem},'%'))", };

	private Pelagem pelagem = new Pelagem();

	public PelagemList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Pelagem getPelagem() {
		return pelagem;
	}
}
