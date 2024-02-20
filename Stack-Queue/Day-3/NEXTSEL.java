import java.util.Stack;

public class NEXTSEL{
      public static void nsel( int []arr){
        
        Stack<Integer> st= new Stack<>();
        int [] ng=new int[arr.length];

        //for start element put -1
        ng[0]=-1;
        st.push(arr[0]);

        for(int i=1;i<arr.length;i++){

            //pop all element which are less than itself
           while(st.size()>0&& arr[i]<=st.peek()) {
            st.pop();
           }

           //time to assign value and push
           if(st.size()==0){
            ng[i]=-1;
           }else{
            ng[i]=st.peek();
           }
           st.push(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("NSETL of "+arr[i]+" is "+ng[i]);
        }

    }


    public static void main(String []args){
        int arr[]={2,5,9,3,1,12,6,8,7};
         nsel(arr);
    }
}

/*
PS D:\DSA\Stack-Queue\Day-3> javac NEXTSEL.java
PS D:\DSA\Stack-Queue\Day-3> java NEXTSEL
NSETL of 2 is -1
NSETL of 5 is 2
NSETL of 9 is 5
NSETL of 3 is 2
NSETL of 1 is -1
NSETL of 12 is 1
NSETL of 6 is 1
NSETL of 8 is 6
NSETL of 7 is 6
 */