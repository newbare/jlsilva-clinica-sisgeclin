package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("internacaoMedicamentoHome")
public class InternacaoMedicamentoHome extends EntityHome<InternacaoMedicamento> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 462216157723572319L;
	@In(create = true)
	InternacaoHome internacaoHome;

	public void setInternacaoMedicamentoCodinternacaoMedicamento(Integer id) {
		setId(id);
	}

	public Integer getInternacaoMedicamentoCodinternacaoMedicamento() {
		return (Integer) getId();
	}

	@Override
	protected InternacaoMedicamento createInstance() {
		InternacaoMedicamento internacaoMedicamento = new InternacaoMedicamento();
		return internacaoMedicamento;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Internacao internacao = internacaoHome.getDefinedInstance();
		if (internacao != null) {
			getInstance().setInternacao(internacao);
		}
	}

	public boolean isWired() {
		return true;
	}

	public InternacaoMedicamento getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
