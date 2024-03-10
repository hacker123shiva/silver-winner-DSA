// Method-1 using two pointer 
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

/*
m is length of neddle 
n is length of heystack

substring time complexity m
and do it n-m times

  O((n-m)*m).
 */


 class Solution2 {
    public int strStr(String haystack, String needle) {
        
        return haystack.indexOf(needle);
    }
}

/*
The code snippet uses the indexOf 
method which has a time complexity 
of O(n), where n is the length of 
the haystack string. Therefore, the
overall time complexity of the strStr
method is O(n).
*/