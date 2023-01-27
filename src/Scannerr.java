import java.util.Scanner ;

public class Scannerr {
	public static void main(String args[]) 
	{
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt() ; 
		double b = kb.nextDouble() ;
		String c = kb.next(); 
		//String d = kb.next();
		// 123 321 Python Ok
		// We can use kb.nextline() to detect from python to the end of line 
		System.out.print(a +  ", " + b + ", " + c );
		
	}
}
