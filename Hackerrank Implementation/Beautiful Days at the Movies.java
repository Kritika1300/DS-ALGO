import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
          int count = 0;
          for(int c = i ; c <= j; c++) {
              int res = 0;
              int n = c;
              while( n != 0) {
                  int rem = n%10;
                  res = res*10 + rem;
                  n = n/10;
              }
              if(Math.abs(c - res)%k == 0){
                  count++;
              }
          }
          return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
