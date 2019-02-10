package com.singtel.count;

import com.singtel.behavior.AllSpecies;
import com.singtel.behavior.SwimingSpecies;
import com.singtel.behavior.impl.Phone;
import com.singtel.behavior.impl.animal.Cat;
import com.singtel.behavior.impl.animal.Dog;
import com.singtel.behavior.impl.bird.Duck;
import com.singtel.behavior.impl.bird.Parrot;
import com.singtel.behavior.impl.bird.Rooster;
import com.singtel.behavior.impl.fish.Dolphin;
import com.singtel.behavior.impl.insect.Butterfly;
import com.singtel.behavior.impl.insect.Caterpillar;
import com.singtel.behavior.impl.insect.Chrysalis;
import com.singtel.factory.SpeciesFactory;

public class CountingSpecies {

	static int flyCount = 0;
	static int walkCount = 0;
	static int singCount = 0;
	static int swimCount = 0;
	
	static void allSpecies(AllSpecies species) {
		if(species.fly())
			flyCount++;
		if(species.walk())
			walkCount++;
		if(species.sing())
			singCount++;
		if(species.swim())
			swimCount++;
		
	}
	
	static void printCount() {
		System.out.println("---------- ALL COUNTS:");
		System.out.println("Animals can fly count:"+flyCount);
		System.out.println("Animals can walk count:"+walkCount);
		System.out.println("Animals can sing count:"+singCount);
		System.out.println("Animals can swim count:"+swimCount);
	}
	
	public static void main(String[] args) {
		boolean result = false;
		// Object creation using factory
		SpeciesFactory speciesFactory = new SpeciesFactory();
		
		// Bird Species
		//Bird bird = new Chicken();
		AllSpecies bird = speciesFactory.createSpecies("chicken");
			allSpecies(bird);
		bird = speciesFactory.createSpecies("duck");
			allSpecies(bird);
		bird = new Rooster("MALE");
			allSpecies(bird);
			
		// Parrot modeled with other animals or species
		Parrot parrot = new Parrot(new Dog());
			allSpecies(parrot);
		parrot = new Parrot(new Cat());
			allSpecies(parrot);
		parrot = new Parrot(new Rooster("MALE"));
			allSpecies(parrot);
		parrot = new Parrot(new Duck());
			allSpecies(parrot);
		parrot = new Parrot(new Phone());
			allSpecies(parrot);
		
		// Animal Species
		AllSpecies animal = speciesFactory.createSpecies("cat");
			allSpecies(animal);
		animal = speciesFactory.createSpecies("dog");
			allSpecies(animal);
		animal = speciesFactory.createSpecies("frog");
			allSpecies(animal);
			
		// Fish Species
		AllSpecies fish = speciesFactory.createSpecies("ClownFish");
			allSpecies(fish);
		fish = speciesFactory.createSpecies("shark");
			allSpecies(fish);
		
		SwimingSpecies dolphin = new Dolphin();
		result = dolphin.swim();
			if(result)	swimCount++;
		
		
		// Insect Species
		Caterpillar caterpillar = new Caterpillar(); 
		Butterfly butterfly = new Butterfly(new Chrysalis(caterpillar));
			allSpecies(butterfly);
		
		// Printing counts of fly, walk, sing, swim
			printCount();
	}

}
