package com.example.collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		MapExample obj = new MapExample();
		obj.start();

	}
//How to create a hashmap
	private void start() {
		Map<String, Integer> colection= new HashMap<String, Integer>();//Without indices
		colection.put("1", 1); 
		//Add to a hashMAp, Key and value
		//coleccion.entrySet(),returns 1 for everyone of the sets (tuple) of the collection
		for (Object obj:colection.entrySet()) {
			System.out.println(obj);
		}
		for (Object obj: colection.keySet()) {
			System.out.println(obj);//Returns only the keys
		}
		for (Object obj: colection.values()) {
			System.out.println(obj);//Returns only the values
		}
		Object obj= colection.get("1");
			System.out.println(obj); //Return only the value of the key
	}

}
