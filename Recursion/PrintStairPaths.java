import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       ArrayList<String> ls= printStairs(n);
       System.out.println(ls);
    }

    public static ArrayList<String> printStairs(int num){
        
       if(num==0){
        ArrayList<String> ls=new ArrayList<>();
        ls.add("");
        return ls;
       }
       if(num<0){
        ArrayList<String> ls=new ArrayList<>();
        return ls;
       }

        ArrayList<String> path1=printStairs(num-1);
        ArrayList<String> path2=printStairs(num-2);
        ArrayList<String> path3=printStairs(num-3);

        ArrayList<String> res=new ArrayList<>();
        for(String path: path1){
            res.add(1+path);
        }
        for(String path: path2){
            res.add(2+path);
        }
        for(String path: path3){
            res.add(3+path);
        }

        return res;
    }
}