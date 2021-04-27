class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
    int arr[] = new int [n+m];
    int j = n+m;
    for(int i = 0 ; i < n ; i++){
        arr[i] = arr1[i];
    }
     int k = n;
     for(int i = 0 ; i < m ; i++){
        arr[n] = arr2[i];
        n++;
    }
       Arrays.sort(arr);
       for(int i = 0 ; i < j ; i++){
       System.out.print(arr[i]);
    }
      
       
    }
}