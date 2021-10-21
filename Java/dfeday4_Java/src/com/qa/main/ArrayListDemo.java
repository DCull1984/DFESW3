package com.qa.main;

import java.util.ArrayList;

public class ArrayListDemo {
	//Ctrl + Shift + O - Fixes all imports
	
	//arraylists are an implementation of the collections class with java
	//they have inbuilt functionality to add, read, update and delete
	//and they are mutable, meaning we can change the length of the array at will
	
	//to create an arrayList use: ArrayList<DataType> nameOfList
	// = new ArrayList<>();
	public static ArrayList<String> pizzaList = new ArrayList<>();
	
	//ArrayLists have inbuilt methods to manipulate
	
	public static void setUpPizza() {
		pizzaList.add("Hawaian");
		pizzaList.add("fungi");
		pizzaList.add("cheese and tomato");
	}
	
	public static void addPizza() {
		
		System.out.println(pizzaList);
		
		System.out.println("*****************");
		
		//array list name.add
		pizzaList.add("Meat Feast"); //Taking Array List and adding the string "Meat Feast"
		
		System.out.println(pizzaList);

	}
	
	public static String getPizza(int index) {
		return pizzaList.get(index); //returns a pizza of index
	}
	
	public static void removePizza(int index) {
		pizzaList.remove(index); //deletes a pizza of index
		
	}
	
	public static void updatePizza(int index) {
		pizzaList.set(index, "pepperoni");
	}
	
	public static void clearAllPizza() {
		pizzaList.removeAll(pizzaList);
	}
	
	public static void getAllPizza() {
		
	}
	
	public static void forLoopArrayList() {
		//print all pizzas line by line  with a loop
		
		for(String pizza : pizzaList) {
			System.out.println(pizza);
		}
	}
}