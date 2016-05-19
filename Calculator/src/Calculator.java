

public class Calculator {
	
	public static void  main(String[] args)
	{
		System.out.println("This Calulator Demo");
		
		Calculator Cal = new Calculator();
		System.out.println("Sum: "+Cal.add(10.5,20.5));
		System.out.println("Sub: "+Cal.sub(30,20));
		System.out.println("mul: "+Cal.mul(10,10));
		
		Cal.add(10, 23);
	}
	
	
	public double add(double a, double b)
	{
		return a+b;
		
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		return a*b; 
	}
}
