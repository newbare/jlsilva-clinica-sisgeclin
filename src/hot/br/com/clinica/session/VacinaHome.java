package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("vacinaHome")
public class VacinaHome extends EntityHome<Vacina> {

	@In(create = true)
	VacinacaoHome vacinacaoHome;
	@In(create = true)
	TiporetornovacinacaoHome tiporetornovacinacaoHome;

	public void setVacinaCodvacinas(Integer id) {
		setId(id);
	}

	public Integer getVacinaCodvacinas() {
		return (Integer) getId();
	}

	@Override
	protected Vacina createInstance() {
		Vacina vacina = new Vacina();
		return vacina;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Vacinacao vacinacao = vacinacaoHome.getDefinedInstance();
		if (vacinacao != null) {
			getInstance().setVacinacao(vacinacao);
		}
		Tiporetornovacinacao tiporetornovacinacao = tiporetornovacinacaoHome
				.getDefinedInstance();
		if (tiporetornovacinacao != null) {
			getInstance().setTiporetornovacinacao(tiporetornovacinacao);
		}
	}

	public boolean isWired() {
		if (getInstance().getVacinacao() == null)
			return false;
		return true;
	}

	public Vacina getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
