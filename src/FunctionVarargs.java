
public class FunctionVarargs {
	public static void main(String []args)
	{
		System.out.println(prod(1.0,2));
		System.out.println(prod(1.0,2,3));
		System.out.println(prod(1,2,3,4));
		System.out.println(args.length);
		for(String x : args)
		{
			System.out.print(x + " ") ; 
		}
	}
	/*
	 * Hello.java --> compile --> Hello.class (ByteCode)
	 * JVM - Java Virtual Machine
	 * Platform independent works on macOS ,window ,Linux ,etc...
	 * 
	 * main fuction also takes args -> Array of String 
	 * You can use terminal and run this program that takes multiple args
	 * java FunctionVarargs Wanny OK
	 * 
	 * 
	 * 
	 * */
	
	// Method overloading   *can be the same name but have to take different arguments*
	static double prod(double a,double b )
	{
		System.out.println("prod1");
		return a*b ;
	}
	static double prod(double a ,double b ,double c )
	{
		
		System.out.println("prod2");
		return a*b*c ; 
	}
	// varargs in Java 
	// parameter args is array 
	static double prod(double a , double... args)
	{
		
		System.out.println("prod3");
		double p = a ;
		for (double x : args)
		{
			p *= x ; 
		}
		return p ;
	}
}
