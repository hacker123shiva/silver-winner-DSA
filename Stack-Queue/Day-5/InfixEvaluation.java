import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {
   
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

  private static int precedence(char ch){
    if(ch=='*'||ch=='/'||ch=='%'){
     return 2;
    } else{
     return 1;
    }
  }

  public static int infixEval(String str){

  Stack<Integer> opds=new Stack<>();
  Stack<Character> oprs=new Stack<>();

  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    if(ch=='*'||ch=='/'||ch=='+'||ch=='-'||ch=='%'||ch=='('||ch==')'){

        if(ch!='('&&ch!=')'){
            while(oprs.size()!=0&&oprs.peek()!='('&&precedence(oprs.peek())>=precedence(ch)){
              int num2=opds.pop();
              int num1=opds.pop();
              
              char op=oprs.pop();
              int res=process(op,num1,num2);

              opds.push(res);
              
            }
            
            oprs.push(ch);
        } 
         else if(ch==')'){
        
            while(oprs.peek()!='('){
                int num2=opds.pop();
                int num1=opds.pop();
                
                char op=oprs.pop();
                int res=process(op,num1,num2);
  
                opds.push(res);
            }

            oprs.pop();

        }else{
           oprs.push(ch);
        }

    }else{
        opds.push(Integer.parseInt(ch+""));
    }
  }
   

  while(oprs.size()!=0){
    int num2=opds.pop();
    int num1=opds.pop();
    
    char op=oprs.pop();
    int res=process(op,num1,num2);

    opds.push(res);
  }
return opds.pop();

  }

    public static void main(String []args){

Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

int x=infixEval(str);
System.out.println("Value of infix expression "+str+" is "+x);

    }
}


/*
 PS D:\DSA\Stack-Queue\Day-5> javac Infix.java
PS D:\DSA\Stack-Queue\Day-5> java Infix      
2+(5-3*6/2)
Value of infix expression 2+(5-3*6/2) is -2
 */