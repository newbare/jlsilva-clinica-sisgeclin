package br.com.clinica.session;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import br.com.clinica.entity.Animal;
@Name("relatorioList")
public class RelatorioList extends EntityQuery<Animal> {
	private static final String EJBQL = "select animal from Animal animais";
	
	private static final String[] RESTRICTIONS = { "animais.codanimal = relatorioList.animal.codanimal}" };
	private Animal animal = new Animal();
	
	public RelatorioList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(10);
	}

	public Animal getAnimal() {
		return animal;
	}
	
}
