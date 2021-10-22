package com.qa.birds;

//when making a child class we need to specify what
//is the parent class, with the word extends
public class FlightlessBirds extends OOP_Lesson{
	
	//fields
	private String habitat;
	private int landSpeed;
		
	public void attemptToFly() {
			System.out.println("smacks face into the ground");
		}
	
	@Override //good practice to let devs know you are over riding the method
	public void makeNoise() {
		System.out.println("stomping feet");
	}
		
	public FlightlessBirds(String featherColour, int wingSpan, boolean migratory, String habitat, int landSpeed) {
		super(featherColour, wingSpan, migratory);
		this.habitat = habitat;
		this.landSpeed = landSpeed;
	}

	//Getters and Setters
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getLandSpeed() {
		return landSpeed;
	}

	public void setLandSpeed(int landSpeed) {
		this.landSpeed = landSpeed;
	}

	
	
}
