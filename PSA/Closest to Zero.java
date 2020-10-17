//https://code-divas-2020.hackerearth.com/challenges/test/practice-test-50714/problems/a357bce284324c1bb3708e12d78a5d22/
import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] arr_A = br.readLine().split(" ");
        for(int i_A = 0; i_A < N; i_A++) {
        	A[i_A] = Integer.parseInt(arr_A[i_A]);
        }
        int out_ = Solve(N, A);
        System.out.println(out_);

         wr.close();
         br.close();
    }
    static int Solve(int N, int[] A){
    int minPositive = Integer.MAX_VALUE;
    int maxNegative = Integer.MIN_VALUE;
    for(int i = 0; i < A.length; i++)
    {
        if(A[i] == 0)
        {
            return 0;
        }
        if(A[i] > 0)
        {
           minPositive = Math.min(minPositive,A[i]);
        }
        if(A[i] < 0)
        {
           maxNegative = Math.max(maxNegative,A[i]);
        }
       
    }
        if(Math.abs(minPositive) == Math.abs(maxNegative))
        {
            return minPositive;
        }
        else if(Math.abs(minPositive) > Math.abs(maxNegative))
        {
            return maxNegative;
        }
        else 
        {
            return minPositive;
        }
        
    }
}