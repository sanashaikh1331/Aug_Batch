package package1;

public class ConstuctorPractice {
	
	public ConstuctorPractice() 
	{
		System.out.println("Default Constuctor");
	}
	public ConstuctorPractice(int a)
	{
		System.out.println("One Parameterised Constuctor");
	}
	public ConstuctorPractice(int a, int b)
	{
		System.out.println("Two Parameterised Consuctor");
	}
	public ConstuctorPractice(int a, int b,int c)
	{
		System.out.println("Three Parameterised Consturctor");
	}
	public ConstuctorPractice(int a, int b,int c,int d)
	{
		System.out.println("Four Paramerised Constuctor");
	}

	public static void main(String[] args) {
	
		ConstuctorPractice obj = new ConstuctorPractice();
		ConstuctorPractice obj1 = new ConstuctorPractice(111);
		ConstuctorPractice obj2 = new ConstuctorPractice(1, 2);
		ConstuctorPractice obj3 = new ConstuctorPractice(1, 2, 3);
		ConstuctorPractice obj4 = new ConstuctorPractice(1, 2, 3, 4);

	}

}
