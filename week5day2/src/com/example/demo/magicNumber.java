package com.example.demo;

import java.util.Random;
import java.util.Scanner;

public class magicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int magicnumber = rand.nextInt(100);
		System.out.println(magicnumber);
		int guess = -1;

		Scanner sc = new Scanner(System.in);

		while (guess != magicnumber) {
			System.out.println("Guess a number from 0 to 100:");
			guess = sc.nextInt();
			
			if(guess> magicnumber) {}
			if(guess< magicnumber) {}
			if(guess == magicnumber) {}

			if (guess > magicnumber) {
				System.out.println("too high");
			}
			if (guess < magicnumber) {
				System.out.println("too low");
			} else {
				System.out.println("you win");
			}
		}
		sc.close();
	}

}
