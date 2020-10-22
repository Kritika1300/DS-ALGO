import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {-1,2,3,4,-4,-5};
	    for(int i = 1 ; i<arr.length; i++){
	        if(arr[i] < 0 && arr[i-1] >= 0)
	        {
	            int temp = arr[i-1];
	            arr[i-1] = arr[i];
	            arr[i] = temp;
	            i = 0;
	            
	        }
	    }
	   
	    for(int i =0 ; i<arr.length; i++)
	    {
	        System.out.print(arr[i] + " ");
	    }
		
	}
}
