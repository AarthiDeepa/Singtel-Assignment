package com.singtel.behavior.impl.animal;

import com.singtel.behavior.impl.Animal;

public class Dog extends Animal{

	@Override
	public boolean sing() {
		System.out.println("Woof, woof");
		return true;
	}
	
}
