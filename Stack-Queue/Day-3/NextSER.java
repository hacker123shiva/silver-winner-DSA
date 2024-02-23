import java.util.Stack;

public class NextSER {
      public static void nser( int []arr){
        
        Stack<Integer> st= new Stack<>();
        int [] ng=new int[arr.length];

        //for last element in array
        ng[arr.length-1]=-1;
        st.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){

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
            System.out.println("NSETR of "+arr[i]+" is "+ng[i]);
        }

    }


    public static void main(String []args){
        int arr[]={2,5,9,3,1,12,6,8,7};
         nser(arr);
    }
}

/*
 PS D:\DSA\Stack-Queue\Day-3> javac .\NextSER.java
PS D:\DSA\Stack-Queue\Day-3> java NextSER
NSETR of 2 is 1
NSETR of 5 is 3
NSETR of 9 is 3
NSETR of 3 is 1
NSETR of 1 is -1
NSETR of 12 is 6
NSETR of 6 is -1
NSETR of 8 is 7
NSETR of 7 is -1
 */