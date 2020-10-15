import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
    Boolean flag = false;
    StringBuffer s1 = new StringBuffer();
    s1.append(s);
    String f = s1.reverse().toString();
        for(int i = 0; i< f.length()-1; i++)
        {
          int a = Math.abs(s.charAt(i) - s.charAt(i+1));
          int b =  Math.abs(f.charAt(i) - f.charAt(i+1));
          if(a == b)
          {
              flag = true;
          }
          else{
               flag = false;
               break;

          }
          
        }
        if(flag)
        {
            return "Funny";
        }
        return "Not Funny";
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}