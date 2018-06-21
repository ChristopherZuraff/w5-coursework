package com.example.demo;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal monkey = new Animal("brown", 2, false);
		Animal fish = new Animal("gray", 0, true);
		Primate gibbus = new Primate(true);
		System.out.println(gibbus.getHasThumbs());
		System.out.println(gibbus.getColor());
		System.out.println(gibbus.getNumberOfLegs());

		ArrayList<Animal> myList = new ArrayList<Animal>();
		myList.add(monkey);
		myList.add(fish);
		myList.add(gibbus);

		for (Animal a : myList) {
			System.out.println(a.getColor());
		}
	}

}
