import java.util.Arrays;

public class ListVsArray {
	public static void main(String []args) 
	{
		int n = 10 ; 
		int []f = new int[n]; //Array of ints *The size of every array is fixed * 
		f[0] = 0;
		f[1] = 1;
		for(int i=2;i<f.length;i++) 
		{
			f[i] = f[i-1] + f[i-2] ; 
		}
		for(int i=0 ;i<f.length;i++)
		{
			System.out.print(f[i] + " ");
		}
		System.out.println();
		// or We can use 
		System.out.println(Arrays.toString(f));
		
		int[] a = new int[10] ;
		double[] b = new double[100] ;
		String[] s = new String[5] ; 
		
		int[] m = {1,2,3,4,5};
		m = new int[] {1,2,3}; 
		
		int [][] x = {{1,2,3},{4,5,6}} ; 
		int sum = 0 ;
		for(int i=0;i<x.length;i++) 
		{
			for(int j=0;j<x[i].length;j++)
			{
				sum += x[i][j] ; 
			}
		}
		
		sum = 0 ;
		for(int [] row  : x )
		{
			for(int e : row) 
			{
				sum += e ; 
			}
		}
		
		// We can print manually but We can also use Arrays.deepToString(x)
		
		int [][][] y ={ {{1,2},{3,4},{5,6}},{{9,8},{7,6},{5,6}}  }; 
		
		System.out.println(Arrays.deepToString(y)) ;
	}
}
