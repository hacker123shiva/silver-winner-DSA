import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket{
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

public static void main(String []args){

    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();

    boolean res=checkDup(str);
    System.out.println(res);
}
}