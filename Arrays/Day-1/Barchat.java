import java.util.Scanner;

public class Barchat {
    public static void printBar(int []arr){
   
    int max=maxValue(arr);
     

    for(int i=max-1;i>=0;i--){
        for(int j=0;j<arr.length;j++){
            if(i<arr[j]){
               System.out.print(" * ");
            }else{
                System.out.print("   ");
            }
        }
        System.out.println();
    }

    }

    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    
    int arr[];
    int n=sc.nextInt();
    arr=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    printBar(arr);

    }


    public static int maxValue(int []arr){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
        if(max<arr[i])
        max=arr[i];
        }

        return max;

    }
}


/*
PS D:\DSA\Arrays\Day-1> javac .\Barchat.java
PS D:\DSA\Arrays\Day-1> java Barchat
5
3
1
0
7
5
          *
          *
          *  *
          *  *
 *        *  *
 *        *  *
 *  *     *  * 

 */