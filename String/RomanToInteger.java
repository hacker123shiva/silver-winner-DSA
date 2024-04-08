class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            if(number(s.charAt(i))<number(s.charAt(i+1)))
            ans -=number(s.charAt(i));
            else
            ans +=number(s.charAt(i));
        }
        ans +=number(s.charAt(s.length()-1));
return ans;

    } 

    public int number(char ch){
       return switch(ch){
        case 'I' -> 1;
        case 'V' ->5;
        case 'X' ->10;
        case 'L' ->50;
        case 'D' ->500;
        case 'C' ->100;
        default ->1000;
       };
    }
}