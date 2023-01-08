package com.learning.arreglos;

public class Arr {

	public static void main(String[] args) {
		Arr obj = new Arr();
		obj.start();	

	}

	private void start() {
		int[] arr = new int[5];//declare an array, with[], name the array, then you specify the array size with [X]= "int [5]"
		System.out.println(arr.length);//it prints 5 because that's the way it was defined
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		arr[3] = 2;
		
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]);
		
	}
		imprimirArreglo(arr);
}
	private void imprimirArreglo(int[] arreglo) {
		for(int i=0; i<arreglo.length ; i++) {
			System.out.print(arreglo[i]);
		}
	}
	
}
