import java.util.Stack;

public class NextGERALT {
    public static void nger( int []arr){
        
        Stack<Integer> st= new Stack<>();
        int [] ng=new int[arr.length];
        
        st.push(0);

        for(int i=1;i<arr.length;i++){
           
while(st.size()>0 && arr[i]>arr[st.peek()])
{
    ng[st.peek()]=arr[i]; 
    st.pop();
}

 
    st.push(i);
 

 
        }

while(st.size()>0){
    ng[st.peek()]=-1;
    st.pop();
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
