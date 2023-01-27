import java.util.HashMap ;
import java.util.Map ;
import java.util.Map.Entry;
public class DictVsMap {
	public static void main(String []args)
	{
		Map<String,String> d = new HashMap<>() ;
		d.put("MO", "Monday") ; // Key and Value 
		d.put("TU", "Tuesday") ;
		System.out.println(d);
		System.out.println(d.get("TU")) ;
		if(d.containsKey("MO")) // have d.containsValue("Monday") as well 
		{
			System.out.println(d.get("MO"));
		}
		else
		{
			System.out.println("????") ;
		}
		
		for(String x : d.keySet())
		{
			System.out.println(x);
		}
		
		for(Entry<String,String> x : d.entrySet())
		{
			System.out.println(x);
		}
		
		
	}
}
