package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("fichaList")
public class FichaList extends EntityQuery<Ficha> {
	private static final long serialVersionUID = 462216157723572319L;
	private static final String EJBQL = "select ficha from Ficha ficha";

	private static final String[] RESTRICTIONS = {
			"lower(ficha.anamnese) like lower(concat(#{fichaList.ficha.anamnese},'%'))",
			"lower(ficha.diagnostico) like lower(concat(#{fichaList.ficha.diagnostico},'%'))",
			"lower(ficha.solicitados) like lower(concat(#{fichaList.ficha.solicitados},'%'))",
			"lower(ficha.receituario) like lower(concat(#{fichaList.ficha.receituario},'%'))", };

	private Ficha ficha = new Ficha();

	public FichaList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Ficha getFicha() {
		return ficha;
	}
}
