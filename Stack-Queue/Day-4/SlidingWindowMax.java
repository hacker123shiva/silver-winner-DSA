import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMax {
   
    public static void maxOfFourWind(int []arr){

        for(int i=0;i<=arr.length-4;i++){
            System.out.println(Math.max(arr[i],Math.max(arr[i+1],Math.max(arr[i+2],arr[i+3]))));
        }
    }

    public static void maxOfNWind(int []arr,int size){

        int ng[]=ngr(arr);
        for(int i=0,j=0;i<arr.length-size+1;i++){
         j=i;
            while(i<=ng[j]&&ng[j]<=i+size-1){
                j=ng[j];

            }

            System.out.println(arr[j]);

        }

    }

    public static int [] ngr(int []arr){

        int ng[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(st.size()!=0&&arr[i]>arr[st.peek()]){
                st.pop();
            }

            if(st.size()==0){
                ng[i]=-1;
            }else{
                ng[i]=st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ng));
        return ng;

    }

    public static void main(String []args){
        int []arr={2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        // maxOfFourWind(arr);
        maxOfNWind(arr,4);
    }
}


 
/*
 PS D:\DSA\Stack-Queue\Day-4> javac .\SlidingWindowMax.java
PS D:\DSA\Stack-Queue\Day-4> java SlidingWindowMax        
[1, 6, 3, 6, 5, 6, 8, 8, 10, 10, -1, 12, 13, -1, 15, -1, -1]
9
9
8
12
12
14
14
32
32
32
32
19
19
19
 */