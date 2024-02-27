import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Celebrity {
    

    public static int celebrity(int [][]arr){
        boolean  isExit=false;
        Stack<Integer> st=new Stack<>();
       
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }

        while(st.size()!=1){
           int y=st.pop();
           int x=st.pop();
if(arr[x][y]!=0){
    st.push(y);
    
}else{
    st.push(x);
   
}
        }

int val=st.pop();

for(int i=0;i<arr.length;i++){
    if(i==val||arr[i][val]==1){
        
    }else {

     
        return -1;
       
    }
}

for(int i=0;i<arr.length;i++){
    if(arr[val][i]==0){
        
    }else{
        System.out.println("D");
        return -1;
    }
}
return val;
    }

    public static void main(String []args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    int n=Integer.parseInt(br.readLine());
    int [][]arr=new int [n][n];

    for(int j=0;j<n;j++){
  String line=br.readLine();
  for(int k=0;k<line.length();k++){
    arr[j][k]=line.charAt(k)-'0';
  }
    }
    int cel=celebrity(arr);
    System.out.println(cel);
 if(cel==-1)
 System.out.println("No Celebrity");
 else{
    System.out.println("Celebrity is "+cel);
 }
    }
}

//known by everybody but donot know anyone
//only one celebrity possible
//It is possible no celebrity

/*
 PS D:\DSA\Stack-Queue\Day-7> javac .\Celebrity.java
PS D:\DSA\Stack-Queue\Day-7> java Celebrity        
5
01000
00000
01000
01110
01010
1
Celebrity is 1
 */