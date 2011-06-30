package br.com.clinica.session;

import br.com.clinica.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("tiporetornovacinacaoHome")
public class TiporetornovacinacaoHome extends EntityHome<Tiporetornovacinacao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2064744716856219831L;

	public void setTiporetornovacinacaoCodtiporetornovacinacao(Integer id) {
		setId(id);
	}

	public Integer getTiporetornovacinacaoCodtiporetornovacinacao() {
		return (Integer) getId();
	}

	@Override
	protected Tiporetornovacinacao createInstance() {
		Tiporetornovacinacao tiporetornovacinacao = new Tiporetornovacinacao();
		return tiporetornovacinacao;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public Tiporetornovacinacao getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Vacina> getVacinas() {
		return getInstance() == null ? null : new ArrayList<Vacina>(
				getInstance().getVacinas());
	}

	

}
