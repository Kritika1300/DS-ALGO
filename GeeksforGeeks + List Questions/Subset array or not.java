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
    int m = sc.nextInt();
    int n = sc.nextInt();
    int arr1[] = new int[m];
    for(int i = 0; i < m; i++){
        arr1[i] = sc.nextInt();
    }
    int arr2[] = new int[n];
    for(int j = 0; j < n; j++){
        arr2[j] = sc.nextInt();
    }
    boolean flag = true;
    HashSet<Integer> h = new HashSet<>();
    for(int i = 0; i < m; i++){
        h.add(arr1[i]); 
    }
    for(int i = 0; i < n; i++){
        if(!h.contains(arr2[i])){
            flag = false;
            break;
        }
        else{
            flag = true;
        }
    }
    if(flag){
        System.out.println("Yes");
    }
    else{
         System.out.println("No");
    }
    
	}
}
}