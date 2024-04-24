import java.util.Scanner;

class Solution{
   public static void main(String []args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int jump[]=new int[n+1];
for(int i=0;i<=n;i++){
    jump[i]=sc.nextInt();
}

int minPath=minJump(n, jump);
System.out.println(minPath);
   }

   public static int minJump(int n,  int jump[]){
        
   Integer arr[]=new Integer[n+1];
arr[n]=0;
   for(int i=n-1;i>=0;i--){
    int min=Integer.MAX_VALUE;
        for(int j=1;j<=jump[i]&&i+j<=n;j++){
           
            if(arr[i+j]!=null){
                min=Math.min(min,arr[i+j]);
                arr[i]=min+1;
            }

        }
   }

   return arr[0];
   }
}