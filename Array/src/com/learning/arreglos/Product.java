package com.learning.arreglos;

public class Product {
	public String name;
	public Double price;
	public String description;

	Product(String name, Double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;

	}

	public void print() {
		System.out.println(this.name + ", " + this.price + ", " + this.description);
	}
}
