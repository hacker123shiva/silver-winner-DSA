 class Solution {
    public static void selectionSort(int[] arr) {
        int n=arr.length;
       for(int i=0;i<n-1;i++){
           int min_idx=i;
           for(int j=i+1;j<n;j++){
               if(arr[min_idx]>arr[j]){
                   min_idx=j;
               }
           }
           int tmp=arr[i];
           arr[i]=arr[min_idx];
           arr[min_idx]=tmp;
       }
    }
}