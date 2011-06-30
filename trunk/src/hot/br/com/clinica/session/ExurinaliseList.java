package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("exurinaliseList")
public class ExurinaliseList extends EntityQuery<Exurinalise> {

	private static final String EJBQL = "select exurinalise from Exurinalise exurinalise";

	private static final String[] RESTRICTIONS = {
			"lower(exurinalise.urinaColheita) like lower(concat(#{exurinaliseList.exurinalise.urinaColheita},'%'))",
			"lower(exurinalise.aspecto) like lower(concat(#{exurinaliseList.exurinalise.aspecto},'%'))",
			"lower(exurinalise.cor) like lower(concat(#{exurinaliseList.exurinalise.cor},'%'))",
			"lower(exurinalise.odor) like lower(concat(#{exurinaliseList.exurinalise.odor},'%'))",
			"lower(exurinalise.proteinas) like lower(concat(#{exurinaliseList.exurinalise.proteinas},'%'))",
			"lower(exurinalise.glicose) like lower(concat(#{exurinaliseList.exurinalise.glicose},'%'))",
			"lower(exurinalise.ccetonicos) like lower(concat(#{exurinaliseList.exurinalise.ccetonicos},'%'))",
			"lower(exurinalise.bilirrubina) like lower(concat(#{exurinaliseList.exurinalise.bilirrubina},'%'))",
			"lower(exurinalise.uribilinogenio) like lower(concat(#{exurinaliseList.exurinalise.uribilinogenio},'%'))",
			"lower(exurinalise.sgoculto) like lower(concat(#{exurinaliseList.exurinalise.sgoculto},'%'))",
			"lower(exurinalise.nitritos) like lower(concat(#{exurinaliseList.exurinalise.nitritos},'%'))",
			"lower(exurinalise.hemacias) like lower(concat(#{exurinaliseList.exurinalise.hemacias},'%'))",
			"lower(exurinalise.leucocitos) like lower(concat(#{exurinaliseList.exurinalise.leucocitos},'%'))",
			"lower(exurinalise.cilindros) like lower(concat(#{exurinaliseList.exurinalise.cilindros},'%'))",
			"lower(exurinalise.celdescm) like lower(concat(#{exurinaliseList.exurinalise.celdescm},'%'))",
			"lower(exurinalise.cristais) like lower(concat(#{exurinaliseList.exurinalise.cristais},'%'))",
			"lower(exurinalise.outros) like lower(concat(#{exurinaliseList.exurinalise.outros},'%'))",
			"lower(exurinalise.obs) like lower(concat(#{exurinaliseList.exurinalise.obs},'%'))", };

	private Exurinalise exurinalise = new Exurinalise();

	public ExurinaliseList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Exurinalise getExurinalise() {
		return exurinalise;
	}
}
