import java.util.Scanner;
public class ifelse {
	public static void main(String []args) 
	{
		// Leap year test 
		Scanner kb = new Scanner(System.in) ;
		int m = kb.nextInt() ; 
		int d ; 
		if(m%400 == 0 || (m%4 ==0 && m%100!=0)) // || means or , && means and 
		{
			d = 29  ; 
		}
		else 
		{
			d = 28 ; 
		}
		System.out.print(d);
	}
}
