import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    int pos=-1;
    String first=strs[0];
    String last=strs[strs.length-1];
    int i=0;
    int f=first.length();
    int l=last.length();
    while(i<f && i<l){
      if(first.charAt(i)==last.charAt(i))
      {
        pos++;
      }else{
        break;
      }
      i++;

    }
    if(pos==-1)
    return "";
    else
    return first.substring(0,pos+1);
    }
}