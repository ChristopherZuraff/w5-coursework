package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
doFibonacci();
//for (int i = 1; i <40;  i++) {
//	System.out.println(doFibonacci(i));
}
	
	
	public static void doFibonacci() {	
	int numF = 46;
		int start = 1;
		int total =1;		
		for(int i=0; i< numF; i++){
			
			System.out.println(start);
			total += start;
			start = total-start;
		
			
		}
		
		
		
	}

}
