package com.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapFunction {

	public static void main(String[] args) {
		MapFunction obj = new MapFunction();
		obj.start();

	}

	private void start() {
		Scanner scanner= new Scanner(System.in);
		Map <String, String> map= new HashMap<String, String>();
		System.out.println ("Select an option from the menu: ");
		System.out.println ("1.-Add");
		System.out.println ("2.-Modify");
		System.out.println ("3.-Delete");
		System.out.println ("4.-Show");
		System.out.println ("5.-Count");
		System.out.println ("6.-Salir");
		int selection= scanner.nextInt();
		switch (selection) {
	
		case 1: case 2:
			System.out.println ("Add a Key:");
			String key= scanner.next();
			System.out.println ("Add a Value:");
			String value= scanner.next();
			map.put(key, value);
			break;
		
		case 3:
			show(map);
			System.out.println ("Seleccione la llave a borrar: ");
			String llaveNueva= scanner.next();
			System.out.println ("Seleccione el nuevo valor: ");
			String valueNuevo= scanner.next();
			map.put(llaveNueva, valueNuevo);
			break;
			
		case 4:
			show(map);
			break;
			
		case 5:
			System.out.println ("The amount of elements are: "+
					map.size());
			break;
			
		case 6:
			break;
		}
		scanner.close();
	}

	private void show(Map<String, String> map) {
		for (Object obj:map.entrySet()) {
			System.out.println(obj);
		}
		
	}
}
