package br.com.clinica.session;

import br.com.clinica.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("vacinacaoHome")
public class VacinacaoHome extends EntityHome<Vacinacao> {

	@In(create = true)
	FichaHome fichaHome;

	public void setVacinacaoCodvacinacao(Integer id) {
		setId(id);
	}

	public Integer getVacinacaoCodvacinacao() {
		return (Integer) getId();
	}

	@Override
	protected Vacinacao createInstance() {
		Vacinacao vacinacao = new Vacinacao();
		return vacinacao;
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
		if (getInstance().getFicha() == null)
			return false;
		return true;
	}

	public Vacinacao getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Vacina> getVacinas() {
		return getInstance() == null ? null : new ArrayList<Vacina>(
				getInstance().getVacinas());
	}
	

}
