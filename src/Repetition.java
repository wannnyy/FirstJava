
public class Repetition {
	public static void main(String []args) 
	{
		int n = 2000 ;
		int b = 0 ;
		while (n > 0)  // while loop 
		{
			b += 1 ;
			n /= 2 ; 
		}
		System.out.println(b);
		for(int i=0;i<10;i++)  // for loop 
		{
			System.out.println(i) ;  
		}
	}
}
