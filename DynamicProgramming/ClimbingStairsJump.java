import java.util.Scanner;

class Solution{
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int jump[]=new int[n+1];
for(int i=0;i<=n;i++){
    jump[i]=sc.nextInt();
}
int path=jumpStatirs(0, jump);

System.out.println(path);
    }

    public static int jumpStatirs(int n, int jump[]){
        int arr[]=new int[n+1];

        for(int i=0;i<=n;i++){
            for(int j=1;j>=jump[i]&&i-j>=0;j++){
                arr[i]+=arr[i-j];
            }
        }

        return arr[n];
    }
}
