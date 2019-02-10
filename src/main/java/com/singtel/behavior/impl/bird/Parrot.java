package com.singtel.behavior.impl.bird;

import com.singtel.behavior.SoundingSpecies;

public class Parrot { 
	//Parrot is implemented using Composition "has-a" relationship
	SoundingSpecies sound;
	
	public Parrot(SoundingSpecies sound) {
		this.sound = sound;
	}
	
	public boolean sing() {
		if(sound != null)
			return sound.sing();
		else
			return false;
	}

}

