package com.harki.factoryPattern.service;

import com.harki.factoryPattern.model.Animal;
import com.harki.factoryPattern.model.AnimalType;

public class AnimalFactory {

	private Animal dog;
	private Animal cat;
	private Animal lion;

	public AnimalFactory(Animal dog, Animal cat, Animal lion) {
		this.dog = dog;
		this.cat = cat;
		this.lion = lion;
	}

	public Animal getAnimal(AnimalType type) {
		if (type.equals(AnimalType.DOG)) {
			return dog;
		} else if (type.equals(AnimalType.CAT)) {
			return cat;
		} else if (type.equals(AnimalType.LION)) {
			return lion;
		}

		throw new IllegalArgumentException(type.name());
	}
}
