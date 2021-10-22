package com.qa.birds;

public class OOP_Lesson {
	
	//Fields
	private String featherColour;
	private int wingSpan;
	private boolean migratory;
	
	public void makeNoise() {
		System.out.println("Kaw!");
	}
	
	public OOP_Lesson(String featherColour, int wingSpan, boolean migratory) {
		super();
		this.featherColour = featherColour;
		this.wingSpan = wingSpan;
		this.migratory = migratory;
	}
	
	public String getFeatherColour() {
		return featherColour;
	}
	
	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}
	
	public int getWingSpan() {
		return wingSpan;
	}
	
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	public boolean isMigratory() {
		return migratory;
	}
	
	public void setMigratory(boolean migratory) {
		this.migratory = migratory;
	}
		
}
