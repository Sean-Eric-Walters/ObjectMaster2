/**
 * 
 */
package com.sean.ObjectMaster;

/**
 * @author seane
 *
 */
public class TestHuman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Human myHuman = new Human("Christian");
		Human myHuman2 = new Human("Sean");
		Ninja myNinja = new Ninja("John");
		Ninja myNinja2 = new Ninja("Jeff"); 
		
//		myHuman.attak(myHuman2);
//		myHuman.showHealth(); //		
//		myHuman2.showHealth();
		myNinja.steal(myNinja2);
		myNinja.showHealth();
		
	}

}

