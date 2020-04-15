package com.revature.code;

public class Animal {
	private int age;
	private int weight;
	private String animalType;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	@Override
	public String toString() {
		return "Animal [age=" + age + ", weight=" + weight + ", animalType=" + animalType + "]";
	}
	
	
}
