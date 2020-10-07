import java.util.*;
public class Main
{  
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {1,2,3,4,5,6};
	    int k = 10;
	    if(k == 1)
	    {
	      print(arr);
	    }
	    else
	    { 
	        int start = 0;
	        if(k>arr.length) {
	            k = arr.length;
	        }
	        
	        int end = start+k-1;
	
    	    while(end <= arr.length-1 && start<end)
    	    {
        	    reverse(arr,start,end);
        	    start = end+1;
        	    end = start+k-1;
        	    if(end>arr.length-1)
        	    {
        	        end = arr.length-1;
        	    }
    	    
    	    }
    	     print(arr);
	    }
	}
	public static void print(int[] arr)
	{
	     for(int j:arr)
	     {
	        System.out.print(j+" ");
	     }

	}
	public static void  reverse(int[] arr,int start,int end)
	{
	    while(start<end)
	    {
	        int temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	    }
	}
	
}

