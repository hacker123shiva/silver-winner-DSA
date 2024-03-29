import java.util.Scanner;

class Solution{
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
 
printstairs(num, "");
    }

    public static void printstairs(int num, String ans){
       if(num<0){
        return ;
       }
if(num==0)
{
    System.out.println(ans);
}
        //high level thinking
        printstairs(num-1, ans+1);
        printstairs(num-2,ans+2);
        printstairs(num-3,ans+3);

    }
}