class Solution {
    public int maxDepth(String s) {
         
         Stack<Character> st=new Stack<>();
         boolean check=false;
         int maxdpt=0;
         int dpth=0;
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( ch=='('){
                st.push('(');
                dpth++;
                maxdpt=Math.max(maxdpt,dpth);
            } else if(ch==')') {
                st.pop();
               dpth--;
                
            }

         }

         return maxdpt;
    }
}