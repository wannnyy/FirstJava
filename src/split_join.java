import java.util.Arrays ;
import java.util.List ; 
import java.util.Scanner; 
import java.util.ArrayList ; 
public class split_join {
	public static void main(String[]args)
	{
		/*String s = "A BB CCCC" ; 
		String[] t = s.split(" ");
		System.out.println(Arrays.toString(t));
		List<String> t1 = Arrays.asList(t); 
		System.out.println(t1) ;
		String u = String.join(", ", t1) ;
		System.out.println(u);*/ 
		
		Scanner kb = new Scanner(System.in) ;
		System.out.println(">>>") ;
		String s = kb.nextLine(); 
		List<String> t = Arrays.asList(s.split(" ")) ; 
		List<String> u = new ArrayList<>() ; 
		for(String w : t)
		{
			if (!u.contains(w))
			{
				u.add(w);
			}
		}
	}
}
