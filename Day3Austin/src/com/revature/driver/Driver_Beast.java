package com.revature.driver;
import com.revature.code.Beast;

public class Driver_Beast {

	public static void main(String[] args) {

		
	Beast unknown = new Beast();
	
	unknown.setName("Pheonix");
	unknown.setElement("Fire");
	unknown.setStrength(180000000);
	
	System.out.println("Name: " + unknown.getName());
	
	System.out.println(unknown);
	
	}

}
