package com.example.demo;

public class Animal {

	private String color;
	private boolean layEggs;

	private int numberOfLegs;

	public Animal(String color, int numberOfLegs, boolean layEggs) {
		super();
		this.color = color;
		this.numberOfLegs = numberOfLegs;
		this.layEggs = layEggs;
	}

	public String getColor() {
		return color;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

}
