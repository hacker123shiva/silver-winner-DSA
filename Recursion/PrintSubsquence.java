import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();

        ArrayList<String> al=printSubseqence(st);
        System.out.println(al);


    }

    public static ArrayList<String> printSubseqence(String str){
        //low level thinking
        if(str.length()==0){
            ArrayList<String> al=new ArrayList<>();
            al.add("");
            return al;
        }
          

        //high level thinking
        ArrayList<String> p=printSubseqence(str.substring(1));
       ArrayList<String> res=new ArrayList<>();
        for(String st: p){
            res.add(""+st);
            res.add(str.charAt(0)+st);
        }

        return res;


    }
}