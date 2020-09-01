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
		LinkedHashSet h = new LinkedHashSet();
	    int flag = 1;
	    int i = 0;
		for (i = 0; i < arr.length;i++)
       {
          h.add(arr[i]);
        }
        int b [] = new int[h.size()];
        int k =0;
        Iterator it = h.iterator();
        while(it.hasNext())
       { 
               b[k++]=(int) it.next();
        }
        for(int j = 0 ; j < b.length ; j++)
        {
            System.out.println(b[j]);
        }
      
	}
	
}
