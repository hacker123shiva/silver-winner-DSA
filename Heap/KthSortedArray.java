 

import java.util.Arrays;
import java.util.PriorityQueue;

  class Solution {
    public static void main(String []args){
        int []arr=new int[]{2,3,1,4,6,7,8,9};
        int k=2;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=k;i++){
           pq.add(arr[i]);
        }
         
        int sortedArr[]=new int[arr.length];
        int idx=0;
        for(int i=k+1;i<arr.length;i++){
             sortedArr[idx]=pq.remove();
             pq.add(arr[i]);
             idx++;
        }

        while(pq.size()>0){
            sortedArr[idx++]=pq.remove();
        }

        System.out.println(Arrays.toString(sortedArr));

    }
}
