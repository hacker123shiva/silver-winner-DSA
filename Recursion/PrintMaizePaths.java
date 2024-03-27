import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    public static void main(String []args){

        Scanner scn=new Scanner(System.in);
        int sr=scn.nextInt();
        int sc=scn.nextInt();
        int dc=scn.nextInt();
        int dr=scn.nextInt();

        ArrayList<String> ls=getMaizePaths(sr, sc, dr, dc);
        System.out.println(ls);

    }

    public static ArrayList<String> getMaizePaths(int sr,int sc, int dr,int dc){
        if(sr==dr&&sc==dc){
            ArrayList<String> ls=new ArrayList<>();
            ls.add("");
            return ls;
        }
        ArrayList<String> vpaths=new ArrayList<>();
        ArrayList<String> hpaths=new ArrayList<>();
        if(sr<dr){
            vpaths=getMaizePaths(sr+1,sc,dr,dc);
        }
        if(sc<dc){
            hpaths =getMaizePaths(sr,sc+1,dr,dc);
        }

      
       

        ArrayList<String> res=new ArrayList<>();
        for(String vpath: vpaths){
        res.add("v"+vpath);
        }

        for(String hpath: hpaths){
            res.add("h"+hpath);
        }


        return res;
    }
}