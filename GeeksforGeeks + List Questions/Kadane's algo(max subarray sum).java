/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T != 0){
        T--;
    int N = sc.nextInt();
    int arr[] = new int[N];
    for(int i = 0; i < N; i++){
        arr[i] = sc.nextInt();
    }
    int res = arr[0];
    int maxEnding = arr[0];
    for(int i = 1; i < N; i++){

         maxEnding = Math.max( maxEnding + arr[i],arr[i]);
         res = Math.max(res,maxEnding);
         }
 
    System.out.println(res);
    }
	}
}