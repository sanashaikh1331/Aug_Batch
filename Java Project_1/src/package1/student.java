package package1;

public class student {

	int age;
	int rollNo;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2() 
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		
		student obj1 = new student();
		obj1.age = 29;
		obj1.rollNo = 12345;
		obj1.display1();
		obj1.display2();
		
		System.out.println("Age is = "+ obj1.age);
		System.out.println("Roll Number is = " + obj1.rollNo);

	}

}
