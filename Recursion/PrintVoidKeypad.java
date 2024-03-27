import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    static String[] seq = new String[]{"?!","abc","def","ghi","jkl","mnop","qrst","uv","wxyz",".,"};
    public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
        String num=sc.next();
       
        getKeypad(num,"");
     
    }

    public static  void getKeypad(String num, String ans) {
       
        if(num.length()==0){
            System.out.println(ans);
            return;
        }

        int pos=num.charAt(0)-'0';
        String str=seq[pos];

        for(int i=0;i<str.length();i++){
            getKeypad(num.substring(1),ans+str.charAt(i));
        }

    }
}
