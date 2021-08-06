package com.sean.ObjectMaster;

public class Wizard extends Human {
	
	
	public Wizard(String name) { 
		super(name);
		setHealth(50);
		setIntelligence(8);
	}
	
	public int fireball(Human target) {
		target.setHealth(target.getHealth() - (getIntelligence() * 3));
		System.out.println(target.getName() + " " + target.getHealth());
		return getHealth();
	}
	
	public int heal(Human target) {
		target.setHealth(target.getHealth() + this.getIntelligence());
		return getHealth();
	
	}

}
