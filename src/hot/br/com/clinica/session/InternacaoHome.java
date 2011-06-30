package br.com.clinica.session;

import br.com.clinica.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("internacaoHome")
public class InternacaoHome extends EntityHome<Internacao> {

	@In(create = true)
	FichaHome fichaHome;

	public void setInternacaoCodinternacao(Integer id) {
		setId(id);
	}

	public Integer getInternacaoCodinternacao() {
		return (Integer) getId();
	}

	@Override
	protected Internacao createInstance() {
		Internacao internacao = new Internacao();
		return internacao;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Ficha ficha = fichaHome.getDefinedInstance();
		if (ficha != null) {
			getInstance().setFicha(ficha);
		}
	}

	public boolean isWired() {
		return true;
	}

	public Internacao getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<InternacaoMedicamento> getInternacaoMedicamentos() {
		return getInstance() == null ? null
				: new ArrayList<InternacaoMedicamento>(getInstance()
						.getInternacaoMedicamentos());
	}

	

}
