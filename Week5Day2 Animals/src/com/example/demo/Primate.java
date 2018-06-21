package com.example.demo;

public class Primate extends Animal {

	private boolean hasThumbs;

	public Primate(boolean hasThumbs) {
		super("brown", 2, false);
		this.hasThumbs = hasThumbs;
	}

	public void matingCry() {
		System.out.println("hey baby hey baby");
	}

	public void setHasThumbs(boolean hasThumbs) {
		this.hasThumbs = hasThumbs;
	}

	public boolean getHasThumbs() {
		return this.hasThumbs;
	}

}
