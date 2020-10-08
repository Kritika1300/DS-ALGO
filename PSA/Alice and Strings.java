import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    String s2 = sc.next();    
        if(compatibleStrings(s1,s2))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
	}
    public static boolean compatibleStrings(String s1,String s2){
      if(s1.length()!=s2.length())
      {
          return false;
      }
      char[] arr1 = s1.toCharArray();
      char[] arr2 = s2.toCharArray();
    
      for(int i = 0; i < arr1.length - 1; i++)
      {
          if(arr2[i]-arr1[i]<arr2[i+1]-arr1[i+1]) 
          {
             // System.out.println((arr1[i]-arr2[i])+" "+ (arr1[i+1]-arr2[i+1]));
             return false;
          }
         
      }
      return true;
    }
}

