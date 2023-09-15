package package1;

public class TestCase {
	
	public void m1()
	{
		System.out.println("First line of code");
		System.out.println("Second line of code");
	}
	public void m2()
	{
		System.out.println("Third line of the code");
		System.out.println("Fourth line of the code");
	}

	public static void main(String[] args) {
		System.out.println("I am the main method");
		System.out.println("I am the boss");
		
		TestCase obj = new TestCase();
		System.out.println("Second line of the main method");
		obj.m1();
		System.out.println("Main Method");
		obj.m2();
		System.out.println("Final line of the main method");

	}

}
