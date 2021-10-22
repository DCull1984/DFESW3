package com.qa.main;

import java.util.ArrayList;

import com.qa.vehicle.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> garage = new ArrayList<> ();
		
		Vehicle daihatsu = new Vehicle("Mini-Van", "White", 4, "Diesel");
		Vehicle yam = new Vehicle("MotorBike", "White and Blue", 2, "Petrol");
		Vehicle trans = new Vehicle("Transit", "White", 4, "Diesel");
		
		garage.add(daihatsu);
		garage.add(yam);
		garage.add(trans);
		
		for(Vehicle i : garage)
		{	
			System.out.println("Contents of the garage: " + i);
		}
		
		
		}
}