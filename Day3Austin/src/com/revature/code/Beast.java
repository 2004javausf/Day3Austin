package com.revature.code;

public class Beast {
	
	private String name;
	private String element;
	private int strength;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "Beast [name = " + name + ", element = " + element + ", strength = " + strength + "]";
	}
	
	
	
	
	
}
