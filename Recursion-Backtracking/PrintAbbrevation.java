import java.util.Scanner;

class Solution{

    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    recur(str, 0, "", 0);
    }

    public static void recur(String str, int pos, String asf, int count){
     if(pos==str.length())
     if(count==0){
         System.out.println(asf);
         return;
     }else{
       System.out.println(asf+count);
       return;
     }
     

    //high level thinking
    if(count==0)
    recur(str, pos+1, asf+str.charAt(pos),0);
    else
    recur(str, pos+1, asf+ count+ str.charAt(pos),0);


    recur(str, pos+1, asf, count+1);
    }
}

/*
For Word shiva
shiva
shiva
shiv1
shi1a
shi2
sh1va
sh1v1
sh2a
sh3
s1iva
s1iv1
s1i1a
s1i2
s2va
s2v1
s3a
s4
1hiva
1hiv1
1hi1a
1hi2
1h1va
1h1v1
1h2a
1h3
2iva
2iv1
2i1a
2i2
3va
3v1
4a
5
*/