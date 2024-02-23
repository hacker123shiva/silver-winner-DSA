 
import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistogram {
    
  public static int[] nsml(int []arr){
    int ns[]=new int[arr.length];
    Stack<Integer> st=new Stack<>();

    for(int i=0;i<arr.length;i++){

        while(st.size()!=0&&arr[i]<=arr[st.peek()]){
            st.pop();
        }

        if(st.size()==0){
            ns[i]=-1;
        }else{
            ns[i]=st.peek();
        }
        st.push(i);
    }
    System.out.println("nsml index: "+Arrays.toString(ns));
    return ns;
  }

  public static int[] nsmr(int []arr){
    int ns[]=new int[arr.length];
    Stack<Integer> st=new Stack<>();

    for(int i=arr.length-1;i>=0;i--){

        while(st.size()!=0&&arr[i]<=arr[st.peek()]){
            st.pop();
        }

        if(st.size()==0){
            ns[i]=-1;
        }else{
            ns[i]=st.peek();
        }
        st.push(i);
    }

    System.out.println("nsmr index: "+Arrays.toString(ns));
    return ns;
  }

  public static int largestAreaHist(int []arr){

    int lArr []=nsml(arr);
    int rArr []=nsmr(arr);

    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        int l=lArr[i];
        int r=rArr[i];

        if(l!=-1&&r!=-1){
         max=Math.max((r-l-1)*arr[i],max);
        }else if(l!=-1&&r==-1){
         max=Math.max((arr.length-l-1)*arr[i],max);
        }else if(r!=-1&&l==-1){
         max=r;
        }else{
         max=Math.max(arr.length,max);
        }


    }
    return max;

  }

  public static void main(String []args){
    int []arr={6,2,5,4,5,1,6};

    int large=largestAreaHist(arr);
    System.out.println("Largest Area Histogram "+large);

  }

  
}

/*
PS D:\DSA\Stack-Queue\Day-4> javac .\LargestAreaHistogram.java
PS D:\DSA\Stack-Queue\Day-4> java LargestAreaHistogram        
nsml index: [-1, -1, 1, 1, 3, -1, 5]
nsmr index: [1, 5, 3, 5, 5, -1, -1]
Largest Area Histogram 12
 */