import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MergeInterval {
    public static class Pair implements Comparable<Pair>{
        int st;
        int et;
       

        Pair(int st, int et){
            this.st=st;
            this.et=et;
        }


        //this ->other return +ve
        // this ==other return 0
        // this < other return -ve
        @Override
        public int compareTo(MergeInterval.Pair other) {
            
            if(this.st!=other.st){
                return this.st - other.st;
            }
            else{
                return this.et -other.et;
            }
            
        }
        
    }

    public static void sortInterval(List<List<Integer>> lst){
     
        Stack<List<Integer>> st=new Stack<>();

        for(var l: lst){
            if(st.size()==0){
            st.push(l);
            }else{
                int x=st.peek().get(1);
                if(x>=l.get(0)){
                  if(x>=l.get(1)){
                  }else{
                    List<Integer> s=st.pop();
                    st.push(List.of(s.get(0),l.get(1)));
                  }
                }else{
                    st.push(l);
                }
            }
             
        }
        System.out.println(st);



    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
List<List<Integer>> lst=new ArrayList<List<Integer>>();
     for(int i=1;i<=n;i++){
     List<Integer> l=   List.of(sc.nextInt(),sc.nextInt());
     lst.add(l);
       }

Collections.sort(lst, new Comparator<List<Integer>>() {
    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        if(o1.get(0)!=o2.get(0)){
       return o1.get(0).compareTo(o2.get(0 ));
        }else{
            return o1.get(1).compareTo(o2.get(1 ));
        }
    }
});
System.out.println(lst);
sortInterval(lst);
    }

   
}

/*
 PS D:\DSA\Stack-Queue\Day-8> javac .\MergeInterval.java
PS D:\DSA\Stack-Queue\Day-8> java MergeInterval        
4
2 3
1 4
3 5
4 6
[[1, 4], [2, 3], [3, 5], [4, 6]]
[[1, 6]]


PS D:\DSA\Stack-Queue\Day-8> javac .\MergeInterval.java
PS D:\DSA\Stack-Queue\Day-8> java MergeInterval        
4
4 6 
4 5 
3 5 
9 0 
[[3, 5], [4, 5], [4, 6], [9, 0]]
[[3, 6], [9, 0]]
 */

 /*
  The code snippet reads 'n' pairs of integers into a list of lists and
   then sorts the list of lists based on the first element of each pair. 
   The sorting operation has a time complexity of O(n log n) using Collections.sort().
  */