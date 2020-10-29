import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
    static int anagram(String s) {
        int q = s.length()/2;
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int count = 0;
        if(s.length()%2 != 0 ) { return -1;}
        
                String s1 = s.substring(0,q);
                String s2 = s.substring(q,s.length());
                for(int i = 0; i<s1.length(); i++)
                {
                    arr1[s1.charAt(i) - 'a']++;
                    arr2[s2.charAt(i) - 'a']++;
                }
                for(int i = 0; i< 26; i++)
                {
                    if(arr1[i] - arr2[i] != 0)
                    {
                        count =  Math.abs(arr1[i] - arr2[i]);
                    }
                }
              return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}