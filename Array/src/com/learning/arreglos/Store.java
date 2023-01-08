package com.learning.arreglos;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Store store = new Store();
		store.start();

	}

	private void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the store. Plese select a product ");
		Product[] arr = new Product[3];
		Product product1 = new Product("Broom", 16.0, "It flies");
		Product product2 = new Product("Apple", 3.5, "Taste good");
		Product product3 = new Product("Book", 0.0, "A universe in the palm of your hand");
		arr[0] = product1;
		arr[1] = product2;
		arr[2] = product3;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + ". " + arr[i].name);
		}
		String user = scanner.next();

		switch (user) {
		case "1":
			arr[0].print();
			break;

		case "2":
			arr[1].print();
			break;

		case "3":
			arr[2].print();
			break;

		default:
			System.out.println("Unvalid option");
			break;
		}
		scanner.close();
	}

}
//}
