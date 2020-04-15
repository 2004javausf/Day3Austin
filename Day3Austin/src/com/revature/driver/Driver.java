package com.revature.driver;
import com.revature.code.Animal;

public class Driver {

	public static void main(String[] args) {
		// Moved the driver file to the driver package
		
	Animal a = new Animal();
	
	a.setAge(80);
	a.setAnimalType("Dog");
	a.setWeight(180);
	System.out.println(a.getAnimalType());
	
	System.out.println(a);
	
	}

}
