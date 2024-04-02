 

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKsortedArray {
    static List<List<Pair>> ls=new ArrayList<>();
    static PriorityQueue<Pair> pq=new PriorityQueue<>();

     static class Pair implements Comparable<Pair> {
        int li;
        int di;
        int val;

        public Pair(int li, int di, int val){
            this.li=li;
            this.di=di;
            this.val=val;
        }
        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
        
     }
    
    public static List<Integer> mergeKsortedArray( List<Integer> ... list ){
    List<Integer> ret=new ArrayList<>();
    for(int li=0; li<list.length; li++){
       List<Integer> lf=list[li];
       List<Pair> lp=new ArrayList<>();

       for(int di=0;di<lf.size();di++){
        Pair p=new Pair(li,di,lf.get(di));
        lp.add(p);
       }
      ls.add(lp);
    }

    for(int i=0;i<ls.size();i++){
        pq.add(ls.get(i).get(0));
    }
    
    while(pq.size()>0){
        Pair p=pq.remove();
     ret.add(p.val);
     p.di++; 
     if(p.di<ls.get(p.li).size()){
      pq.add(ls.get(p.li).get(p.di));
     }

    }

    return ret;
    }
 
    

}

class Solution{
    public static void main(String []args){
        List<Integer> l1=new ArrayList<>();
        l1.add(2);
        l1.add(9);
        l1.add(13);
        l1.add(15);

        List<Integer> l2=new ArrayList<>();
        l2.add(5);
        l2.add(10);
        l2.add(16);

        List<Integer> l3=new ArrayList<>();
        l3.add(7);
        l3.add(19);
        l3.add(25);

       List<Integer> ls= MergeKsortedArray.mergeKsortedArray(l1,l2,l3);
        
       System.out.println(ls);
         

    }
}