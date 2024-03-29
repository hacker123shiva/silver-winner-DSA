import java.util.Scanner;

class Solution{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int sr=scn.nextInt();
        int sc=scn.nextInt();
        int dr=scn.nextInt();
        int dc=scn.nextInt();
 

        printmazepaths(sr, sc, dr, dc, "");

    }

    public static void printmazepaths(int sr,int sc, int dr, int dc, String ans){
        if(sr==dr&&sc==dc){
            System.out.println(ans);
            return;
        }
        if(sr>dr||sc>dc)
        {
            return;
        }

        //high level thinking
        printmazepaths(sr+1, sc, dr, dc,ans+"v");
        printmazepaths(sr,sc+1,dr,dc,ans+"h");

    }
 }