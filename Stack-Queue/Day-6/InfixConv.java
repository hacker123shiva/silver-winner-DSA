import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class InfixConv{

  private static int precedence(char ch){
    if(ch=='*'||ch=='/'||ch=='%'){
     return 2;
    } else{
     return 1;
    }
  }

 

  public static Map<String, String> infixConv(String str){

  Stack<String>  pre=new Stack<>();
  Stack<String> post=new Stack<>();
  Stack<Character> ops=new Stack<>();

  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    if(ch=='*'||ch=='/'||ch=='+'||ch=='-'){
    
        while(ops.size()!=0&&ops.peek()!='('&&precedence(ops.peek())>=precedence(ch)){
            char p=ops.pop();
            String vpre2=pre.pop();
            String vpre1=pre.pop();
            pre.push(p+vpre1+vpre2);

            String vpost2=post.pop();
            String vpost1=post.pop();
            post.push(vpost1+vpost2+p);

        }
        if(ops.size()!=0&&ops.peek()=='('){
            ops.pop();
        }
        ops.push(ch);

    }else if(ch=='('){
        ops.push(ch);
    }else if(ch==')'){

        while(ops.size()!=0 && ops.peek()!='('){
            char p=ops.pop();
            String vpre2=pre.pop();
            String vpre1=pre.pop();
            pre.push(p+vpre1+vpre2);

            String vpost2=post.pop();
            String vpost1=post.pop();
            post.push(vpost1+vpost2+p);
        }


    }else{
pre.push(ch+"");
post.push(ch+"");
    }
  }

//   System.out.println(ops);

while(ops.size()!=0){
   
    char p=ops.pop();
    String vpre2=pre.pop();
    String vpre1=pre.pop();
    pre.push(p+vpre1+vpre2);

    String vpost2=post.pop();
    String vpost1=post.pop();
    post.push(vpost1+vpost2+p);
    
    
}

return Map.of("Prefix:",pre.pop(),"Postfix:",post.pop());
  }

    public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

Map m=infixConv(str);
System.out.println(m);
    }

}

/*
 PS D:\DSA\Stack-Queue\Day-6> javac .\InfixConv.java
PS D:\DSA\Stack-Queue\Day-6> java InfixConv        
2+(5-3*6/2)
{Postfix:=2536*2/-+, Prefix:=+2-5/*362}
 */