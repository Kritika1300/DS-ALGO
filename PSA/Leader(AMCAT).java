import java.util.*;
class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
      
        for(int i = 0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
          int i;
        int j;
        for(i = 0; i<arr.length; i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    break;
                }
                
            }
            if(j == arr.length)
            {
                System.out.println(arr[i]);
            }
        }
        
    }
}
