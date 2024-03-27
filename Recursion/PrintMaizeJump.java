import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int sr=scn.nextInt();
        int sc=scn.nextInt();
        int dc=scn.nextInt();
        int dr=scn.nextInt();

        ArrayList<String> ls=getMaizePath(sr, sc, dr, dc);
        System.out.println(ls);
    }

    public static ArrayList<String> getMaizePath(int sr,int sc, int dc, int dr){
        
        if(sr==dr&&sc==dc)
        {
            ArrayList<String> ls=new ArrayList<>();
            ls.add("");
            return ls;
        }

        if(sr>dr||sc>dc){
            ArrayList<String> ls=new ArrayList<>();
            return ls;
        }

        ArrayList<String> res=new ArrayList<>();
        //horizontal move
        for(int ms=1;ms<=dc-sc;ms++){
          ArrayList<String> hpaths=getMaizePath(sr, sc+ms, dc, dr);
          for(String hpath: hpaths ){
             res.add("h"+ms+hpath);
          }
        }
        
        //vertical move 
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> vpaths=getMaizePath(sr+ms,sc, dc,dr);

            for(String vpath: vpaths){
                res.add("v"+ms+vpath);
            }
        }
 
        //diagonal move 
        for(int ms=1; ms<=dr-sr &&  ms<=dc-sc;ms++){
        ArrayList<String> dpaths=getMaizePath(sr+ms,sc+ms,dc,dr);

        for(String dpath: dpaths){
            res.add("d"+ms+dpath);
        }

        }

        return res;
    }
}