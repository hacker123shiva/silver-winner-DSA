import java.util.Comparator;
import java.util.PriorityQueue;

class Solution{
    public static void main(String []args){
        PriorityQueue<Integer> pq=new PriorityQueue<>( );

         int []arr=new int[]{17,3,4,1,9,10,10};
         int k=3;

         for(int i=0;i<arr.length;i++){
            if(i<k){
                pq.add(arr[i]);
            }else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
         }

         System.out.println(pq);
     
    }
}