
public class BasicString {
	public static void main(String []args) 
	{
		String s = "I am a \' \"string" ;  // Use \' \" to print ' and " 
		char c = 'x' ; 
		String t = s + s ; 
		t = s + 2 + true; 
		
		System.out.println(t);
		
		int k = s.length() ; 
		t = s.trim(); // Just like strip() in Python 
		t = s.toLowerCase() ;
		t = s.toUpperCase() ; 
		k = s.indexOf("OK") ; // Just like find() in Python 
		k = s.indexOf("OK",10) ; // Start from index 10 
		
		boolean b = s.contains("OK") ; 
		
		s = "OK" ; 
		t = "ok".toUpperCase();
		String u = 'O' + "K" ;
		
		System.out.println(s == t) ; 
		System.out.println(s == u) ; 
		System.out.println(u == t) ; // Using == to compare equal of string is too risky  
		
		/* 			We should use .equals method instead     		*/
		System.out.println();
		
		System.out.println(s.equals(t)) ; 
		System.out.println(s.equals(u)) ; 
		System.out.println(u.equals(t)) ;  
		
		
		System.out.println();
		
		
		if (s.compareTo(t) == 0 ) // We use .compareTo() method instead of == ,  <= , >= in Python 
		{
			System.out.println(0) ; 
		}
		
		s = "abcdefghij"; 
		for(char x : s.toCharArray())
		{
			System.out.print(x + "-");
		}
		
		t = s.substring(2,3);  // s[2]
		t = s.substring(2,10); // s[2:10]
		t = s.substring(0,8);  // s[:8]
		t = s.substring(2);    // s[2:]
		t = s.substring(s.length()- 1); // s[-1]
		
		
		
		
	}
}
