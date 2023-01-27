import java.util.HashSet ;
import java.util.Set; 
import java.util.TreeSet ;
public class setvsSet {
	public static void main(String args[])
	{
		Set<Integer> s = new HashSet<>() ; 
		Set<Integer> g = new TreeSet<>() ; 
		for (int i=0;i<6;i++)
		{
			s.add(i);
			g.add(i);
		}
		s.remove(3);
		System.out.println(s); 
		if (s.contains(4))
		{
			System.out.println("4444");
		}
		for (int x : s) // Might not be in order 
		{
			System.out.print(x+" ");
		}
		System.out.println(); 
		for (int x : g)
		{
			System.out.print(x+ " ");
		}
	}
}
