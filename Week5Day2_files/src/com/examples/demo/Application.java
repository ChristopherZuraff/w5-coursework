package com.examples.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	private static String fileName = "movies.txt";
	private static ArrayList<String> movies = new ArrayList<String>();

	public static void main(String[] args) {

		loadMovies();

		Scanner sc = new Scanner(System.in);
		int menuChoice = -1;

		while (menuChoice != 0) {
			// print menu
			printMenu();
			menuChoice = sc.nextInt();
			sc.nextLine();
			switch (menuChoice) {
			case 1:
				System.out.print("Name of Movie:");
				String movie = sc.nextLine();
				// movies.add(sc.nextLine());
				movies.add(movie);
				break;
			case 2:
				displayMovies();
				System.out.println("Number of Movie:");
				int movieToEdit = sc.nextInt();
				sc.nextLine();
				System.out.println("Name of Movie:");
				String newName = sc.next();
				movies.set(movieToEdit, newName);
				break;
			case 3:
				displayMovies();

				break;
			case 4:
				saveMovies();
				break;
			case 5:
				displayMovies();
				System.out.println("Number of Movie to Delete");
				int movieToDelete = sc.nextInt();
				sc.nextLine();
				movies.remove(movieToDelete);
				break;
			default:
				break;
			}
		}
		sc.close();
	}

	// try {
	// BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	// writer.write("Who lives in a pineapple under the sea");
	// writer.close();
	// }catch (IOException ex) {
	//
	// }
	// try {
	// BufferedReader reader =new BufferedReader(new FileReader(fileName));
	// String line;
	// while((line = reader.readLine()) != null){
	// System.out.println(line);
	// }
	// }
	// catch (IOException ex) {
	//
	// }

	public static void printMenu() {
		System.out.println("----------");
		System.out.println("| KnotFlix |");
		System.out.println("----------");
		System.out.println("1) Add Movie");
		System.out.println("2) Edit Movies");
		System.out.println("3) Display Movies");
		System.out.println("4) Save Movies");
		System.out.println("5) Delete Movie");
		System.out.println("0) Exit)");
		System.out.println("-----------");
		System.out.println("Menu choice:");

	}

	public static void displayMovies() {
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(i + ")" + movies.get(i));
		}
	}

	public static void saveMovies() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			for (int i = 0; i < movies.size(); i++) {
				writer.write(movies.get(i));
				writer.newLine();
			}
			writer.close();
		} catch (IOException ex) {

		}
	}

	public static void loadMovies() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				movies.add(line);
			}
			reader.close();
		} catch (IOException ex) {

		}
	}
}
