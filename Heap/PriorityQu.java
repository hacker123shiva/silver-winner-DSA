import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution{
    public static void main(String []args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        pq.add(4);
        pq.add(1);
        pq.add(5);
        pq.add(3);
        pq.add(9);
        pq.add(6);

        System.out.println(pq);


        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }


    }
}