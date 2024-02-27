import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class PostConvEval {
    private static int process(char ch,int num1,int num2){
        if(ch=='*'){
         return num1*num2;
        }else if(ch=='/'){
         return num1/num2;
        }else if(ch=='%'){
        return num1%num2;
        }else if(ch=='+'){
        return num1+num2;
        }else{
        return num1-num2;
        }
      }
    public static Map<String,String> postxEvalConv(String str){
        Stack<String> inf=new Stack<>();
        Stack<String>  pre=new Stack<>();
        Stack<Integer> val=new Stack<>();

         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(Character.isDigit(ch)){
             val.push(Integer.parseInt(ch+""));
             inf.push(ch+"");
             pre.push(ch+"");

            }else{
                int val2=val.pop();
                int val1=val.pop();
                
                int res=process(ch, val1, val2);
                val.push(res);

                String in2=inf.pop();
                String in1=inf.pop();
                inf.push("("+ in1 + ch + in2+")");


                String pre2=pre.pop();
                String pre1=pre.pop();
                pre.push(ch + pre1 + pre2);

            }

         }

         return Map.of("Value: ",val.pop()+"","Infix: ",inf.pop(),"Prefix: ",pre.pop());

    }
    
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

Map<String, String> m=postxEvalConv(str);
System.out.println(m);
    }

}

/*
 PS D:\DSA\Stack-Queue\Day-6> javac .\PostConvEval.java
PS D:\DSA\Stack-Queue\Day-6> java PostConvEval
264*8/+3-
{Value: =2, Prefix: =-+2/*6483, Infix: =((2+((6*4)/8))-3)}
 */