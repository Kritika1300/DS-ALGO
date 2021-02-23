import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String result = "";
	    while(n != 0){
	        int rem = n%2;
	        result += String.valueOf(rem);
	        n = n/2;
	    }
	    StringBuffer s = new StringBuffer();
	    s.append(result);
		System.out.print(s.reverse());
	}
}
