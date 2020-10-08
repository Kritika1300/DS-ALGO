class Solution {
    public int nthUglyNumber(int n) {
       ArrayList<Integer> set = new ArrayList<>();
       int i2 = 0;
       int i3 = 0;
       int i5 = 0;  // i2 3   i3  2
       set.add(1);
       while(set.size() < n){
           int a = 2*set.get(i2);
           int b = 3*set.get(i3);
           int c = 5*set.get(i5);
           int min = Math.min(a,Math.min(b,c));
          if(min == a)
            i2++;
          if (min == b)
            i3++;
          if(min == c)
             i5++;
           set.add(min);   
       }
        return set.get(n-1);
    }
}