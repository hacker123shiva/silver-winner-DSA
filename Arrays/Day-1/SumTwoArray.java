import java.util.Arrays;
import java.util.Scanner;

public class SumTwoArray {
    
    public static int [] sumArray(int []arr1, int []arr2){
        
        int size=Math.max(arr1.length,arr2.length);
        int []arr=new int[size];
        int i1= arr1.length-1, i2=arr2.length-1;
        int carry=0;
        for(;i1>=0&&i2>=0;i1--,i2--){
            
            int  quotient=(arr1[i1]+arr2[i2]+carry)%10;
            carry=(arr1[i1]+arr2[i2]+carry)/10;

         arr[--size] =quotient;
        }

        for(;i1>=0;i1--){
         
            int  quotient=(arr1[i1]+carry)%10;

            carry=(arr1[i1]+carry)/10;
            arr[--size]=quotient;
        }

        for(;i2>=0;i2--){
            int  quotient=(arr2[i2]+carry)%10;
            carry=(arr2[i2]+carry)/10;
            arr[--size]=quotient;
        }

        if(carry!=0){
            int [] reArr=new int[arr.length+1];
            reArr[0]=carry;

            for(int i=0;i<arr.length;i++){
                reArr[i+1]=arr[i];
        
            }
            return reArr;
        }

        return arr;
    }

    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();

        int []arr1=new int[n1];
        int []arr2=new int[n2];

    System.out.println();
    for(int i=0;i<n1;i++){
     arr1[i]=sc.nextInt();
    }

    System.out.println();
    for(int i=0;i<n2;i++){
     arr2[i]=sc.nextInt();
    }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int []arr=sumArray(arr1, arr2);

        System.out.println(Arrays.toString(arr));
    }
}

/*
 PS D:\DSA\Arrays\Day-1> javac .\SumTwoArray.java
PS D:\DSA\Arrays\Day-1> java SumTwoArray        
4
5

1
1
1
1

2
3
4
5
6
[1, 1, 1, 1]
[2, 3, 4, 5, 6]
1
1
1
1
2
[2, 4, 5, 6, 7]
 */

/*
 
in case of carry
PS D:\DSA\Arrays\Day-1> javac .\SumTwoArray.java
PS D:\DSA\Arrays\Day-1> java SumTwoArray        
4
5

8
8
8
8

2
3
4
5
6
[8, 8, 8, 8]
[2, 3, 4, 5, 6]
[3, 2, 3, 4, 4]
 */