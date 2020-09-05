https://www.hackerrank.com/challenges/java-string-tokens/submissions/code/168493976
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.length() > 0)
        {
            String []arr=s.split("[\\s!,?._\\'@]+");

            System.out.println(arr.length);

            for(int i=0;i<arr.length;i++)
                System.out.println(arr[i]);
        }else {
        System.out.println(0);
    }
        // Write your code here.
        scan.close();
    }
}

