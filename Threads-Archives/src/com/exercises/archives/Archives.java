package com.exercises.archives;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.*;
import java.util.ArrayList;

public class Archives {
	public ArrayList<Employee> list = new ArrayList<>();

	public static void main(String[] args) {
		try {
			Archives obj = new Archives();
			obj.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void start() throws Exception {// throw an exception directly on a method
		Path path = Paths
				.get("C:\\Example\\Example\\Example\\Eclipse_Workspace\\Threads-Files\\src\\com\\exercises\\archives");
		// Create archive as utf-8
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedReader bufferedReader = Files.newBufferedReader(path);
		String linea = bufferedReader.readLine();
		while (linea != null) {
			String[] arr = linea.split("'");
			String name = "", age = "", performance = "", id = "";
			linea = bufferedReader.readLine();
			for (String value : arr) {
				String[] tuple = value.split("=");
				if (tuple[0].equals("ID")) {
					id = tuple[1];
				}
				if (tuple[0].equals("Name")) {
					name = tuple[1];
				}
				if (tuple[0].equals("Edad")) {
					age = tuple[1];
				}
				if (tuple[0].equals("Negro")) {
					performance = tuple[1];
				}
			}
			Employee employee = new Employee(Integer.parseInt(id), name, Integer.parseInt(age),
					Boolean.parseBoolean(performance));

			this.list.add(employee);
		}
		bufferedReader.close();
		for (Employee empleado : this.list) {
			empleado.print();
		}

		FileWriter file = new FileWriter(path.toFile(), true);
		BufferedWriter writer = new BufferedWriter(file);
		writer.append("ID=3'Name=Homer'Edad=36'Great Performance=false \n");
		writer.flush();
		writer.close();
	}

}
