package com.example.demo;

public class Circle implements Shape{
private float radius;

public Circle(float radius) {
	this.radius = radius;
}
public float area() {
	return 3.14159f * radius * radius;
}

}
