package com.qa.main;

import java.util.ArrayList;

public class ArrayListExercise {
	// 2 arraylists, one for done orders and one for orders
	//create methods that can do the following
	
	//add a new order to an orders array .add
	//move an existing order to a Done order array .add(.get)?
	//return the name of an order .get(index)
	//modify the order by index with a new name .update
	//remove the order from either arrays .remove
	//print the length of either arrays
	//clear either arrays .removeAll or .clear
	
	public static ArrayList<String> orders = new ArrayList<>();
	public static ArrayList<String> doneOrders = new ArrayList<>();
	
	public static void setUpOrder() {
		orders.add("Small Espresso");
		orders.add("Large Cold Brew");
		orders.add("Medium Cappuccino");
		orders.add("Medium Flat White");
		orders.add("Large Choc Cookie Frappe");
		orders.add("Small Caramel Iced Latte");
		orders.add("Small Americano");
		orders.add("Large Cafe Au Lait");
		orders.add("Medium Strawberry Iced Tea");
	}
	
	public static void addOrder(String order) {
		orders.add(order);
	}
	
	public static void checkOrderList(int index) {
		System.out.println("Order at position: " + index + " is: " + orders.get(index));
	}
	
	public static void checkDoneOrderList(int index) {
		System.out.println("Order at position: " + index + " is: " + doneOrders.get(index));
	}
	
	public static void updateOrder(int index, String order) {
		orders.set(index, order);
	}
	
	public static void listOrders() {
		int count = 0;
		for(String items : orders) {
			System.out.println("Order: " + count + " " +items);
			count++;
		}
	}

	public static void listDone() {
		//int count = 1;
		for(String items : doneOrders) {
			System.out.println("Orders waiting collection: " + items);
		}
	}
	
 	public static void moveOrder(int index) {
		doneOrders.add(orders.get(index));
		orders.remove(index);
	}
	
	public static void removeOrder(int index) {
		orders.remove(index);
	}
	public static void removeDoneOrder(int index) {
		doneOrders.remove(index);
	}
	
	public static void removeAllOrders() {
		orders.removeAll(orders);
		orders.clear();
	}
	
	public static void removeAllDone() {
		doneOrders.removeAll(doneOrders);
		doneOrders.clear();
	}
	
	public static void orderSize() {
		orders.size();
	}
	
	public static void doneOrderSize() {
		doneOrders.size();
	}
}
