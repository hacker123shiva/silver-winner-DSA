import java.util.Scanner;

public class Span {

    public static int spanValue(int []arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return max-min;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int span=spanValue(arr);
        System.out.println("Span value is:: "+span);
    }

    
}


/*
PS D:\DSA\Arrays\Day-1> java Span
5
0
10
100
1000
10000
Span value is:: 10000
 */