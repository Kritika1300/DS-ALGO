import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
    String subString = "";
    boolean valid = false;
    for(int i = 1; i <= s.length()/2; i++){
        subString = s.substring(0,i);
        Long num = Long.parseLong(subString);
        String validstring = subString;
        while(validstring.length() < s.length()){
            validstring = validstring + Long.toString(++num);
        }
        if(s.equals(validstring)){
            valid = true;
            break;
        }
    }
    System.out.println(valid?"YES" +" "+ subString :"NO");


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
