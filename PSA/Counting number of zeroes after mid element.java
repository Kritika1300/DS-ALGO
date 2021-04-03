import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,2,3,0,0,0,0,3};
	    int start = arr.length / 2 + 1;
	    int count = 0;
	    for(int i = start; i < arr.length; i++) {
	        if(arr[i] == 0) {
	            count++;
	        }
	    }
		System.out.println(count);
	}
}
