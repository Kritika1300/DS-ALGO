/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
	 while(T != 0)
	 {
	     T--;
	     int N = sc.nextInt();
	     int A[] = new int[N];
	     for(int i = 0 ; i < N ; i++){
	         A[i] =  sc.nextInt();
	     }
	     int countzero = 0;
	     int countone = 0;
	     int counttwo = 0;
	     for(int i = 0 ; i < N ; i++){
	         if(A[i] == 0)
	         {
	             countzero++;
	         }
	         else if (A[i] == 1){
	             countone++;
	         }
	         else{
	             counttwo++;
	         }
	     }
	     for(int i = 0 ; i < countzero ; i++){
	         A[i] = 0;
	     }
	     for(int i = countzero ; i < countzero+countone; i++){
	         A[i] = 1;
	     }
	     for(int i = countzero+countone; i < N ; i++){
	         A[i] = 2;
	     }
	     for(int i = 0 ; i < N ; i++){
	         System.out.print(A[i] + " ");
	     }
	      System.out.print("\n");
	     
	     
	     
	 }
	 
	}
}