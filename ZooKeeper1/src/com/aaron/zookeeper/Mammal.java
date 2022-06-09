package com.aaron.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	
	public Mammal(int energyLevel) {
		
		this.energyLevel = energyLevel;
	}
	public Mammal() {
		
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int displayEnergy() {
		System.out.printf("Energy Level : %s", energyLevel);
		return energyLevel;
	
	}

}
