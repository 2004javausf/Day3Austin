package com.revature.code;

public class Driver {

	public static void main(String[] args) {
	Animal a = new Animal();
	System.out.println(a);
	a.setAge(80);
	a.setAnimalType("Dog");
	a.setWeight(180);
	System.out.println(a.getAnimalType());
	
	}

}
