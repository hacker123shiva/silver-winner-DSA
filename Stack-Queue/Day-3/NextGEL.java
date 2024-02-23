import java.util.Stack;

public class NextGEL {
    public static void ngl(int []arr){
        Stack<Integer> st=new Stack<>();

        int []ng=new int[arr.length];

        //assign leftmost value greatest element as -1
        ng[0]=-1;
        st.push(arr[0]);

        for(int i=1;i<arr.length;i++){
            while(st.size()>0&&st.peek()<arr[i]){
                st.pop();
            }

            if(st.size()==0){
                ng[i]=-1;
               
            }else{
                ng[i]=st.peek();
               
            }

            st.push(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("NGETL of "+arr[i]+" is "+ng[i]);
        }

    }

    public static void main(String []args){
        int arr[]={2,5,9,3,1,12,6,8,7};
         ngl(arr);
    }
}


/*
 PS D:\DSA\Stack-Queue\Day-3> javac NextGEL.java
PS D:\DSA\Stack-Queue\Day-3> java NextGEL      
NGETL of 2 is -1
NGETL of 5 is -1
NGETL of 9 is -1
NGETL of 3 is 9
NGETL of 1 is 3
NGETL of 12 is -1
NGETL of 6 is 12
NGETL of 8 is 12
NGETL of 7 is 8
 */