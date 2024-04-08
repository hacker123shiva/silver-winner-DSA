import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        
        char ch=s.charAt(0);
        boolean check=true;
        Stack<Character> st=new Stack<>();

        st.push(ch);
        for(int i=1;i<s.length();i++){
            ch=s.charAt(i);
          
            if(ch=='('&&check==true){
            sb.append(ch);
            st.push(ch);
            }
            else if(check==false)
            {
            st.push(ch);
            check=true;
            }
            else{
                st.pop();
               if(st.size()>0){
                sb.append(ch);
                }
              else{
                check=false;
              }

            }

        }

return sb.toString();
    }
}
 