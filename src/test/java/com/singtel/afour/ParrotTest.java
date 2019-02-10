package com.singtel.afour;

import org.junit.Assert;
import org.junit.Test;

import com.singtel.behavior.impl.Phone;
import com.singtel.behavior.impl.animal.Cat;
import com.singtel.behavior.impl.animal.Dog;
import com.singtel.behavior.impl.bird.Duck;
import com.singtel.behavior.impl.bird.Parrot;
import com.singtel.behavior.impl.bird.Rooster;

public class ParrotTest {
	Parrot parrot;
	
	@Test
	public void singWithDogTest() {
		parrot = new Parrot(new Dog());
		Assert.assertEquals(true, parrot.sing());
	}
	
	@Test
	public void singWithCatTest() {
		parrot = new Parrot(new Cat());
		Assert.assertEquals(true, parrot.sing());
	}
	
	@Test
	public void singWithRoosterTest() {
		parrot = new Parrot(new Rooster("male"));
		Assert.assertEquals(true, parrot.sing());
	}
	
	@Test
	public void singWithDuckTest() {
		parrot = new Parrot(new Duck());
		Assert.assertEquals(true, parrot.sing());
	}
	
	@Test
	public void singWithPhoneTest() {
		parrot = new Parrot(new Phone());
		Assert.assertEquals(true, parrot.sing());
	}
	
}
