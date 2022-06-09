package com.aaron.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void throwSomething() {
		System.out.printf("Throw Something");
		energyLevel = energyLevel - 5;
		
	}
	
	public void eatBanana() {
		System.out.printf("Eat Banana");
		energyLevel = energyLevel + 10;
		
	}
	
	public void climb() {
		System.out.printf("Climb");
		energyLevel = energyLevel - 10;
		
	}
}
