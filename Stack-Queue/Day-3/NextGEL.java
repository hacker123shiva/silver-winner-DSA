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
