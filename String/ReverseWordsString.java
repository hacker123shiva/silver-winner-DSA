class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        
        // Split the input string into an array of words
       String[] words = s.split("\s+");
        
        int left=0;
        int right=words.length-1;
        while(left<right){
            String tmp=words[left];
            words[left]=words[right];
            words[right]=tmp;
            left++;
            right--;
        }

       return String.join(" ",words);
}
}