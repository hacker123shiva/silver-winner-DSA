 public class BuildStack {
    int []data;
    int tos;

    public BuildStack(int cap){
        data=new int[cap];
        tos=-1;
    }

    public int size(){
        return tos+1;
    }

    public void display(){
      for(int i=tos;i>=0;i--){
        System.out.print(data[i]+" ");
      }
      System.out.println();
    }

    public int pop(){
        if(tos>=0){
     int d=  data[tos];
     data[tos]=0;
     tos--;
     return d;
        }else{
            System.out.println("Stack Underflow");
            return -1;
        }
    }


    public void push(int val){
   
    if(tos<data.length-1){
    data[++tos]=val;
    }
    else{
    System.out.println("Stack Overflow");
    }

    }

    public int top(){
        if(tos>=0){
        return data[tos];
        }
        else{
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    
     public static void main(String []args){
        BuildStack st=new BuildStack(10);
        
        st.push(10);
        st.push(12);

       st.display();

      System.out.println( "top "+st.top());
      System.out.println("size "+st.size());

      System.out.println("pop "+st.pop());
      System.out.println( "top "+st.top());
      System.out.println("size "+st.size());
     }
}

/*
 PS D:\DSA\Stack-Queue\Day-9> java BuildStack
12 10 
top 12
size 2
pop 12
top 10
size 1
 */