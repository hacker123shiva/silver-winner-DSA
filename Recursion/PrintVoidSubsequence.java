import java.util.Scanner;

class Solution{
    public static void main(String []args){
    Scanner scn=new Scanner(System.in);
    String query=scn.next();
 

    printSubsequence(query, "");

    }

    public static void printSubsequence(String query, String ans){
        //low level thinking
        if(query.length()==0){
            System.out.println(ans);
            return;
        }
      

        //high level thinking
        char ch=query.charAt(0);
        printSubsequence(query.substring(1), ans+"");
        printSubsequence(query.substring(1),ans+ch);
    }
}
