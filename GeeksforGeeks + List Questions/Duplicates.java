// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class Delete_Duplicate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int a[] = new int[N];
			for(int i=0; i<N; i++)
				a[i] = sc.nextInt();
			
			GfG g = new GfG();
			int n = g.remove_duplicate(a,N);
			
			for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
			
			System.out.println();
			
		T--;
		}
	}
}// } Driver Code Ends


class GfG
{
        /*You are required to complete this function */
	int remove_duplicate(int a[], int N)
	{       
	       int j =0;
	       int temp[] = new int[N];
	       if(N == 0 || N ==1)
	       {
	           return 1;
	       }
    	   for(int i = 0 ; i < a.length-1 ; i++) {
    		    if(a[i] != a[i+1])
    		    {
    		        temp[j] = a[i];
    		        j++;
    		    }
    		    
    		}
    		temp[j] = a[a.length-1];
    		j++;
    		for(int i = 0 ; i < j ; i++)
    		{
    		    a[i] = temp [i];
    		}
    		return j;
    		
    	
}
}
