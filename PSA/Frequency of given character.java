import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s = "Hellooeeee ee to ggii";
	    char[] arr = s.toCharArray();
	    int count = 0;
	   // for(int i = 0; i < arr.length; i++) {
	   //     if(arr[i] == 'e') {
	   //         count++;
	   //     }
	   // }
	   for(int i = 0 ; i < s.length(); i++) {
	       if(s.charAt(i) == 'o') {
	           count++;
	       }
	   }
		System.out.println(count);
	}
}