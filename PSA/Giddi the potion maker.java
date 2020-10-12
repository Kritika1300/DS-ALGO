//https://practice.geeksforgeeks.org/contest-problem/giddi-the-potion-maker/1/
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.oneForAll(n,arr));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public int gcd(int a, int b) {
       if (b==0)
        return a;
        return gcd(b,a%b);
    }
    public String oneForAll(int N , int arr[]) {
        int ans = arr[0];
        for(int i=0;i<N;i++){
            ans = gcd(ans,arr[i]);
        }
        if(ans==1)
            return "Rewarded";
        else
            return "NotRewarded";
    }
    
}