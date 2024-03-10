import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String str1=strs[0];
    String str2=strs[strs.length-1];

    int idx=0;
    while(idx<str1.length()){
        if(str1.charAt(idx)==str2.charAt(idx)){
         idx++;
        }else{
            break;
        }
    }

 return str1.substring(0,idx);
    }
}


/*
 	The code first sorts the input array of strings, which 
    takes O(n log n) time complexity. Then, it compares the 
    first and last strings character by character until a
     mismatch is found, which takes O(n) time complexity. 
     Therefore, the overall time complexity is
     O(n log n) + O(n) = O(n log n).
 */