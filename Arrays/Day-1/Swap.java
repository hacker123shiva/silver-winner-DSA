public class Swap {
    public static void swap(int []arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String [] args){
        int []arr;
        arr=new int[5];
        arr[0]=12;
        arr[1]=13;
        arr[2]=14;
        arr[3]=15;
        arr[4]=16;
    
        swap(arr,0,4);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
     }
    
}
