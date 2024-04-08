class Solution {
    public boolean rotateString(String s, String goal) {

if(s.length()!=goal.length())
return false;

         String doubleString=s+s;

         if(doubleString.contains(goal)){
            return true;
         }
         return false;
    }
}
