class Solution {
   public int[] intersection(int[] nums1, int[] nums2) {
   HashSet<Integer> h = new HashSet<>();
   HashSet<Integer> f = new HashSet<>();
    for(int i = 0 ; i < nums1.length ; i++){
        if(!h.contains(nums1[i]))
            h.add(nums1[i]);
    }
    for(int j = 0 ; j < nums2.length ; j++){
        if(h.contains(nums2[j]))
            f.add(nums2[j]);
    }
    int a[] = new int [f.size()];
    int index = 0;
    for(int k : f){
      a[index++] = k;
    }
    return a;
}
}