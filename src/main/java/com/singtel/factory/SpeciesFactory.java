package com.singtel.factory;

import com.singtel.behavior.AllSpecies;
import com.singtel.behavior.impl.animal.Cat;
import com.singtel.behavior.impl.animal.Dog;
import com.singtel.behavior.impl.animal.Frog;
import com.singtel.behavior.impl.bird.Chicken;
import com.singtel.behavior.impl.bird.Duck;
import com.singtel.behavior.impl.fish.ClownFish;
import com.singtel.behavior.impl.fish.Shark;

public class SpeciesFactory extends BaseSpeciesFactory{

	@Override
	public AllSpecies createSpecies(String name) {
		AllSpecies species = null;
		
		switch(name.toLowerCase()) {
			case "chicken":
				species = new Chicken();
				break;
			case "duck":
				species = new Duck();
				break;
			case "cat":
				species = new Cat();
				break;
			case "dog":
				species = new Dog();
				break;
			case "frog":
				species = new Frog();
				break;
			case "clownfish":
				species = new ClownFish();
				break;
			case "shark":
				species = new Shark();
				break;
				
			default: throw new IllegalArgumentException("No such species.");
		}
		return species;
	}

}
