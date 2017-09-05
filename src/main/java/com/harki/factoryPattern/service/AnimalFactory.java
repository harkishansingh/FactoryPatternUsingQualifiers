package com.harki.factoryPattern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.harki.factoryPattern.model.Animal;
import com.harki.factoryPattern.model.AnimalType;
@Service
public class AnimalFactory {
	@Qualifier("Dog")
	@Autowired
	private Animal dog;
	@Qualifier("Cat")
	@Autowired
	private Animal cat;
	@Qualifier("Lion")
	@Autowired
	private Animal lion;

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
