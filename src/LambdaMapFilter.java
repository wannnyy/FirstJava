import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMapFilter {
	public static void main(String []args)
	{
		List<Integer> a,b ; 
		a = Arrays.asList(1,2,3,4,5) ; 
		b = new ArrayList<>() ; 
		for (int e : a)b.add(2*e) ;
		System.out.println(b);
		
		b = a.stream().map( e -> 2*e ).collect(Collectors.toList());
		System.out.println(b);
		
		b.clear();
		
		for (int e : a)
			if(e%2 == 0) b.add(e) ;
		System.out.println(b);
		
		b = a.stream().filter( e -> e%2 == 0 ).collect(Collectors.toList());
		System.out.println(b);
		
		b.clear();
		b = a.stream().filter( e -> e%2 == 0 ).map(e -> 2*e).collect(Collectors.toList());
		System.out.println(b);
	}
}
