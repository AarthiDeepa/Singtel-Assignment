package com.singtel.bonetwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.behavior.impl.Fish;
import com.singtel.behavior.impl.fish.Shark;
import com.singtel.util.Color;
import com.singtel.util.Size;

public class SharkFishTest {
	Fish fish;
	
	@Before
	public void setUp() throws Exception{
		fish = new Shark();
	}
	
	@Test
	public void sizeTest() {
		Assert.assertEquals(Size.LARGE, fish.getSize());
	}
	
	@Test
	public void colorTest() {
		Assert.assertEquals(Color.GREY, fish.getColor());
	}

	@Test
	public void swimTest() {
		Assert.assertEquals(true, fish.swim());
	}
	
	@Test
	public void behaviorTest() {
		Assert.assertEquals(true, fish.behavior());
	}
	
	@Test
	public void singTest() {
		Assert.assertEquals(false, fish.sing());
	}
	
	@Test
	public void flyTest() {
		Assert.assertEquals(false, fish.fly());
	}
	
	@Test
	public void walkTest() {
		Assert.assertEquals(false, fish.walk());
	}
	
}
