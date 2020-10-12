import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
    HashMap <Integer,Integer> m = new HashMap<> ();

    for(int i : arr)
    {
        if(!m.containsKey(i))
        {
            m.put(i,1);
        }
        else
        {
            m.put(i,m.get(i)+1);
        }
    }
    System.out.println(m);
    int max = Integer.MIN_VALUE;
    for(int i : m.keySet())
    {
       if(m.get(i)>max)
       {
           max = m.get(i);
       }
    }
    int sum = 0;
    for(int i : m.keySet())
    {
         if(m.get(i)!=max)
         {
             sum = sum + m.get(i);
         }
         System.out.println(sum);
    }

    return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
