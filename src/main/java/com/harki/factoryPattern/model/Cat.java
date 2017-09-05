package com.harki.factoryPattern.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier(value = "Cat")
@Component
public class Cat extends Animal {

	@Override
	void speak() {
		System.out.println("Dog Meow!!!");

	}
}
