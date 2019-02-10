package com.singtel.factory;

import com.singtel.behavior.AllSpecies;

public abstract class BaseSpeciesFactory {
	public abstract AllSpecies createSpecies(String name); 
}
