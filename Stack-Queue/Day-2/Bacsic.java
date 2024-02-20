import java.util.Stack;

public class Bacsic {
    
    public static void main(String []args){
        Stack<Integer>st=new Stack<>();

        st.push(10);
        st.push(20);

        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.push(30);
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.push(40);
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        // System.out.println(st+"->"+st.peek()+" "+st.size()); //-> this cause exeption
        System.out.println(st+"->" +" "+st.size());
    }
}

/*
PS D:\DSA\Stack-Queue\Day-2> java Bacsic        
[10, 20]->20 2
[10, 20, 30]->30 3
[10, 20, 30, 40]->40 4
[10, 20, 30]->30 3
[10, 20]->20 2
[10]->10 1
Exception in thread "main" java.util.EmptyStackException
        at java.base/java.util.Stack.peek(Stack.java:101)
        at Bacsic.main(Bacsic.java:23) 

 */

 /*
  PS D:\DSA\Stack-Queue\Day-2> java Bacsic        
[10, 20]->20 2
[10, 20, 30]->30 3
[10, 20, 30, 40]->40 4
[10, 20, 30]->30 3
[10, 20]->20 2
[10]->10 1
[]-> 0
  */