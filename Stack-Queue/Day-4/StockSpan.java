import java.util.Stack;

public class StockSpan {
   
    public static int[] ngel(int []arr){
int [] ng=new int[arr.length];
Stack<Integer> st=new Stack<>();

for(int i=0;i<arr.length;i++){
    while(st.size()!=0&&arr[st.peek()]<arr[i]){
        st.pop();
    }

    if(st.size()==0){
        ng[i]=-1;
    }else{
        ng[i]=st.peek();
    }
    st.push(i);
}

return ng;
   }


   public static void stockSpan(int []arr){

    int [] ngl=ngel(arr);
    
    int []stSp=new int[arr.length];

    for(int i=0;i<arr.length;i++){
    if(ngl[i]==-1){
        stSp[i]=i+1;
    }else{
        stSp[i]=i-ngl[i];
    }
    }


    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+"->"+stSp[i]);
    }

   }


   public static void main(String []args){
    int []arr={1,2,3,1,2,1,2,3,9,1,1,2,3,5,1};

    stockSpan(arr);
   }
}

/*
 PS D:\DSA\Stack-Queue\Day-4> javac .\StockSpan.java
PS D:\DSA\Stack-Queue\Day-4> java StockSpan
1->1
2->2
3->3
1->1
2->2
1->1
2->2
3->5
9->9
1->1
1->1
2->3
3->4
5->5
1->1
 */