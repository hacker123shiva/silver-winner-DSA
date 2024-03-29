import java.util.Scanner;

class Solution{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int sr=scn.nextInt();
        int sc=scn.nextInt();
        int dc=scn.nextInt();
        int dr=scn.nextInt();

         printjumpmaze(sr, sc, dr, dc,"");
        
    }

    public static void printjumpmaze(int sr,int sc,int dr,int dc,String ans){

if(sr==dr&&sc==dc){
    System.out.println(ans);
    return;
}
if(sc>dc||sr>dr)
return;

        //high level thinking

        //vertical move
        for(int ms=1;ms<=dr-sr;ms++){
            printjumpmaze(sr+ms, sc, dr, dc, ans+"h"+ms);
        }

        //horizontal move
        for(int ms=1;ms<=dc-sc;ms++){
            printjumpmaze(sr, sc+ms, dr, dc, ans+"v"+ms);

        }

        //diagonal move
        for(int ms=1;ms<=dc-sc&&ms<dr-sr;ms++){
            printjumpmaze(sr+ms, sc+ms, dr, dc, ans+"d"+ms);

        }

    }
 }