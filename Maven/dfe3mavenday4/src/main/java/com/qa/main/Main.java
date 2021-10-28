package com.qa.main;

import java.util.HashMap;
import com.qa.translate.*;
public class Main {

	public static void main(String[] args) {
//		HashMap<Integer, String> animals = new HashMaps<Integer, String>();
//		HashMap<String, HashMap<Integer, String>> cities = new HashMap<>();
//		
//		animals.put(5, "Cat");
//		animals.put(4, "Dog");
//		animals.put(3, "Panda");
//		animals.put(2, "Rabbit");
//		animals.put(1, "Bunny");
//		
//		animals.forEach((x, i)-> System.out.println("Key: " + x + "Value: " + i));
//		
//		animals.remove(1);
//		
//		animals.replace(2, "Dog");
		
		//Translate Exercise
		MorseTransExercise translator = new MorseTransExercise();
        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
        
	}
}
