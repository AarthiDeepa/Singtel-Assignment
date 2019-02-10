package com.singtel.behavior.impl.animal;

import com.singtel.behavior.impl.Animal;

public class Cat extends Animal{

	@Override
	public boolean sing() {
		System.out.println("Meow");
		return true;
	}
	
}
