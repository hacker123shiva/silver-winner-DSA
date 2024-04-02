import java.util.HashMap;
import java.util.Scanner;

class Solution2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
         
        HashMap<Character,Integer> hs=new HashMap<>();

        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(hs.containsKey(ch)){
                if(hs.get(ch)>0){
                    hs.put(ch,hs.get(ch)-1);
                    System.out.print(ch+" ");
                }
            }
        }

    }
 }