import java.util.Scanner;

public class Search {
  
    public static int searchIndex(int []arr, int value){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==value)
        return i;
    }
    return -1;
    }
    
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int value=sc.nextInt();
        int ind=searchIndex(arr, value);
        System.out.println("Index :: "+ind);

    }

}
