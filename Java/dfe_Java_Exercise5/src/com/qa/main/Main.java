package com.qa.main;

import com.qa.oop.OOP_Exercise_Child;

public class Main {

	public static void main(String[] args) {
		// using child class
		OOP_Exercise_Child book = new OOP_Exercise_Child("The Ruby Knight", "David Eddings", "Fantasy", true, 3);
		
		book.bookReview();
	}

}
