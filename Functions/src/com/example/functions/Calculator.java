package com.example.functions;

import java.util.Scanner;

//Create a calculator using functions
public class Calculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.start();

	}

	private void start() {
		Scanner scanner = new Scanner(System.in);// We use the scanner to take the user input
		double num_1 = 0;
		double num_2 = 0;
		int option = 0;
		while (option != 6) {
			menu();
			option = scanner.nextInt();
			switch (option) {
			case 1:
				num_1 = scanner.nextDouble();
				num_2 = scanner.nextDouble();
				suma(num_1, num_2);
				System.out.println(suma(num_1, num_2));

				break;
			case 2:
				num_1 = scanner.nextDouble();
				num_2 = scanner.nextDouble();
				resta(num_1, num_2);

				break;
			case 3:
				num_1 = scanner.nextDouble();
				num_2 = scanner.nextDouble();
				multip(num_1, num_2);
				break;

			case 4:
				num_1 = scanner.nextDouble();
				num_2 = scanner.nextDouble();
				divi(num_1, num_2);
				break;

			case 5:
				num_1 = scanner.nextDouble();
				fact(num_1);
				break;

			case 6:

				break;

			}

		}
		scanner.close();
	}

	private void fact(Double num_1) {
		double num, fact = 1;
		for (num = 1; num <= num_1; num++) {
			fact = fact * num;
		}
		System.out.println("Factorial of: " + num_1 + " equals " + fact);
	}

	private void divi(Double num_1, Double num_2) {
		Double result = num_1 / num_2;
		System.out.println(result);

	}

	private void multip(Double num_1, Double num_2) {
		Double result = num_1 * num_2;
		System.out.println(result);

	}

	private void resta(Double num_1, Double num_2) {
		Double result = num_1 - num_2;
		System.out.println(result);
	}

	private Double suma(Double num_1, Double num_2) {
		Double result = num_1 + num_2;
		return result;

	}

	private void menu() {
		System.out.println("1.- Add");
		System.out.println("2.- Subtraction ");
		System.out.println("3.- Multiplication");
		System.out.println("4.- Division");
		System.out.println("5.- Factorial");
		System.out.println("6.- Exit");
	}

}
