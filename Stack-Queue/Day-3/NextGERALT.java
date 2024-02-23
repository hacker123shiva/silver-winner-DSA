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


/*
PS D:\DSA\Stack-Queue\Day-3> javac .\NextGERALT.java
PS D:\DSA\Stack-Queue\Day-3> java NextGERALT        
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

