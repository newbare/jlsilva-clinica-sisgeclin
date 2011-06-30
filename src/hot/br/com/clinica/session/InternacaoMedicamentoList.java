package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("internacaoMedicamentoList")
public class InternacaoMedicamentoList extends
		EntityQuery<InternacaoMedicamento> {

	private static final String EJBQL = "select internacaoMedicamento from InternacaoMedicamento internacaoMedicamento";

	private static final String[] RESTRICTIONS = {
			"lower(internacaoMedicamento.medicamento) like lower(concat(#{internacaoMedicamentoList.internacaoMedicamento.medicamento},'%'))",
			"lower(internacaoMedicamento.forma) like lower(concat(#{internacaoMedicamentoList.internacaoMedicamento.forma},'%'))", };

	private InternacaoMedicamento internacaoMedicamento = new InternacaoMedicamento();

	public InternacaoMedicamentoList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public InternacaoMedicamento getInternacaoMedicamento() {
		return internacaoMedicamento;
	}
}
