import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {
    int[] lcase = new int[26];
    int[] ucase = new int[26];
    for(int i = 0 ; i<s.length(); i++){
        if(s.charAt(i)>= 97 && s.charAt(i)<= 122)
        {
            lcase[s.charAt(i)-97]++;
        }
         if(s.charAt(i)>= 65 && s.charAt(i)<= 90)
        {
            ucase[s.charAt(i)-65]++;
        }
    }
    for(int j = 0; j< 26; j++)
    {
        if(lcase[j]==0 && ucase[j] == 0)
        {
            return "not pangram";
        }
    }
    
    return "pangram";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
