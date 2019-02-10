package com.singtel.behavior.impl.fish;

import com.singtel.behavior.impl.Fish;
import com.singtel.util.Color;
import com.singtel.util.Size;

public class Shark extends Fish{
	
	public Shark() {
		this.size = Size.LARGE;
		this.color = Color.GREY;
	}

	@Override
	public boolean behavior() {
		System.out.println("Shark eat other fish");
		return true;
	}

}
