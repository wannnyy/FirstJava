import java.util.ArrayList ;
import java.util.LinkedList; 
import java.util.List ; 
import java.util.Arrays ; 
public class listvsList {
	public static void main(String []args) 
	{
		//ArrayList<Integer> a = new ArrayList<Integer>() ; 
		//LinkedList<Integer> a = new LinkedList<>() ; 
		
		// ArrayList and LinkedList both are list 
		// So we can do this 
		List<Integer> a = new ArrayList<>() ;
		List<Integer> b = new LinkedList<>() ;
		
		for (int i=0;i<5;i++)
		{
			a.add(i) ;   // Same as append in Python 
		}
		System.out.println(a) ; // ***most method works in the same way but differ by the speed ***
		a.add(0,999) ;
		System.out.println(a) ; 
		a.set(2, 2222) ; // a[2] = 2222 
		a.set(3, a.get(3)+10000) ; 
		System.out.println(a) ; 
		a.remove(1) ; // remove index 1
		System.out.println(a) ; 
		
		List<Integer> c = Arrays.asList(1,2,3,4,5) ; 
		System.out.println(c) ; 
		a.addAll(c) ; // add entire b at the end of a 
		System.out.println(a) ; 
		a.addAll(0,c) ; 
		System.out.println(a) ; 
		
		for(int x : a)
		{
			System.out.print(x+" ");
		}
		
		
		

	}
}
