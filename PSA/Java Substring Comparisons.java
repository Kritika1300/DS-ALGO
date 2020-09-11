 public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int l1=s.length();
        // if(l1<k)
        // return "";
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for(int i=0;i+k<=l1;i++)
        {
                String b =s.substring(i,i+k);
                if(b.compareTo(smallest)<0)
                {
                    smallest=b;
                }
                if(b.compareTo(largest)>0)
                {
                    largest=b;
                }
           
        }
       
        
       
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

