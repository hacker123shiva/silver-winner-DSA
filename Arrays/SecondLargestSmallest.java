 

 class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
     int smax=Integer.MIN_VALUE;
     int max=Integer.MIN_VALUE;

     int smin=Integer.MAX_VALUE;
     int min=Integer.MAX_VALUE;

     for(int i=0;i<n;i++){
         if(a[i]>=max){
             smax=max;
             max=a[i];
         } else if(a[i]>=smax){
             smax=a[i];
         }
         if(a[i]<=min){
             smin=min;
             min=a[i];
         } else if(a[i]<=smin){
             smin=a[i];
         }
     }
    return new int[]{smax,smin};
    }
}