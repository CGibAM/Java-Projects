package com.excercise.trycatch;

import java.util.InputMismatchException;

public class ExampleTry {

	public static void main(String[] args) {
		int num = 2;
// The try will execute the program if there is an error it will execute the catch statement
		try {
			if (num == 0)
				throw new Exception("Error message");

		} catch (InputMismatchException ime) {

		} catch (Exception e) {
		}
	}
}