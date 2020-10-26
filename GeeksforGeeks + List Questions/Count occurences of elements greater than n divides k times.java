// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new CountElement().countOccurence(arr, n, k));
        }
    }
}
// } Driver Code Ends


class CountElement {

    // Function to find element with count more than n/k times
    // arr: input array
    public int countOccurence(int[] arr, int n, int k) {
        int target = n/k;
        int count = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],1);
            }
            else{
                h.put(arr[i],h.get(arr[i]) + 1);
            }
            }
            for(int i : h.keySet()){
              if(h.get(i) > target)
              {
                  count++;
              }
            }
           
        
    return count;
    }
}
