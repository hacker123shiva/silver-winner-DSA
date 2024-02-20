import java.util.Stack;

public class NextGER {
    public static void nger( int []arr){
        
        Stack<Integer> st= new Stack<>();
        int [] ng=new int[arr.length];

        ng[arr.length-1]=-1;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
           int val=arr[i];
           if(st.size()>0 && st.peek()<val){

           while(st.size()>0 && st.peek()<val){
             st.pop();
           }

           if(st.size()==0){
            ng[i]=-1;
            st.push(val);
           }else{
            ng[i]=st.peek();
            st.push(val);
           }


        }else if(st.size()>0){
            ng[i]=st.peek();
            st.push(val);
        }else{
            ng[i]=-1;
            st.push(val);
        }

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
 