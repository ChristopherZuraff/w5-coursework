package com.example.demo;

public class Application {

	public static void main(String[] args) {
	
		Square sqr = new Square(5);
		//System.out.println(sqr.area());
		sayArea(sqr);
		
		Rectangle rect = new Rectangle(3,4);
		//System.out.println(rect.area());
		sayArea(rect);
		
		Circle cir = new Circle(5);
		//System.out.println(cir.area());
		sayArea(cir);
	}

	public static void sayArea(Shape sh) {
		System.out.println(sh.area());
	}
}
