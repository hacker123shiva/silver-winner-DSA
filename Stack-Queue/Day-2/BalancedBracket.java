import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    
    public static boolean balancedBrac(String str){
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==']'||ch=='}'||ch==')'){
               char cor= corres(ch);
                if(st.size()==0){
                    return false;
                } else {
                    while(st.peek()!=cor){
                    if(st.peek()=='('||st.peek()=='{'||st.peek()=='['&&st.peek()==cor){
                      return false;
                    }
                    else{
                        st.pop();
                    }
                    }
                    st.pop();
                }


            }else if(ch=='['||ch=='{'||ch=='('){
                st.push(ch);
            }

        }
        if(st.size()!=0)
        return false;

        return true;
    }

    private static char corres(char ch) {
         
        if(ch==')')
        return '(';
        else if(ch==']')
        return '[';
        else
        return '{';
        
    }


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        boolean res=balancedBrac(str);
        System.out.println(res);
    }
}

/*
 PS D:\DSA\Stack-Queue\Day-2> javac .\BalancedBracket.java 
PS D:\DSA\Stack-Queue\Day-2> java BalancedBracket
[(a+b)+{(c+d)*(e/f)}]
true
PS D:\DSA\Stack-Queue\Day-2> java BalancedBracket
[(a+b)+{(c+d)*(e/f)]}
false
PS D:\DSA\Stack-Queue\Day-2> javac .\BalancedBracket.java
PS D:\DSA\Stack-Queue\Day-2> java BalancedBracket        
[(a+b)+{(c+d)*(e/f)}
false
PS D:\DSA\Stack-Queue\Day-2> java BalancedBracket
([(a+b)+{(c+d)*(e/f)}]
false
 */

 /*
  Time complexity O(n)
  */