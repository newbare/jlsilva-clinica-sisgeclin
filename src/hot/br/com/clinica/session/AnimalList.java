package br.com.clinica.session;

import br.com.clinica.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("animalList")
public class AnimalList extends EntityQuery<Animal> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 53771234819757741L;

	private static final String EJBQL = "select animal from Animal animal";

	private static final String[] RESTRICTIONS = {
			"lower(animal.nome) like lower(concat(#{animalList.animal.nome},'%'))",
			"lower(animal.cci) like lower(concat(#{animalList.animal.cci},'%'))",
			"lower(animal.chip) like lower(concat(#{animalList.animal.chip},'%'))",
			"lower(animal.alergias) like lower(concat(#{animalList.animal.alergias},'%'))",
			"lower(animal.obs) like lower(concat(#{animalList.animal.obs},'%'))",
			"lower(animal.motivo) like lower(concat(#{animalList.animal.motivo},'%'))", };

	private Animal animal = new Animal();

	public AnimalList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Animal getAnimal() {
		return animal;
	}
}
