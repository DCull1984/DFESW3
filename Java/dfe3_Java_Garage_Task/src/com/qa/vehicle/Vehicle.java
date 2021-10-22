package com.qa.vehicle;

public class Vehicle {

	private String vehicleType;
	private String vehicleColour;
	private int numWheels;
	private String engineType;

	/******************************************************************************************/

	public Vehicle(String vehicleType, String vehicleColour, int numWheels, String engineType) {
		super();
		this.vehicleType = vehicleType;
		this.vehicleColour = vehicleColour;
		this.numWheels = numWheels;
		this.engineType = engineType;
	}

	/******************************************************************************************/

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/******************************************************************************************/

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	/******************************************************************************************/

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	/******************************************************************************************/

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {

		if(engineType.equalsIgnoreCase("Diesel")) {
			this.engineType = "Diesel";
		}
		else if (engineType.equalsIgnoreCase("Petrol")) {
			this.engineType = "Petrol";
		}
		else {
			System.out.println("Not a valid fuel");

		}
	}

	@Override
	public String toString() {
		return " " + getVehicleType() + ", " + getVehicleColour()
				+ ", " + getNumWheels() + ", " + getEngineType();
	}


}
