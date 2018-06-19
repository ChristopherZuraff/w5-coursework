package week5day1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello world");
		
		sayMyName("Chris");
		
		int x=5;
		int result = square(5);
		System.out.println(result);
		String myFullName = "Chris" + "Zuraff";
		System.out.println(myFullName);
	}

	private static int square(int num) {
		// TODO Auto-generated method stub
		return num * num;
	}

	public static void sayMyName(String name) {
		System.out.println(name);

	}
}
