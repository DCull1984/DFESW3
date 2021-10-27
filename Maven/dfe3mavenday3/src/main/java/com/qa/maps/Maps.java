package com.qa.maps;

import java.util.ArrayList;
import java.util.HashSet;

public class Maps {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("");
		arrList.get(0);
		
		// when mapping we need key value pairs
		HashSet<String> animals = new HashSet<String>();
		animals.add("Panda");
		animals.add("Snake");
		animals.add("Otter");
		
		System.out.println(animals.size());
		animals.remove("Panda");
		
		animals.forEach(System.out::println);
		
		animals.clear();
		
		
	}
	
}
