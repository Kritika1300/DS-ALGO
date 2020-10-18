public class Main
{
	public static void main(String[] args) {
		int[] arr = {111,22,3};
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i : arr) {
		    min1 = Math.min(min1,i);
		}
		// 
		for(int i : arr) {
		    if(i!=min1)
		    {
		      min2 = Math.min(min2,i);
		    }
		}
		if(min2 = Integer.MAX_VALUE) {
		    
		}
	}
}