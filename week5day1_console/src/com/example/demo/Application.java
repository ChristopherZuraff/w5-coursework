package com.example.demo;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner choose = new Scanner(System.in);
		String menuOption =null;
		
		menu();
		
		
		while(!"exit".equals(menuOption)) {
			menuOption = choose.nextLine();
			//System.out.println(menuOption);
			switch (menuOption) {
			case "b":
				default:
					break;
				case "c":
					System.out.println("Chris");
					break;
				default:
					break;
					
				case "z":
					getRandomNumber();
					break;
					default:
						break;
			}
			menu ();
		}
		choose.close();
	}
	
	private static void getRandomNumber( ) {
		System.out.println(Math.floor(Math.random()*100+1));
	}
private static void  menu() {
	System.out.println("My Menu");
	System.out.println("b) for beans");
	System.out.println("c) for Chris");
	System.out.println("z) random number");
	System.out.println();
	
}
}
