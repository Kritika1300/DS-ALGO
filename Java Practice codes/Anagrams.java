import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
    String a = scan.next().toLowerCase();
    String b = scan.next().toLowerCase();
    char arr[]=a.toCharArray();
    char brr[]=b.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(brr);
    a = new String(arr);
    b = new String(brr);
    
    if(a.equals(b))
        System.out.println("Yes");
    else
        System.out.println("No");
    
	}

}

