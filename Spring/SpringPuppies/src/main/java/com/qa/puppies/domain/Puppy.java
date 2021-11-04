package com.qa.puppies.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Puppy {

	@Id // tells spring this is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Integer id;

	private String name;
	private String breed;
	private int height;

	public Puppy(String name, String breed, int height) {
		super();
		// Validation for the information submitted
		this.name = name;
		this.breed = breed;
		this.setHeight(height);
	}

	// MUST BE INCLUDED
	public Puppy() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		// validation of the height data
		if (height > 8 && height < 100)
			this.height = height;
		else
			System.out.println("Invalid height: " + height);
	}

	@Override
	public String toString() {
		return "Puppy [name: " + name + ", breed: " + breed + ", height: " + height + "]";
	}

}
