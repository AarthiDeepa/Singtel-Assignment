package com.singtel.atwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.behavior.impl.Bird;
import com.singtel.behavior.impl.bird.Duck;

public class DuckTest {
	Bird bird;
	
	@Before
	public void setUp() throws Exception{
		bird = new Duck();
	}
	
	@Test
	public void singTest() {
		Assert.assertEquals(true, bird.sing());
	}
	
	@Test
	public void flyTest() {
		Assert.assertEquals(true, bird.fly());
	}
	
	@Test
	public void swimTest() {
		Assert.assertEquals(true, bird.swim());
	}
}
