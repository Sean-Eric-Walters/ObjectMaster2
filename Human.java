/**
 * 
 */
package com.sean.ObjectMaster;

/**
 * @author seane
 *
 */
public class Human {
	
	//---variables---
	private String name;
	private int strength=3;
	private int intelligence=3;
	private int stealth=3;
	private int health=100;
	
	
	
	
	
	
	//---constructors---
	public Human(String name) {
		setName(name);
		setStrength(3);
		setIntelligence(3);
		setStealth(3);
		setHealth(100);
	}
	 public Human() {}
		
	//---methods---
	public void showHealth() {
		System.out.println(getName() + " " + getHealth());
//		System.out.println(this.health);
	}
	
	public void attak(Human target) {
		System.out.println(getName() + " " + getHealth());
		target.health -= this.strength;
	}

	public String getName() {
		return name;
	}
	
	//---
	public void setName(String name) {
		this.name = name;
	}
	

	

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
}
