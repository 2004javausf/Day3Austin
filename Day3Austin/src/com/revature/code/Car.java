package com.revature.code;

public class Car {
	private int age;
	private String make;
	private String model;
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [age=" + age + ", make=" + make + ", model=" + model + "]";
	}
	
	

}
