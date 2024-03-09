 

public class BuildDynamicStack {
    int []data;
    int tos;

    public BuildDynamicStack(int cap){
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
    
        int []datadouble=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            datadouble[i]=data[i];
        }
        data=datadouble;
        data[++tos]=val;
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
        BuildDynamicStack st=new BuildDynamicStack(3);
        
        st.push(10);
        st.push(12);

       st.display();

      System.out.println( "top "+st.top());
      System.out.println("size "+st.size());

      System.out.println("pop "+st.pop());
      System.out.println( "top "+st.top());
      System.out.println("size "+st.size());
      st.push(23);
      st.push(34);
      st.push(45);
      System.out.println("size "+st.size());
      st.display();

     } 
}
