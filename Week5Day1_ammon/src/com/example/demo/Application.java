package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myFullName("Ammon", "Wombat");
addTogether(5,6);
decideWinner(6);
decideWinner(2);

rollCall("Ammon");
rollCall("Bryan");

String yelled = yell("face tattoos are great");
System.out.println(yelled);

sayMany("butts", 9000);

	}
	public static void sayMany(String word, int times) {
//		for(int i=0; i < times; i++) {
//			System.out.println( i + word);
		
		int i = 0 ;
				while(i< times) {
					System.out.println(i + word);
					i++;
			
		}
	}
	
	public static String yell(String words) {
		return  words + "!";
	}
	public static void myFullName(String firstName, String lastName) {
		System.out.println(firstName +" "+ lastName);
		
	}
	public static void addTogether(int firstNum, int secondNum) {
		System.out.println(firstNum + secondNum);
	}
	public static void decideWinner(int num) {if (num >0 && num <6) {
		System.out.println("Loser");
	}else if (num > 6 && num <=10) {System.out.println("Winner");
	} else {System.out.println("???");
	}
}
	
	public static void rollCall(String person) {if (person == "Ammon") 
	{System.out.println("Instructor " + person);
	
	}else {System.out.println("Student " + person);
}
	}
}