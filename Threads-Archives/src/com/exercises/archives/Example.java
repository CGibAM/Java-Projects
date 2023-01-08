package com.exercises.archives;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Example {

	public static void main(String[] args) {
		try {
			Example obj = new Example();
			obj.start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void start() throws Exception {
		/* First we get a file path to work with surrounded by a try/catch */
		Path path = Paths.get("C:\\Users\\example\\exaple\\file.txt");
		System.out.println(path);
		// another way to find the path
		path = Paths.get("C:", "Users", "example", "example", "file.txt");
		System.out.println(path);
		// another way to find the path
		path = Paths.get("C:/Users/ingan/desktop/archivo.txt");
		System.out.println(path);

		System.out.println(path.getFileName());// method to get the file name in path

		System.out.println("Verify if a file exists");
		if (!Files.exists(path)) {
			Files.createFile(path);// method used to create a file on path
			Files.writeString(path, "File automatically created"); /* This method overwrites all the file */

			// This method receives bytes, and has the option to add text at the end of the
			// file
			Files.write(path, "\n Second line as bytes array".getBytes(), StandardOpenOption.APPEND);
		}

		System.out.println("Write on a file");
		FileWriter file = new FileWriter(path.toFile(), true); /*
																 * the "true" indicates if the text is added at the end
																 * of the file; it overwrites the file otherwise
																 */
		BufferedWriter writer = new BufferedWriter(file);
		writer.append("Executed program\n");
		writer.flush(); // Sends to the file whatever it has on the buffer
		writer.close();// Close the connection

		System.out.println("Read file:");
		System.out.println("-----------------------------------------------------");
		String content = Files.readString(path);// To read all of the file
		System.out.println(content);
		System.out.println("-----------------------------------------------------");

		System.out.println("Read line by line:");
		BufferedReader bufferedReader = Files.newBufferedReader(path);
		String line = bufferedReader.readLine();// Read file line by line
		System.out.println("-----------------------------------------------------");
		while (line != null) {// it will read the file while the next line it's not empty
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		System.out.println("-----------------------------------------------------");
		bufferedReader.close();
	}

}