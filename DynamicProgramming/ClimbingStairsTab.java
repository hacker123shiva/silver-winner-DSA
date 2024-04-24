import java.util.Scanner;

class Solution{


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int path=climbStairTab(n);
        System.out.println(path);
    }
    
    public static int climbStairTab(int n){
        int str[]=new int[n+1];
        str[0]=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=3&&i-j>=0;j++){
                
                str[i]+=str[i-j];
            }
        }

        return str[n];

    }
 }