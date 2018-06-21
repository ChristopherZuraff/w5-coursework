package com.example.demo;

public class Square implements Shape {
 
	
	private float length;
 public Square(float length) {
	 this.length = length;
 }
 public float area() {
	 return length * length;
 }
}
