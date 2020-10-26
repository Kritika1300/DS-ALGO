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
    int A[] = new int[N];
    int count = 0;
    for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
    }
    for(int i = 0, j = N-1 ; i <= j ; ){
       if(A[i] == A[j]){
           i++;
           j--;
       }
        else if(A[i] < A[j]){
           i++;
           A[i] = A[i] + A[i-1];
         
           count++;
       }
       else{
           
           j--;
           A[j] = A[j] + A[j+1];
           
           count++;
       }
       }
       System.out.println(count);
    }
    
    
	}
}