package com.harki.factoryPattern;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.harki.factoryPattern.model.Animal;
import com.harki.factoryPattern.model.AnimalType;
import com.harki.factoryPattern.model.Cat;
import com.harki.factoryPattern.model.Dog;
import com.harki.factoryPattern.model.Lion;
import com.harki.factoryPattern.service.AnimalFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class AnimalFactoryTest {

	@Autowired
	private AnimalFactory factory;

	@Test
	public void testgetAnimal() {

		Animal animal = factory.getAnimal(AnimalType.DOG);
		Assert.assertTrue(animal instanceof Dog);
		
		animal = factory.getAnimal(AnimalType.CAT);
		Assert.assertTrue(animal instanceof Cat);
		
		animal = factory.getAnimal(AnimalType.LION);
		Assert.assertTrue(animal instanceof Lion);

	}
}
