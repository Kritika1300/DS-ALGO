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
	    int M = sc.nextInt();
	    int A[] = new int[N];
	    int B[] = new int[M];
	    for(int i = 0 ; i < N ; i++){
	        A[i] = sc.nextInt();
	    }
	    for(int i = 0 ; i < M ; i++){
	        B[i] = sc.nextInt();
	    }
	    HashSet h = new HashSet();
	    for(int i = 0 ; i < N ; i++){
	        if(!h.contains(A[i]))
	          h.add(A[i]);
	    }
	    for(int i = 0 ; i < M ; i++){
	        if(!h.contains(B[i])) 
	          h.add(B[i]);
	    }
	    System.out.println(h.size());
	    
	}
	}
}