import java.util.Scanner;
import java.util.Stack;

public class BalNDup {
    
 
        public static boolean checkDup(String str){
            Stack<Character> st=new Stack<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch==')'){
               if(st.size()!=0&&st.peek()=='('){
                return true;
               }
        
              else{
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
              }
                }else{
                    st.push(ch);
                }
            }
        
            return false;
        }

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
                        if(st.peek()=='('||st.peek()=='{'||st.peek()=='['){
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
        
            boolean res1=checkDup(str);
            boolean res2=balancedBrac(str);
            System.out.println(!res1&&res2);
        }
}

/*
 PS D:\DSA\Stack-Queue\Day-2> javac .\BalNDup.java
PS D:\DSA\Stack-Queue\Day-2> java BalNDup         
((a+b)+(c+d))
true
PS D:\DSA\Stack-Queue\Day-2> java BalNDup        
(a+b)+((c+d))
false
PS D:\DSA\Stack-Queue\Day-2> java BalNDup
[(a+b)+{(c+d)*(e/f)}]
true
PS D:\DSA\Stack-Queue\Day-2> java BalNDup        
([(a+b)+{(c+d)*(e/f)}]
false
 */