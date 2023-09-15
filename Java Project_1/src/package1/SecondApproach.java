package package1;
//with the help of method
public class SecondApproach {
	
	int a, b, c, d, e;
	
	public void m1(int a1, int b1, int c1, int d1, int e1)
	{
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;
	}
	public static void main(String[] args) {
		SecondApproach obj = new SecondApproach();
		obj.m1(111, 222, 333, 444, 555);
	}

}
