package com.singtel.aone;

import org.junit.Before;
import org.junit.Test;

import com.singtel.unrefracted.Bird;

public class SolutionTest {
	Bird bird;
	
	@Before
	public void setUp() throws Exception{
		bird = new Bird();
	}
	
	@Test
	public void FlyTest() {
		bird.fly();
	}
	
	@Test
	public void singTest() {
		bird.sing();
	}
}
