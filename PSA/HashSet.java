https://www.hackerrank.com/challenges/java-hashset/copy-from/168498056
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
       HashSet<String> h = new HashSet<String>();
        for(int j=0; j < t; j++)
       {
           String sa=pair_left[j]+" "+pair_right[j];
            h.add(sa);
            System.out.println(h.size());
       }

    }
}