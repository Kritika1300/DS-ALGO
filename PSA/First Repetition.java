import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i =0; i<arr.length; i++)
		{
		    arr[i] = sc.nextInt();
		}
		HashSet h = new HashSet();
	     int flag = 0;
	    int i = 0;
		for (i = 0; i < arr.length;i++)
       {
       
        if(!h.contains(arr[i]))
        {
            h.add(arr[i]);
            flag = 1;
        }
        else
        {
           flag = 0;
           break;
        }
        
       }
       if(flag == 0)
       {
         System.out.println(arr[i]);
       }
      
	}
	
}

