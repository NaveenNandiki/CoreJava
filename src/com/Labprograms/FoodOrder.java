package com.Labprograms;

public class FoodOrder {
	int order_id;
	String customerName;
	String restaurantName;
	String itemName;
	int quantity;
	double price;

	FoodOrder() {
		System.out.println("No arg Constructor called");
	}

	FoodOrder(int id, String customerName, String item) {
		this.order_id = id;
		this.customerName = customerName;
		this.itemName = item;
	}

	FoodOrder(int id, String customerName, String restaurantName, String item, int quantity) {
		this.order_id = id;
		this.customerName = customerName;
		this.restaurantName = restaurantName;
		this.itemName = item;
		this.quantity = quantity;
	}

	FoodOrder(int id, String customerName, String restaurantName, String item, int quantity, double price) {
		this.order_id = id;
		this.customerName = customerName;
		this.itemName = item;
		this.restaurantName = restaurantName;
		this.quantity = quantity;
		this.price = price;
	}

	void display() {

		System.out.println("Order id: " + order_id);
		System.out.println("Customer Name: " + customerName);
		System.out.println("restaurant name: " + restaurantName);
		System.out.println("item: " + itemName);
		System.out.println("Quantity: " + quantity);
		System.out.println("price " + price);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		FoodOrder order = new FoodOrder();
		System.out.println("First Order");
		FoodOrder order1 = new FoodOrder(101, "Siva", "Chicken Biryani");
		order1.display();
		System.out.println();
		System.out.println("Second order");
		FoodOrder order2 = new FoodOrder(102, "Reddy", "Paradise", "Mutton Biryani", 2);
		order2.display();
		System.out.println();
		System.out.println("Third Order");
		FoodOrder order3 = new FoodOrder(103, "Kumar", "Mehfil", "Fried Rice", 3, 450);
		order3.display();
	}

}
