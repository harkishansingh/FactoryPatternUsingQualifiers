package com.harki.factoryPattern.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier(value = "Dog")
@Component
public class Dog extends Animal{

	@Override
	void speak() {
		System.out.println("Dog Bark!!!");
		
	}

}
