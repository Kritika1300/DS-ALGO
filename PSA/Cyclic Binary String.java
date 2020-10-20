import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    public static int maximumPower(String s) {
        int length = s.length();
        int count = 1;
        int ans = 0;
        if(!s.contains("1")) return -1;
        if(!s.contains("0")) return 0;
        int counts = 0;
        int counte = length-1;
       
            while(s.charAt(counts) == '0')
            {
            counts++;
            }
            while(s.charAt(counte) == '0')
            {
            counte--;
            }
            counte = (length -1)-counte;
            ans = counts+counte;
        
        
        for(int i = 0 ; i < length - 1 ; i++)
        {   
            if(s.charAt(i) == '0' && s.charAt(i+1) == '0'){
                 count ++;
            }
            else{
                ans = Math.max(ans,count);
                count = 1;
            }

        }
        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.maximumPower(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}