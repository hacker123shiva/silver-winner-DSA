import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class PreConvEval {
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
    public static Map<String,String> prexEvalConv(String str){
        Stack<String> inf=new Stack<>();
        Stack<String>  post=new Stack<>();
        Stack<Integer> val=new Stack<>();

         for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            
            if(Character.isDigit(ch)){
             val.push(Integer.parseInt(ch+""));
             inf.push(ch+"");
             post.push(ch+"");
            }else{
                int val1=val.pop();
                int val2=val.pop();
                
                int res=process(ch, val1, val2);
                val.push(res);

                String in1=inf.pop();
                String in2=inf.pop();
                inf.push("("+ in1 + ch + in2+")");


                String pst1=post.pop();
                String pst2=post.pop();
                post.push(pst1 + pst2+ ch);

            }

         }

         return Map.of("Value: ",val.pop()+"","Infix: ",inf.pop(),"Postfix: ",post.pop());

    }
    
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

Map<String, String> m=prexEvalConv(str);
System.out.println(m);
    }

}
 