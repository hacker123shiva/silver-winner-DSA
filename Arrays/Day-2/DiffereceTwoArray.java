import java.util.Arrays;
import java.util.Scanner;

public class DiffereceTwoArray {
    
   public static int [] differenceArray(int []arr1, int []arr2){

    int n1=arr1.length;
    int n2=arr2.length;

    int size=n1>n2?n1:n2;

    int arr[]=new int[size];
    int i1=n1-1;
    int i2=n2-1;
    
    for( ;i1>=0&&i2>=0;i1--,i2--){
        if(arr2[i2]>=arr1[i1]){
            arr[--size]=arr2[i2]-arr1[i1];
        }else{
            arr[--size]=10  +arr2[i2]-arr1[i1];
            arr2[i2-1]--;
        }
    }
 
    for(;i2>=0;i2--){
        arr[--size]=arr2[i2];
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

        int []arr=differenceArray(arr1, arr2);

        System.out.println(Arrays.toString(arr));
    }
}
