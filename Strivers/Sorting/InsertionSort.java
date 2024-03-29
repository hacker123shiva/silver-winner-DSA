 class Solution {
    public static void insertionSort(int[] arr, int size) {
         for(int i=1;i<size;i++){
             for(int j=i;j>0;j--){
                  if(arr[j]<arr[j-1]){
                      int tmp=arr[j];
                      arr[j]=arr[j-1];
                      arr[j-1]=tmp;
                }
                else{
                 break;
             }
             }
         }
    }
}