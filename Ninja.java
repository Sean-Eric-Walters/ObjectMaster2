package com.sean.ObjectMaster;

public class Ninja extends Human {
	


	

	public Ninja(String name) { 
		super(name);
		setStealth(10);
	}
	

	public int steal(Human target) {
		target.setHealth(target.getHealth() - getStealth());
		setHealth(getHealth() + 10);
		System.out.println(target.getName() + " " + target.getHealth());
		return getHealth();
	}
	
	public int runaway() {
		super.setHealth(getHealth() - 10);
		return getHealth();
	
	}
	
}



	
	
	
	
	
	
	
	
	
	
	
