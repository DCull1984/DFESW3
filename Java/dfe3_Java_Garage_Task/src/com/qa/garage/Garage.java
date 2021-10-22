package com.qa.garage;

import java.util.ArrayList;

import com.qa.vehicle.Vehicle;

public class Garage {
	public static ArrayList<Vehicle> garageContents = new ArrayList<>();
	
	public static void addVehicle(Vehicle vehicle) {
		garageContents.add(vehicle);
	}
	public static void removeVehicle(Vehicle vehicle) {
		garageContents.remove(vehicle);
	}
	public static void updateVehicle(int index, Vehicle vehicle) {
		garageContents.set(index, vehicle);
	}
	public static void getVehicle(int index) {
		System.out.println(garageContents.get(index));
	}
	public static void clearGarage() {
		garageContents.clear();
	}
}
