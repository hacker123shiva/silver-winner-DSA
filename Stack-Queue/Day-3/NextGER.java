import java.util.Stack;

public class NextGER {
    public static void nger( int []arr){
        
        Stack<Integer> st= new Stack<>();
        int [] ng=new int[arr.length];

        //for last element in array
        ng[arr.length-1]=-1;
        st.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){

            //pop all element which are less than itself
           while(st.size()>0&& arr[i]>=st.peek()) {
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
            System.out.println("NGETR of "+arr[i]+" is "+ng[i]);
        }

    }


    public static void main(String []args){
        int arr[]={2,5,9,3,1,12,6,8,7};
         nger(arr);
    }
}
 
/*
PS D:\DSA\Stack-Queue\Day-3> javac .\NextGER.java
PS D:\DSA\Stack-Queue\Day-3> java NextGER        
NGETR of 2 is 5
NGETR of 5 is 9
NGETR of 9 is 12
NGETR of 3 is 12
NGETR of 1 is 12
NGETR of 12 is -1
NGETR of 6 is 8
NGETR of 8 is -1
NGETR of 7 is -1
 */