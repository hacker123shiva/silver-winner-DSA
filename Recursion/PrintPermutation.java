import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
String quest=sc.next();
String ans="";
permutation(quest, ans);
    }

    public static void permutation(String quest, String ans){

        if(quest.length()==0){
            
            System.out.println(ans);
            return;
        }
        //high level thinking

         for(int i=0;i<quest.length();i++){
            char ch=quest.charAt(i);

            String left=quest.substring(0, i);
            String right=quest.substring(i+1);
            permutation(left+right, ans+ch);
         }
    }
}