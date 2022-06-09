package com.aaron.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super(300);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.printf(" Fly Away ");
		energyLevel = energyLevel - 50;
		
	}
	public void eatHumans() {
		System.out.printf(" Eating Humans");
		energyLevel = energyLevel + 25;
		
	}
	public void attackTown() {
		System.out.printf(" Attacking the Town");
		energyLevel = energyLevel - 100;
		
	}


	
	
	
	
	
}
