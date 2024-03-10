class Solution {
    public String addStrings(String num1, String num2) {
       StringBuilder sb=new StringBuilder();
       int sum=0;
       int carry=0;
       int i=num1.length()-1;
       int j=num2.length()-1;

       while(i>=0||j>=0){
           sum=0+carry;
           if(i>=0){
              sum+=num1.charAt(i)-'0';
              i--;
           }
           if(j>=0){
               sum+=num2.charAt(j)-'0';
               j--;
           }

           carry=sum/10;
           sum=sum%10;
           sb.append(sum);
       }

       if(carry!=0){
           sb.append(carry);
       }

       sb=sb.reverse();
       return sb.toString();
}
}

