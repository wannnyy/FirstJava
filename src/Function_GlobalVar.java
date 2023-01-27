import java.util.Arrays;

public class Function_GlobalVar {
	static int a = 8 ; // class variable
	public static void main(String []args)
	{
		int []x = {3,4,2,5,0};
		Function_GlobalVar.bubbleSort(x); // We can erase the class name since this method is in this class
		System.out.println(Arrays.toString(x));
		System.out.println(f(5));
			
	}
	// static method 
	static void bubbleSort(int[] d) 
	{
		int n = d.length ; 
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(d[j] > d[j+1])
				{
					int t = d[j] ; 
					d[j] = d[j+1] ; 
					d[j+1] = t ; 
				}
			}
		}
	}
	static int f(int n)
	{
		if(n<2) return n ;
		return f(n-1) + f(n-2) ;
	}
	
	static void g()
	{
		int a = 0 ; // local variable 
		System.out.println(a) ; 
	}
}
