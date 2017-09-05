package com.harki.factoryPattern.model;

import org.springframework.stereotype.Component;

@Component
public abstract class Animal {

	private String name;
	private AnimalType type;
	private int noOfLegs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnimalType getType() {
		return type;
	}

	public void setType(AnimalType type) {
		this.type = type;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	abstract void speak();

}
