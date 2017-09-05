package com.harki.factoryPattern;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harki.factoryPattern.model.Animal;
import com.harki.factoryPattern.service.AnimalFactory;

@Configuration
@ComponentScan(basePackages = "com.harki.factoryPattern")
public class AppConfig {
	@Bean
	public AnimalFactory getAnimalFactory(@Qualifier("Dog") Animal dog,@Qualifier("Cat") Animal cat,@Qualifier("Lion") Animal lion){
		return new AnimalFactory(dog,cat,lion);
	}
}