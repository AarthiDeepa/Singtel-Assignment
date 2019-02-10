package com.singtel.behavior.impl.insect;

import com.singtel.behavior.MetamorphosisSpecies;
import com.singtel.behavior.impl.Insect;

public class Chrysalis extends Insect implements MetamorphosisSpecies<Butterfly>{

	public Chrysalis(Caterpillar caterpillar) {
		//initialize new State transformed from Caterpillar to Chrysalis  
	}
	
	@Override
	public boolean fly() {
		 System.out.println("Chrysalis cannot fly");
		 return false;
		
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public Butterfly metamorphosis() {
		return new Butterfly(this);
	}

}
