package com.qa.main;

public class Main {

	public static void main(String[] args) {
		ArraysDemo.arrayDemo();
		
		System.out.println();
		System.out.println();
		
		ArraysDemo.foreachArray();
		
		ArrayListDemo.setUpPizza();
		ArrayListDemo.addPizza();
		System.out.println(ArrayListDemo.getPizza(1));
		ArrayListDemo.updatePizza(0);
		ArrayListDemo.forLoopArrayList();
	}

}
