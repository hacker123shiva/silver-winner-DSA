import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           if(hm.containsKey(ch)){
            hm.put(ch,hm.get(ch)+1);
           }else{
            hm.put(ch,1);
           }
        }

        char maxch=' ';
        int maxcount=0;
        for(char ch: hm.keySet()){
         if(maxcount<hm.get(ch)){
            maxcount=hm.get(ch);
            maxch=ch;
         }
        }

        System.out.println("Maximum occured character is "+maxch);
    }
}