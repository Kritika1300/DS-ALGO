import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    HashMap<Integer,Integer> m = new HashMap<> ();
    int count = 0;
    for(int i : arr)
    {
        if(!m.containsKey(arr.get(i)))
        {
            m.put(arr.get(i),count);
        }
        else
        {
            m.put(arr.get(i),m.get(arr.get(i))+1);
        }
    }
    int max1 = Integer.MIN_VALUE;
    int ans = 1;
    for(Integer i : m.keySet())
    {
       if(m.get(i)>max1)
       {
           max1 = m.get(i);
            ans = i-1;
       }
    }
    return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
