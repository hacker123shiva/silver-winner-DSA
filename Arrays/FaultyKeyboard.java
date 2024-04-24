class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if('i'!=ch){
              sb.append(ch);
            }else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}