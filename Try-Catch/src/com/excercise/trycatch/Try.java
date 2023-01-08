package com.excercise.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {

		String title = "I will tell you if you are an adult. Introduce your age";
		System.out.println(title);
		Scanner scanner = new Scanner(System.in);

		try {
			Integer age = scanner.nextInt();
			scanner.close();

			if (age >= 18) {
				System.out.println("You're an adult");
			} else {
				System.out.println("You're young");
			}
		} catch (InputMismatchException e) {//catches a mismatch exception
			System.out.println("Please enter a valid integer number");
		} catch (Exception e) {//catches general exceptions, and executes actions accordingly 
			System.out.println("Plese enter a valid number");
		} finally { // What the program will execute whether there's an error or not
			System.out.println("Let's finish the program");
		}

	}

}
