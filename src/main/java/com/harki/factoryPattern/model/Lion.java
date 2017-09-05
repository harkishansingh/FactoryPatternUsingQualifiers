package com.harki.factoryPattern.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier(value = "Lion")
@Component
public class Lion extends Animal {

	@Override
	void speak() {
		System.out.println("Lion Roars!!!");

	}
}
